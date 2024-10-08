package X;

/* renamed from: X.FEr  reason: case insensitive filesystem */
public final class C49917FEr {
    public static C49917FEr A0B;
    public C49666F0y A00;
    public C46634DiE A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public final synchronized void A02(C49666F0y f0y, Integer num, String str, String str2) {
        C49917FEr fEr = A0B;
        fEr.A02 = num;
        fEr.A08 = str;
        fEr.A00 = f0y;
        fEr.A07 = str2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.FEr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.F0y, java.lang.Object] */
    public static synchronized C49917FEr A00() {
        C49917FEr fEr;
        synchronized (C49917FEr.class) {
            if (A0B == null) {
                ? obj = new Object();
                A0B = obj;
                obj.A02(new Object(), AnonymousClass05K.A1F, "", "");
                C49917FEr fEr2 = A0B;
                C46634DiE diE = C46634DiE.A0z;
                synchronized (fEr2) {
                    C49917FEr fEr3 = A0B;
                    fEr3.A0A = "";
                    fEr3.A09 = "";
                    fEr3.A01 = diE;
                }
                C49917FEr fEr4 = A0B;
                Integer num = AnonymousClass05K.A00;
                synchronized (fEr4) {
                    A0B.A05 = num;
                }
                synchronized (A0B) {
                }
                C49917FEr fEr5 = A0B;
                Integer num2 = AnonymousClass05K.A0C;
                synchronized (fEr5) {
                    A0B.A03 = num2;
                }
            }
            fEr = A0B;
        }
        return fEr;
    }

    public static String A01() {
        if (A00().A04 == AnonymousClass05K.A00) {
            return 1Q0.A01();
        }
        return null;
    }
}
