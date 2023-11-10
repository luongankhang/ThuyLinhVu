package entities;

import java.util.List;

public class LibraryManager {
    private LibraryDocumentDataSource documentDataSource;
    private UserDataSource userDataSource;

    public LibraryManager(LibraryDocumentDataSource documentDataSource, UserDataSource userDataSource) {
        this.documentDataSource = documentDataSource;
        this.userDataSource = userDataSource;
    }

    public List<LibraryDocument> getAllLibraryDocument() {
        return documentDataSource.getAllLibraryDocuments();
    }

    public List<User> getAllUsers() {
        return userDataSource.getAllUsers();
    }

    public User getUserByUsername(String username) {
        return userDataSource.getUserByUsername(username);
    }
}
