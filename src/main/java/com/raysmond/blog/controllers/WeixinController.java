package com.raysmond.blog.controllers;

import com.raysmond.blog.Constants;
import com.raysmond.blog.services.WeChatService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@RestController
@RequestMapping("/weixin")
public class WeixinController {

    @Autowired
    private WeChatService weChatService;


    @ResponseBody
    @RequestMapping(value = "/signature", method = {RequestMethod.GET, RequestMethod.POST})
    public void signature(
            @RequestParam(value = "signature", required = true) String signature,
            @RequestParam(value = "timestamp", required = true) String timestamp,
            @RequestParam(value = "nonce", required = true) String nonce,
            @RequestParam(value = "echostr", required = true) String echostr,
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("UTF-8");  //微信服务器POST消息时用的是UTF-8编码，在接收时也要用同样的编码，否则中文会乱码
        response.setCharacterEncoding("UTF-8"); //在响应消息（回复消息给用户）时，也将编码方式设置为UTF-8，原理同上
        boolean isGet = request.getMethod().toLowerCase().equals("get");

        try {
            if (isGet) {
                String[] values = {Constants.WEIXIN_TOKEN, timestamp, nonce};
                Arrays.sort(values); // 字典序排序
                String value = values[0] + values[1] + values[2];
                String sign = DigestUtils.shaHex(value);

                if (signature.equals(sign)) {// 验证成功返回ehcostr
                    response.getWriter().write(echostr);
                }

            } else {
                String respMessage = weChatService.weixinPost(request);
                response.getWriter().write(respMessage);
            }
        } catch (Exception e) {

        } finally {
            response.getWriter().close();
        }

    }


}
