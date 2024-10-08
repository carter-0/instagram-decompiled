package X;

public final class T1D implements C13961TmO {
    public static final T1D A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T1D] */
    static {
        SUa A03 = SUa.A03("eventsDroppedCount");
        C8863RDe rDe = C8863RDe.DEFAULT;
        A01 = SUa.A0K(A03, rDe, 1);
        A02 = SUa.A0K(SUa.A03("reason"), rDe, 3);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C10453RsU rsU = (C10453RsU) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7P(A01, rsU.A00);
        tgH.A7Q(A02, rsU.A01);
    }
}
