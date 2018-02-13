package com.raysmond.blog.support.web.impl;

import org.pegdown.Extensions;
import org.pegdown.LinkRenderer;
import org.pegdown.PegDownProcessor;
import org.pegdown.ToHtmlSerializer;
import org.pegdown.ast.RootNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;

import com.raysmond.blog.support.web.MarkdownService;

/**
 * @author Raysmond
 */
@Service
@Qualifier("pegdown")
public class PegDownMarkdownService implements MarkdownService {

    private final PegDownProcessor pegdown;

    public PegDownMarkdownService() {
        pegdown = new PegDownProcessor(Extensions.ALL ^ Extensions.EXTANCHORLINKS);
    }

    @Override
    public String renderToHtml(String markdownSource) {
        if (StringUtils.isEmpty(markdownSource)) {
            return null;
        }
        // synchronizing on pegdown instance since neither the processor nor the underlying parser is thread-safe.
        synchronized(pegdown) {
            RootNode astRoot = pegdown.parseMarkdown(markdownSource.toCharArray());
            ToHtmlSerializer serializer = new ToHtmlSerializer(new LinkRenderer());
            // Collections.singletonMap(VerbatimSerializer.DEFAULT, PygmentsVerbatimSerializer.INSTANCE));
            return serializer.toHtml(astRoot);
        }
    }
}
