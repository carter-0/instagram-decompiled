package X;

import android.view.View;
import com.instagram.android.R;

public final class JG0 extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static void A00(View view, View view2, int i, int i2) {
        view.findViewById(R.id.non_tall_media_top_guide).setGuidelineBegin(i);
        view.findViewById(R.id.non_tall_media_bottom_guide).setGuidelineEnd(i2);
        view.findViewById(R.id.square_media_bottom_guide).setGuidelineEnd(i2);
        view2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JG0(int i, Object obj, Object obj2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: androidx.compose.ui.platform.ComposeView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v151, resolved type: X.HtY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v163, resolved type: com.meta.foa.accountswitcher.UserAccountInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v188, resolved type: androidx.compose.ui.platform.ComposeView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v189, resolved type: androidx.compose.ui.platform.ComposeView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v190, resolved type: androidx.compose.ui.platform.ComposeView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v167, resolved type: X.HtY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v168, resolved type: X.HtY} */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, X.7hM] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0305, code lost:
        if (r18 != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x049f, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04a4, code lost:
        r1.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04cb, code lost:
        if (X.0qQ.A0K(r0.A1y, r5) != false) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0654, code lost:
        return X.I3H.A00(r4, r1, (X.C54715HPu) r2.A01, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0764, code lost:
        if (r9 == null) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0780, code lost:
        if (r3 >= 0) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0866, code lost:
        if (r10 == null) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0884, code lost:
        if (r1 >= 0.8d) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0997, code lost:
        r2 = new X.C58703IwC(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0ac7, code lost:
        r2 = X.C58711IwK.A00(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0acf, code lost:
        return X.C51965G9l.A0f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ac, code lost:
        X.C49949FGe.A02(r4, r1, r3, r2, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x021b, code lost:
        r2.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a9, code lost:
        if (r4 >= r6.size()) goto L_0x02ab;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x06f4  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x08d9  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x091d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) {
        /*
            r31 = this;
            r2 = r31
            r0 = r33
            r1 = r32
            int r3 = r2.A00
            switch(r3) {
                case 3: goto L_0x0011;
                case 4: goto L_0x0066;
                case 5: goto L_0x0142;
                case 6: goto L_0x0162;
                case 7: goto L_0x017b;
                case 8: goto L_0x0194;
                case 9: goto L_0x061f;
                case 10: goto L_0x061f;
                case 11: goto L_0x0636;
                case 12: goto L_0x01b5;
                case 13: goto L_0x01c8;
                case 14: goto L_0x01c8;
                case 15: goto L_0x0249;
                case 16: goto L_0x0283;
                case 17: goto L_0x0356;
                case 18: goto L_0x0467;
                case 19: goto L_0x04a9;
                case 20: goto L_0x0655;
                case 21: goto L_0x066a;
                case 22: goto L_0x0719;
                case 23: goto L_0x081b;
                case 24: goto L_0x05c3;
                case 25: goto L_0x092c;
                case 26: goto L_0x0968;
                case 27: goto L_0x099e;
                case 28: goto L_0x09c9;
                case 29: goto L_0x0a6d;
                case 30: goto L_0x05eb;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.AnonymousClass7TG.A1N(r1, r0)
        L_0x000e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0011:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r3 != r0) goto L_0x0020
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x04a4
        L_0x0020:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x002e
            r3 = 1617026873(0x6061df39, float:6.510316E19)
            java.lang.String r0 = "com.instagram.wonderwall.ui.bottomsheet.WallNuxBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (WallNuxBottomSheetFragment.kt:61)"
            X.0fL.A01(r3, r0)
        L_0x002e:
            java.lang.Object r4 = r2.A01
            X.HlM r4 = (X.C55663HlM) r4
            r0 = 590867024(0x2337ea50, float:9.9700675E-18)
            r1.ExS(r0)
            java.lang.Object r3 = r2.A02
            boolean r0 = r1.AGw(r3)
            java.lang.Object r2 = r1.ECw()
            if (r0 != 0) goto L_0x0048
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0052
        L_0x0048:
            r0 = 42
            X.Wvr r2 = new X.Wvr
            r2.<init>(r3, r0)
            r1.FLL(r2)
        L_0x0052:
            X.0sa r2 = (X.C62320sa) r2
            boolean r0 = X.C51968G9o.A1Y(r1)
            X.C55193Hdj.A00(r1, r4, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x000e
            r0 = 941168564(0x381917b4, float:3.6500118E-5)
            goto L_0x049f
        L_0x0066:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r3 != r0) goto L_0x0075
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x04a4
        L_0x0075:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0083
            r3 = 1192121999(0x470e568f, float:36438.56)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.screens.WallPostComposerScreen.<anonymous> (WallPostComposerScreen.kt:35)"
            X.0fL.A01(r3, r0)
        L_0x0083:
            X.5Zr r4 = X.C287215Zl.A00
            java.lang.Object r3 = r2.A01
            X.GhK r3 = (X.C53029GhK) r3
            java.lang.Object r5 = r2.A02
            X.4gU r5 = (X.C270284gU) r5
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            X.5Zx r0 = X.C287275Zs.A07
            X.5RD r6 = X.C291495hO.A00(r0, r1, r4)
            r4 = 0
            int r9 = X.C287425a7.A00(r1)
            r2 = r1
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r0 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r1, r8)
            X.C51973G9u.A0y(r1, r2)
            X.C51971G9r.A12(r1, r6, r0)
            X.0sL r6 = X.C287485aD.A02
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x00b7
            boolean r0 = X.C51972G9s.A1Q(r1, r9)
            if (r0 != 0) goto L_0x00ba
        L_0x00b7:
            X.C51971G9r.A13(r1, r6, r9)
        L_0x00ba:
            X.C51965G9l.A18(r1, r7)
            r0 = 1103101952(0x41c00000, float:24.0)
            X.G9w.A15(r1, r8, r0)
            java.lang.Object r9 = r5.getValue()
            X.Gm7 r9 = (X.C53321Gm7) r9
            r0 = -1880630859(0xffffffff8fe7d9b5, float:-2.2862216E-29)
            boolean r0 = X.C51967G9n.A1Y(r1, r3, r0)
            java.lang.Object r6 = r1.ECw()
            if (r0 != 0) goto L_0x00d9
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r6 != r0) goto L_0x00df
        L_0x00d9:
            r0 = 18
            X.In7 r6 = X.G9w.A0o(r1, r3, r0)
        L_0x00df:
            X.0Ya r7 = X.C51965G9l.A12(r2, r6)
            X.0sP r7 = (X.0sP) r7
            r6 = 317886837(0x12f29175, float:1.5308205E-27)
            r0 = 20
            X.JFy r0 = X.C59346JFy.A00(r5, r0)
            X.5PJ r13 = X.AnonymousClass5PI.A01(r1, r0, r6)
            r6 = -1721576650(0xffffffff9962d336, float:-1.172658E-23)
            r0 = 21
            X.JFy r0 = X.C59346JFy.A00(r3, r0)
            X.5PJ r14 = X.AnonymousClass5PI.A01(r1, r0, r6)
            r15 = 3456(0xd80, float:4.843E-42)
            r10 = r1
            r11 = r9
            r12 = r7
            X.C56643I5y.A01(r10, r11, r12, r13, r14, r15)
            r0 = 1098907648(0x41800000, float:16.0)
            X.G9w.A15(r1, r8, r0)
            r0 = -1880617448(0xffffffff8fe80e18, float:-2.2882395E-29)
            java.lang.Object r0 = X.C51967G9n.A0n(r1, r5, r0)
            X.Gm7 r0 = (X.C53321Gm7) r0
            X.YBO r0 = r0.A03
            if (r0 != 0) goto L_0x0124
            java.lang.Object r0 = r5.getValue()
            X.Gm7 r0 = (X.C53321Gm7) r0
            X.62P r0 = r0.A06
            X.C56643I5y.A04(r0, r1, r4)
        L_0x0124:
            X.C286565Wx.A0L(r2, r4)
            r0 = -1880613936(0xffffffff8fe81bd0, float:-2.2887679E-29)
            java.lang.Object r0 = X.C51967G9n.A0n(r1, r5, r0)
            X.Gm7 r0 = (X.C53321Gm7) r0
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0137
            X.C56643I5y.A03(r1, r3, r4)
        L_0x0137:
            boolean r0 = X.C51971G9r.A1S(r1, r2, r4)
            if (r0 == 0) goto L_0x000e
            r0 = -1679723078(0xffffffff9be175ba, float:-3.7299207E-22)
            goto L_0x049f
        L_0x0142:
            float r4 = X.AnonymousClass7TE.A04(r1)
            float r3 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r0 = r2.A01
            X.HjP r0 = (X.C55543HjP) r0
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = r0.A00
            X.5PZ r0 = r1.A03
            r0.EWt(r4)
            X.5PZ r0 = r1.A02
            r0.EWt(r3)
            java.lang.Object r0 = r2.A02
            X.0rh r0 = (X.0rh) r0
            r0.A00 = r4
            goto L_0x000e
        L_0x0162:
            com.meta.foa.accountswitcher.UserAccountInfo r1 = (com.meta.foa.accountswitcher.UserAccountInfo) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.String r4 = r1.A02
            java.lang.String r3 = "INSTAGRAM"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x0178
            java.lang.Object r2 = r2.A02
        L_0x0174:
            X.0sL r2 = (X.0sL) r2
            goto L_0x021b
        L_0x0178:
            java.lang.Object r2 = r2.A01
            goto L_0x0174
        L_0x017b:
            com.meta.foa.accountswitcher.UserAccountInfo r1 = (com.meta.foa.accountswitcher.UserAccountInfo) r1
            boolean r9 = X.C51975G9x.A1X(r0, r1)
            java.lang.Object r0 = r2.A01
            X.F3q r0 = (X.C49726F3q) r0
            androidx.fragment.app.Fragment r4 = r0.A00()
            java.lang.Object r0 = r2.A02
            X.Gu2 r0 = (X.C53773Gu2) r0
            com.meta.foa.session.FoaUserSession r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r0 = r0.A02
            goto L_0x01ac
        L_0x0194:
            com.meta.foa.accountswitcher.UserAccountInfo r1 = (com.meta.foa.accountswitcher.UserAccountInfo) r1
            boolean r9 = X.C51975G9x.A1X(r0, r1)
            java.lang.Object r0 = r2.A01
            X.F3q r0 = (X.C49726F3q) r0
            androidx.fragment.app.Fragment r4 = r0.A00()
            java.lang.Object r0 = r2.A02
            X.GtS r0 = (X.C53737GtS) r0
            com.meta.foa.session.FoaUserSession r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r0 = r0.A02
        L_0x01ac:
            r5 = r1
            r6 = r3
            r7 = r2
            r8 = r0
            X.C49949FGe.A02(r4, r5, r6, r7, r8, r9)
            goto L_0x000e
        L_0x01b5:
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A02
            X.GwM r1 = (X.C53916GwM) r1
            X.0sL r3 = r1.A0A
            if (r3 == 0) goto L_0x000e
            java.lang.Object r1 = r2.A01
            r3.invoke(r1, r0)
            goto L_0x000e
        L_0x01c8:
            r6 = r1
            X.HoM r6 = (X.C55839HoM) r6
            r1 = 0
            X.0qQ.A0B(r6, r1)
            java.lang.Object r4 = r2.A02
            X.GvK r4 = (X.C53853GvK) r4
            java.lang.Object r5 = r2.A01
            X.2Wb r5 = (X.2Wb) r5
            X.GbJ r3 = r4.A00
            X.HIE r1 = r4.A01
            X.HtY r1 = r1.A03
            boolean r2 = r6 instanceof X.HHY
            if (r2 != 0) goto L_0x0238
            boolean r2 = r6 instanceof X.C54514HHa
            if (r2 != 0) goto L_0x0238
            boolean r2 = r6 instanceof X.HHZ
            if (r2 != 0) goto L_0x0238
            boolean r2 = r6 instanceof X.HHW
            if (r2 == 0) goto L_0x01f8
            if (r1 == 0) goto L_0x000e
            X.0sP r3 = r4.A02
            X.HI5 r0 = X.HI5.A00
        L_0x01f3:
            r3.invoke(r0)
            goto L_0x000e
        L_0x01f8:
            boolean r2 = r6 instanceof X.HHV
            if (r2 == 0) goto L_0x0206
            if (r1 == 0) goto L_0x000e
            X.0sP r3 = r4.A02
            X.HHi r0 = new X.HHi
            r0.<init>(r1)
            goto L_0x01f3
        L_0x0206:
            boolean r2 = r6 instanceof X.HHX
            if (r2 == 0) goto L_0x0226
            if (r1 == 0) goto L_0x000e
            X.0sP r3 = r4.A02
            X.HI3 r2 = X.HI3.A00
            r3.invoke(r2)
            boolean r2 = r4.A04
            if (r2 == 0) goto L_0x0220
            if (r33 == 0) goto L_0x0220
            X.0sL r2 = r4.A03
        L_0x021b:
            r2.invoke(r1, r0)
            goto L_0x000e
        L_0x0220:
            X.HHo r0 = new X.HHo
            r0.<init>(r1)
            goto L_0x01f3
        L_0x0226:
            boolean r0 = r6 instanceof X.C54516HHc
            if (r0 == 0) goto L_0x022f
            X.0sP r3 = r4.A02
            X.HI7 r0 = X.HI7.A00
            goto L_0x01f3
        L_0x022f:
            boolean r0 = r6 instanceof X.C54515HHb
            if (r0 == 0) goto L_0x000e
            X.0sP r3 = r4.A02
            X.HI4 r0 = X.HI4.A00
            goto L_0x01f3
        L_0x0238:
            r3.A03()
            X.0sP r3 = r4.A02
            int r0 = r6.A00
            java.lang.String r1 = X.C244013aV.A0E(r5, r0)
            X.HHk r0 = new X.HHk
            r0.<init>(r1)
            goto L_0x01f3
        L_0x0249:
            X.HtY r1 = (X.C56146HtY) r1
            X.Hse r0 = (X.C56091Hse) r0
            r3 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r3, r1, r0)
            java.lang.Object r5 = r2.A02
            X.GuQ r5 = (X.C53797GuQ) r5
            java.lang.Object r7 = r2.A01
            X.3Y5 r7 = (X.AnonymousClass3Y5) r7
            X.HMY r2 = r5.A01
            X.Hsu r4 = X.C55226HeH.A00(r2, r1)
            r2 = 49
            X.Ivw r9 = X.C58687Ivw.A00(r1, r5, r2)
            X.Ivx r10 = X.C58688Ivx.A00(r4, r5, r3)
            X.Ivx r11 = X.C58688Ivx.A00(r1, r5, r6)
            r1 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r1 = X.C51972G9s.A0B(r7, r1)
            int r1 = -r1
            r12 = 0
            X.Iu1 r13 = X.C58568Iu1.A00
            r16 = 8388659(0x800033, float:1.1755015E-38)
            r8 = r0
            r14 = r3
            r15 = r1
            X.C55229HeK.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x000e
        L_0x0283:
            X.HIE r1 = (X.HIE) r1
            X.I1c r0 = (X.C56548I1c) r0
            boolean r5 = X.AnonymousClass7TG.A1Z(r1, r0)
            java.util.List r6 = r0.A01
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x000e
            int r4 = r0.A00
            r11 = 0
            boolean r18 = X.AnonymousClass7TF.A1R(r4)
            int r0 = X.DbT.A02(r6, r5)
            boolean r19 = X.AnonymousClass7TF.A1T(r4, r0)
            if (r4 < 0) goto L_0x02ab
            int r3 = r6.size()
            r0 = 1
            if (r4 < r3) goto L_0x02ac
        L_0x02ab:
            r0 = 0
        L_0x02ac:
            r3 = 0
            if (r0 == 0) goto L_0x0353
            java.lang.Object r5 = r6.get(r4)
            X.I1n r5 = (X.C56559I1n) r5
        L_0x02b5:
            java.lang.Object r0 = X.00k.A0K(r6)
            X.I1n r0 = (X.C56559I1n) r0
            X.HQf r4 = r0.A00
            r10 = 1
            if (r4 == 0) goto L_0x02f0
            r10 = 0
            boolean r0 = r4 instanceof X.C54544HIf
            if (r0 == 0) goto L_0x034f
            X.HIf r4 = (X.C54544HIf) r4
            if (r4 == 0) goto L_0x034f
            java.lang.String r9 = r4.A00
            boolean r4 = r4.A01
        L_0x02cd:
            java.lang.Object r8 = r2.A02
            X.GgI r8 = (X.C52965GgI) r8
            r0 = 16
            X.IwN r7 = X.C58714IwN.A01(r8, r0)
            if (r4 != 0) goto L_0x02da
            r7 = r3
        L_0x02da:
            X.05G r6 = r8.A09
        L_0x02dc:
            java.lang.Object r4 = r6.getValue()
            X.HIO r0 = new X.HIO
            r0.<init>(r9, r7)
            boolean r0 = r6.AIY(r4, r0)
            if (r0 == 0) goto L_0x02dc
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository r0 = r8.A05
            r0.A03()
        L_0x02f0:
            java.lang.Object r0 = r2.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r10 == 0) goto L_0x034c
            if (r0 == 0) goto L_0x02fc
            if (r18 == 0) goto L_0x034c
        L_0x02fc:
            r20 = 1
        L_0x02fe:
            java.lang.Object r4 = r2.A02
            X.GgI r4 = (X.C52965GgI) r4
            if (r0 == 0) goto L_0x0307
            r0 = 1
            if (r18 == 0) goto L_0x0308
        L_0x0307:
            r0 = 0
        L_0x0308:
            r4.A01 = r0
            if (r5 == 0) goto L_0x034a
            X.HtY r6 = r5.A01
        L_0x030e:
            r2 = 0
            X.05G r0 = r4.A07
            java.lang.Object r14 = r0.getValue()
            X.HQ0 r14 = (X.HQ0) r14
            X.Icv r13 = X.C57568Icv.A00
            java.lang.String r0 = r1.A04
            X.HQ1 r15 = r1.A02
            X.AnonymousClass7TG.A1R(r14, r13)
            X.HIE r12 = new X.HIE
            r16 = r6
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            X.HQ0 r0 = r12.A01
            boolean r0 = r0 instanceof X.C54520HHg
            if (r0 == 0) goto L_0x0343
            if (r5 == 0) goto L_0x0337
            X.HtY r0 = r5.A01
            if (r0 == 0) goto L_0x0337
            java.lang.Integer r3 = r0.A02
        L_0x0337:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 != r0) goto L_0x033c
            r11 = 1
        L_0x033c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            X.C52965GgI.A00(r4, r0, r2)
        L_0x0343:
            X.05G r0 = r4.A08
            r0.Epw(r12)
            goto L_0x000e
        L_0x034a:
            r6 = r3
            goto L_0x030e
        L_0x034c:
            r20 = 0
            goto L_0x02fe
        L_0x034f:
            r9 = r3
            r4 = 1
            goto L_0x02cd
        L_0x0353:
            r5 = r3
            goto L_0x02b5
        L_0x0356:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r3 != r0) goto L_0x0365
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x04a4
        L_0x0365:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0373
            r3 = 1522431038(0x5abe743e, float:2.68040276E16)
            java.lang.String r0 = "instagram.features.clips.blend.ui.BlendViewerNuxFragment.onCreateView.<anonymous>.<anonymous> (BlendViewerNuxFragment.kt:99)"
            X.0fL.A01(r3, r0)
        L_0x0373:
            r0 = 110903713(0x69c41a1, float:5.877711E-35)
            java.lang.Object r11 = X.C51967G9n.A0m(r1, r0)
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            r17 = 0
            if (r11 != r13) goto L_0x0386
            X.HLR r0 = X.HLR.SUGGESTED_FOR
            androidx.compose.runtime.ParcelableSnapshotMutableState r11 = X.G9t.A0o(r1, r0)
        L_0x0386:
            X.5Oz r11 = (X.C284945Oz) r11
            r12 = r1
            X.5Wx r12 = (X.C286565Wx) r12
            r10 = 0
            X.C286565Wx.A0L(r12, r10)
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            androidx.compose.foundation.layout.FillElement r8 = X.C287205Zk.A01
            androidx.compose.ui.Modifier r7 = r9.Ezh(r8)
            java.lang.Object r0 = r2.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.Object r6 = r2.A02
            X.5RD r4 = X.C51966G9m.A0a(r10)
            int r3 = X.C287425a7.A00(r1)
            X.5RM r2 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r15 = X.C287435a8.A01(r1, r7)
            X.0sa r14 = X.C287485aD.A00
            X.C51973G9u.A0z(r1, r12, r14)
            X.0sL r5 = X.C287485aD.A03
            X.0sL r16 = X.C51969G9p.A0w(r1, r4, r2, r5)
            X.0sL r4 = X.C287485aD.A02
            boolean r2 = r12.A0K
            if (r2 != 0) goto L_0x03c4
            boolean r2 = X.C51972G9s.A1Q(r1, r3)
            if (r2 != 0) goto L_0x03c7
        L_0x03c4:
            X.C51971G9r.A13(r1, r4, r3)
        L_0x03c7:
            X.0sL r15 = X.C51966G9m.A1K(r1, r15)
            X.2DN r3 = X.1zC.A00(r1, r0)
            r2 = 1103101952(0x41c00000, float:24.0)
            X.5S2 r0 = X.C55299HfS.A00
            androidx.compose.ui.Modifier r0 = X.HRG.A00(r9, r0, r2, r2)
            androidx.compose.ui.Modifier r0 = r0.Ezh(r8)
            X.AnonymousClass6G3.A05(r1, r0, r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            androidx.compose.ui.Modifier r0 = X.HRF.A00(r7, r0)
            androidx.compose.ui.Modifier r3 = X.G9t.A0p(r1, r0)
            r0 = -560822774(0xffffffffde92860a, float:-5.2790687E18)
            boolean r2 = X.C51967G9n.A1Z(r1, r6, r0)
            java.lang.Object r0 = r1.ECw()
            if (r2 != 0) goto L_0x03f7
            if (r0 != r13) goto L_0x03ff
        L_0x03f7:
            r0 = 3
            X.Ivz r0 = X.C58690Ivz.A00(r11, r6, r0)
            r1.FLL(r0)
        L_0x03ff:
            androidx.compose.ui.Modifier r0 = X.C51969G9p.A0V(r12, r3, r0)
            X.C287675aa.A02(r1, r0, r10)
            r1.ASN()
            androidx.compose.foundation.layout.FillElement r0 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r2 = r9.Ezh(r0)
            X.5RD r0 = X.G9w.A0M(r1)
            int r7 = X.C287425a7.A00(r1)
            X.5RM r3 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r1, r2)
            X.C51973G9u.A0z(r1, r12, r14)
            X.C287595aO.A00(r1, r0, r5)
            r0 = r16
            boolean r0 = X.C51965G9l.A1Y(r1, r12, r3, r0)
            if (r0 != 0) goto L_0x0433
            boolean r0 = X.C51972G9s.A1Q(r1, r7)
            if (r0 != 0) goto L_0x0436
        L_0x0433:
            X.C51971G9r.A13(r1, r4, r7)
        L_0x0436:
            X.C287595aO.A00(r1, r2, r15)
            java.lang.Object r19 = r11.getValue()
            X.J5f r21 = X.C59072J5f.A00
            r3 = -1033087233(0xffffffffc26c56ff, float:-59.084957)
            r2 = 26
            X.GaB r0 = new X.GaB
            r0.<init>((int) r2, (java.lang.Object) r11, (java.lang.Object) r6)
            X.5PJ r23 = X.AnonymousClass5PI.A01(r1, r0, r3)
            java.lang.String r20 = "blend animation"
            r24 = 1597824(0x186180, float:2.239028E-39)
            r25 = 42
            r16 = r1
            r18 = r17
            r22 = r17
            X.I27.A02(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x000e
            r0 = 954195759(0x38dfdf2f, float:1.067504E-4)
            goto L_0x049f
        L_0x0467:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r3 != r0) goto L_0x0476
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x04a4
        L_0x0476:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0484
            r3 = 1258828059(0x4b08311b, float:8925467.0)
            java.lang.String r0 = "instagram.features.clips.blend.ui.BlendViewerNuxFragment.onCreateView.<anonymous> (BlendViewerNuxFragment.kt:96)"
            X.0fL.A01(r3, r0)
        L_0x0484:
            long r3 = X.C51966G9m.A0A(r1)
            r7 = -11115299(0xffffffffff5664dd, float:-2.849785E38)
            java.lang.Object r6 = r2.A01
            java.lang.Object r5 = r2.A02
            r2 = 17
            X.JG0 r0 = new X.JG0
            r0.<init>(r2, r6, r5)
            boolean r0 = X.C51975G9x.A1U(r1, r0, r7, r3)
            if (r0 == 0) goto L_0x000e
            r0 = 1360875390(0x511d4f7e, float:4.222772E10)
        L_0x049f:
            X.0fL.A00(r0)
            goto L_0x000e
        L_0x04a4:
            r1.Evl()
            goto L_0x000e
        L_0x04a9:
            X.5kq r1 = (X.C293505kq) r1
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            boolean r4 = X.AnonymousClass7TG.A1Z(r1, r0)
            java.lang.Object r3 = r2.A01
            android.app.Dialog r3 = (android.app.Dialog) r3
            r3.hide()
            java.lang.Boolean r3 = r0.A23
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            boolean r3 = X.0qQ.A0K(r3, r5)
            if (r3 != 0) goto L_0x04cd
            java.lang.Boolean r3 = r0.A1y
            boolean r5 = X.0qQ.A0K(r3, r5)
            r3 = 0
            if (r5 == 0) goto L_0x04ce
        L_0x04cd:
            r3 = 1
        L_0x04ce:
            java.lang.Object r5 = r2.A02
            X.GiF r5 = (X.C53081GiF) r5
            com.instagram.common.session.UserSession r2 = r5.A07
            com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures r7 = X.C319116q4.A00(r2, r1, r0, r3, r4)
            X.0eM r6 = r5.A0C
            java.lang.Object r8 = r6.getValue()
            X.LPH r8 = (X.LPH) r8
            X.JVg r3 = X.C59722JVg.DRAFT_FOLDER
            X.0qQ.A0B(r8, r4)
            boolean r2 = r7.A01
            if (r2 == 0) goto L_0x050d
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972694(0x7f135256, float:1.9582403E38)
        L_0x04f4:
            android.content.Context r0 = r5.A04
            X.8ab r1 = X.DbS.A0Y(r0)
            r1.A0s(r4)
            r1.A09(r3)
            r1.A08(r2)
            X.I8X r0 = X.I8X.A00
            r1.A0E(r0)
            X.DbT.A1V(r1)
            goto L_0x000e
        L_0x050d:
            boolean r2 = r7.A05
            if (r2 == 0) goto L_0x051d
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972697(0x7f135259, float:1.9582409E38)
            goto L_0x04f4
        L_0x051d:
            boolean r2 = r7.A0E
            if (r2 == 0) goto L_0x052d
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            r8.A04(r3, r0)
            r3 = 2131972705(0x7f135261, float:1.9582425E38)
            r2 = 2131972702(0x7f13525e, float:1.958242E38)
            goto L_0x04f4
        L_0x052d:
            boolean r2 = r7.A04
            if (r2 == 0) goto L_0x053d
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972696(0x7f135258, float:1.9582407E38)
            goto L_0x04f4
        L_0x053d:
            boolean r2 = r7.A0F
            if (r2 == 0) goto L_0x054d
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972703(0x7f13525f, float:1.9582421E38)
            goto L_0x04f4
        L_0x054d:
            boolean r2 = r7.A0C
            if (r2 == 0) goto L_0x0558
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972701(0x7f13525d, float:1.9582417E38)
            goto L_0x04f4
        L_0x0558:
            boolean r2 = r7.A03
            if (r2 == 0) goto L_0x0563
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972695(0x7f135257, float:1.9582405E38)
            goto L_0x04f4
        L_0x0563:
            boolean r2 = r7.A0D
            if (r2 == 0) goto L_0x0573
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972693(0x7f135255, float:1.95824E38)
            goto L_0x04f4
        L_0x0573:
            boolean r2 = r7.A08
            if (r2 == 0) goto L_0x0584
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972699(0x7f13525b, float:1.9582413E38)
            goto L_0x04f4
        L_0x0584:
            boolean r2 = r7.A0B
            if (r2 == 0) goto L_0x0595
            java.lang.Integer r0 = X.AnonymousClass05K.A0G
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972700(0x7f13525c, float:1.9582415E38)
            goto L_0x04f4
        L_0x0595:
            boolean r2 = r7.A06
            if (r2 == 0) goto L_0x05a6
            java.lang.Integer r0 = X.AnonymousClass05K.A07
            r8.A04(r3, r0)
            r3 = 2131972704(0x7f135260, float:1.9582423E38)
            r2 = 2131972698(0x7f13525a, float:1.958241E38)
            goto L_0x04f4
        L_0x05a6:
            boolean r2 = r7.A09
            if (r2 == 0) goto L_0x05be
            android.content.Context r4 = r5.A04
            r3 = 4
            X.I8H r2 = new X.I8H
            r2.<init>(r3, r1, r5, r0)
            r1 = 0
            java.lang.Object r0 = r6.getValue()
            X.LPH r0 = (X.LPH) r0
            X.C319116q4.A03(r4, r2, r1, r0, r7)
            goto L_0x000e
        L_0x05be:
            X.C53081GiF.A01(r1, r0, r5)
            goto L_0x000e
        L_0x05c3:
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r4 = r2.A02
            X.GFJ r4 = (X.GFJ) r4
            X.GDe r3 = r4.A08
            r3.A05 = r0
            java.lang.Object r0 = r2.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r1)
            X.Gak r3 = r4.A0E
            if (r3 == 0) goto L_0x000e
            java.lang.String r2 = X.C52672Gak.A02(r4)
            if (r2 == 0) goto L_0x000e
            r1 = 0
            java.lang.String r0 = "lead_ads_first_question_continue_click"
            X.C52672Gak.A03(r3, r1, r2, r0)
            goto L_0x000e
        L_0x05eb:
            java.util.List r0 = (java.util.List) r0
            r6 = 0
            boolean r5 = X.AnonymousClass7TF.A1U(r6, r1, r0)
            boolean r3 = X.AnonymousClass7TE.A1b(r0)
            if (r3 == 0) goto L_0x0608
            java.lang.Object r3 = r2.A02
            X.Ghp r3 = (X.C53057Ghp) r3
            X.Gh0 r4 = r3.A00
            X.05G r3 = r4.A0D
            X.AnonymousClass7TF.A1O(r3, r6)
            X.05G r3 = r4.A0C
            X.AnonymousClass7TF.A1O(r3, r5)
        L_0x0608:
            java.lang.Object r2 = r2.A01
            X.LLz r2 = (X.C64081LLz) r2
            r5 = 0
            X.1IX r3 = r2.A00
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            X.LDd r2 = new X.LDd
            r4 = r2
            r6 = r1
            r7 = r0
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            r3.resumeWith(r2)
            goto L_0x000e
        L_0x061f:
            X.7et r1 = (X.C336607et) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r3 = r2.A02
            X.JMO r3 = (X.JMO) r3
            X.IcR r3 = (X.C57539IcR) r3
            X.0sL r3 = r3.A02
            java.lang.Object r4 = r3.invoke(r1, r0)
            X.3mp r4 = (X.C251263mp) r4
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x064c
        L_0x0636:
            X.7et r1 = (X.C336607et) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r3 = r2.A02
            X.JMO r3 = (X.JMO) r3
            X.IcR r3 = (X.C57539IcR) r3
            X.0sL r3 = r3.A02
            java.lang.Object r4 = r3.invoke(r1, r0)
            X.3mp r4 = (X.C251263mp) r4
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
        L_0x064c:
            java.lang.Object r0 = r2.A01
            X.HPu r0 = (X.C54715HPu) r0
            X.2Tp r0 = X.I3H.A00(r4, r1, r0, r3)
            return r0
        L_0x0655:
            java.lang.Object r3 = r2.A02
            X.Gx4 r3 = (X.C53960Gx4) r3
            X.IZD r1 = r3.A04
            java.lang.Object r0 = r2.A01
            X.6Rm r0 = (X.C307786Rm) r0
            r1.A02 = r0
            r0 = 40
            X.Ivl r2 = new X.Ivl
            r2.<init>(r3, r0)
            goto L_0x0acb
        L_0x066a:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = 1
            X.0qQ.A0B(r0, r7)
            java.lang.Object r10 = r2.A02
            X.GJn r10 = (X.C52222GJn) r10
            r3 = 2131440757(0x7f0b3475, float:1.8503506E38)
            android.view.View r9 = X.AnonymousClass7TF.A0F(r0, r3)
            android.widget.SeekBar r9 = (android.widget.SeekBar) r9
            boolean r4 = r10.A0C
            r11 = 0
            if (r4 != 0) goto L_0x0694
            boolean r1 = r10.A0B
            if (r1 == 0) goto L_0x0694
            java.lang.ref.WeakReference r1 = r10.A08
            java.lang.Object r8 = r1.get()
            X.Tpg r6 = new X.Tpg
            r6.<init>(r7, r8, r9, r10, r11)
            r9.setOnSeekBarChangeListener(r6)
        L_0x0694:
            java.lang.Object r5 = r2.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            r1 = 2131165206(0x7f070016, float:1.7944623E38)
            long r1 = X.C244013aV.A0C(r5, r1)
            int r8 = X.C51969G9p.A09(r5, r1)
            r1 = 9221401712017801217(0x7ff9000000000001, double:NaN)
            int r1 = X.C51969G9p.A09(r5, r1)
            int r8 = r8 + r1
            boolean r6 = r10.A0B
            if (r6 == 0) goto L_0x0714
            if (r4 == 0) goto L_0x070f
            r1 = 2131165293(0x7f07006d, float:1.79448E38)
            long r1 = X.C244013aV.A0C(r5, r1)
            int r7 = X.C51969G9p.A09(r5, r1)
            int r7 = r7 + r8
        L_0x06bf:
            if (r6 != 0) goto L_0x0710
            if (r4 == 0) goto L_0x070d
            r1 = 2131165293(0x7f07006d, float:1.79448E38)
        L_0x06c6:
            long r1 = X.C244013aV.A0C(r5, r1)
            int r4 = X.C51969G9p.A09(r5, r1)
            int r4 = r4 + r8
        L_0x06cf:
            r1 = 2131440765(0x7f0b347d, float:1.8503523E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r0, r1)
            r1 = 52
            X.C56801ICy.A01(r2, r1, r10)
            r1 = 2131440758(0x7f0b3476, float:1.8503508E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r0, r1)
            if (r6 != 0) goto L_0x06e6
            r11 = 8
        L_0x06e6:
            r1.setVisibility(r11)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r0, r3)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r1 = 2131231361(0x7f080281, float:1.80788E38)
            if (r6 == 0) goto L_0x06f7
            r1 = 2131231359(0x7f08027f, float:1.8078797E38)
        L_0x06f7:
            android.graphics.drawable.Drawable r1 = X.C244013aV.A0D(r5, r1)
            r2.setProgressDrawable(r1)
            android.animation.ValueAnimator r1 = X.C52222GJn.A00(r0, r9, r10, r7, r4)
            r0 = 22
            X.IwO r0 = X.C58715IwO.A01(r1, r0)
            X.3eI r0 = X.C51965G9l.A0f(r0)
            return r0
        L_0x070d:
            r4 = 0
            goto L_0x06cf
        L_0x070f:
            r7 = 0
        L_0x0710:
            r1 = 2131165248(0x7f070040, float:1.7944708E38)
            goto L_0x06c6
        L_0x0714:
            int r7 = r9.getHeight()
            goto L_0x06bf
        L_0x0719:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout) r0
            r3 = 1
            X.0qQ.A0B(r0, r3)
            java.lang.Object r4 = r2.A02
            X.GxU r4 = (X.C53986GxU) r4
            int r1 = r4.A03
            r0.setCornerRadius(r1)
            r7 = 0
            r0.setBackgroundColor(r7)
            r0.setStrokeWidth(r3)
            java.lang.Object r2 = r2.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            android.content.Context r6 = r0.getContext()
            r1 = 2130970259(0x7f040693, float:1.7549223E38)
            int r1 = X.C51968G9o.A08(r6, r2, r1)
            r0.setStrokeColor(r1)
            r1 = 2131443053(0x7f0b3d6d, float:1.8508163E38)
            android.view.View r3 = X.AnonymousClass7TE.A0b(r0, r1)
            r1 = 2131428884(0x7f0b0614, float:1.8479425E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r0, r1)
            int r1 = r4.A04
            r3.setBackgroundColor(r1)
            int r1 = r4.A01
            r2.setBackgroundColor(r1)
            X.1Xj r1 = r4.A07
            if (r1 == 0) goto L_0x0809
            X.0qQ.A07(r6)
            com.instagram.common.typedurl.ImageUrlBase r9 = X.C52154GGw.A00(r6, r1)
            if (r9 != 0) goto L_0x076f
        L_0x0766:
            X.0kg r3 = X.0kg.A06
            java.lang.String r2 = "MultiAdsPhotoLayoutClipsComponent"
            java.lang.String r1 = "imagePlaceHolderUrl is null"
            X.0wb.A01(r3, r2, r1)
        L_0x076f:
            float r1 = r4.A00
            double r1 = (double) r1
            r10 = 0
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x0782
            r10 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            r1 = 1
            if (r3 < 0) goto L_0x0783
        L_0x0782:
            r1 = 0
        L_0x0783:
            java.lang.String r8 = "Required value was null."
            if (r1 == 0) goto L_0x07f5
            r1 = 2131433224(0x7f0b1708, float:1.8488228E38)
            android.view.View r5 = r0.findViewById(r1)
            r3 = r5
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r9 == 0) goto L_0x0811
            X.0iw r1 = r4.A05
            r3.setUrl(r9, r1)
        L_0x0798:
            X.0qQ.A0A(r5)
            boolean r5 = r4.A0B
            if (r5 == 0) goto L_0x07ed
            r1 = 22
            X.0qQ.A07(r6)
            int r2 = X.C61380mr.A01(r6, r1)
        L_0x07a8:
            boolean r1 = r4.A0A
            if (r1 == 0) goto L_0x07e3
            r1 = 72
            if (r5 == 0) goto L_0x07b2
            r1 = 44
        L_0x07b2:
            int r1 = X.C61380mr.A01(r6, r1)
        L_0x07b6:
            A00(r0, r3, r2, r1)
            java.util.HashMap r1 = r4.A09
            java.lang.String r0 = r4.A08
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x080c
            java.util.List r1 = (java.util.List) r1
            int r0 = r4.A02
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.adapter.common.LithoClipsMultiAdsPhotoViewHolder"
            X.0qQ.A0C(r2, r0)
            X.Idb r2 = (X.C57610Idb) r2
            com.instagram.common.session.UserSession r1 = r4.A06
            X.Hqg r0 = new X.Hqg
            r0.<init>(r3, r1)
            r2.A00 = r0
            r0 = 26
            X.IwO r2 = X.C58715IwO.A01(r3, r0)
            goto L_0x0acb
        L_0x07e3:
            if (r5 == 0) goto L_0x07ea
            int r1 = X.C61380mr.A01(r6, r7)
            goto L_0x07b6
        L_0x07ea:
            r1 = 32
            goto L_0x07b2
        L_0x07ed:
            X.0qQ.A07(r6)
            int r2 = X.C61380mr.A01(r6, r7)
            goto L_0x07a8
        L_0x07f5:
            r1 = 2131429761(0x7f0b0981, float:1.8481204E38)
            android.view.View r5 = r0.findViewById(r1)
            r3 = r5
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r9 == 0) goto L_0x0816
            X.0iw r2 = r4.A05
            X.1Tw r1 = X.1Tw.A02
            r3.setUrl(r9, r2, r1)
            goto L_0x0798
        L_0x0809:
            r9 = 0
            goto L_0x0766
        L_0x080c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0811:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0816:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x081b:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout) r0
            r3 = 1
            X.0qQ.A0B(r0, r3)
            java.lang.Object r5 = r2.A02
            X.GxV r5 = (X.C53987GxV) r5
            int r1 = r5.A02
            r0.setCornerRadius(r1)
            r6 = 0
            r0.setBackgroundColor(r6)
            r0.setStrokeWidth(r3)
            java.lang.Object r2 = r2.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            android.content.Context r8 = r0.getContext()
            r1 = 2130970259(0x7f040693, float:1.7549223E38)
            int r1 = X.C51968G9o.A08(r8, r2, r1)
            r0.setStrokeColor(r1)
            r1 = 2131443053(0x7f0b3d6d, float:1.8508163E38)
            android.view.View r3 = X.AnonymousClass7TE.A0b(r0, r1)
            r1 = 2131428884(0x7f0b0614, float:1.8479425E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r0, r1)
            int r1 = r5.A03
            r3.setBackgroundColor(r1)
            int r1 = r5.A01
            r2.setBackgroundColor(r1)
            X.1Xj r1 = r5.A07
            if (r1 == 0) goto L_0x091a
            X.0qQ.A07(r8)
            com.instagram.common.typedurl.ImageUrlBase r10 = X.C52154GGw.A00(r8, r1)
            if (r10 != 0) goto L_0x0871
        L_0x0868:
            X.0kg r3 = X.0kg.A06
            java.lang.String r2 = "MultiAdsVideoLayoutClipsComponent"
            java.lang.String r1 = "imagePlaceHolderUrl is null"
            X.0wb.A01(r3, r2, r1)
        L_0x0871:
            boolean r7 = r5.A0B
            float r1 = r5.A00
            double r1 = (double) r1
            r11 = 0
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x0886
            r11 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            r11 = 1
            if (r3 < 0) goto L_0x0887
        L_0x0886:
            r11 = 0
        L_0x0887:
            java.lang.String r9 = "Required value was null."
            if (r11 == 0) goto L_0x0906
            r1 = 2131433224(0x7f0b1708, float:1.8488228E38)
            android.view.View r4 = r0.findViewById(r1)
            r3 = r4
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r10 == 0) goto L_0x0922
            X.0iw r1 = r5.A05
            r3.setUrl(r10, r1)
        L_0x089c:
            X.0qQ.A0A(r4)
            r1 = 2131429762(0x7f0b0982, float:1.8481206E38)
            if (r11 == 0) goto L_0x08a7
            r1 = 2131433241(0x7f0b1719, float:1.8488262E38)
        L_0x08a7:
            android.view.View r4 = r0.findViewById(r1)
            X.0qQ.A0A(r4)
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r4 = (com.instagram.ui.simplevideolayout.SimpleVideoLayout) r4
            if (r7 == 0) goto L_0x08fe
            r1 = 22
            X.0qQ.A07(r8)
            int r2 = X.C61380mr.A01(r8, r1)
        L_0x08bb:
            boolean r1 = r5.A0A
            if (r1 == 0) goto L_0x08f4
            r1 = 72
            if (r7 == 0) goto L_0x08c5
            r1 = 44
        L_0x08c5:
            int r1 = X.C61380mr.A01(r8, r1)
        L_0x08c9:
            A00(r0, r3, r2, r1)
            r4.setVisibility(r6)
            java.util.HashMap r1 = r5.A09
            java.lang.String r0 = r5.A08
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x091d
            java.util.List r1 = (java.util.List) r1
            int r0 = r5.A04
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.adapter.common.LithoClipsMultiAdsVideoViewHolder"
            X.0qQ.A0C(r1, r0)
            X.Idc r1 = (X.C57611Idc) r1
            r1.A01 = r4
            r1.A00 = r3
            r0 = 13
            X.Iw1 r2 = X.C58692Iw1.A00(r3, r4, r0)
            goto L_0x0acb
        L_0x08f4:
            if (r7 == 0) goto L_0x08fb
            int r1 = X.C61380mr.A01(r8, r6)
            goto L_0x08c9
        L_0x08fb:
            r1 = 32
            goto L_0x08c5
        L_0x08fe:
            X.0qQ.A07(r8)
            int r2 = X.C61380mr.A01(r8, r6)
            goto L_0x08bb
        L_0x0906:
            r1 = 2131429761(0x7f0b0981, float:1.8481204E38)
            android.view.View r4 = r0.findViewById(r1)
            r3 = r4
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r10 == 0) goto L_0x0927
            X.0iw r2 = r5.A05
            X.1Tw r1 = X.1Tw.A02
            r3.setUrl(r10, r2, r1)
            goto L_0x089c
        L_0x091a:
            r10 = 0
            goto L_0x0868
        L_0x091d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0922:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0927:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x092c:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r7 = r2.A01
            X.3Y5 r7 = (X.AnonymousClass3Y5) r7
            java.lang.Object r8 = r2.A02
            X.GxK r8 = (X.C53976GxK) r8
            long r3 = r8.A01
            int r1 = X.C51969G9p.A09(r7, r3)
            float r2 = (float) r1
            long r5 = r8.A00
            X.2V4 r1 = r7.Bnf()
            X.2Wd.A00(r1, r5)
            X.H7t r5 = new X.H7t
            r5.<init>(r2)
            X.2Wd r1 = r8.A02
            if (r1 == 0) goto L_0x095d
            long r1 = r1.A00
            int r1 = X.C51969G9p.A09(r7, r1)
            float r1 = (float) r1
            r0.setPageSpacing(r1)
        L_0x095d:
            int r1 = X.C51969G9p.A09(r7, r3)
            r0.A0C = r1
            r0.A0J = r5
            r1 = 30
            goto L_0x0997
        L_0x0968:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.2V1 r3 = r1.A05
            r1 = 0
            X.GYb r4 = new X.GYb
            r4.<init>(r3, r1)
            java.lang.Object r3 = r2.A02
            X.GxK r3 = (X.C53976GxK) r3
            r4.A01(r0, r1)
            X.0sP r1 = r3.A03
            java.lang.Object r1 = r1.invoke(r0)
            java.util.List r1 = (java.util.List) r1
            r4.A02(r1)
            r2 = 6
            X.Oz7 r1 = new X.Oz7
            r1.<init>(r3, r2)
            r0.A0P(r1)
            r1 = 31
        L_0x0997:
            X.IwC r2 = new X.IwC
            r2.<init>(r0, r1)
            goto L_0x0acb
        L_0x099e:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r7 = 1
            X.0qQ.A0B(r0, r7)
            java.lang.Object r6 = r2.A01
            X.3Y5 r6 = (X.AnonymousClass3Y5) r6
            java.lang.Object r2 = r2.A02
            X.GxW r2 = (X.C53988GxW) r2
            long r3 = r2.A02
            int r1 = X.C51969G9p.A09(r6, r3)
            float r5 = (float) r1
            long r1 = r2.A01
            int r1 = X.C51969G9p.A09(r6, r1)
            float r1 = (float) r1
            X.H7v r2 = new X.H7v
            r2.<init>(r5, r1)
            int r1 = X.C51969G9p.A09(r6, r3)
            r0.A0C = r1
            r0.A0J = r2
            goto L_0x0ac7
        L_0x09c9:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.2V1 r3 = r1.A05
            r1 = 0
            X.GYb r13 = new X.GYb
            r13.<init>(r3, r1)
            java.lang.Object r14 = r2.A02
            X.GxW r14 = (X.C53988GxW) r14
            int r12 = r14.A00
            r13.A01(r0, r12)
            X.Jvs r1 = r14.A03
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x09f2:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0a5f
            java.lang.Object r10 = r16.next()
            X.GrI r10 = (X.C53603GrI) r10
            int r9 = r10.A00
            com.instagram.common.session.UserSession r1 = r14.A05
            r19 = r1
            X.0iw r1 = r14.A04
            r18 = r1
            boolean r1 = r14.A0E
            r17 = r1
            java.util.HashMap r15 = r14.A09
            java.util.HashMap r8 = r14.A0A
            X.JQn r7 = r14.A06
            java.util.List r1 = r14.A0B
            java.lang.Object r6 = X.00k.A0O(r1, r9)
            X.0sa r6 = (X.C62320sa) r6
            java.util.List r1 = r14.A0C
            if (r1 == 0) goto L_0x0a5d
            java.lang.Object r5 = X.00k.A0O(r1, r9)
            X.0sa r5 = (X.C62320sa) r5
        L_0x0a24:
            boolean r30 = X.AnonymousClass7TF.A1S(r9, r12)
            X.Hla r4 = r14.A07
            java.lang.String r3 = r14.A08
            r2 = 4
            X.Ino r1 = new X.Ino
            r1.<init>(r0, r9, r2)
            X.Gvd r2 = new X.Gvd
            r26 = r6
            r27 = r5
            r28 = r1
            r29 = r17
            r21 = r10
            r22 = r4
            r23 = r3
            r24 = r15
            r25 = r8
            r17 = r2
            r20 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.7hM r3 = new X.7hM
            r3.<init>()
            r3.A00 = r2
            X.7ho r1 = new X.7ho
            r1.<init>(r3)
            r11.add(r1)
            goto L_0x09f2
        L_0x0a5d:
            r5 = 0
            goto L_0x0a24
        L_0x0a5f:
            r13.A02(r11)
            r2 = 7
            X.Oz7 r1 = new X.Oz7
            r1.<init>(r14, r2)
            r0.A0P(r1)
            r7 = 2
            goto L_0x0ac7
        L_0x0a6d:
            androidx.compose.ui.platform.ComposeView r0 = (androidx.compose.ui.platform.ComposeView) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r7 = r2.A02
            X.Gwu r7 = (X.C53950Gwu) r7
            java.lang.Object r6 = r2.A01
            X.0xG r6 = (X.0xG) r6
            boolean r1 = r0.isAttachedToWindow()
            if (r1 == 0) goto L_0x0ab0
            r4 = 1
            boolean r1 = com.facebook.systrace.Systrace.A0E(r4)
            if (r1 == 0) goto L_0x0a91
            r2 = 1610471026(0x5ffdd672, float:3.6581865E19)
            java.lang.String r1 = "ThreadsComposePrimitiveComponent.bind(uiState)"
            X.0fS.A01(r1, r2)
        L_0x0a91:
            android.app.Activity r8 = r7.A00     // Catch:{ all -> 0x0aa2 }
            com.instagram.common.session.UserSession r3 = r7.A01     // Catch:{ all -> 0x0aa2 }
            X.GrJ r2 = r7.A03     // Catch:{ all -> 0x0aa2 }
            X.Hlc r1 = r7.A02     // Catch:{ all -> 0x0aa2 }
            r9 = r0
            r10 = r6
            r11 = r3
            r12 = r1
            r13 = r2
            X.GZM.A00(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0aa2 }
            goto L_0x0ab9
        L_0x0aa2:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)
            if (r0 == 0) goto L_0x0aaf
            r0 = -994942345(0xffffffffc4b26277, float:-1427.077)
            X.0fS.A00(r0)
        L_0x0aaf:
            throw r1
        L_0x0ab0:
            X.GZL r1 = new X.GZL
            r1.<init>(r0, r0, r6, r7)
            r0.addOnAttachStateChangeListener(r1)
            goto L_0x0ac5
        L_0x0ab9:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r4)
            if (r1 == 0) goto L_0x0ac5
            r1 = -450586221(0xffffffffe5249993, float:-4.8581315E22)
            X.0fS.A00(r1)
        L_0x0ac5:
            r7 = 12
        L_0x0ac7:
            X.IwK r2 = X.C58711IwK.A00(r0, r7)
        L_0x0acb:
            X.3eI r0 = X.C51965G9l.A0f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JG0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
