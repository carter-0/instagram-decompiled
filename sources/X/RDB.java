package X;

public enum RDB {
    DYNAMIC,
    STATIC,
    DEFAULT_TYPING;

    /* access modifiers changed from: public */
    static {
        DYNAMIC = new RDB("DYNAMIC", 0);
        STATIC = new RDB("STATIC", 1);
        DEFAULT_TYPING = new RDB("DEFAULT_TYPING", 2);
    }
}
