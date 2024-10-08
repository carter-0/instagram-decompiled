package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.Wc9  reason: case insensitive filesystem */
public final class C19584Wc9 implements C20981X7w {
    public final /* synthetic */ C17936ViR A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ AnonymousClass4D7 A02;

    public C19584Wc9(C17936ViR viR, Product product, AnonymousClass4D7 r3) {
        this.A00 = viR;
        this.A02 = r3;
        this.A01 = product;
    }

    public final void DTp(String str) {
        C17936ViR viR = this.A00;
        05G r0 = viR.A02;
        Boolean A0u = AnonymousClass7TE.A0u();
        r0.Epw(A0u);
        viR.A03.Epw(A0u);
        this.A02.resumeWith(A0u);
        C18778W1d w1d = viR.A00;
        Product product = this.A01;
        String A0q = C13989Tnp.A0q(product);
        0qQ.A0A(A0q);
        w1d.A05(product, A0q);
    }

    public final void DwB(List list) {
        C17936ViR viR = this.A00;
        05G r0 = viR.A02;
        Boolean A0u = AnonymousClass7TE.A0u();
        r0.Epw(A0u);
        viR.A03.Epw(A0u);
        this.A02.resumeWith(A0u);
        C18778W1d w1d = viR.A00;
        Product product = this.A01;
        String A0q = C13989Tnp.A0q(product);
        0qQ.A0A(A0q);
        w1d.A05(product, A0q);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        W0O w0o = (W0O) obj;
        0qQ.A0B(w0o, 0);
        C17936ViR viR = this.A00;
        AnonymousClass7TF.A1O(viR.A02, false);
        05G r0 = viR.A03;
        Boolean A0v = AnonymousClass7TE.A0v();
        r0.Epw(A0v);
        this.A02.resumeWith(A0v);
        C18778W1d w1d = viR.A00;
        String A0q = C13989Tnp.A0q(this.A01);
        0qQ.A0A(A0q);
        UserSession userSession = w1d.A03;
        C323486xZ r3 = C323426xT.A00(userSession).A07;
        0qQ.A07(r3);
        if (r3.A01 == null) {
            return;
        }
        if (A0q == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r3.A09(A0q) != null) {
            AnonymousClass0iw r4 = w1d.A01;
            String str = w1d.A0B;
            String str2 = w1d.A0A;
            String str3 = w1d.A07;
            String str4 = w1d.A0D;
            String str5 = r3.A01;
            if (str5 != null) {
                String A09 = r3.A09(A0q);
                if (A09 != null) {
                    boolean A04 = w1d.A05.A04();
                    W2s.A04(r4, userSession, w1d.A04, (ShoppingGuideLoggingInfo) null, w0o, str, str2, A0q, str3, str4, "lightbox_sticky_cta", str5, A09, w1d.A06, w1d.A08, A04);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
