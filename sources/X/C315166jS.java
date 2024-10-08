package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jS  reason: invalid class name and case insensitive filesystem */
public final class C315166jS implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0qQ.A0B(userSession, 0);
        W3U w3u = W3U.A00;
        int i = W3U.A02(userSession, w3u).getInt("product_sticker_tooltip_seen_count", 0);
        0xY AR4 = W3U.A02(userSession, w3u).AR4();
        AR4.E5Z("product_sticker_tooltip_seen_count", i + 1);
        AR4.apply();
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        C316896mO r0;
        if (r3 instanceof C316006kx) {
            r0 = ((C316006kx) r3).A1R;
        } else if (!(r3 instanceof C309406Yd)) {
            return null;
        } else {
            r0 = ((C309406Yd) r3).A0P;
        }
        return C316896mO.A00(r0);
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EtQ(com.instagram.common.session.UserSession r6, X.C255773uh r7, X.C250973mM r8, X.C316026kz r9) {
        /*
            r5 = this;
            com.instagram.model.reels.Reel r1 = r8.A0H
            boolean r0 = r1.A0b()
            r4 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r1.A1a
            r1 = 1
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT
            java.util.List r0 = r7.Bkd(r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003f
            if (r1 != 0) goto L_0x003f
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.W3U r2 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r6, r2)
            java.lang.String r0 = "product_sticker_tooltip_seen_count"
            int r1 = r1.getInt(r0, r3)
            r0 = 2
            if (r1 >= r0) goto L_0x003f
            X.0xa r1 = X.W3U.A02(r6, r2)
            java.lang.String r0 = "has_entered_pdp_via_product_sticker"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x003f
            return r4
        L_0x003f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315166jS.EtQ(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.6kz):boolean");
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        return new C315476jx((CharSequence) context.getString(2131969855));
    }
}
