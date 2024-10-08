package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.UkP  reason: case insensitive filesystem */
public final class C15901UkP extends C230372pW {
    public final UserSession A00;
    public final W1W A01;

    public static String A00(0Aj r4, W1W w1w, long j) {
        r4.AAe("ig_funded_discount_ids", 0sr.A1L(new Long[]{Long.valueOf(j)}));
        r4.AAK(W1W.A00(w1w, (String) null), "navigation_info");
        X9C x9c = w1w.A0A;
        C18588Vuf Bz5 = x9c.Bz5();
        0qQ.A07(Bz5);
        r4.AAK(W1W.A01(w1w, Bz5), "pdp_logging_info");
        Product product = x9c.Bz5().A09;
        0qQ.A0A(product);
        User user = product.A0B;
        if (user != null) {
            return AnonymousClass3ZA.A00(user);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.VPL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.VPL} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r0 == null) goto L_0x000d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(long r7) {
        /*
            r6 = this;
            com.instagram.common.session.UserSession r5 = r6.A00
            X.VPL r4 = X.W3U.A04(r5)
            if (r4 != 0) goto L_0x0023
            X.VPL r4 = new X.VPL
            r4.<init>()
        L_0x000d:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x0012:
            java.lang.String r3 = java.lang.String.valueOf(r7)
            long r1 = java.lang.System.currentTimeMillis()
            X.Pxe.A1X(r3, r0, r1)
            r4.A00 = r0
            X.W3U.A07(r5, r4)
            return
        L_0x0023:
            java.util.HashMap r0 = r4.A00
            if (r0 != 0) goto L_0x0012
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15901UkP.A01(long):void");
    }

    public C15901UkP(1Bk r1, UserSession userSession, W1W w1w) {
        super(r1);
        this.A00 = userSession;
        this.A01 = w1w;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        long A0R = AnonymousClass7TE.A0R(obj);
        W3U.A05(this.A00, System.currentTimeMillis());
        A01(A0R);
        W1W w1w = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(w1w.A04, "instagram_shopping_ig_funded_incentive_impression");
        C13988Tno.A1A(A0e, A00(A0e, w1w, A0R));
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        long A0R = AnonymousClass7TE.A0R(obj);
        W3U.A05(this.A00, System.currentTimeMillis());
        A01(A0R);
        W1W w1w = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(w1w.A04, "instagram_shopping_ig_funded_incentive_sub_impression");
        C13988Tno.A1A(A0e, A00(A0e, w1w, A0R));
        A0e.Cgf();
    }
}
