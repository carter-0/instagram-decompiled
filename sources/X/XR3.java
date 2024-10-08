package X;

public enum XR3 {
    DISABLED(0),
    AUTOMATIC(1),
    ALWAYS_ENABLED(4);
    
    public final int A00;

    /* access modifiers changed from: public */
    XR3(int i) {
        this.A00 = i;
    }
}
