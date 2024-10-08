package X;

/* renamed from: X.T2x  reason: case insensitive filesystem */
public final class C12687T2x implements C13961TmO {
    public static final C12687T2x A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;
    public static final C11357SOt A03;
    public static final C11357SOt A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T2x] */
    static {
        SUa A032 = SUa.A03("window");
        C8863RDe rDe = C8863RDe.DEFAULT;
        A04 = SUa.A0K(A032, rDe, 1);
        A03 = SUa.A0K(SUa.A03("logSourceMetrics"), rDe, 2);
        A02 = SUa.A0K(SUa.A03("globalMetrics"), rDe, 3);
        A01 = SUa.A0K(SUa.A03("appNamespace"), rDe, 4);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        SFK sfk = (SFK) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7Q(A04, sfk.A01);
        tgH.A7Q(A03, sfk.A03);
        tgH.A7Q(A02, sfk.A00);
        tgH.A7Q(A01, sfk.A02);
    }
}
