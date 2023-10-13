package com.np.stronghold;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Document {

    @JsonProperty("cover_i")
    private Integer coverId;

    @JsonProperty("has_fulltext")
    private Boolean hasFulltext;

    @JsonProperty("edition_count")
    private Integer editionCount;

    private String title;

    @JsonProperty("author_name")
    private List<String> authorNames;

    @JsonProperty("first_publish_year")
    private Integer firstPublishYear;

    private String key;

    private List<String> ia;

    @JsonProperty("author_key")
    private List<String> authorKeys;

    @JsonProperty("public_scan_b")
    private Boolean publicScanB;

    public Integer getCoverId() {
        return coverId;
    }

    public void setCoverId(Integer coverId) {
        this.coverId = coverId;
    }

    public Boolean getHasFulltext() {
        return hasFulltext;
    }

    public void setHasFulltext(Boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    public Integer getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(Integer editionCount) {
        this.editionCount = editionCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(List<String> authorNames) {
        this.authorNames = authorNames;
    }

    public Integer getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(Integer firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getIa() {
        return ia;
    }

    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    public List<String> getAuthorKeys() {
        return authorKeys;
    }

    public void setAuthorKeys(List<String> authorKeys) {
        this.authorKeys = authorKeys;
    }

    public Boolean getPublicScanB() {
        return publicScanB;
    }

    public void setPublicScanB(Boolean publicScanB) {
        this.publicScanB = publicScanB;
    }
}
