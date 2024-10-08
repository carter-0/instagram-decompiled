package X;

public final class T1G implements C13961TmO {
    public static final T1G A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T1G] */
    static {
        SUa A03 = SUa.A03("startMs");
        C8863RDe rDe = C8863RDe.DEFAULT;
        A02 = SUa.A0K(A03, rDe, 1);
        A01 = SUa.A0K(SUa.A03("endMs"), rDe, 2);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C10455RsW rsW = (C10455RsW) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7P(A02, rsW.A01);
        tgH.A7P(A01, rsW.A00);
    }
}
