package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class GFC implements C59626JQu, JR2, C59618JQm, JQV, AnonymousClass33C, C59603JPx, C59605JPz, JTI, C59604JPy {
    public 0sK A00;
    public 0sH A01;
    public final ClipsViewerSource A02;
    public final UserSession A03;
    public final 1Av A04;
    public final AnonymousClass0t1 A05;
    public final 17i A06;
    public final C51979GAc A07;
    public final boolean A08;
    public final /* synthetic */ AnonymousClass33C A09;
    public final /* synthetic */ C59618JQm A0A;
    public final /* synthetic */ C59603JPx A0B;
    public final /* synthetic */ JQV A0C;
    public final /* synthetic */ GF8 A0D;
    public final /* synthetic */ C52311GNc A0E;
    public final /* synthetic */ C59626JQu A0F;
    public final /* synthetic */ C59605JPz A0G;

    public final void CIU(C267324bN r4, C52058GDe gDe, String str, boolean z) {
        AnonymousClass7TF.A1H(r4, gDe);
        this.A0A.CIU(r4, gDe, (String) null, false);
    }

    public final void CIq(View view, C267324bN r8, C52058GDe gDe, 1Xj r10, int i) {
        AnonymousClass7TG.A1T(r8, gDe, r10);
        this.A0C.CIq(view, r8, gDe, r10, i);
    }

    public final void DUq(C247003fc r8, 1Xj r9, Integer num, WeakReference weakReference, C62320sa r12, 0sP r13) {
        0qQ.A0B(weakReference, 0);
        C51974G9v.A1M(r9, r8, r12);
        0qQ.A0B(r13, 5);
        AnonymousClass33C r0 = this.A09;
        r0.DUq(r8, r9, num, weakReference, r12, r13);
    }

    public final void Djm(View view, C267324bN r8, C52058GDe gDe, boolean z, boolean z2) {
        AnonymousClass7TG.A1N(r8, gDe);
        this.A0F.Djm(view, r8, gDe, z, z2);
    }

    public final void Dzk(1Xj r2, AnonymousClass3W1 r3) {
        this.A0G.Dzk(r2, r3);
    }

    public final void EbF(0sP r2) {
        this.A0F.EbF(r2);
    }

    public final void EbG(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A09.EbG(r2);
    }

    public final void EbR(0sI r2) {
        this.A0C.EbR(r2);
    }

    public final void EbY(0sP r2) {
        this.A0A.EbY(r2);
    }

    public final void EbZ(0sP r2) {
        this.A0A.EbZ(r2);
    }

    public final void Ebf(0sP r2) {
        this.A0F.Ebf(r2);
    }

    public final void EkC(0sP r2) {
        this.A0F.EkC(r2);
    }

    public final void Enp(0sK r2) {
        this.A0B.Enp(r2);
    }

    public final void Enr(0sP r2) {
        this.A0G.Enr(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (X.182.A06(r5, r2, 36319390211251392L) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36317418821260404L) != false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CIt(android.view.View r15, X.C267324bN r16, X.C52058GDe r17) {
        /*
            r14 = this;
            r8 = r16
            r9 = r17
            boolean r4 = X.AnonymousClass7TG.A1Z(r8, r9)
            X.5o2 r1 = r8.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x00f2
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x00fa
            X.0sH r7 = r14.A01
            if (r7 == 0) goto L_0x00f2
            com.instagram.common.session.UserSession r2 = r14.A03
            X.3OA r0 = r8.A06()
            java.lang.String r1 = r0.A0c
            X.GAc r0 = r14.A07
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = X.AnonymousClass71K.A0B(r2, r1, r0)
            if (r0 == 0) goto L_0x00f7
            X.3OA r0 = r8.A06()
            java.lang.String r1 = r0.A0c
            if (r1 == 0) goto L_0x00f7
            X.17i r0 = r14.A06
            com.instagram.user.model.User r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r5 = r0.B8Q()
            X.3OA r0 = r8.A06()
            boolean r3 = r0.A10
            android.content.Context r1 = X.C51966G9m.A0P(r2)
            r0 = 2131970062(0x7f13480e, float:1.9577064E38)
            if (r3 == 0) goto L_0x0052
            r0 = 2131970063(0x7f13480f, float:1.9577066E38)
        L_0x0052:
            java.lang.String r10 = X.DbW.A0h(r1, r5, r0)
        L_0x0056:
            X.1Av r3 = r14.A04
            boolean r1 = X.C228342lQ.A07(r2, r3)
            X.1Xj r0 = r8.A02
            r6 = 1
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r0.A5n()
            if (r0 != 0) goto L_0x00f5
            if (r1 != 0) goto L_0x00f5
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319390211382466(0x81084b00021cc2, double:3.031866843899541E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 != 0) goto L_0x0081
            r0 = 36319390211251392(0x81084b00001cc0, double:3.031866843816649E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x00f5
        L_0x0081:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            X.1Xj r0 = r8.A02
            r5 = 1
            if (r0 == 0) goto L_0x00f3
            X.1Xy r0 = r0.A0C
            X.47f r0 = r0.Atb()
            if (r0 == 0) goto L_0x00f3
            java.lang.Boolean r0 = r0.Buc()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x00f3
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321615004313183(0x810a510000265f, double:3.033273811907448E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x00f3
        L_0x00a9:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            boolean r0 = r14.A08
            if (r0 != 0) goto L_0x00b7
            com.instagram.clips.intf.ClipsViewerSource r1 = r14.A02
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.ADS_HISTORY
            if (r1 != r0) goto L_0x00cb
        L_0x00b7:
            boolean r0 = X.C228342lQ.A0B(r2, r3)
            if (r0 == 0) goto L_0x00cb
            X.0Tu r3 = X.0Tu.A05
            r0 = 36317418821260404(0x81068000001474, double:3.030620128848198E-306)
            boolean r1 = X.182.A06(r3, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00cc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r7.invoke(r8, r9, r10, r11, r12, r13)
        L_0x00d3:
            X.1Xj r3 = r8.A02
            if (r3 == 0) goto L_0x00f2
            X.0t1 r0 = r14.A05
            com.instagram.user.model.User r2 = r0.A00()
            com.instagram.common.session.UserSession r1 = r14.A03
            com.instagram.user.model.User r0 = r3.A2A(r1)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00f2
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "instagram_clips_self_view_overflow_menu_tap"
            X.C51974G9v.A1F(r1, r0)
        L_0x00f2:
            return
        L_0x00f3:
            r5 = 0
            goto L_0x00a9
        L_0x00f5:
            r6 = 0
            goto L_0x0081
        L_0x00f7:
            r10 = 0
            goto L_0x0056
        L_0x00fa:
            X.0sK r0 = r14.A00
            if (r0 == 0) goto L_0x00f2
            r0.invoke(r8, r9, r15)
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFC.CIt(android.view.View, X.4bN, X.GDe):void");
    }

    public final void Eb0(0sP r2) {
        this.A0D.A00 = r2;
    }

    public final void Ece(0sL r2) {
        this.A0E.A01 = r2;
    }

    public final void Ej8(0sL r2) {
        this.A0E.A00 = r2;
    }

    public final void Enq(0sL r2) {
        this.A0E.A02 = r2;
    }

    public /* synthetic */ GFC(ClipsViewerSource clipsViewerSource, UserSession userSession, AnonymousClass33C r7, C59618JQm jQm, C59603JPx jPx, JQV jqv, GF8 gf8, C52311GNc gNc, C59626JQu jQu, C59605JPz jPz, C51979GAc gAc, boolean z) {
        17i A002 = 17h.A00(userSession);
        1Av A003 = 1Au.A00(userSession);
        AnonymousClass0t1 A004 = 0eE.A00(userSession);
        0qQ.A0B(A002, 13);
        0qQ.A0B(A003, 14);
        0qQ.A0B(A004, 15);
        this.A0A = jQm;
        this.A0F = jQu;
        this.A0C = jqv;
        this.A0D = gf8;
        this.A0E = gNc;
        this.A0B = jPx;
        this.A09 = r7;
        this.A0G = jPz;
        this.A03 = userSession;
        this.A07 = gAc;
        this.A02 = clipsViewerSource;
        this.A08 = z;
        this.A06 = A002;
        this.A04 = A003;
        this.A05 = A004;
    }

    public final void CIV(C267324bN r2, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r2, gDe);
        this.A0A.CIV(r2, gDe);
    }

    public final void CIp(C267324bN r2, C52058GDe gDe, 1Xj r4, boolean z) {
        AnonymousClass7TG.A1T(r2, gDe, r4);
        this.A0C.CIp(r2, gDe, r4, z);
    }

    public final void CJ8(C267324bN r2, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r2, gDe);
        this.A0E.CJ8(r2, gDe);
    }

    public final void CJ9(C267324bN r2, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r2, gDe);
        this.A0E.CJ9(r2, gDe);
    }

    public final void CJA(C267324bN r2, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r2, gDe);
        this.A0E.CJA(r2, gDe);
    }

    public final void CwZ(C267324bN r2, C52058GDe gDe, boolean z) {
        AnonymousClass7TG.A1O(r2, gDe);
        this.A0D.CwZ(r2, gDe, z);
    }

    public final void DJh(View view, C267324bN r3, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r3, gDe);
        this.A0B.DJh(view, r3, gDe);
    }

    public final void Djq(MotionEvent motionEvent, C267324bN r3, C52058GDe gDe) {
        AnonymousClass7TG.A1O(r3, gDe);
        this.A0F.Djq(motionEvent, r3, gDe);
    }

    public final void Eaz(0sH r1) {
        this.A01 = r1;
    }

    public final void Ebb(0sK r1) {
        this.A00 = r1;
    }
}
