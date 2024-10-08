package X;

public enum RGY {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RGY(String str) {
        this.A00 = str;
    }
}
