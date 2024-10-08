package X;

import android.view.View;

public final class LXI implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public LXI(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        r0 = -960735580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        X.JTP.A1A(r0.A0H, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0144;
                case 1: goto L_0x012f;
                case 2: goto L_0x0046;
                case 3: goto L_0x00b9;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -503812389(0xffffffffe1f86edb, float:-5.7284756E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A02
            instagram.features.clips.edit.ClipsEditMetadataController r5 = (instagram.features.clips.edit.ClipsEditMetadataController) r5
            X.4jy r0 = r5.A0x
            java.lang.String r1 = r0.A0C
            int r0 = r13.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x003f
            if (r4 == 0) goto L_0x003f
            android.content.Context r3 = r5.A0n
            X.8ab r1 = X.DbS.A0Y(r3)
            r0 = 2131956380(0x7f13129c, float:1.9549314E38)
            r1.A09(r0)
            r0 = 2131956379(0x7f13129b, float:1.9549312E38)
            X.DbY.A0w(r3, r1, r4, r0)
            r1.A05()
            r0 = 58
            X.LV2 r0 = X.LV2.A00(r5, r0)
            r1.A0F(r0)
            X.DbT.A1V(r1)
        L_0x003f:
            r0 = -65116460(0xfffffffffc1e66d4, float:-3.289874E36)
        L_0x0042:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0046:
            r0 = 38368808(0x2497628, float:1.4801057E-37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.Jko r0 = (X.C60395Jko) r0
            X.L21 r3 = r0.A00
            X.L6s[] r1 = r0.A01
            int r0 = r13.A01
            r1 = r1[r0]
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.KhG r0 = r1.A02
            int r0 = r0.ordinal()
            java.lang.String r4 = "resultsListController"
            switch(r0) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x00ab;
                case 2: goto L_0x0075;
                case 3: goto L_0x0099;
                case 4: goto L_0x0090;
                case 5: goto L_0x008a;
                default: goto L_0x0068;
            }
        L_0x0068:
            X.K6w r0 = r3.A00
            com.instagram.music.search.MusicOverlayResultsListController r0 = r0.A04
            if (r0 == 0) goto L_0x00d2
            r0.A07()
        L_0x0071:
            r0 = -960735580(0xffffffffc6bc56a4, float:-24107.32)
            goto L_0x0042
        L_0x0075:
            X.K6w r3 = r3.A00
            X.0eM r0 = r3.A0R
            X.27r r1 = X.C51971G9r.A0g(r0)
            X.8fP r0 = X.C360948fP.CLIPS
            r1.A0u(r0)
            com.instagram.music.search.MusicOverlayResultsListController r0 = r3.A04
            if (r0 == 0) goto L_0x00d2
            r0.A08()
            goto L_0x0071
        L_0x008a:
            X.K6w r0 = r3.A00
            X.C61423K6w.A02(r0)
            goto L_0x0071
        L_0x0090:
            X.K6w r0 = r3.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = X.JTP.A0Y(r0)
            X.KMw r1 = X.C61807KMw.A00
            goto L_0x00b3
        L_0x0099:
            X.K6w r0 = r3.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = X.JTP.A0Y(r0)
            X.KMx r1 = X.C61808KMx.A00
            goto L_0x00b3
        L_0x00a2:
            X.K6w r0 = r3.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = X.JTP.A0Y(r0)
            X.KMz r1 = X.C61810KMz.A00
            goto L_0x00b3
        L_0x00ab:
            X.K6w r0 = r3.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = X.JTP.A0Y(r0)
            X.KMy r1 = X.C61809KMy.A00
        L_0x00b3:
            X.2Fj r0 = r0.A0H
            X.JTP.A1A(r0, r1)
            goto L_0x0071
        L_0x00b9:
            r0 = -2083823240(0xffffffff83cb6178, float:-1.1953645E-36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A02
            X.K7d r5 = (X.C61428K7d) r5
            X.0eM r4 = r5.A0F
            java.lang.Object r3 = r4.getValue()
            X.KVj r3 = (X.C62010KVj) r3
            java.lang.String r1 = r5.A08
            if (r1 != 0) goto L_0x00da
            java.lang.String r4 = "mediaId"
        L_0x00d2:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00da:
            r10 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A01(r0, r1, r10, r10)
            java.lang.Object r3 = r4.getValue()
            X.KVj r3 = (X.C62010KVj) r3
            X.0wc r1 = r3.A00
            r0 = 1442(0x5a2, float:2.02E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            X.LMi r3 = r3.A01
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "media_id"
            r4.AAJ(r0, r1)
            java.lang.String r1 = "live"
            java.lang.String r0 = "product"
            r4.AAJ(r0, r1)
            java.lang.String r1 = "badges"
            java.lang.String r0 = "product_type"
            X.C64090LMi.A00(r4, r3, r0, r1)
            X.EZV r1 = X.EZV.BADGES_ESTIMATED_EARNINGS
            java.lang.String r0 = "origin"
            r4.A8M(r1, r0)
            r4.Cgf()
            X.0eM r0 = r5.A0G
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.28D r6 = X.28D.A5Q
            java.lang.String r9 = r5.A07
            int r12 = r13.A01
            java.lang.String r11 = r5.A09
            java.lang.Long r8 = r5.A06
            X.VG4.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -737953160(0xffffffffd403ba78, float:-2.26307657E12)
            goto L_0x0042
        L_0x012f:
            r0 = 1959712273(0x74ced611, float:1.3109801E32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = r13.A01
            X.C51967G9n.A0w(r0, r1)
            r0 = 349034896(0x14cdd990, float:2.0785523E-26)
            goto L_0x0042
        L_0x0144:
            r0 = -614389327(0xffffffffdb6129b1, float:-6.337771E16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.KM0 r0 = (X.KM0) r0
            X.0sP r1 = r0.A06
            if (r1 == 0) goto L_0x0158
            int r0 = r13.A01
            X.C51967G9n.A0w(r0, r1)
        L_0x0158:
            r0 = 1158927610(0x4513d4fa, float:2365.311)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LXI.onClick(android.view.View):void");
    }
}
