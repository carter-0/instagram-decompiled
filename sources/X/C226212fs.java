package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.2fs  reason: invalid class name and case insensitive filesystem */
public final class C226212fs implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;
    public final /* synthetic */ 1QK A02;

    public C226212fs(UserSession userSession, InstagramMainActivity instagramMainActivity, 1QK r3) {
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r1 = r23
            r0 = -958366614(0xffffffffc6e07c6a, float:-28734.207)
            int r3 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r1 instanceof com.instagram.notifications.badging.ui.component.ToastingBadge
            r8 = r22
            if (r0 == 0) goto L_0x0033
            com.instagram.mainactivity.InstagramMainActivity r0 = r8.A01
            X.2b7 r0 = r0.A09
            r0.getClass()
            X.2fw r1 = (X.C226242fw) r1
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r1.getBadgeValue()     // Catch:{ NumberFormatException -> 0x0035 }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0035 }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002e
            r4 = 1
        L_0x002e:
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0035 }
            goto L_0x0037
        L_0x0033:
            r6 = 0
            goto L_0x0037
        L_0x0035:
            java.lang.Long r6 = X.2b7.A0C
        L_0x0037:
            com.instagram.common.session.UserSession r4 = r8.A00
            com.instagram.mainactivity.InstagramMainActivity r7 = r8.A01
            X.0iw r0 = r7.A0n()
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r4)
            java.lang.String r1 = "ig_navigation_tab_clicked"
            X.0kJ r0 = r2.A00
            X.0Aj r5 = r2.A00(r0, r1)
            X.2b7 r0 = r7.A09
            r0.getClass()
            X.2b8 r0 = r0.A01
            X.1QK r0 = r0.A01()
            java.lang.String r0 = r0.A06
            java.lang.String r13 = "current_section"
            r5.AAJ(r13, r0)
            X.1QK r2 = r8.A02
            java.lang.String r12 = r2.A06
            java.lang.String r11 = "destination_section"
            r5.AAJ(r11, r12)
            java.lang.String r1 = "tab"
            java.lang.String r0 = "flag"
            r5.AAJ(r0, r1)
            X.2b7 r0 = r7.A09
            r0.getClass()
            X.2b8 r0 = r0.A01
            X.1QK r0 = r0.A01()
            java.lang.String r10 = r0.A06
            java.lang.String r9 = ""
            r0 = 2
            X.0qQ.A0B(r10, r0)
            r0 = 3
            X.0qQ.A0B(r12, r0)
            X.93a r8 = X.AnonymousClass93Z.A01(r4)
            if (r8 == 0) goto L_0x00ba
            r14 = 0
            r7 = 1
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x00ba
            X.C3728893a.A02(r8)
            X.0XK r1 = new X.0XK
            r1.<init>()
            java.lang.String r0 = "analytics_module"
            r1.A00(r0, r9, r7)
            r1.A00(r13, r10, r7)
            r1.A00(r11, r12, r7)
            X.02m r12 = X.C3728893a.A00(r8)
            r13 = 976032351(0x3a2d125f, float:6.602164E-4)
            r15 = 7
            long r18 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r20 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r16 = "tab_navigation"
            r17 = r1
            r21 = r14
            r12.markerPoint(r13, r14, r15, r16, r17, r18, r20, r21)
        L_0x00ba:
            if (r6 == 0) goto L_0x00c1
            java.lang.String r0 = "badge_value"
            r5.A9F(r0, r6)
        L_0x00c1:
            r5.Cgf()
            X.1QK r0 = X.1QK.A09
            if (r2 != r0) goto L_0x00e4
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.AnonymousClass2yJ.A00(r0)
            com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker r5 = X.2II.A00(r4)
            if (r5 == 0) goto L_0x00e4
            X.4Cq r4 = r5.A0E
            r1 = 0
            r0 = 11
            X.MFy r2 = new X.MFy
            r2.<init>(r5, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r4)
        L_0x00e4:
            r0 = -585291401(0xffffffffdd1d2977, float:-7.077946E17)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226212fs.onClick(android.view.View):void");
    }
}
