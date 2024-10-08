package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.3yr  reason: invalid class name and case insensitive filesystem */
public final class C258343yr implements C258353ys {
    public final Fragment A00;
    public final UserSession A01;
    public final String A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C377159Kt(this, 39));
    public final AnonymousClass4DU A04;
    public final AnonymousClass2xS A05;
    public final C2360132b A06;

    public C258343yr(Fragment fragment, UserSession userSession, AnonymousClass4DU r5, AnonymousClass2xS r6, C2360132b r7, String str) {
        0qQ.A0B(r7, 4);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = str;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r1 == X.1sy.A0H) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ctq(android.view.MotionEvent r12, X.C254073rt r13, X.1Xj r14, X.AnonymousClass3W1 r15, X.2EG r16, X.C62320sa r17) {
        /*
            r11 = this;
            X.0eM r0 = r11.A03
            java.lang.Object r1 = r0.getValue()
            X.3yx r1 = (X.C258403yx) r1
            X.DIs r0 = X.C46014DIs.A00
            r1.A01(r0)
            X.02m r2 = r1.A00
            if (r2 == 0) goto L_0x001d
            r1 = 1056313521(0x3ef610b1, float:0.4805961)
            r0 = 3695(0xe6f, float:5.178E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.markerPoint(r1, r0)
        L_0x001d:
            androidx.fragment.app.Fragment r6 = r11.A00
            android.content.Context r2 = r6.getContext()
            r7 = r14
            r8 = r15
            if (r2 == 0) goto L_0x0089
            int r1 = r15.A03
            com.instagram.common.session.UserSession r3 = r11.A01
            r0 = 0
            com.instagram.model.androidlink.AndroidLink r5 = X.AnonymousClass47K.A02(r2, r3, r14, r1, r0)
            X.1sy r1 = r15.A0o
            X.1sy r0 = X.1sy.A0R
            r4 = 1
            if (r1 == r0) goto L_0x0044
            X.1sy r0 = X.1sy.A05
            if (r1 == r0) goto L_0x0044
            X.1sy r0 = X.1sy.A0U
            if (r1 == r0) goto L_0x0044
            X.1sy r0 = X.1sy.A0H
            r2 = 0
            if (r1 != r0) goto L_0x0045
        L_0x0044:
            r2 = 1
        L_0x0045:
            if (r5 == 0) goto L_0x00c3
            X.47L r1 = X.C271714jT.A01(r5)
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_APP_STORE
            if (r1 == r0) goto L_0x0057
            X.47L r1 = X.C271714jT.A01(r5)
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_DEEPLINK
            if (r1 != r0) goto L_0x00c3
        L_0x0057:
            r0 = 1
        L_0x0058:
            if (r2 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0089
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r3, r14)
            boolean r0 = X.AnonymousClass3ZN.A01(r0, r3)
            if (r0 != 0) goto L_0x0089
            X.1Xy r0 = r14.A0C
            X.47f r0 = r0.Atb()
            if (r0 == 0) goto L_0x00bf
            java.lang.Boolean r1 = r0.Bud()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00bf
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321615004313183(0x810a510000265f, double:3.033273811907448E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00bf
        L_0x0089:
            X.32b r3 = r11.A06
            java.lang.String r10 = r11.A02
            if (r13 == 0) goto L_0x00bd
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = r13.A0Y
        L_0x0091:
            r4 = r12
            r9 = r16
            r3.A00(r4, r5, r6, r7, r8, r9, r10)
            com.instagram.common.session.UserSession r2 = r11.A01
            com.instagram.user.model.UpcomingEvent r4 = r14.A27(r2)
            r1 = 0
            if (r4 == 0) goto L_0x00bc
            java.util.EnumSet r0 = X.1sx.A01
            boolean r0 = X.C243213Xw.A02(r2, r14)
            if (r0 == 0) goto L_0x00bc
            X.6am r3 = new X.6am
            r3.<init>(r1, r2, r10)
            java.lang.String r2 = r14.getId()
            r0 = 858(0x35a, float:1.202E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "cta_bar_ads_cta"
            r3.A04(r4, r2, r1, r0)
        L_0x00bc:
            return
        L_0x00bd:
            r5 = 0
            goto L_0x0091
        L_0x00bf:
            r17.invoke()
            goto L_0x0089
        L_0x00c3:
            r0 = 0
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258343yr.Ctq(android.view.MotionEvent, X.3rt, X.1Xj, X.3W1, X.2EG, X.0sa):void");
    }
}
