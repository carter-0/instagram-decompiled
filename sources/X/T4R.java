package X;

public final class T4R implements C13961TmO {
    public static final T4R A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;
    public static final C11357SOt A03;
    public static final C11357SOt A04;
    public static final C11357SOt A05;
    public static final C11357SOt A06;
    public static final C11357SOt A07;
    public static final C11357SOt A08;
    public static final C11357SOt A09;
    public static final C11357SOt A0A;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.T4R, java.lang.Object] */
    static {
        SUa A032 = SUa.A03("durationMs");
        RDO rdo = RDO.DEFAULT;
        A01 = SUa.A0C(rdo, A032);
        A02 = SUa.A0E(rdo, "errorCode");
        A03 = SUa.A0F(rdo, "isColdCall");
        A04 = SUa.A0G(rdo, "autoManageModelOnBackground");
        A05 = SUa.A0H(rdo, "autoManageModelOnLowMemory");
        A06 = SUa.A0I(rdo, "isNnApiEnabled");
        A07 = SUa.A0J(rdo, "eventsCount");
        A08 = SUa.A0D(rdo, SUa.A03("otherErrors"), 8);
        A09 = SUa.A0D(rdo, SUa.A03("remoteConfigValueForAcceleration"), 9);
        A0A = SUa.A0D(rdo, SUa.A03("isAccelerated"), 10);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C10756Rxa rxa = (C10756Rxa) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7Q(A01, rxa.A04);
        tgH.A7Q(A02, rxa.A00);
        tgH.A7Q(A03, rxa.A01);
        tgH.A7Q(A04, rxa.A02);
        tgH.A7Q(A05, rxa.A03);
        tgH.A7Q(A06, (Object) null);
        tgH.A7Q(A07, (Object) null);
        tgH.A7Q(A08, (Object) null);
        tgH.A7Q(A09, (Object) null);
        tgH.A7Q(A0A, (Object) null);
    }
}
