package com.instagram.urlhandlers.viewprofile;

import X.08y;
import X.09i;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ViewProfileUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.viewprofile.ViewProfileUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = 2034507385(0x79441e79, float:6.3644265E34)
            int r5 = X.AnonymousClass0fD.A00(r0)
            r4 = r18
            r0 = r19
            super.onCreate(r0)
            android.os.Bundle r1 = X.DbX.A0A(r4)
            X.0wW r7 = r4.getSession()
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0024
            X.FFQ.A01(r4, r1, r7)
        L_0x001d:
            r0 = 2065906663(0x7b233be7, float:8.4755935E35)
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x0024:
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = X.DbS.A0m(r1)
            if (r1 == 0) goto L_0x00b6
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00b6
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            r17 = 0
            r16 = 0
            r14 = 0
            r13 = 0
            r6 = 1
            X.0qQ.A0B(r7, r6)
            android.net.Uri r2 = X.0cp.A03(r1)     // Catch:{ SecurityException -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r4.finish()
            goto L_0x001d
        L_0x0047:
            X.0qQ.A0A(r2)
            java.lang.String r1 = "user"
            java.lang.String r0 = r2.getHost()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r11 = "id"
            java.lang.String r8 = r2.getQueryParameter(r11)
            java.lang.String r10 = "id_type"
            java.lang.String r12 = r2.getQueryParameter(r10)
            java.lang.String r0 = "upcoming_event_id"
            java.lang.String r3 = r2.getQueryParameter(r0)
            r15 = 0
            r0 = 0
            if (r3 == 0) goto L_0x008f
            java.lang.String r1 = "upcoming_event_name"
            java.lang.String r14 = r2.getQueryParameter(r1)
            java.lang.String r1 = "upcoming_event_start_time"
            java.lang.String r1 = r2.getQueryParameter(r1)
            if (r1 == 0) goto L_0x007e
            java.lang.Long r13 = X.AnonymousClass7TE.A10(r1)
        L_0x007e:
            java.lang.String r1 = "upcoming_event_end_time"
            java.lang.String r1 = r2.getQueryParameter(r1)
            if (r1 == 0) goto L_0x008a
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r1)
        L_0x008a:
            r16 = r3
            r17 = r0
            r15 = 1
        L_0x008f:
            java.lang.String r9 = "source_application"
            java.lang.String r3 = r2.getQueryParameter(r9)
            if (r8 == 0) goto L_0x00b6
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x00b6
            if (r12 == 0) goto L_0x00b6
            java.lang.String r0 = "fbid"
            boolean r0 = r12.equals(r0)
            java.lang.String r2 = "ViewProfileUrlHandler"
            if (r0 == 0) goto L_0x00bb
            X.0xG r2 = X.DbS.A0O(r2)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r8)
            java.lang.String r0 = "ig_direct"
            X.FEC.A00(r4, r2, r7, r1, r0)
        L_0x00b6:
            r4.finish()
            goto L_0x001d
        L_0x00bb:
            java.lang.String r1 = "igid"
            boolean r0 = r12.equals(r1)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0109
            java.lang.String r0 = "com.instagram.android"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0109
            X.6Yo r4 = X.DbS.A0M(r4, r7)
            X.1a1 r3 = X.C46447Df9.A02()
            java.lang.String r0 = "deep_link"
            X.Dfc r2 = X.C46548Dgp.A01(r7, r8, r0, r2)
            r1 = 0
            r0 = r1
            if (r15 == 0) goto L_0x00e7
            r0 = r16
        L_0x00e7:
            r2.A0P = r0
            r0 = r1
            if (r15 == 0) goto L_0x00ed
            r0 = r14
        L_0x00ed:
            r2.A0Q = r0
            r0 = r1
            if (r15 == 0) goto L_0x00f3
            r0 = r13
        L_0x00f3:
            r2.A07 = r0
            if (r15 == 0) goto L_0x00f9
            r1 = r17
        L_0x00f9:
            r2.A06 = r1
            androidx.fragment.app.Fragment r0 = X.C46474Dfc.A00(r7, r3, r2)
            r4.A0D(r0)
            r4.A0F = r6
            X.DbV.A1O(r4)
            goto L_0x001d
        L_0x0109:
            java.lang.String r0 = "instagram://userid"
            android.net.Uri$Builder r0 = X.DbW.A07(r0)
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r11, r8)
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r10, r1)
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r9, r3)
            X.Dbc.A0I(r4, r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.viewprofile.ViewProfileUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
