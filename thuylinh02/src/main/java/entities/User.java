package entities;

import java.util.List;

class User {
    private String username;
    private List<LibraryDocument> favoriteDocuments;
    private List<LibraryDocument> borrowedDocuments;

    public User(String username, List<LibraryDocument> favoriteDocuments, List<LibraryDocument> borrowedDocuments) {
        this.username = username;
        this.favoriteDocuments = favoriteDocuments;
        this.borrowedDocuments = borrowedDocuments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<LibraryDocument> getFavoriteDocuments() {
        return favoriteDocuments;
    }

    public void setFavoriteDocuments(List<LibraryDocument> favoriteDocuments) {
        this.favoriteDocuments = favoriteDocuments;
    }

    public List<LibraryDocument> getBorrowedDocuments() {
        return borrowedDocuments;
    }

    public void setBorrowedDocuments(List<LibraryDocument> borrowedDocuments) {
        this.borrowedDocuments = borrowedDocuments;
    }
}
