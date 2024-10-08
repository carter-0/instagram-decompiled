package X;

public enum XRw {
    ;
    
    public final int A00;
    public final int A01;

    public static XRw A00(String str, int i, int i2) {
        return new XRw(str, i, i2, -1);
    }

    public static XRw A02(String str, int i, int i2, int i3) {
        return new XRw(str, i, i2, i3);
    }

    /* access modifiers changed from: public */
    XRw(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public static XRw A01(String str, int i, int i2) {
        return new XRw(str, i, i2, -16226561);
    }
}
