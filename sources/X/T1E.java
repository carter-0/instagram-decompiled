package X;

public final class T1E implements C13961TmO {
    public static final T1E A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T1E] */
    static {
        SUa A03 = SUa.A03("logSource");
        C8863RDe rDe = C8863RDe.DEFAULT;
        A02 = SUa.A0K(A03, rDe, 1);
        A01 = SUa.A0K(SUa.A03("logEventDropped"), rDe, 2);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        SEX sex = (SEX) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7Q(A02, sex.A00);
        tgH.A7Q(A01, sex.A01);
    }
}
