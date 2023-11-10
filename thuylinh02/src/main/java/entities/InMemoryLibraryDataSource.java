package entities;

import java.util.ArrayList;
import java.util.List;

public class InMemoryLibraryDataSource implements LibraryDocumentDataSource {
    @Override
    public List<LibraryDocument> getAllLibraryDocuments() {
        return new ArrayList<>();
    }
}
