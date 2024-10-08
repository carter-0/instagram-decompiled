package X;

public final class SEH {
    public final Object A00;
    public final Throwable A01;

    public static void A00(2Fk r2, Throwable th) {
        r2.A0A(new SEH((Object) null, th));
    }

    public SEH(Object obj, Throwable th) {
        this.A00 = obj;
        this.A01 = th;
    }
}
