package X;

/* renamed from: X.Rks  reason: case insensitive filesystem */
public abstract class C9998Rks {
    public static R2t A00;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.R2t, X.S0k] */
    public static synchronized C11332SNl A00(String str) {
        C11332SNl sNl;
        synchronized (C9998Rks.class) {
            C8549Qwn qwn = new C8549Qwn(str);
            R2t r2t = A00;
            R2t r2t2 = r2t;
            if (r2t == null) {
                ? s0k = new S0k();
                A00 = s0k;
                r2t2 = s0k;
            }
            sNl = (C11332SNl) r2t2.A00(qwn);
        }
        return sNl;
    }
}
