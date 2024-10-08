package X;

public final class T4D implements C13961TmO {
    public static final T4D A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;
    public static final C11357SOt A03;
    public static final C11357SOt A04;
    public static final C11357SOt A05;
    public static final C11357SOt A06;
    public static final C11357SOt A07;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.T4D, java.lang.Object] */
    static {
        SUa A032 = SUa.A03("durationMs");
        RDN rdn = RDN.DEFAULT;
        A01 = SUa.A04(rdn, A032);
        A02 = SUa.A06(rdn, "imageSource");
        A03 = SUa.A07(rdn, "imageFormat");
        A04 = SUa.A08(rdn, "imageByteSize");
        A05 = SUa.A09(rdn, "imageWidth");
        A06 = SUa.A0A(rdn, "imageHeight");
        A07 = SUa.A0B(rdn, "rotationDegrees");
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C10800RyM ryM = (C10800RyM) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7Q(A01, ryM.A06);
        tgH.A7Q(A02, ryM.A01);
        tgH.A7Q(A03, ryM.A00);
        tgH.A7Q(A04, ryM.A02);
        tgH.A7Q(A05, ryM.A03);
        tgH.A7Q(A06, ryM.A04);
        tgH.A7Q(A07, ryM.A05);
    }
}
