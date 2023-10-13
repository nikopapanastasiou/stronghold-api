package com.np.stronghold;

import java.util.List;

public class SearchResult {

    private String title;

    private List<Document> docs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Document> getDocs() {
        return docs;
    }

    public void setDocs(List<Document> docs) {
        this.docs = docs;
    }
}
