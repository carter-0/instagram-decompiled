package X;

public final class I03 {
    public final AnonymousClass4DU A00;
    public final AnonymousClass1L1 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final GTU A06;

    public I03(C53335GmL gmL) {
        String A002;
        0qQ.A0B(gmL, 1);
        GTU gtu = new GTU(gmL.A0F, gmL.A0c, gmL.A0Y, gmL.A0e);
        this.A06 = gtu;
        this.A00 = gtu;
        if (gtu.A00) {
            A002 = "self_comments_v2";
        } else {
            A002 = AnonymousClass000.A00(1210);
        }
        this.A04 = A002;
        this.A03 = AnonymousClass7TG.A0j();
        this.A01 = AnonymousClass1L1.A01.A01(gmL.A0D);
        this.A05 = gmL.A0b;
        this.A02 = gmL.A03;
    }

    public static AnonymousClass4DU A00(AnonymousClass0eM r0) {
        return ((I03) r0.getValue()).A00;
    }
}
