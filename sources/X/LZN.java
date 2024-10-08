package X;

import android.widget.PopupWindow;

public final class LZN implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LZN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        r6 = (X.C61013JvD) r7.A06.A06.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r6 == null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d9, code lost:
        r4 = X.AnonymousClass7TE.A1C();
        r1 = r6.A0F.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e7, code lost:
        if (r1.hasNext() == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
        r4.add(X.JTO.A0l(r1).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        X.AnonymousClass7TE.A1Z(new X.MGS(r4, r5, r6, r7, r8, r9, r8, 6), X.C318116oQ.A00(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0109, code lost:
        r4 = r7.A03;
        r6 = X.C51969G9p.A0d(r4.A04, "live_with_invite_waterfall");
        r0 = r4.A02;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0119, code lost:
        r0 = X.AnonymousClass7TE.A10(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        if (r0 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        r0 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0123, code lost:
        X.JTQ.A0z(r6, r0);
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        if (r0 == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        r2 = X.JTR.A0M(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012e, code lost:
        X.JTQ.A10(r6, r2);
        r6.AAJ("invite_type", r5.A00);
        r0 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        if (r0 != null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r4 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013c, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013e, code lost:
        X.C51965G9l.A1I(r6, r0);
        X.DbS.A1H(r6, "invite_accepted");
        X.JTQ.A11(r6, r4.A05);
        r0 = r4.A06;
        r2 = X.AnonymousClass7TG.A0r(r0);
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0159, code lost:
        if (r1.hasNext() == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015b, code lost:
        X.JTS.A1V(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
        r6.AAe("current_guest_ids", r2);
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0169, code lost:
        if (r0 != null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016b, code lost:
        r2 = Double.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0170, code lost:
        r6.A8D("respond_time", java.lang.Double.valueOf(r2));
        r6.Cgf();
        X.JTR.A1V(r7.A05.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0184, code lost:
        r2 = ((double) (android.os.SystemClock.elapsedRealtime() - r0.longValue())) / 1000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a7, code lost:
        r4 = X.C318116oQ.A00(r3);
        r5 = new X.MHL((java.lang.Object) r3, (java.lang.Object) r2, (X.AnonymousClass4D7) null, 45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b3, code lost:
        X.AnonymousClass7TE.A1Z(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b6, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDismiss() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0033;
                case 1: goto L_0x0047;
                case 2: goto L_0x0072;
                case 3: goto L_0x00a0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A02
            X.GiF r4 = (X.C53081GiF) r4
            X.HJZ r4 = (X.HJZ) r4
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322001551435664(0x810aab00012790, double:3.0335182658642056E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0032
            X.HmB r4 = r4.A08
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x0032
            android.view.ViewParent r2 = r3.getParent()
            boolean r1 = r2 instanceof android.view.ViewGroup
            r0 = 0
            if (r1 == 0) goto L_0x0032
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x0032
            r2.removeView(r3)
            r4.A00 = r0
        L_0x0032:
            return
        L_0x0033:
            java.lang.Object r0 = r12.A01
            X.U6V r0 = (X.U6V) r0
            X.U5e r0 = r0.A04
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = r12.A02
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r0
            r1.removeGlobalOnLayoutListener(r0)
            return
        L_0x0047:
            java.lang.Object r1 = r12.A02
            X.L7P r1 = (X.L7P) r1
            X.0eM r0 = r1.A02
            X.2YL r8 = X.DbS.A0H(r0)
            X.Iav r0 = r1.A01
            boolean r1 = r0.A02
            java.lang.Object r0 = r12.A01
            X.Ko5 r0 = (X.C62891Ko5) r0
            X.Ke1 r0 = (X.C62329Ke1) r0
            com.instagram.user.model.User r6 = r0.A02
            java.lang.Integer r7 = r0.A04
            X.AnonymousClass7TG.A1O(r6, r7)
            if (r1 == 0) goto L_0x0032
            X.6oS r4 = X.C318116oQ.A00(r8)
            r9 = 0
            r10 = 9
            X.MHK r5 = new X.MHK
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            goto L_0x01b3
        L_0x0072:
            java.lang.Object r0 = r12.A02
            X.LMh r0 = (X.C64089LMh) r0
            X.Iaw r0 = r0.A02
            boolean r1 = r0.A01
            java.lang.Object r0 = r12.A01
            X.L2u r0 = (X.C63684L2u) r0
            X.LBL r0 = r0.A00
            X.0eM r0 = r0.A0D
            if (r1 == 0) goto L_0x00f3
            java.lang.Object r7 = r0.getValue()
            X.JiY r7 = (X.C60277JiY) r7
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r0 = r7.A05
            X.0Ud r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof X.C62178Kba
            if (r0 == 0) goto L_0x0032
            X.Kba r1 = (X.C62178Kba) r1
            if (r1 == 0) goto L_0x0032
            java.lang.String r9 = r1.A01
            r8 = 0
            X.KhZ r5 = X.C62543KhZ.GUEST_REQUEST
            goto L_0x00cd
        L_0x00a0:
            java.lang.Object r0 = r12.A02
            X.LMh r0 = (X.C64089LMh) r0
            X.Iav r1 = r0.A03
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r12.A01
            X.L2u r0 = (X.C63684L2u) r0
            X.LBL r0 = r0.A00
            X.0eM r0 = r0.A0D
            java.lang.Object r7 = r0.getValue()
            X.JiY r7 = (X.C60277JiY) r7
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r0 = r7.A05
            X.0Ud r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof X.C62178Kba
            if (r0 == 0) goto L_0x0032
            X.Kba r1 = (X.C62178Kba) r1
            if (r1 == 0) goto L_0x0032
            java.lang.String r9 = r1.A01
            r8 = 0
            X.KhZ r5 = X.C62543KhZ.HOST_INVITE
        L_0x00cd:
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r7.A06
            X.0Ud r0 = r0.A06
            java.lang.Object r6 = r0.getValue()
            X.JvD r6 = (X.C61013JvD) r6
            if (r6 == 0) goto L_0x0109
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r6.A0F
            java.util.Iterator r1 = r0.iterator()
        L_0x00e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fb
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.JTO.A0l(r1)
            java.lang.String r0 = r0.A01
            r4.add(r0)
            goto L_0x00e3
        L_0x00f3:
            X.2YL r3 = X.DbS.A0H(r0)
            X.KhZ r2 = X.C62543KhZ.GUEST_REQUEST
            goto L_0x01a7
        L_0x00fb:
            X.6oS r0 = X.C318116oQ.A00(r7)
            r11 = 6
            X.MGS r3 = new X.MGS
            r10 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r3, r0)
        L_0x0109:
            X.LAn r4 = r7.A03
            X.0Ae r1 = r4.A04
            java.lang.String r0 = "live_with_invite_waterfall"
            X.0Aj r6 = X.C51969G9p.A0d(r1, r0)
            java.lang.String r0 = r4.A02
            r2 = 0
            if (r0 == 0) goto L_0x015f
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x015f
            long r0 = r0.longValue()
        L_0x0123:
            X.JTQ.A0z(r6, r0)
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x012e
            long r2 = X.JTR.A0M(r0)
        L_0x012e:
            X.JTQ.A10(r6, r2)
            java.lang.String r1 = r5.A00
            java.lang.String r0 = "invite_type"
            r6.AAJ(r0, r1)
            java.lang.String r0 = r4.A03
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = ""
        L_0x013e:
            X.C51965G9l.A1I(r6, r0)
            java.lang.String r0 = "invite_accepted"
            X.DbS.A1H(r6, r0)
            X.1Q9 r0 = r4.A05
            X.JTQ.A11(r6, r0)
            java.util.Set r0 = r4.A06
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0155:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0162
            X.JTS.A1V(r2, r1)
            goto L_0x0155
        L_0x015f:
            r0 = 0
            goto L_0x0123
        L_0x0162:
            java.lang.String r0 = "current_guest_ids"
            r6.AAe(r0, r2)
            java.lang.Long r0 = r4.A00
            if (r0 != 0) goto L_0x0184
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0170:
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "respond_time"
            r6.A8D(r0, r1)
            r6.Cgf()
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r0 = r7.A05
            X.05G r0 = r0.A04
            X.JTR.A1V(r0)
            return
        L_0x0184:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.longValue()
            long r4 = r4 - r0
            double r2 = (double) r4
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            goto L_0x0170
        L_0x0195:
            boolean r1 = r1.A00
            java.lang.Object r0 = r12.A01
            X.L2u r0 = (X.C63684L2u) r0
            X.LBL r0 = r0.A00
            X.0eM r0 = r0.A0D
            if (r1 == 0) goto L_0x01b7
            X.2YL r3 = X.DbS.A0H(r0)
            X.KhZ r2 = X.C62543KhZ.HOST_INVITE
        L_0x01a7:
            X.6oS r4 = X.C318116oQ.A00(r3)
            r1 = 0
            r0 = 45
            X.MHL r5 = new X.MHL
            r5.<init>((java.lang.Object) r3, (java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x01b3:
            X.AnonymousClass7TE.A1Z(r5, r4)
            return
        L_0x01b7:
            java.lang.Object r1 = r0.getValue()
            X.JiY r1 = (X.C60277JiY) r1
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r0 = r1.A05
            r0.A04()
            X.4Co r0 = r1.A00
            X.4Co r0 = X.JTQ.A0n(r0)
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZN.onDismiss():void");
    }
}
