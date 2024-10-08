package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.F5n  reason: case insensitive filesystem */
public abstract class C49761F5n {
    public static final void A00(Context context, UserSession userSession) {
        C310336ap A0a = DbS.A0a();
        A0a.A06();
        DbS.A19(context, A0a, 2131963359);
        A0a.A0I = context.getString(2131963358);
        DbY.A1N(A0a);
        C49762F5o.A01(userSession, AnonymousClass05K.A0N, (Integer) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36311925559984957L) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(androidx.fragment.app.Fragment r7, com.instagram.common.session.UserSession r8, java.lang.Integer r9) {
        /*
            boolean r4 = X.AnonymousClass7TG.A1Z(r7, r8)
            X.02m r1 = X.02m.A0p
            r0 = 190461770(0xb5a374a, float:4.2026868E-32)
            r1.markerStart(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r9 != r0) goto L_0x001e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311925559984957(0x810181001d033d, double:3.0271461682980175E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r3 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            android.content.Context r2 = r7.requireContext()
            X.631 r1 = new X.631
            r1.<init>(r8)
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0037
            X.Fba r0 = new X.Fba
            r0.<init>(r2, r8)
            r1.A00(r0, r3)
            return
        L_0x0037:
            r6 = 0
            X.1NY r5 = X.AnonymousClass7TG.A0a(r8)
            java.lang.String r0 = "accounts/set_hide_message_requests_global/"
            r5.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r5.A0O(r6, r1, r0, r4)
            java.lang.String r0 = "config_value"
            r5.A0C(r0, r4)
            java.lang.String r0 = "spam_scam_consent"
            r5.A0C(r0, r3)
            int r0 = r9.intValue()
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0073;
                case 2: goto L_0x0076;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.String r1 = "direct-hidden-words-spam-scam-nux"
        L_0x005b:
            java.lang.String r0 = "entry_point"
            r5.A9m(r0, r1)
            X.1OC r1 = X.DbT.A0U(r5, r4)
            X.EDQ r0 = new X.EDQ
            r0.<init>((android.content.Context) r2, (com.instagram.common.session.UserSession) r8, (int) r4, (boolean) r3)
            r1.A00 = r0
            X.0gy r0 = X.AnonymousClass07i.A00(r7)
            X.1ES.A00(r2, r0, r1)
            return
        L_0x0073:
            java.lang.String r1 = "direct-hidden-words-adoption-nux-from-pending-folder"
            goto L_0x005b
        L_0x0076:
            java.lang.String r1 = "direct-hidden-words-adoption-bottomsheet"
            goto L_0x005b
        L_0x0079:
            java.lang.String r1 = "direct-hidden-words-adoption-qp"
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49761F5n.A01(androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, java.lang.Integer):void");
    }
}
