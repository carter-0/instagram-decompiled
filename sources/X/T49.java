package X;

public final class T49 implements C13961TmO {
    public static final T49 A00 = new Object();
    public static final C11357SOt A01 = C11357SOt.A00("clientInfo");
    public static final C11357SOt A02 = C11357SOt.A00("logEvent");
    public static final C11357SOt A03 = C11357SOt.A00("logSourceName");
    public static final C11357SOt A04 = C11357SOt.A00("logSource");
    public static final C11357SOt A05 = C11357SOt.A00("qosTier");
    public static final C11357SOt A06 = C11357SOt.A00("requestTimeMs");
    public static final C11357SOt A07 = C11357SOt.A00("requestUptimeMs");

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C13745TgH tgH = (C13745TgH) obj2;
        C8307Qnn qnn = (C8307Qnn) ((C9686Rf4) obj);
        tgH.A7P(A06, qnn.A00);
        tgH.A7P(A07, qnn.A01);
        tgH.A7Q(A01, qnn.A02);
        tgH.A7Q(A04, qnn.A04);
        tgH.A7Q(A03, qnn.A05);
        tgH.A7Q(A02, qnn.A06);
        tgH.A7Q(A05, qnn.A03);
    }
}
