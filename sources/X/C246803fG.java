package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.3fG  reason: invalid class name and case insensitive filesystem */
public final class C246803fG {
    public final Fragment A00;
    public final 1Ng A01;
    public final UserSession A02;
    public final C246813fH A03 = new Object();
    public final AnonymousClass4DU A04;
    public final C2357330z A05;
    public final C2360532g A06;
    public final SearchContext A07;
    public final C249763kK A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3fH, java.lang.Object] */
    public C246803fG(Fragment fragment, 1Ng r3, UserSession userSession, C2357330z r5, AnonymousClass4DU r6, C2360532g r7, SearchContext searchContext, C249763kK r9, String str, String str2, String str3) {
        0qQ.A0B(r3, 4);
        0qQ.A0B(r7, 9);
        this.A05 = r5;
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = r3;
        this.A08 = r9;
        this.A04 = r6;
        this.A09 = str;
        this.A07 = searchContext;
        this.A06 = r7;
        this.A0A = str2;
        this.A0B = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0294, code lost:
        if (X.FGK.A01(r2, new X.C245893de(r9, (X.AnonymousClass3W1) null)) != false) goto L_0x0296;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.1Xj r32, X.AnonymousClass3W1 r33, java.lang.String r34, int r35) {
        /*
            r31 = this;
            r1 = 0
            r8 = 1
            r4 = r31
            androidx.fragment.app.Fragment r0 = r4.A00
            r18 = r0
            androidx.fragment.app.FragmentActivity r0 = r18.getActivity()
            if (r0 == 0) goto L_0x0253
            r0 = r18
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x0017
            X.0nA.A0N(r0)
        L_0x0017:
            com.instagram.common.session.UserSession r2 = r4.A02
            X.3kK r5 = r4.A08
            X.4DU r10 = r4.A04
            r3 = r33
            int r0 = r3.A03
            java.lang.Integer r23 = java.lang.Integer.valueOf(r35)
            r17 = 0
            java.lang.String r25 = "share_button"
            r9 = r32
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r24 = r17
            r26 = r0
            X.C233822wX.A0Q(r19, r20, r21, r22, r23, r24, r25, r26)
            if (r5 == 0) goto L_0x029f
            java.lang.String r28 = r5.getSessionId()
        L_0x0040:
            r6 = r18
            X.0iw r6 = (X.AnonymousClass0iw) r6
            int r0 = r3.getPosition()
            java.lang.Integer r26 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A0W
            java.lang.Integer r27 = java.lang.Integer.valueOf(r0)
            com.instagram.search.common.analytics.SearchContext r0 = r4.A07
            r29 = r34
            r25 = r17
            r30 = r1
            r21 = r9
            r22 = r3
            r23 = r17
            r24 = r0
            r19 = r6
            r20 = r2
            X.C56293Hw6.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            android.content.Context r16 = r18.requireContext()
            java.lang.String r13 = r4.A09
            X.30z r11 = r4.A05
            java.lang.String r14 = r4.A0A
            java.lang.String r12 = r4.A0B
            X.2FW r6 = X.C55018Hap.A00(r9)
            X.2FW r0 = X.2FW.A1D
            if (r6 != r0) goto L_0x0092
            X.1E8 r7 = X.1E7.A00(r2)
            java.lang.String r0 = r9.getId()
            X.1Xj r0 = r7.A02(r0)
            if (r0 != 0) goto L_0x0092
            X.1E8 r0 = X.1E7.A00(r2)
            r0.A01(r9, r8, r1)
        L_0x0092:
            X.1as r0 = X.1as.A04
            X.1ap r0 = r0.A02
            X.F3w r7 = r0.A07(r10, r2, r6)
            r7.A04(r10)
            java.lang.String r0 = r9.getId()
            if (r0 == 0) goto L_0x00a6
            r7.A06(r0)
        L_0x00a6:
            int r15 = r3.A03
            android.os.Bundle r6 = r7.A07
            r0 = 20
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.putInt(r0, r15)
            if (r14 == 0) goto L_0x00be
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putString(r0, r14)
        L_0x00be:
            if (r13 == 0) goto L_0x00c9
            r0 = 2226(0x8b2, float:3.119E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putString(r0, r13)
        L_0x00c9:
            boolean r0 = r10 instanceof X.C232682uF
            if (r0 == 0) goto L_0x00db
            r0 = r10
            X.2uF r0 = (X.C232682uF) r0
            X.0jB r0 = r0.E4l(r9)
            X.0xF r0 = r0.A00()
            r7.A02(r0)
        L_0x00db:
            r7.A03 = r11
            r7.A05 = r3
            int r11 = r3.getPosition()
            r0 = 919(0x397, float:1.288E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putInt(r0, r11)
            r0 = 922(0x39a, float:1.292E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putString(r0, r12)
            r0 = 923(0x39b, float:1.293E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r0 = r17
            r6.putString(r11, r0)
            float r11 = X.C66901Mej.A00(r16)
            r0 = 52
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.putFloat(r0, r11)
            int r11 = r3.A0W
            r0 = 2227(0x8b3, float:3.12E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putInt(r0, r11)
            r0 = 604(0x25c, float:8.46E-43)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r0 = r29
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x029b
            X.XSW r11 = X.XSW.A0F
        L_0x0128:
            r0 = 56
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.putSerializable(r0, r11)
            if (r5 == 0) goto L_0x0142
            java.lang.String r5 = r5.getSessionId()
            if (r5 == 0) goto L_0x0142
            r0 = 215(0xd7, float:3.01E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.putString(r0, r5)
        L_0x0142:
            android.content.Context r0 = r18.requireContext()
            float r13 = X.C66901Mej.A00(r0)
            X.F1K r5 = X.FBM.A03
            X.2FW r0 = X.C55018Hap.A00(r9)
            r12 = 0
            boolean r0 = r5.A00(r2, r0, r1)
            r16 = 0
            if (r0 == 0) goto L_0x015c
            r16 = 1034147594(0x3da3d70a, float:0.08)
        L_0x015c:
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r11 = X.182.A06(r5, r2, r0)
            if (r11 == 0) goto L_0x0267
            r0 = 36318234865375251(0x81073e00051813, double:3.031136198432373E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0267
            X.3de r1 = new X.3de
            r0 = r17
            r1.<init>(r9, r0)
            boolean r0 = X.FGK.A01(r2, r1)
            if (r0 != 0) goto L_0x0296
            r0 = 36318234865637399(0x81073e00091817, double:3.0311361985981565E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            r1 = 1059648963(0x3f28f5c3, float:0.66)
            if (r0 == 0) goto L_0x0195
            r1 = 1060655596(0x3f3851ec, float:0.72)
        L_0x0195:
            float r6 = X.C49752F5d.A00(r1, r13)
        L_0x0199:
            boolean r0 = r9.A55()
            if (r0 == 0) goto L_0x01aa
            r0 = 36326154784880191(0x810e720002363f, double:3.036144787418253E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 != 0) goto L_0x01bb
        L_0x01aa:
            boolean r0 = r9.A55()
            if (r0 != 0) goto L_0x01c7
            r0 = 36326154784945728(0x810e7200033640, double:3.036144787459699E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x01c7
        L_0x01bb:
            r0 = 36326154784814654(0x810e720001363e, double:3.0361447873768073E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x01c7
            r12 = 1
        L_0x01c7:
            X.7Pr r5 = new X.7Pr
            r5.<init>(r2)
            X.IZd r1 = new X.IZd
            r0 = r29
            r1.<init>(r4, r0)
            r5.A0U = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r5.A0a = r0
            r5.A0z = r12
            float r6 = r6 + r16
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e7
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x01e7:
            r5.A03 = r6
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r18.requireActivity()
            X.37D r16 = r1.A01(r0)
            X.7Pu r1 = X.C48943Emh.A00(r16)
            if (r16 == 0) goto L_0x0254
            r6 = r16
            X.37F r6 = (X.AnonymousClass37F) r6
            boolean r0 = r6.A0g
            if (r0 == 0) goto L_0x0254
            if (r1 == 0) goto L_0x0254
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = r1.A03
            X.07Z r0 = r0.getViewLifecycleOwner()
            X.07V r0 = r0.getLifecycle()
            X.07U r1 = r0.A07()
            X.07U r0 = X.07U.A01
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0254
            X.7Ui r1 = r6.A0H
            X.FmO r0 = new X.FmO
            r13 = r4
            r14 = r5
            r15 = r1
            r11 = r0
            r12 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r6.A0H = r0
            r16.A0B()
        L_0x022a:
            int r0 = r3.A03
            boolean r0 = X.C253933re.A00(r9, r0)
            if (r0 == 0) goto L_0x0249
            X.32g r0 = r4.A06
            boolean r0 = r0.A03(r9, r3)
            if (r0 == 0) goto L_0x0240
            r3.A0e(r8)
            r3.A0m(r8, r8)
        L_0x0240:
            X.C292885jg.A00(r2)
            X.C292905ji.A00(r2, r9, r10, r3)
            r3.A0m(r8, r8)
        L_0x0249:
            X.1Ng r1 = r4.A01
            X.INq r0 = new X.INq
            r0.<init>(r8)
            r1.A05(r0)
        L_0x0253:
            return
        L_0x0254:
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r12 = r7.A00()
            if (r16 == 0) goto L_0x022a
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r14 = 255(0xff, float:3.57E-43)
            r11 = r16
            r15 = r14
            r16 = r8
            r11.A0N(r12, r13, r14, r15, r16)
            goto L_0x022a
        L_0x0267:
            r0 = 36318234865637399(0x81073e00091817, double:3.0311361985981565E-306)
            boolean r14 = X.182.A06(r5, r2, r0)
            r0 = 36605860235056455(0x820cd600021547, double:3.2130316403931684E-306)
            long r0 = X.182.A01(r5, r2, r0)
            java.lang.Integer r15 = X.C48817Ekf.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            if (r15 != r1) goto L_0x0283
            r0 = 1
        L_0x0283:
            boolean r0 = X.FGK.A02(r2, r11, r14, r0)
            if (r0 == 0) goto L_0x0199
            X.3de r1 = new X.3de
            r0 = r17
            r1.<init>(r9, r0)
            boolean r0 = X.FGK.A01(r2, r1)
            if (r0 == 0) goto L_0x0199
        L_0x0296:
            r1 = 1062668861(0x3f570a3d, float:0.84)
            goto L_0x0195
        L_0x029b:
            X.XSW r11 = X.XSW.A0A
            goto L_0x0128
        L_0x029f:
            r28 = r17
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246803fG.A00(X.1Xj, X.3W1, java.lang.String, int):void");
    }
}
