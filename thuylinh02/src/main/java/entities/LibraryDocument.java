package entities;

class LibraryDocument {
    private String title;
    private String author;
    private String type;
    private int ratings;

    public LibraryDocument(String title, String author, String type, int ratings) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}

