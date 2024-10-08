package X;

public final class T1F implements C13961TmO {
    public static final T1F A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T1F] */
    static {
        SUa A03 = SUa.A03("currentCacheSizeBytes");
        C8863RDe rDe = C8863RDe.DEFAULT;
        A01 = SUa.A0K(A03, rDe, 1);
        A02 = SUa.A0K(SUa.A03("maxCacheSizeBytes"), rDe, 2);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C10454RsV rsV = (C10454RsV) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7P(A01, rsV.A00);
        tgH.A7P(A02, rsV.A01);
    }
}
