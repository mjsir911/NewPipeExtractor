package org.schabi.newpipe.extractor.linkhandler;

import java.util.Collections;
import java.util.List;

public class ListLinkHandler extends LinkHandler {
    protected final List<String> contentFilters;
    protected final String sortFilter;

    public ListLinkHandler(String originalUrl,
                           String url,
                           String shortUrl,
                           String id,
                           List<String> contentFilters,
                           String sortFilter) {
        super(originalUrl, url, shortUrl, id);
        this.contentFilters = Collections.unmodifiableList(contentFilters);
        this.sortFilter = sortFilter;
    }

    public ListLinkHandler(ListLinkHandler handler) {
        this(handler.originalUrl,
                handler.url,
                handler.shortUrl,
                handler.id,
                handler.contentFilters,
                handler.sortFilter);
    }

    public ListLinkHandler(LinkHandler handler,
                           List<String> contentFilters,
                           String sortFilter) {
        this(handler.originalUrl,
                handler.url,
                handler.shortUrl,
                handler.id,
                contentFilters,
                sortFilter);
    }

    public List<String> getContentFilters() {
        return contentFilters;
    }

    public String getSortFilter() {
        return sortFilter;
    }
}
