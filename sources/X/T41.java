package X;

public final class T41 implements C13961TmO {
    public static final T41 A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;
    public static final C11357SOt A03;
    public static final C11357SOt A04;
    public static final C11357SOt A05;
    public static final C11357SOt A06;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.T41, java.lang.Object] */
    static {
        SUa A032 = SUa.A03("maxMs");
        RDO rdo = RDO.DEFAULT;
        A01 = SUa.A0C(rdo, A032);
        A02 = SUa.A0E(rdo, "minMs");
        A03 = SUa.A0F(rdo, "avgMs");
        A04 = SUa.A0G(rdo, "firstQuartileMs");
        A05 = SUa.A0H(rdo, "medianMs");
        A06 = SUa.A0I(rdo, "thirdQuartileMs");
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C10786Ry7 ry7 = (C10786Ry7) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7Q(A01, ry7.A00);
        tgH.A7Q(A02, ry7.A01);
        tgH.A7Q(A03, ry7.A02);
        tgH.A7Q(A04, ry7.A03);
        tgH.A7Q(A05, ry7.A04);
        tgH.A7Q(A06, ry7.A05);
    }
}
