package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class F2R {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C67015Mgo.A01(r7) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r7 = r10.A02
            boolean r2 = X.C67015Mgo.A02(r7)
            boolean r0 = X.C67015Mgo.A00(r7)
            if (r0 != 0) goto L_0x0013
            boolean r0 = X.C67015Mgo.A01(r7)
            r9 = 0
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r9 = 1
        L_0x0014:
            r6 = 5
            java.lang.String r1 = "source"
            r0 = 2102(0x836, float:2.946E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r8 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.String r0 = "is_hw_predefined_list_on"
            java.lang.String r5 = "True"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r0, r5)
            java.lang.String r3 = "False"
            r1 = r3
            if (r2 == 0) goto L_0x002f
            r1 = r5
        L_0x002f:
            java.lang.String r0 = "hw_predefined_list_state_changes"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "is_hw_custom_list_on"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r5)
            if (r9 != 0) goto L_0x003e
            r5 = r3
        L_0x003e:
            java.lang.String r0 = "hw_custom_list_state_changes"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r5)
            X.0eP[] r0 = new X.0eP[]{r8, r4, r2, r1, r0}
            java.util.HashMap r1 = X.0Yt.A02(r0)
            java.lang.String r0 = "com.instagram.hidden_words.secure_consent_bottom_sheet.action"
            X.8ey r0 = X.C359988do.A05(r7, r0, r1)
            X.E84.A00(r0, r10, r6)
            X.1ES.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F2R.A00():void");
    }

    public F2R(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = str;
    }
}
