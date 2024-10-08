package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GCV implements C2357330z {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass4DH A02;
    public final C270694h9 A03;
    public final ClipsViewerConfig A04;
    public final 1wn A05;
    public final UserSession A06;
    public final C246813fH A07;
    public final AnonymousClass4DU A08;
    public final JU5 A09;
    public final AnonymousClass324 A0A;
    public final AnonymousClass32W A0B;
    public final AnonymousClass93U A0C;
    public final C55948HqC A0D;
    public final JR1 A0E;
    public final H3C A0F;
    public final C55684Hlh A0G;
    public final GF2 A0H;

    public final void A02(View view, C267324bN r22) {
        1Xj r13;
        View view2 = view;
        if (view != null && (r13 = r22.A02) != null) {
            UserSession userSession = this.A06;
            if (182.A06(0Tu.A05, userSession, 2342162575518604773L)) {
                long currentTimeMillis = System.currentTimeMillis() - ((long) ViewConfiguration.getLongPressTimeout());
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                Rect rect = new Rect(i, i2, view2.getWidth() + i, view2.getHeight() + i2);
                C246813fH r6 = this.A07;
                FragmentActivity fragmentActivity = this.A01;
                Integer num = AnonymousClass05K.A0N;
                AnonymousClass4DU r11 = this.A08;
                ViewParent parent = view2.getParent();
                0qQ.A07(parent);
                r6.A00(rect, parent, fragmentActivity, this.A02, r11, userSession, r13, r11, 2FW.A0W, num, 0, currentTimeMillis);
                1Av A002 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A002, A002.A2n, 1Av.A8a, 84, true);
            }
        }
    }

    public final void A03(View view, C267324bN r20, C52058GDe gDe, String str, boolean z, boolean z2) {
        1Xj r1;
        C65251bZ BtX;
        String AgC;
        C267324bN r14 = r20;
        C52058GDe gDe2 = gDe;
        boolean A1U = AnonymousClass7TF.A1U(0, r14, gDe2);
        View view2 = view;
        if (z) {
            A02(view2, r14);
            return;
        }
        if (z2) {
            UserSession userSession = this.A06;
            if (182.A06(0Tu.A05, userSession, 36320652933866198L)) {
                IQ2 iq2 = new IQ2(A1U ? 1 : 0, view2, r14, gDe2, this);
                E68.A08.A00(this.A01, GPK.NEW_TOOLTIP, userSession, iq2, r14.A0C(), this.A08.getModuleName(), (String) null, false, A1U);
                return;
            }
        }
        if (r14.A01 != C295365o2.AD_PREVIEW) {
            C51966G9m.A1O(this.A03, C233162v9.SHARE_BUTTON_CLICK, r14, gDe2);
            1Xj r12 = r14.A02;
            String str2 = str;
            if (r12 == null || r12.A4y() != A1U || (r1 = r14.A02) == null || (BtX = r1.A0C.BtX()) == null || (AgC = BtX.AgC()) == null || AgC.length() == 0) {
                A00(view2, r14, gDe2, this, str2);
                return;
            }
            this.A0B.A00(this.A02, new ITP(view2, r14, gDe2, this, str2), (C55539HjL) null, AgC, C56587I2r.A00(r14.A02, this.A08.getModuleName()));
        }
    }

    public final void Dgf(1Xj r3, AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r3, 0);
        if (r4 != null) {
            AnonymousClass324 r1 = this.A0A;
            r1.DgX(r3, r4, r1.CBn(), i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3fH, java.lang.Object] */
    public /* synthetic */ GCV(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r21, C270694h9 r22, ClipsViewerConfig clipsViewerConfig, 1wn r24, UserSession userSession, AnonymousClass4DU r26, JU5 ju5, AnonymousClass93U r28, C55948HqC hqC, JR1 jr1, H3C h3c, C55684Hlh hlh, GF2 gf2) {
        UserSession userSession2 = userSession;
        AnonymousClass32W r2 = new AnonymousClass32W(userSession2);
        ? obj = new Object();
        ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
        AnonymousClass4DH r10 = r21;
        AnonymousClass4DU r12 = r26;
        AnonymousClass93U r14 = r28;
        C55948HqC hqC2 = hqC;
        GCW gcw = new GCW(r10, userSession2, r12, clipsViewerConfig2.A0S, r14, hqC2, String.valueOf(clipsViewerConfig2.A0g), clipsViewerConfig2.A0p);
        C270694h9 r7 = r22;
        C51974G9v.A1Q(r12, hqC2, r7, r14);
        JU5 ju52 = ju5;
        C55684Hlh hlh2 = hlh;
        GF2 gf22 = gf2;
        C51974G9v.A1R(gf22, ju52, hlh2, userSession2);
        this.A01 = fragmentActivity;
        this.A05 = r24;
        this.A0E = jr1;
        this.A00 = context;
        this.A0F = h3c;
        this.A02 = r10;
        this.A08 = r12;
        this.A0D = hqC2;
        this.A03 = r7;
        this.A0C = r14;
        this.A0H = gf22;
        this.A09 = ju52;
        this.A0G = hlh2;
        this.A06 = userSession2;
        this.A04 = clipsViewerConfig2;
        this.A0B = r2;
        this.A07 = obj;
        this.A0A = gcw;
    }

    /* JADX WARNING: type inference failed for: r0v61, types: [X.Hi2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f4, code lost:
        if (X.182.A06(r11, r1, 36326154784880191L) == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        if (X.182.A06(r11, r1, 36326154784945728L) != false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0109, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0113, code lost:
        if (X.182.A06(r11, r1, 36326154784814654L) != false) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r27, X.C267324bN r28, X.C52058GDe r29, X.GCV r30, java.lang.String r31) {
        /*
            r3 = r28
            X.1Xj r0 = r3.A02
            r17 = r0
            if (r0 == 0) goto L_0x028f
            r2 = r30
            android.content.Context r7 = r2.A00
            X.Hlh r0 = r2.A0G
            r20 = r0
            java.lang.String r5 = r0.A00
            com.instagram.common.session.UserSession r1 = r2.A06
            X.4DU r0 = r2.A08
            r30 = r0
            X.93U r6 = r2.A0C
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A04
            r19 = r0
            java.lang.Long r0 = r0.A0g
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r0 = r19
            java.lang.String r11 = r0.A0p
            X.1Xj r8 = r3.A02
            if (r8 == 0) goto L_0x028a
            boolean r0 = r8.A5Y()
            if (r0 == 0) goto L_0x0263
            X.2FW r9 = X.2FW.A0t
        L_0x0034:
            float r7 = X.C66901Mej.A00(r7)
            X.1as r0 = X.1as.A04
            X.1ap r8 = r0.A02
            r0 = r30
            X.F3w r9 = r8.A07(r0, r1, r9)
            java.lang.String r0 = r17.getId()
            if (r0 == 0) goto L_0x0285
            r9.A06(r0)
            r0 = r30
            r9.A04(r0)
            r21 = r29
            int r8 = r21.A09()
            android.os.Bundle r10 = r9.A07
            r0 = 919(0x397, float:1.288E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putInt(r0, r8)
            r0 = 2225(0x8b1, float:3.118E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putString(r0, r5)
            java.lang.String r5 = r6.getSessionId()
            r8 = 0
            X.0qQ.A0B(r5, r8)
            r0 = 215(0xd7, float:3.01E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r10.putString(r0, r5)
            r0 = 52
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r10.putFloat(r0, r7)
            r0 = 922(0x39a, float:1.292E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putString(r0, r4)
            r0 = 923(0x39b, float:1.293E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putString(r0, r11)
            r18 = r31
            if (r31 == 0) goto L_0x00a5
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            r0 = r18
            r10.putString(r4, r0)
        L_0x00a5:
            r9.A03 = r2
            r0 = r21
            X.3W1 r7 = r0.A0E
            if (r7 == 0) goto L_0x00af
            r9.A05 = r7
        L_0x00af:
            boolean r0 = r3.CcK()
            if (r0 == 0) goto L_0x00bc
            X.3OA r0 = r3.A06()
            X.C324666zh.A02(r10, r1, r0)
        L_0x00bc:
            r4 = -1
            if (r7 == 0) goto L_0x025f
            int r0 = r7.A03
            r16 = r0
            if (r0 <= r4) goto L_0x00d0
            r0 = 20
            java.lang.String r4 = X.C273654mx.A00(r0)
            r0 = r16
            r10.putInt(r4, r0)
        L_0x00d0:
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.3KV> r4 = X.AnonymousClass3KV.class
            X.1wn r0 = r2.A05
            r5.A01(r0, r4)
            X.HqC r0 = r2.A0D
            X.GE2 r0 = r0.A00
            X.GE2.A03(r0, r8)
            boolean r0 = r17.A55()
            r6 = 1
            if (r0 == 0) goto L_0x00f6
            X.0Tu r11 = X.0Tu.A05
            r4 = 36326154784880191(0x810e720002363f, double:3.036144787418253E-306)
            boolean r0 = X.182.A06(r11, r1, r4)
            if (r0 != 0) goto L_0x0109
        L_0x00f6:
            boolean r0 = r17.A55()
            if (r0 != 0) goto L_0x0115
            X.0Tu r11 = X.0Tu.A05
            r4 = 36326154784945728(0x810e7200033640, double:3.036144787459699E-306)
            boolean r0 = X.182.A06(r11, r1, r4)
            if (r0 == 0) goto L_0x0115
        L_0x0109:
            r4 = 36326154784814654(0x810e720001363e, double:3.0361447873768073E-306)
            boolean r0 = X.182.A06(r11, r1, r4)
            r12 = 1
            if (r0 != 0) goto L_0x0116
        L_0x0115:
            r12 = 0
        L_0x0116:
            X.37E r4 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r14 = r2.A01
            X.37D r0 = r4.A01(r14)
            X.7Pu r13 = X.C48943Emh.A00(r0)
            X.IZn r11 = new X.IZn
            r5 = r27
            r0 = r18
            r11.<init>(r5, r3, r2, r0)
            X.7Pr r15 = X.DbS.A0W(r1)
            r15.A0U = r11
            X.DbS.A1S(r15, r6)
            r15.A0z = r12
            X.37D r5 = r4.A01(r14)
            r9.A01()
            X.XSW r4 = X.XSW.A04
            r0 = 56
            java.lang.String r0 = X.C273654mx.A00(r0)
            r10.putSerializable(r0, r4)
            if (r13 == 0) goto L_0x016f
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = r13.A03
            X.07Z r0 = r0.getViewLifecycleOwner()
            X.07V r0 = r0.getLifecycle()
            X.07U r4 = r0.A07()
            X.07U r0 = X.07U.A01
            int r0 = r4.compareTo(r0)
            if (r0 < 0) goto L_0x016f
            if (r5 == 0) goto L_0x025c
            r0 = r5
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0m
            if (r0 != r6) goto L_0x025c
            if (r7 == 0) goto L_0x025c
            boolean r0 = r7.A2z
            if (r0 != r6) goto L_0x025c
        L_0x016f:
            r10 = 0
        L_0x0170:
            r0 = 7
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            if (r10 == 0) goto L_0x0221
            r9.A08(r8)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r5 = r9.A00()
            X.0qQ.A0C(r5, r4)
            r15.A0T = r5
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            r15.A03 = r0
            if (r13 == 0) goto L_0x018d
            r13.A0G(r5, r15, r8, r8)
        L_0x018d:
            com.instagram.api.schemas.MusicPageTabType r0 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            X.GLN r8 = X.GLB.A00(r0, r1)
            X.1sQ r7 = X.C51966G9m.A0n(r17)
            X.4DH r5 = r2.A02
            java.lang.String r0 = r5.getModuleName()
            java.lang.String r4 = "open_share_sheet"
            r8.A01(r7, r1, r4, r0)
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x01a9
            X.G9w.A1J(r5, r1, r0, r4)
        L_0x01a9:
            int r10 = r21.A09()
            r0 = r20
            java.lang.String r11 = r0.A00
            r0 = r19
            com.instagram.search.common.analytics.SearchContext r9 = r0.A0S
            X.GF2 r8 = r2.A0H
            X.1DQ r4 = r8.A01
            r0 = r17
            X.3aT r0 = r4.A00(r0)
            java.lang.Double r7 = r0.A0B
            r0 = 7
            X.0qQ.A0B(r9, r0)
            r0 = 72
            java.lang.String r4 = X.C66579MXk.A00(r0)
            r0 = r30
            X.3sc r5 = X.C52086GEg.A01(r3, r1, r0, r4)
            if (r5 == 0) goto L_0x01dd
            r5.A09(r10)
            r5.A6L = r11
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.C233822wX.A0I(r1, r5, r0, r4)
        L_0x01dd:
            r21 = 0
            r19 = r1
            r20 = r17
            r22 = r21
            r23 = r9
            r24 = r7
            r25 = r21
            r26 = r21
            r27 = r21
            r28 = r18
            r29 = r16
            r18 = r0
            X.C56293Hw6.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.1Xj r1 = r3.A02
            if (r1 == 0) goto L_0x020b
            X.1DQ r0 = r8.A01
            X.3aT r1 = r0.A00(r1)
            X.Hi2 r0 = new X.Hi2
            r0.<init>()
            r0.A00 = r6
            r1.A08 = r0
        L_0x020b:
            X.JU5 r4 = r2.A09
            X.4Cq r1 = r4.A0N
            r0 = 6
            X.C51971G9r.A1P(r4, r1, r0)
            X.H3C r2 = r2.A0F
            if (r2 == 0) goto L_0x0220
            java.lang.String r1 = X.G9t.A1A(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.H3C.A02(r2, r0, r1)
        L_0x0220:
            return
        L_0x0221:
            if (r5 == 0) goto L_0x018d
            r10 = r5
            X.37F r10 = (X.AnonymousClass37F) r10
            boolean r0 = r10.A0m
            if (r0 != r6) goto L_0x0241
            if (r7 == 0) goto L_0x0241
            boolean r0 = r7.A2z
            if (r0 != r6) goto L_0x0241
            r9.A08(r8)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r9.A00()
            X.0qQ.A0C(r0, r4)
            r15.A0T = r0
            X.DbU.A0y(r14, r0, r15)
            goto L_0x018d
        L_0x0241:
            X.GPw r0 = new X.GPw
            r0.<init>(r6, r6, r6)
            r5.A0O(r0)
            r4 = 7
            X.IZz r0 = new X.IZz
            r0.<init>(r11, r4)
            r10.A0H = r0
            r10.A0i = r12
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r9.A00()
            r5.A0J(r0)
            goto L_0x018d
        L_0x025c:
            r10 = 1
            goto L_0x0170
        L_0x025f:
            r16 = -1
            goto L_0x00d0
        L_0x0263:
            boolean r0 = r3.CcK()
            if (r0 == 0) goto L_0x0275
            X.3OA r0 = r3.A06()
            java.util.List r0 = r0.A0l
            if (r0 == 0) goto L_0x0275
        L_0x0271:
            X.2FW r9 = X.2FW.A1D
            goto L_0x0034
        L_0x0275:
            boolean r0 = r8.A5G()
            if (r0 != 0) goto L_0x0281
            boolean r0 = r3.CcK()
            if (r0 == 0) goto L_0x0271
        L_0x0281:
            X.2FW r9 = X.2FW.A0W
            goto L_0x0034
        L_0x0285:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x028a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x028f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A00(android.view.View, X.4bN, X.GDe, X.GCV, java.lang.String):void");
    }

    public final void A01(MotionEvent motionEvent, String str) {
        AnonymousClass7TG.A1N(motionEvent, str);
        if (182.A06(0Tu.A05, this.A06, 2342162575518604773L)) {
            this.A07.A01(motionEvent, str);
        }
    }
}
