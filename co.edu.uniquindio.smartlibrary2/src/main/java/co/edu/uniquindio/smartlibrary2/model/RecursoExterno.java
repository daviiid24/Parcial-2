package model;

// Adaptee: formato externo incompatible con RecursoAcademico
public class RecursoExterno {

    private final String externalId;
    private final String fullTitle;
    private final String authorName;
    private final long   sizeBytes;

    public RecursoExterno(String externalId, String fullTitle, String authorName, long sizeBytes) {
        this.externalId = externalId;
        this.fullTitle  = fullTitle;
        this.authorName = authorName;
        this.sizeBytes  = sizeBytes;
    }

    public String getExternalId()  { return externalId; }
    public String getFullTitle()   { return fullTitle;  }
    public String getAuthorName()  { return authorName; }
    public long   getSizeBytes()   { return sizeBytes;  }
}
