package X;

import com.instagram.user.model.Product;

public final class WUB implements C250603lj {
    public Product A00;
    public boolean A01;
    public final W03 A02;
    public final W1W A03;

    public WUB(W03 w03, W1W w1w) {
        this.A03 = w1w;
        this.A02 = w03;
    }

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        C15054ULx uLx;
        String str;
        0qQ.A0A(r7);
        Object obj = r7.A03;
        0qQ.A06(obj);
        C17388VTp vTp = (C17388VTp) obj;
        if (!this.A01 && this.A00 != null && vTp.A00.A01 != AnonymousClass05K.A04) {
            0qQ.A0A(r8);
            if (r8.CEk(r7) == AnonymousClass05K.A00) {
                W03 w03 = this.A02;
                if (w03 != null) {
                    Product product = this.A00;
                    C263944Ny r4 = null;
                    if (product != null) {
                        uLx = C294165ly.A03(w03.A03, product);
                    } else {
                        uLx = null;
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_impression");
                    if (A0e.isSampled()) {
                        C15029UKi uKi = w03.A01;
                        if (uKi == null || (str = uKi.A05) == null) {
                            str = "";
                        }
                        C51965G9l.A1L(A0e, W03.A00(A0e, w03, str));
                        if (uLx != null) {
                            r4 = uLx.A01;
                        }
                        W03.A01(A0e, w03, C13992Tns.A0E(r4, A0e, uLx));
                        A0e.Cgf();
                    }
                }
                this.A01 = true;
            }
        }
    }
}
