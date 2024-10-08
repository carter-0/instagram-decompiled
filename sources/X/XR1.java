package X;

public enum XR1 {
    ;
    
    public final int A00;

    public static XR1 A00(Integer num, String str, int i) {
        return new XR1(num, str, i, i);
    }

    /* access modifiers changed from: public */
    XR1(int i, int i2) {
        this.A00 = i2;
        XVk xVk = XVk.$redex_init_class;
        r2.intValue();
    }
}
