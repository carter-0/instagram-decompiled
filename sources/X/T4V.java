package X;

public final class T4V implements C13961TmO {
    public static final T4V A00 = new Object();
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
    public static final C11357SOt A0B;
    public static final C11357SOt A0C;
    public static final C11357SOt A0D;
    public static final C11357SOt A0E;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T4V] */
    static {
        SUa A032 = SUa.A03("appId");
        RDN rdn = RDN.DEFAULT;
        A01 = SUa.A04(rdn, A032);
        A02 = SUa.A06(rdn, "appVersion");
        A03 = SUa.A07(rdn, "firebaseProjectId");
        A04 = SUa.A08(rdn, "mlSdkVersion");
        A05 = SUa.A09(rdn, "tfliteSchemaVersion");
        A06 = SUa.A0A(rdn, "gcmSenderId");
        A07 = SUa.A0B(rdn, "apiKey");
        A08 = SUa.A05(rdn, SUa.A03("languages"), 8);
        A09 = SUa.A05(rdn, SUa.A03("mlSdkInstanceId"), 9);
        A0A = SUa.A05(rdn, SUa.A03("isClearcutClient"), 10);
        A0B = SUa.A05(rdn, SUa.A03("isStandaloneMlkit"), 11);
        A0C = SUa.A05(rdn, SUa.A03("isJsonLogging"), 12);
        A0D = SUa.A05(rdn, SUa.A03("buildLevel"), 13);
        A0E = SUa.A05(rdn, SUa.A03("optionalModuleVersion"), 14);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        C10837Ryx ryx = (C10837Ryx) obj;
        C13745TgH tgH = (C13745TgH) obj2;
        tgH.A7Q(A01, ryx.A06);
        tgH.A7Q(A02, ryx.A07);
        tgH.A7Q(A03, (Object) null);
        tgH.A7Q(A04, ryx.A08);
        tgH.A7Q(A05, ryx.A09);
        tgH.A7Q(A06, (Object) null);
        tgH.A7Q(A07, (Object) null);
        tgH.A7Q(A08, ryx.A00);
        tgH.A7Q(A09, ryx.A0A);
        tgH.A7Q(A0A, ryx.A01);
        tgH.A7Q(A0B, ryx.A02);
        tgH.A7Q(A0C, ryx.A03);
        tgH.A7Q(A0D, ryx.A04);
        tgH.A7Q(A0E, ryx.A05);
    }
}
