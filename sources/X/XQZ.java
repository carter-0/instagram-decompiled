package X;

public enum XQZ {
    BATCH_API(12);
    
    public int A00;

    /* access modifiers changed from: public */
    static {
        new XQZ("API", 0, 0);
        new XQZ("API2", 1, 1);
        new XQZ("STORAGE", 2, 2);
        new XQZ("DEBUG_UI_API", 3, 6);
        new XQZ("DEBUG_UI_STORAGE", 4, 7);
        new XQZ("EARLY_ACCESS", 5, 8);
        new XQZ("RN", 6, 10);
        new XQZ("SERVICE", 7, 11);
        BATCH_API = new XQZ("BATCH_API", 8, 12);
    }

    /* access modifiers changed from: public */
    XQZ(int i) {
        this.A00 = i;
    }
}
