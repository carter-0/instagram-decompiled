package X;

public final class OV2 {
    public static final OV2 A01 = new OV2((Object) null);
    public final Object A00;

    public final String toString() {
        Object obj = this.A00;
        if (obj != null) {
            return 002.A0g(Pxd.A00(159), String.valueOf(obj), ")");
        }
        return "Optional.empty()";
    }

    public OV2(Object obj) {
        this.A00 = obj;
    }
}
