package X;

import android.view.View;
import android.view.animation.Animation;
import com.instagram.common.session.UserSession;

/* renamed from: X.FOc  reason: case insensitive filesystem */
public final class C50087FOc implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Animation A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C255773uh A05;
    public final /* synthetic */ C250973mM A06;
    public final /* synthetic */ C309426Yf A07;
    public final /* synthetic */ C317286n1 A08;
    public final /* synthetic */ C306866Nv A09;
    public final /* synthetic */ AnonymousClass6N0 A0A;

    public C50087FOc(Animation animation, AnonymousClass0iw r2, UserSession userSession, C255773uh r4, C250973mM r5, C309426Yf r6, C317286n1 r7, C306866Nv r8, AnonymousClass6N0 r9, int i, int i2) {
        this.A09 = r8;
        this.A05 = r4;
        this.A01 = i;
        this.A0A = r9;
        this.A07 = r6;
        this.A04 = userSession;
        this.A03 = r2;
        this.A00 = i2;
        this.A08 = r7;
        this.A02 = animation;
        this.A06 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x013d, code lost:
        if (r15 == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x013f, code lost:
        if (r12 < r13) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0141, code lost:
        r10.A02(X.00k.A0a(r8));
        X.C306846Nt.A01.A04(r9.A06, r30, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0151, code lost:
        r1 = r9.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0153, code lost:
        if (r1 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0155, code lost:
        r0 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0157, code lost:
        if (r12 != 0) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0159, code lost:
        if (r0 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x015b, code lost:
        r0.Cv4(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0167, code lost:
        if (r0 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0169, code lost:
        r0.DpK(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r35) {
        /*
            r34 = this;
            r0 = 1687772048(0x64995b90, float:2.2631597E22)
            int r20 = X.AnonymousClass0fD.A05(r0)
            r9 = r34
            X.6Nv r0 = r9.A09
            r29 = r0
            android.view.View r0 = r0.A05
            r33 = r0
            r33.clearAnimation()
            X.3uh r0 = r9.A05
            r24 = r0
            X.4g9 r10 = r0.A09
            if (r10 == 0) goto L_0x015e
            java.util.List r0 = r10.A01()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r0)
            int r7 = r9.A01
            java.lang.Object r6 = r8.remove(r7)
            X.6Nx r6 = (X.C306886Nx) r6
            X.6N0 r0 = r9.A0A
            r30 = r0
            r1 = r0
            r0 = r29
            r1.A03(r0, r7)
            java.lang.String r19 = r10.getId()
            X.6Yf r5 = r9.A07
            r14 = r6
            X.6Nw r14 = (X.C306876Nw) r14
            com.instagram.user.model.User r0 = r14.A02
            r23 = r0
            java.lang.String r0 = r23.getId()
            int r18 = X.C306846Nt.A00(r5, r0, r7)
            com.instagram.common.session.UserSession r4 = r9.A04
            X.0iw r3 = r9.A03
            java.lang.String r1 = r14.A09
            java.lang.String r0 = r14.A0E
            r17 = r0
            r13 = r0
            if (r0 != 0) goto L_0x005a
            java.lang.String r13 = ""
        L_0x005a:
            r11 = 1
            X.0qQ.A0B(r1, r11)
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r2 = 0
            r12.put(r2, r0)
            r12.put(r11, r1)
            r16 = 2
            r0 = r16
            r12.put(r0, r13)
            java.lang.String r15 = r23.getId()
            java.lang.String r0 = r14.A0D
            r22 = r0
            X.3IN r0 = r10.A00
            java.lang.String r0 = r0.A04
            r21 = r0
            java.lang.String r14 = r3.getModuleName()
            r0 = 978(0x3d2, float:1.37E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6KM r13 = new X.6KM
            r13.<init>(r0, r15, r14)
            java.lang.Object r0 = r12.get(r11)
            java.lang.String r15 = X.DbS.A0p(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00a0
            r13.A04 = r0
        L_0x00a0:
            r0 = r16
            java.lang.Object r14 = r12.get(r0)
            X.0qQ.A0C(r14, r15)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x00af
            r13.A07 = r14
        L_0x00af:
            r0 = r22
            r13.A0B = r0
            r0 = r21
            r13.A09 = r0
            r0 = r19
            r13.A08 = r0
            java.lang.Object r0 = r12.get(r2)
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r12 = r12.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r12, r0)
            r13.A00 = r0
        L_0x00cd:
            X.2om r12 = new X.2om
            r12.<init>(r3, r4)
            X.6KN r0 = new X.6KN
            r0.<init>(r13)
            r12.A07(r0)
            java.lang.String r12 = r23.getId()
            r0 = r17
            X.1OC r1 = X.F88.A01(r4, r12, r0, r1)
            r0 = 215319470(0xcd583ae, float:3.2897098E-31)
            r15 = 1
            X.1ES.A06(r1, r0, r2)
            X.2om r12 = new X.2om
            r12.<init>(r3, r4)
            r1 = r19
            r0 = r18
            X.6KM r0 = X.C306896Ny.A00(r3, r6, r1, r0, r11)
            X.DbV.A1T(r0, r12)
            java.util.HashMap r12 = X.C306896Ny.A03
            java.lang.String r6 = r23.getId()
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.put(r6, r0)
            int r12 = r8.size()
            int r13 = r9.A00
            if (r12 < r13) goto L_0x013f
            int r6 = r5.A0M
            int r1 = r6 + r13
            int r1 = r1 - r11
            int r0 = r8.size()
            int r1 = r1 % r0
            java.lang.Object r14 = r8.remove(r1)
            X.6Nx r14 = (X.C306886Nx) r14
            if (r1 >= r7) goto L_0x016d
            int r7 = r7 - r11
            r8.add(r7, r14)
            int r6 = r6 - r11
            r5.A0M = r6
        L_0x012b:
            X.6Nw r14 = (X.C306876Nw) r14
            com.instagram.user.model.User r0 = r14.A02
            java.lang.String r0 = r0.getId()
            X.C306896Ny.A04(r0)
            android.view.animation.Animation r1 = r9.A02
            r0 = r33
            r0.startAnimation(r1)
            if (r15 != 0) goto L_0x0141
        L_0x013f:
            if (r12 >= r13) goto L_0x0151
        L_0x0141:
            java.util.List r0 = X.00k.A0a(r8)
            r10.A02(r0)
            X.6Nt r3 = X.C306846Nt.A01
            X.3mM r1 = r9.A06
            r0 = r30
            r3.A04(r1, r0, r2)
        L_0x0151:
            X.3mM r1 = r9.A06
            if (r1 == 0) goto L_0x015e
            X.6n1 r0 = r9.A08
            if (r12 != 0) goto L_0x0167
            if (r0 == 0) goto L_0x015e
            r0.Cv4(r1)
        L_0x015e:
            r1 = -676141650(0xffffffffd7b2e5ae, float:-3.93399073E14)
            r0 = r20
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0167:
            if (r0 == 0) goto L_0x015e
            r0.DpK(r1)
            goto L_0x015e
        L_0x016d:
            r8.add(r7, r14)
            java.util.List r0 = X.00k.A0a(r8)
            r10.A02(r0)
            X.6n1 r6 = r9.A08
            android.view.animation.Animation r1 = r9.A02
            X.3mM r0 = r9.A06
            r22 = r3
            r23 = r4
            r25 = r0
            r26 = r14
            r27 = r5
            r28 = r6
            r31 = r7
            r32 = r11
            r21 = r1
            X.C306846Nt.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r15 = 0
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50087FOc.onClick(android.view.View):void");
    }
}
