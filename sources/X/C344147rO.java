package X;

/* renamed from: X.7rO  reason: invalid class name and case insensitive filesystem */
public final class C344147rO implements C344157rP {
    public final C344167rQ A00 = new C344167rQ();
    public final C344167rQ A01 = new C344167rQ();
    public final C344167rQ A02 = new C344167rQ();
    public volatile String A03 = null;
    public volatile boolean A04 = false;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.8h0, java.lang.Object] */
    public static C361898h0 A00(C344147rO r11) {
        ? obj = new Object();
        obj.A0F = r11.A03;
        obj.A0G = r11.A04;
        C344167rQ r1 = r11.A02;
        double[] A012 = r1.A01.A01();
        double[] A013 = r1.A03.A01();
        obj.A0D = (long) A012[2];
        obj.A0B = ((int) A012[3]) + ((int) A013[3]);
        obj.A01 = (float) A012[0];
        obj.A09 = (float) A012[1];
        obj.A00 = (float) A013[0];
        obj.A08 = (float) A013[1];
        C344167rQ r12 = r11.A01;
        double[] A014 = r12.A01.A01();
        double[] A015 = r12.A03.A01();
        obj.A0E = (long) A014[2];
        obj.A0A = ((int) A014[3]) + ((int) A015[3]);
        obj.A05 = (float) A014[0];
        obj.A07 = (float) A014[1];
        obj.A04 = (float) A015[0];
        obj.A06 = (float) A015[1];
        double[] A016 = r11.A00.A02.A01();
        obj.A0C = (long) A016[2];
        obj.A02 = (float) A016[0];
        obj.A03 = (float) A016[1];
        return obj;
    }

    public final C361898h0 AR9() {
        C361898h0 A002 = A00(this);
        this.A02.A00();
        this.A01.A00();
        this.A00.A00();
        this.A03 = null;
        return A002;
    }

    public final C361898h0 ARA(String str) {
        C361898h0 A002 = A00(this);
        this.A02.A00();
        this.A01.A00();
        this.A00.A00();
        this.A03 = str;
        return A002;
    }
}
