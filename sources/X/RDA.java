package X;

public enum RDA {
    TRUE,
    DEFAULT;

    /* access modifiers changed from: public */
    static {
        TRUE = new RDA("TRUE", 0);
        DEFAULT = new RDA("DEFAULT", 2);
    }
}
