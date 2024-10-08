package X;

/* renamed from: X.TEq  reason: case insensitive filesystem */
public final class C12939TEq implements Runnable {
    public final /* synthetic */ Q4Y A00;
    public final /* synthetic */ String A01;

    public C12939TEq(Q4Y q4y, String str) {
        this.A00 = q4y;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass3DG r4;
        Q4Y q4y = this.A00;
        AnonymousClass39K r3 = q4y.A00.A03;
        String str = this.A01;
        synchronized (r3.A09) {
            C282905Ff r0 = (C282905Ff) r3.A05.get(str);
            if (r0 == null && (r0 = (C282905Ff) r3.A04.get(str)) == null) {
                r4 = null;
            } else {
                r4 = r0.A08;
            }
        }
        if (r4 != null && C51966G9m.A1a(C255343ty.A08, r4.A0B)) {
            synchronized (q4y.A06) {
                q4y.A09.put(C255363u0.A00(r4), r4);
                q4y.A08.put(C255363u0.A00(r4), AnonymousClass52Y.A00(q4y, q4y.A04, r4, ((AnonymousClass38M) q4y.A05).A03));
            }
        }
    }
}
