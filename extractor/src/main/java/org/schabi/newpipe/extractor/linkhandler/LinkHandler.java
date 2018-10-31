package org.schabi.newpipe.extractor.linkhandler;

import java.io.Serializable;

public class LinkHandler implements Serializable {
    protected final String originalUrl;
    protected final String url;
    protected final String shortUrl;
    protected final String id;

    public LinkHandler(String originalUrl, String url, String shortUrl, String id) {
        this.originalUrl = originalUrl;
        this.url = url;
        this.shortUrl = shortUrl;
        this.id = id;
    }

    public LinkHandler(LinkHandler handler) {
        this(handler.originalUrl, handler.url, handler.shortUrl, handler.id);
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getId() {
        return id;
    }
}
