package X;

public final class T3J implements C13961TmO {
    public static final T3J A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;
    public static final C11357SOt A03;
    public static final C11357SOt A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T3J] */
    static {
        SUa A032 = SUa.A03("imageFormat");
        RDO rdo = RDO.DEFAULT;
        A01 = SUa.A0C(rdo, A032);
        A02 = SUa.A0E(rdo, "originalImageSize");
        A03 = SUa.A0F(rdo, "compressedImageSize");
        A04 = SUa.A0G(rdo, "isOdmlImage");
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        S4P s4p = (S4P) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7Q(A01, s4p.A00);
        tgH.A7Q(A02, s4p.A01);
        tgH.A7Q(A03, (Object) null);
        tgH.A7Q(A04, (Object) null);
    }
}
