package X;

/* renamed from: X.Ig9  reason: case insensitive filesystem */
public final class C57768Ig9 implements Runnable {
    public final /* synthetic */ H1A A00;

    public C57768Ig9(H1A h1a) {
        this.A00 = h1a;
    }

    public final void run() {
        H1A h1a = this.A00;
        H17 h17 = h1a.A02;
        String str = "headerFragment";
        if (h17 != null) {
            h17.A00(h1a.A0H);
            H17 h172 = h1a.A02;
            if (h172 != null) {
                h172.A00 = h1a;
                C54117Gzm gzm = h1a.A00;
                str = "ctaFragment";
                if (gzm != null) {
                    05G r6 = h1a.A0G;
                    0qQ.A0B(r6, 0);
                    C52989Ggg ggg = (C52989Ggg) gzm.A03.getValue();
                    AnonymousClass4D7 A0t = C51975G9x.A0t(ggg.A00);
                    ggg.A00 = C51966G9m.A1L(new C58105ImR((Object) ggg, (Object) r6, A0t, 22), C318116oQ.A00(ggg));
                    C54117Gzm gzm2 = h1a.A00;
                    if (gzm2 != null) {
                        gzm2.A02 = h1a;
                        H1K h1k = h1a.A01;
                        str = "gridFragment";
                        if (h1k != null) {
                            h1k.A00(((C52992Ggj) h1a.A0F.getValue()).A03);
                            H1K h1k2 = h1a.A01;
                            if (h1k2 != null) {
                                ((C52991Ggi) h1k2.A0D.getValue()).A00 = new C57037IMd(h1a);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
