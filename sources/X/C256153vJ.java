package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3vJ  reason: invalid class name and case insensitive filesystem */
public final class C256153vJ implements C256163vK {
    public long A00;
    public final Fragment A01;
    public final 0hq A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C249763kK A05;
    public final Long A06;
    public final String A07;
    public final C2357330z A08;
    public final 1GI A09;
    public final C2360532g A0A;
    public final AnonymousClass2xI A0B;
    public final C228232l0 A0C;
    public final User A0D;

    public C256153vJ(Fragment fragment, 0hq r3, UserSession userSession, C2357330z r5, AnonymousClass4DU r6, C2360532g r7, AnonymousClass2xI r8, C228232l0 r9, User user, C249763kK r11, Long l, String str) {
        0qQ.A0B(r7, 7);
        this.A03 = userSession;
        this.A0D = user;
        this.A01 = fragment;
        this.A02 = r3;
        this.A04 = r6;
        this.A0C = r9;
        this.A0A = r7;
        this.A0B = r8;
        this.A05 = r11;
        this.A08 = r5;
        this.A06 = l;
        this.A07 = str;
        this.A09 = 1GH.A00(userSession);
    }

    public final void D4f(C62320sa r10) {
        ViewGroup viewGroup;
        C62320sa r5 = r10;
        0qQ.A0B(r10, 0);
        AnonymousClass2xI r2 = this.A0B;
        if (r2 != null) {
            AnonymousClass4DV r1 = this.A01;
            if (r1.getContext() != null) {
                ViewParent parent = r1.getScrollingViewProxy().getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    String string = r1.requireContext().getString(2131975561);
                    0qQ.A07(string);
                    r2.A00(viewGroup, string, r5, 500, true);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0176, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36328246433889408L) == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017a, code lost:
        if (r10 != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017c, code lost:
        r60 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0189, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36328246433954945L) != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018b, code lost:
        r60 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        if (r1.CcK() == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0193, code lost:
        r53 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a0, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36330870658843452L) == false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a2, code lost:
        r53 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a4, code lost:
        r23 = r6.getModuleName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a9, code lost:
        if (r5 == null) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ab, code lost:
        r9 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ad, code lost:
        r35 = X.2R8.A02(r7, r1);
        r36 = r6.isOrganicEligible();
        r37 = r6.isSponsoredEligible();
        r14 = X.AnonymousClass5OB.A05;
        r3 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bd, code lost:
        if (r3 == null) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bf, code lost:
        r27 = X.HWY.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c5, code lost:
        if ((r3 instanceof X.AnonymousClass93U) == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c7, code lost:
        r28 = ((X.AnonymousClass93U) r3).AmZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cd, code lost:
        r3 = r2.A03;
        r6 = r2.getPosition();
        r5 = r2.A2V;
        r4 = r2.A0W;
        r21 = r8;
        r24 = r9;
        X.C3018960m.A00().A00().A00(r0.A01.requireActivity(), (X.C59544JNq) null, new X.C53335GmL(r14, (java.lang.Float) null, java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r6), (java.lang.Integer) null, java.lang.Integer.valueOf(r4), (java.lang.Integer) null, r21, (java.lang.String) null, r23, r24, (java.lang.String) null, (java.lang.String) null, r27, r28, (java.lang.String) null, java.lang.String.valueOf(r0.A06), r0.A07, X.AnonymousClass4LK.A03(r1), (java.util.List) null, r1.A0r(), r35, r36, r37, r38, false, r5, false, false, r1.A5v(), false, false, false, false, false, false, r50, false, r1.A4l(), r53, false, false, false, false, false, r50, r60), r7, (X.C273414mX) null, (X.C62320sa) null, X.182.A06(X.0Tu.A05, r7, 36318771736287670L), false, r1.CcK());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025d, code lost:
        r28 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0261, code lost:
        r27 = null;
        r28 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0267, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D4g(X.1Xj r62, X.AnonymousClass3W1 r63, int r64, boolean r65) {
        /*
            r61 = this;
            r12 = 0
            r1 = r62
            X.0qQ.A0B(r1, r12)
            r5 = 1
            r2 = r63
            X.0qQ.A0B(r2, r5)
            r0 = r61
            X.0hq r3 = r0.A02
            boolean r3 = X.AnonymousClass06S.A01(r3)
            r3 = r3 ^ 1
            if (r3 != 0) goto L_0x025c
            long r6 = android.os.SystemClock.uptimeMillis()
            long r3 = r0.A00
            long r10 = r6 - r3
            r8 = 250(0xfa, double:1.235E-321)
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x025c
            r0.A00 = r6
            X.4DU r6 = r0.A04
            boolean r3 = X.AnonymousClass3WX.A00(r1, r6)
            if (r3 == 0) goto L_0x00a6
            X.1i5 r4 = r1.A0d
            X.3gp r3 = r1.A1V()
            X.1i7 r7 = r4.A00(r3)
            r9 = 0
            com.instagram.common.session.UserSession r11 = r0.A03
            java.lang.String r3 = "comment_button"
            X.3sc r10 = X.C254513sb.A04(r1, r6, r3)
            r10.A0G(r11, r1)
            r3 = r64
            r10.A09(r3)
            int r3 = r2.A0U
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.A3T = r3
            java.util.List r3 = r7.A00
            r10.A7t = r3
            X.0jB r13 = new X.0jB
            r13.<init>()
            X.0j9 r4 = X.C271774jZ.A23
            boolean r3 = r2.A2r
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r13.A04(r4, r3)
            X.0j9 r8 = X.C271774jZ.A22
            long r3 = r2.A0b
            r14 = 0
            int r7 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            r3 = 0
            if (r7 <= 0) goto L_0x0074
            r3 = 1
        L_0x0074:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r13.A04(r8, r3)
            X.0j9 r14 = X.C271774jZ.A24
            long r7 = r2.A0b
            double r3 = (double) r7
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r13.A04(r14, r3)
            r10.A0k = r13
            X.3kK r4 = r0.A05
            if (r4 == 0) goto L_0x0271
            java.lang.String r3 = X.HWY.A00(r4)
        L_0x0091:
            r10.A6a = r3
            if (r4 == 0) goto L_0x009f
            boolean r3 = r4 instanceof X.AnonymousClass93U
            if (r3 == 0) goto L_0x009f
            X.93U r4 = (X.AnonymousClass93U) r4
            java.lang.String r9 = r4.AmZ()
        L_0x009f:
            r10.A4g = r9
            int r3 = r2.A03
            X.C233822wX.A0E(r11, r10, r1, r6, r3)
        L_0x00a6:
            X.2l0 r7 = r0.A0C
            X.2v9 r4 = X.C233162v9.COMMENT_BUTTON_CLICK
            X.5yf r3 = X.C301155ye.A00()
            r7.DUE(r3, r4, r1, r2)
            boolean r3 = r1.CcK()
            if (r3 != 0) goto L_0x00d9
            X.1GI r10 = r0.A09
            java.lang.String r9 = r1.getId()
            com.instagram.common.session.UserSession r8 = r10.A00
            X.0Tu r7 = X.0Tu.A05
            r3 = 36317105288778525(0x8106370002131d, double:3.0304218496441637E-306)
            boolean r3 = X.182.A06(r7, r8, r3)
            if (r3 == 0) goto L_0x00d9
            if (r9 == 0) goto L_0x00d9
            boolean r3 = X.00l.A0W(r9)
            if (r3 != 0) goto L_0x00d9
            java.util.Set r3 = r10.A01
            r3.add(r9)
        L_0x00d9:
            int r3 = r2.A03
            boolean r3 = X.1sx.A0Q(r1, r3)
            if (r3 == 0) goto L_0x0100
            boolean r3 = r1.CcK()
            if (r3 == 0) goto L_0x00f5
            X.32g r3 = r0.A0A
            boolean r3 = r3.A03(r1, r2)
            if (r3 == 0) goto L_0x00f5
            r2.A0e(r5)
            r2.A0m(r5, r5)
        L_0x00f5:
            com.instagram.common.session.UserSession r3 = r0.A03
            X.C292885jg.A00(r3)
            X.C292905ji.A00(r3, r1, r6, r2)
            r2.A0m(r5, r5)
        L_0x0100:
            boolean r3 = r2.A2e
            r38 = 0
            if (r3 != 0) goto L_0x012e
            com.instagram.common.session.UserSession r8 = r0.A03
            X.0Tu r7 = X.0Tu.A05
            r3 = 36320562737390198(0x81095c00012276, double:3.032608354068214E-306)
            boolean r3 = X.182.A06(r7, r8, r3)
            if (r3 != 0) goto L_0x012e
            r3 = 36320562738176636(0x81095c000d227c, double:3.03260835456556E-306)
            boolean r3 = X.182.A06(r7, r8, r3)
            if (r3 == 0) goto L_0x026d
            X.1Xy r3 = r1.A0C
            java.lang.Boolean r4 = r3.Bvc()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            boolean r38 = X.0qQ.A0K(r4, r3)
        L_0x012e:
            java.lang.String r8 = r1.getId()
            if (r8 == 0) goto L_0x025c
            com.instagram.common.session.UserSession r7 = r0.A03
            X.7a2 r3 = X.C333727a1.A00(r7)
            java.util.Map r3 = r3.A00
            java.lang.Object r5 = r3.get(r8)
            X.9JD r5 = (X.AnonymousClass9JD) r5
            boolean r3 = r1.CcK()
            if (r3 == 0) goto L_0x026a
            boolean r3 = r1.A5e()
            if (r3 != 0) goto L_0x026a
            boolean r3 = r1.A5o()
            if (r3 != 0) goto L_0x026a
            boolean r3 = r1.A5n()
            if (r3 != 0) goto L_0x026a
            X.1Xy r3 = r1.A0C
            com.instagram.user.model.User r3 = r3.CCd()
            if (r3 == 0) goto L_0x026a
            boolean r3 = r3.A2Q()
            if (r3 != 0) goto L_0x026a
            r10 = 1
            X.0Tu r9 = X.0Tu.A05
            r3 = 36328246433889408(0x81105900013c80, double:3.0374675546740766E-306)
            boolean r3 = X.182.A06(r9, r7, r3)
            r50 = 1
            if (r3 != 0) goto L_0x017c
        L_0x0178:
            r50 = 0
            if (r10 == 0) goto L_0x018b
        L_0x017c:
            X.0Tu r9 = X.0Tu.A05
            r3 = 36328246433954945(0x81105900023c81, double:3.0374675547155224E-306)
            boolean r3 = X.182.A06(r9, r7, r3)
            r60 = 1
            if (r3 != 0) goto L_0x018d
        L_0x018b:
            r60 = 0
        L_0x018d:
            boolean r3 = r1.CcK()
            if (r3 == 0) goto L_0x01a2
            X.0Tu r9 = X.0Tu.A05
            r3 = 36330870658843452(0x8112bc0000433c, double:3.03912712510192E-306)
            boolean r3 = X.182.A06(r9, r7, r3)
            r53 = 1
            if (r3 == 0) goto L_0x01a4
        L_0x01a2:
            r53 = 0
        L_0x01a4:
            java.lang.String r23 = r6.getModuleName()
            r15 = 0
            if (r5 == 0) goto L_0x0267
            java.lang.String r9 = r5.A03
        L_0x01ad:
            boolean r35 = X.2R8.A02(r7, r1)
            boolean r36 = r6.isOrganicEligible()
            boolean r37 = r6.isSponsoredEligible()
            X.5OB r14 = X.AnonymousClass5OB.COMMENT_BUTTON
            X.3kK r3 = r0.A05
            if (r3 == 0) goto L_0x0261
            java.lang.String r27 = X.HWY.A00(r3)
            boolean r4 = r3 instanceof X.AnonymousClass93U
            if (r4 == 0) goto L_0x025d
            X.93U r3 = (X.AnonymousClass93U) r3
            java.lang.String r28 = r3.AmZ()
        L_0x01cd:
            int r3 = r2.A03
            int r6 = r2.getPosition()
            boolean r5 = r2.A2V
            int r4 = r2.A0W
            boolean r43 = r1.A5v()
            int r34 = r1.A0r()
            boolean r52 = r1.A4l()
            java.lang.Long r2 = r0.A06
            java.lang.String r30 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.A07
            java.lang.String r32 = X.AnonymousClass4LK.A03(r1)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            X.GmL r13 = new X.GmL
            r18 = r15
            r20 = r15
            r22 = r15
            r25 = r15
            r26 = r15
            r29 = r15
            r31 = r2
            r33 = r15
            r39 = r12
            r40 = r5
            r41 = r12
            r42 = r12
            r44 = r12
            r45 = r12
            r46 = r12
            r47 = r12
            r48 = r12
            r49 = r12
            r51 = r12
            r54 = r12
            r55 = r12
            r56 = r12
            r57 = r12
            r58 = r12
            r59 = r50
            r21 = r8
            r24 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36318771736287670(0x8107bb000519b6, double:3.0314757177591925E-306)
            boolean r9 = X.182.A06(r4, r7, r2)
            X.1Y4 r2 = X.C3018960m.A00()
            X.Hs6 r2 = r2.A00()
            androidx.fragment.app.Fragment r0 = r0.A01
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            boolean r11 = r1.CcK()
            r4 = r15
            r5 = r13
            r6 = r7
            r7 = r15
            r8 = r15
            r10 = r12
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x025c:
            return
        L_0x025d:
            r28 = 0
            goto L_0x01cd
        L_0x0261:
            r27 = r15
            r28 = r15
            goto L_0x01cd
        L_0x0267:
            r9 = r15
            goto L_0x01ad
        L_0x026a:
            r10 = 0
            goto L_0x0178
        L_0x026d:
            r38 = 1
            goto L_0x012e
        L_0x0271:
            r3 = r9
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256153vJ.D4g(X.1Xj, X.3W1, int, boolean):void");
    }
}
