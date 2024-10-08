package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.F2f  reason: case insensitive filesystem */
public final class C49695F2f {
    public boolean A00;
    public final Activity A01;
    public final Fragment A02;
    public final 28D A03;
    public final UserSession A04;
    public final String A05;

    public C49695F2f(Activity activity, Fragment fragment, 28D r4, UserSession userSession, String str) {
        0qQ.A0B(activity, 1);
        this.A01 = activity;
        this.A04 = userSession;
        this.A03 = r4;
        this.A05 = str;
        this.A02 = fragment;
        if (str != null) {
            this.A00 = C363558jv.A00(userSession);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        if (r0 == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r10 = this;
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            X.28D r5 = r10.A03
            if (r5 == 0) goto L_0x00d2
            java.lang.String r1 = r5.name()
            java.lang.String r0 = "CameraEntryPoint"
        L_0x000e:
            r2.put(r0, r1)
        L_0x0011:
            java.lang.String r6 = r10.A05
            if (r6 == 0) goto L_0x00ce
            X.EZu r4 = X.C48152EZu.A0D
        L_0x0017:
            android.app.Activity r8 = r10.A01
            X.8ab r7 = X.DbS.A0X(r8)
            r0 = 2131237371(0x7f0819fb, float:1.809099E38)
            X.DbU.A16(r8, r7, r0)
            if (r6 == 0) goto L_0x00c9
            boolean r0 = r10.A00
            com.instagram.common.session.UserSession r9 = r10.A04
            X.0Tu r3 = X.0Tu.A06
            if (r0 == 0) goto L_0x00c2
            r0 = 36876138232021081(0x8302a700020059, double:3.3839565339957366E-306)
        L_0x0032:
            java.lang.String r1 = X.182.A04(r3, r9, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -169269864: goto L_0x00ab;
                case 87906535: goto L_0x00b5;
                case 634559352: goto L_0x00a1;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 2131971033(0x7f134bd9, float:1.9579034E38)
        L_0x0040:
            r7.A09(r1)
            r0 = 2131969055(0x7f13441f, float:1.9575022E38)
            if (r6 == 0) goto L_0x004b
            r0 = 2131974191(0x7f13582f, float:1.958544E38)
        L_0x004b:
            r7.A08(r0)
            X.Dba.A1M(r7)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131969738(0x7f1346ca, float:1.9576407E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            r1 = 21
            X.FJl r0 = new X.FJl
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r10, (java.lang.Object) r4)
            r7.A0c(r0, r3)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131972886(0x7f135316, float:1.9582792E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            r1 = 22
            X.FJl r0 = new X.FJl
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r10, (java.lang.Object) r4)
            r7.A0a(r0, r3)
            r3 = 3
            X.FHY r0 = new X.FHY
            r0.<init>(r3, r4, r10, r2)
            r7.A0B(r0)
            X.DbT.A1V(r7)
            if (r5 == 0) goto L_0x0090
            com.instagram.common.session.UserSession r1 = r10.A04
            java.lang.String r0 = "CP_UPSELL_IG_STORY_CROSS_POSTING"
            X.C48925EmP.A00(r1, r0)
        L_0x0090:
            if (r6 == 0) goto L_0x0099
            com.instagram.common.session.UserSession r1 = r10.A04
            java.lang.String r0 = "IG_FEED_CROSS_POSTING_UPSELL"
            X.C48925EmP.A00(r1, r0)
        L_0x0099:
            com.instagram.common.session.UserSession r1 = r10.A04
            java.lang.String r0 = "upsell_impressions"
            X.FFL.A02(r4, r1, r0, r2, r3)
            return
        L_0x00a1:
            java.lang.String r0 = "statement_consistency_use_same_info"
            boolean r0 = r1.equals(r0)
            r1 = 2131974193(0x7f135831, float:1.9585443E38)
            goto L_0x00be
        L_0x00ab:
            java.lang.String r0 = "statement_consistency_keep_updated"
            boolean r0 = r1.equals(r0)
            r1 = 2131974192(0x7f135830, float:1.9585441E38)
            goto L_0x00be
        L_0x00b5:
            java.lang.String r0 = "statement_recognition"
            boolean r0 = r1.equals(r0)
            r1 = 2131974194(0x7f135832, float:1.9585445E38)
        L_0x00be:
            if (r0 != 0) goto L_0x0040
            goto L_0x003d
        L_0x00c2:
            r0 = 36876275671105628(0x8302c70004005c, double:3.384043451026227E-306)
            goto L_0x0032
        L_0x00c9:
            r1 = 2131969056(0x7f134420, float:1.9575024E38)
            goto L_0x0040
        L_0x00ce:
            X.EZu r4 = X.C48152EZu.A0M
            goto L_0x0017
        L_0x00d2:
            java.lang.String r1 = r10.A05
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "XPostFeedEntryPoint"
            r2.put(r0, r1)
            boolean r0 = r10.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "userHasAutoXpostFeedToFBEnabled"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49695F2f.A00():void");
    }
}
