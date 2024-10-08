package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

@Deprecated(message = "Delete this after MVVM migration of ClipsUfiComponent is complete. ")
/* renamed from: X.GKl  reason: case insensitive filesystem */
public final class C52244GKl extends C251343mx {
    public final ClipsViewerConfig A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final JTC A05;
    public final GFO A06;
    public final JTI A07;
    public final C52091GEl A08;
    public final WeakReference A09;
    public final 0sP A0A = J6J.A00(this, 33);
    public final 0sP A0B = J6J.A00(this, 34);
    public final 0sP A0C = J6J.A00(this, 35);
    public final boolean A0D;
    public final GEG A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C52244GKl(GEG geg, ClipsViewerConfig clipsViewerConfig, C267324bN r4, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r7, JTC jtc, GFO gfo, JTI jti, C52091GEl gEl, WeakReference weakReference, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(jti, 3);
        this.A01 = r4;
        this.A08 = gEl;
        this.A07 = jti;
        this.A05 = jtc;
        this.A0E = geg;
        this.A02 = gDe;
        this.A00 = clipsViewerConfig;
        this.A09 = weakReference;
        this.A03 = userSession;
        this.A0F = z;
        this.A04 = r7;
        this.A0D = z2;
        this.A0G = z3;
        this.A06 = gfo;
    }

    /* JADX WARNING: type inference failed for: r3v25, types: [X.GH5] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x048c, code lost:
        if (X.182.A06(r2, r6, 36329126902710078L) == false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04e0, code lost:
        if (X.182.A06(r0, r6, 36329126902710078L) == false) goto L_0x04e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r89) {
        /*
            r88 = this;
            r11 = 0
            r10 = r89
            X.0qQ.A0B(r10, r11)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            long r18 = X.C244013aV.A0C(r10, r0)
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            long r85 = X.C244013aV.A0C(r10, r0)
            r3 = 2131165196(0x7f07000c, float:1.7944602E38)
            long r16 = X.C244013aV.A0A(r10)
            r4 = r88
            X.4bN r7 = r4.A01
            boolean r8 = r7.CcK()
            com.instagram.common.session.UserSession r6 = r4.A03
            X.0qQ.A0B(r6, r11)
            if (r8 == 0) goto L_0x052f
            r50 = 0
        L_0x002c:
            r20 = r10
            r21 = r50
            r22 = r16
            r24 = r18
            long r53 = A00(r20, r21, r22, r24)
            r15 = 1
            r2 = 0
            int r0 = (r50 > r2 ? 1 : (r50 == r2 ? 0 : -1))
            boolean r71 = X.AnonymousClass7TF.A1R(r0)
            if (r8 == 0) goto L_0x0522
            r80 = 0
        L_0x0044:
            r21 = r80
            long r83 = A00(r20, r21, r22, r24)
            int r0 = (r80 > r2 ? 1 : (r80 == r2 ? 0 : -1))
            boolean r56 = X.AnonymousClass7TF.A1R(r0)
            if (r8 == 0) goto L_0x0515
            r35 = 0
        L_0x0054:
            r21 = r35
            long r38 = A00(r20, r21, r22, r24)
            int r0 = (r35 > r2 ? 1 : (r35 == r2 ? 0 : -1))
            boolean r41 = X.AnonymousClass7TF.A1R(r0)
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x006f
            boolean r0 = r4.A0G
            r3 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r0 == 0) goto L_0x006f
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x006f:
            long r8 = X.C244013aV.A0C(r10, r3)
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            X.9JS r1 = X.C51968G9o.A0e(r1, r0)
            r25 = 0
            r0 = r25
            X.2WX r3 = X.C51965G9l.A0X(r0, r1)
            long r0 = X.C244013aV.A0A(r10)
            X.9JR r0 = X.C51967G9n.A0T(r11, r0)
            X.2WX r24 = X.C51974G9v.A0F(r3, r0, r11, r8)
            boolean r0 = r7.CcK()
            if (r0 == 0) goto L_0x00c3
            X.GDe r0 = r4.A02
            if (r0 == 0) goto L_0x00c0
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x00c0
            java.lang.Integer r1 = r0.A10
        L_0x00a3:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x00c3
            X.2Wb r5 = X.C51972G9s.A0Q(r10)
            r25 = r4
            r26 = r5
            r27 = r7
            r28 = r18
            r30 = r16
            X.GH5 r3 = r25.A06(r26, r27, r28, r30)
        L_0x00b9:
            r0 = r24
            X.2Tl r0 = X.C51967G9n.A0N(r3, r5, r10, r0)
            return r0
        L_0x00c0:
            r1 = r25
            goto L_0x00a3
        L_0x00c3:
            X.GKm r0 = X.C52245GKm.A00
            X.2Wa r23 = X.C243643Zq.A00(r10, r0)
            X.GKn r0 = X.C52246GKn.A00
            X.2Wa r22 = X.C243643Zq.A00(r10, r0)
            X.2V5 r2 = X.C51968G9o.A0Z(r10, r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.2V5 r8 = X.C51968G9o.A0Z(r10, r0)
            r0 = 19
            X.I83 r5 = new X.I83
            r5.<init>((X.2V5) r2, (X.2V5) r8, (int) r0)
            r9 = 5
            X.GcU r3 = new X.GcU
            r1 = r22
            r0 = r23
            r3.<init>(r9, r0, r1)
            X.9IE r0 = X.C249213jJ.A00(r3, r5, r6)
            java.lang.Object r0 = r0.A00
            r20 = r0
            r0 = r20
            android.animation.Animator r0 = (android.animation.Animator) r0
            r20 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.9JS r1 = new X.9JS
            r1.<init>(r2, r0)
            r0 = r25
            X.2WX r1 = X.C51974G9v.A0A(r2, r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2WX r1 = X.C51971G9r.A0W(r8, r1, r0)
            X.2WX r0 = X.C51974G9v.A0B(r25)
            X.2WX r72 = r1.A00(r0)
            X.GKo r0 = X.C52247GKo.A00
            X.2Wa r0 = X.C243643Zq.A00(r10, r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r1 = 9
            X.Iw1 r1 = X.C58692Iw1.A00(r0, r4, r1)
            java.lang.Object r14 = X.AnonymousClass3Zw.A00(r10, r1, r2)
            X.3fc r14 = (X.C247003fc) r14
            r1 = 36
            X.J6J r0 = X.J6J.A00(r0, r1)
            X.0sP r49 = X.AnonymousClass3j0.A01(r10, r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325063863186004(0x810d7400023254, double:3.03545488414606E-306)
            boolean r21 = X.182.A06(r2, r6, r0)
            X.2Wb r5 = X.C51972G9s.A0Q(r10)
            com.instagram.clips.intf.ClipsViewerConfig r8 = r4.A00
            X.0qQ.A0B(r8, r11)
            boolean r2 = r8.A1c
            if (r2 != 0) goto L_0x050f
            boolean r0 = X.AnonymousClass3ZC.A0J(r7, r6)
            if (r0 != 0) goto L_0x050f
            X.GEl r0 = r4.A08
            X.JN4 r13 = r0.A0D
            X.JTI r12 = r4.A07
            X.GDe r9 = r4.A02
            X.JTC r3 = r4.A05
            X.4DU r1 = r4.A04
            X.GHZ r0 = new X.GHZ
            r42 = r0
            r43 = r9
            r44 = r6
            r45 = r1
            r46 = r3
            r47 = r13
            r48 = r12
            r51 = r18
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r53)
        L_0x0172:
            r5.A00(r0)
            X.1Xj r1 = r7.A02
            r0 = 0
            if (r1 == 0) goto L_0x01ca
            int r3 = r1.A0v()
            if (r3 <= 0) goto L_0x01ca
            if (r2 != 0) goto L_0x01ca
            boolean r2 = X.AnonymousClass3ZC.A0J(r7, r6)
            if (r2 != 0) goto L_0x01ca
            X.3Yk r0 = X.C243353Yk.A00
            boolean r0 = r0.A04(r6, r1)
            if (r0 != 0) goto L_0x01a0
            boolean r0 = r7.CcK()
            if (r0 != 0) goto L_0x04e4
            X.4gy r0 = r7.A0H
            if (r0 == 0) goto L_0x04c0
            boolean r0 = r0.AxT()
            if (r0 != r15) goto L_0x04c0
        L_0x01a0:
            r0 = 2131963330(0x7f132dc2, float:1.956341E38)
            java.lang.String r61 = X.C244013aV.A0E(r5, r0)
            r0 = 2131976637(0x7f1361bd, float:1.95904E38)
            java.lang.String r62 = X.C244013aV.A0E(r5, r0)
            X.0sP r0 = r4.A0B
            android.text.TextUtils$TruncateAt r58 = android.text.TextUtils.TruncateAt.END
            X.2Wd r60 = X.C51965G9l.A0e(r18)
            java.lang.String r63 = "ufi_count"
            r57 = r4
            r59 = r5
            r64 = r0
            r65 = r25
            r66 = r25
            r67 = r18
            r69 = r16
            X.2WW r0 = r57.A04(r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r69, r71)
        L_0x01ca:
            r5.A00(r0)
            X.2V1 r13 = r5.A00
            X.2Wb r1 = X.AnonymousClass7TG.A0S(r13)
            boolean r0 = X.AnonymousClass3ZC.A08(r8, r7, r6)
            if (r0 == 0) goto L_0x04bd
            X.GEl r0 = r4.A08
            X.GEe r12 = r0.A0C
            X.JTI r9 = r4.A07
            X.GDe r3 = r4.A02
            X.GFO r2 = r4.A06
            X.GHl r0 = new X.GHl
            r73 = r0
            r74 = r7
            r75 = r3
            r76 = r6
            r77 = r2
            r78 = r9
            r79 = r12
            r81 = r18
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81, r83)
        L_0x01f8:
            r1.A00(r0)
            X.2Tl r0 = X.C243563Zg.A00(r1)
            r5.A00(r0)
            X.1Xj r0 = r7.A02
            r3 = 0
            if (r0 == 0) goto L_0x0221
            int r9 = r0.A0r()
            boolean r0 = X.AnonymousClass3ZC.A08(r8, r7, r6)
            if (r0 == 0) goto L_0x0221
            boolean r0 = r7.CcK()
            if (r0 != 0) goto L_0x0490
            X.4gy r0 = r7.A0H
            if (r0 == 0) goto L_0x046c
            boolean r0 = r0.AxR()
            if (r0 != r15) goto L_0x046c
        L_0x0221:
            r5.A00(r3)
            if (r21 == 0) goto L_0x0240
            r2 = r18
            r0 = r16
            X.GMo r0 = r4.A07(r2, r0)
            r5.A00(r0)
            r26 = r4
            r27 = r5
            r28 = r18
            r30 = r16
            X.2WW r0 = r26.A05(r27, r28, r30)
            r5.A00(r0)
        L_0x0240:
            X.2Wb r0 = X.AnonymousClass7TG.A0S(r13)
            boolean r40 = X.C51969G9p.A1V(r22)
            boolean r1 = X.AnonymousClass3ZC.A09(r8, r7, r6)
            if (r1 == 0) goto L_0x0469
            X.JTI r12 = r4.A07
            X.GEl r1 = r4.A08
            X.Jvl r9 = r1.A02
            X.4DU r3 = r4.A04
            X.GFO r2 = r4.A06
            X.GHa r1 = new X.GHa
            r31 = r6
            r32 = r14
            r33 = r2
            r34 = r12
            r36 = r18
            r26 = r1
            r27 = r20
            r28 = r9
            r29 = r23
            r30 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
        L_0x0271:
            r0.A00(r1)
            boolean r20 = X.C51969G9p.A1V(r23)
            if (r20 == 0) goto L_0x02bb
            X.GEl r1 = r4.A08
            X.3gK r9 = r1.A05
            X.0qQ.A0B(r9, r11)
            boolean r1 = r9 instanceof X.C247413gI
            if (r1 == 0) goto L_0x0466
            r3 = r9
            X.3gI r3 = (X.C247413gI) r3
            X.3fc r1 = r3.A00
            X.4DU r14 = r4.A04
            java.lang.ref.WeakReference r13 = r4.A09
            X.JTI r12 = r4.A07
            X.IPy r2 = new X.IPy
            r2.<init>(r1, r9, r4)
            r9 = 8
            r1 = r25
            X.Iw1 r79 = X.C58692Iw1.A00(r1, r4, r9)
            r1 = 32
            X.J6J r80 = X.J6J.A00(r4, r1)
            X.Gx1 r1 = new X.Gx1
            r71 = r1
            r73 = r6
            r74 = r2
            r75 = r12
            r76 = r3
            r77 = r14
            r78 = r13
            r81 = r18
            r71.<init>(r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)
        L_0x02b8:
            r0.A00(r1)
        L_0x02bb:
            X.2Tl r0 = X.C243563Zg.A00(r0)
            r5.A00(r0)
            X.1Xj r0 = r7.A02
            r1 = 0
            if (r0 == 0) goto L_0x02ec
            if (r20 == 0) goto L_0x040b
            r0 = 2131956635(0x7f13139b, float:1.9549831E38)
            java.lang.String r31 = X.C244013aV.A0E(r5, r0)
            java.lang.String r32 = X.C244013aV.A0E(r5, r0)
            X.J5z r34 = X.C59092J5z.A00
            java.lang.String r33 = "ufi_count"
            r27 = r4
            r28 = r1
            r29 = r5
            r30 = r1
            r35 = r1
            r36 = r1
            r37 = r18
            r39 = r16
            X.2WW r1 = r27.A04(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41)
        L_0x02ec:
            r5.A00(r1)
            if (r21 != 0) goto L_0x030b
            r2 = r18
            r0 = r16
            X.GMo r0 = r4.A07(r2, r0)
            r5.A00(r0)
            r26 = r4
            r27 = r5
            r28 = r18
            r30 = r16
            X.2WW r0 = r26.A05(r27, r28, r30)
            r5.A00(r0)
        L_0x030b:
            boolean r0 = X.AnonymousClass3ZC.A0K(r7, r6)
            if (r0 == 0) goto L_0x0408
            X.GEl r0 = r4.A08
            X.Jvl r3 = r0.A01
            X.JTC r2 = r4.A05
            X.JTI r1 = r4.A07
            X.GuX r0 = new X.GuX
            r26 = r0
            r27 = r3
            r28 = r6
            r29 = r2
            r30 = r1
            r31 = r18
            r33 = r16
            r26.<init>(r27, r28, r29, r30, r31, r33)
        L_0x032c:
            r5.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36885307987198555(0x830afe0002025b, double:3.3897555240936115E-306)
            java.lang.String r3 = X.182.A04(r2, r6, r0)
            java.lang.Integer r3 = X.C52248GKp.A00(r3)
            int r3 = r3.intValue()
            if (r3 != r15) goto L_0x0405
            r3 = 2131964345(0x7f1331b9, float:1.956547E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
        L_0x034b:
            r3 = 0
            if (r9 == 0) goto L_0x038d
            int r9 = r9.intValue()
            java.lang.String r0 = X.182.A04(r2, r6, r0)
            java.lang.Integer r0 = X.C52248GKp.A00(r0)
            int r0 = r0.intValue()
            if (r0 != r15) goto L_0x038d
            r0 = 2131964346(0x7f1331ba, float:1.9565471E38)
            boolean r1 = X.AnonymousClass3ZC.A0K(r7, r6)
            if (r1 == 0) goto L_0x038d
            java.lang.String r30 = X.C244013aV.A0E(r5, r9)
            java.lang.String r31 = X.C244013aV.A0E(r5, r0)
            android.text.TextUtils$TruncateAt r27 = android.text.TextUtils.TruncateAt.END
            X.J5y r33 = X.C59091J5y.A00
            X.2Wd r29 = X.C51965G9l.A0e(r18)
            java.lang.String r32 = "ufi_count"
            r26 = r4
            r28 = r5
            r34 = r3
            r35 = r3
            r36 = r18
            r38 = r16
            r40 = r11
            X.2WW r3 = r26.A04(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
        L_0x038d:
            r5.A00(r3)
            com.instagram.clips.intf.ClipsViewerSource r1 = r8.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r1 == r0) goto L_0x039a
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE
            if (r1 != r0) goto L_0x0403
        L_0x039a:
            boolean r0 = r7.CcK()
            if (r0 != 0) goto L_0x0403
            r0 = 36328444002385249(0x81108700013d61, double:3.037592497786391E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0403
            X.GDe r3 = r4.A02
            X.JTI r2 = r4.A07
            X.GEl r0 = r4.A08
            X.JN7 r1 = r0.A0G
            X.GuE r0 = new X.GuE
            r25 = r0
            r26 = r7
            r27 = r3
            r28 = r2
            r29 = r1
            r30 = r16
            r25.<init>(r26, r27, r28, r29, r30)
        L_0x03c4:
            r5.A00(r0)
            r25 = r4
            r26 = r5
            r27 = r7
            r28 = r18
            r30 = r16
            X.GH5 r0 = r25.A06(r26, r27, r28, r30)
            r5.A00(r0)
            X.GEl r0 = r4.A08
            X.JN5 r2 = r0.A0E
            X.GHh r0 = r0.A06
            X.0qQ.A0B(r2, r11)
            X.0qQ.A0B(r0, r15)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0512
            boolean r0 = r2 instanceof X.C52085GEf
            if (r0 == 0) goto L_0x0512
            X.JTI r1 = r4.A07
            X.GEf r2 = (X.C52085GEf) r2
            boolean r0 = r4.A0D
            X.GIG r3 = new X.GIG
            r81 = r3
            r82 = r6
            r83 = r1
            r84 = r2
            r87 = r0
            r81.<init>(r82, r83, r84, r85, r87)
            goto L_0x00b9
        L_0x0403:
            r0 = 0
            goto L_0x03c4
        L_0x0405:
            r9 = 0
            goto L_0x034b
        L_0x0408:
            r0 = 0
            goto L_0x032c
        L_0x040b:
            int r2 = r0.A11()
            if (r2 <= 0) goto L_0x02ec
            boolean r2 = X.C243353Yk.A01(r6, r0)
            if (r2 != 0) goto L_0x02ec
            boolean r2 = X.AnonymousClass3ZC.A09(r8, r7, r6)
            if (r2 == 0) goto L_0x02ec
            boolean r2 = X.GL7.A01(r6)
            if (r2 != 0) goto L_0x02ec
            int r1 = r0.A11()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r30 = X.C51973G9u.A0h(r5, r1)
            r1 = 2131976666(0x7f1361da, float:1.9590459E38)
            int r0 = r0.A11()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r31 = X.C244013aV.A0F(r5, r0, r1)
            r0 = 29
            X.J6J r33 = X.J6J.A00(r4, r0)
            r0 = 30
            X.J6J r34 = X.J6J.A00(r4, r0)
            r0 = 31
            X.J6J r35 = X.J6J.A00(r4, r0)
            java.lang.String r32 = "ufi_count"
            r26 = r4
            r27 = r25
            r28 = r5
            r29 = r25
            r36 = r18
            r38 = r16
            r40 = r11
            X.2WW r1 = r26.A04(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
            goto L_0x02ec
        L_0x0466:
            r1 = 0
            goto L_0x02b8
        L_0x0469:
            r1 = 0
            goto L_0x0271
        L_0x046c:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = X.C51969G9p.A1X(r7, r6, r0)
            if (r0 != 0) goto L_0x0490
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329126902972226(0x811126000d3f42, double:3.038024366867415E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0221
            r0 = 36329126902710078(0x81112600093f3e, double:3.0380243667016316E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0490
            goto L_0x0221
        L_0x0490:
            if (r9 <= 0) goto L_0x0221
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r46 = X.C51973G9u.A0h(r5, r1)
            r0 = 2131976621(0x7f1361ad, float:1.9590368E38)
            java.lang.String r47 = X.C244013aV.A0F(r5, r1, r0)
            X.0sP r0 = r4.A0A
            java.lang.String r48 = "ufi_count"
            r42 = r4
            r43 = r3
            r44 = r5
            r45 = r3
            r49 = r0
            r50 = r3
            r51 = r3
            r52 = r18
            r54 = r16
            X.2WW r3 = r42.A04(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56)
            goto L_0x0221
        L_0x04bd:
            r0 = 0
            goto L_0x01f8
        L_0x04c0:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = X.C51969G9p.A1X(r7, r6, r0)
            if (r0 != 0) goto L_0x04e4
            X.0Tu r0 = X.0Tu.A05
            r1 = 36329126902906689(0x811126000c3f41, double:3.038024366825969E-306)
            boolean r1 = X.182.A06(r0, r6, r1)
            if (r1 != 0) goto L_0x01a0
            r1 = 36329126902710078(0x81112600093f3e, double:3.0380243667016316E-306)
            boolean r0 = X.182.A06(r0, r6, r1)
            if (r0 == 0) goto L_0x04e4
            goto L_0x01a0
        L_0x04e4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r61 = X.C51973G9u.A0h(r5, r0)
            r1 = 2131976636(0x7f1361bc, float:1.9590398E38)
            java.lang.String r62 = X.C244013aV.A0F(r5, r0, r1)
            X.0sP r0 = r4.A0B
            java.lang.String r63 = "ufi_count"
            r57 = r4
            r58 = r25
            r59 = r5
            r60 = r25
            r64 = r0
            r65 = r25
            r66 = r25
            r67 = r18
            r69 = r16
            X.2WW r0 = r57.A04(r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r69, r71)
            goto L_0x01ca
        L_0x050f:
            r0 = 0
            goto L_0x0172
        L_0x0512:
            r3 = 0
            goto L_0x00b9
        L_0x0515:
            X.0Tu r5 = X.0Tu.A05
            r0 = 37173551833154138(0x841126000e025a, double:3.572042092940728E-306)
            float r35 = X.C51965G9l.A00(r5, r6, r0)
            goto L_0x0054
        L_0x0522:
            X.0Tu r5 = X.0Tu.A05
            r0 = 37173551833154138(0x841126000e025a, double:3.572042092940728E-306)
            float r80 = X.C51965G9l.A00(r5, r6, r0)
            goto L_0x0044
        L_0x052f:
            X.0Tu r2 = X.0Tu.A05
            r0 = 37173551833219675(0x841126000f025b, double:3.572042092982174E-306)
            float r50 = X.C51965G9l.A00(r2, r6, r0)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52244GKl.A0X(X.3Y5):X.3mp");
    }

    private final 2WW A04(TextUtils.TruncateAt truncateAt, C70832Wc r23, 2Wd r24, String str, String str2, String str3, 0sP r28, 0sP r29, 0sP r30, long j, long j2, boolean z) {
        long doubleToRawLongBits;
        long floatToRawIntBits;
        int A022;
        long j3;
        long j4 = j2;
        TypedValue typedValue = new TypedValue();
        C70832Wc r20 = r23;
        2V1 Aqq = r20.Aqq();
        Context context = Aqq.A0C;
        context.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        long A0C2 = C244013aV.A0C(r20, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
        AnonymousClass3XV r0 = 2WX.A02;
        C243573Zh r10 = C243573Zh.CENTER;
        Integer num = AnonymousClass05K.A00;
        2WX r14 = new 2WX((2WX) null, new AnonymousClass9JS(num, r10, 3));
        Integer num2 = AnonymousClass05K.A0C;
        2WX r12 = new 2WX(r14, new AnonymousClass9JR(num2, 0, j));
        if (z) {
            doubleToRawLongBits = j4;
        } else {
            doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        }
        Integer num3 = AnonymousClass05K.A08;
        2WX r2 = new 2WX(new 2WX(r12, new AnonymousClass9JR(num3, 0, A0C2)), new AnonymousClass9JR(AnonymousClass05K.A0A, 0, doubleToRawLongBits));
        if (z) {
            j4 = Double.doubleToRawLongBits(0.0d);
        }
        2WX r22 = new 2WX(new 2WX(r2, new AnonymousClass9JR(AnonymousClass05K.A1I, 0, j4)), new AnonymousClass9JS(AnonymousClass05K.A0N, str2, 0));
        Integer num4 = AnonymousClass05K.A01;
        2WX r102 = new 2WX(new 2WX(new 2WX(r22, new AnonymousClass9JS(num4, "android.widget.Button", 0)), new AnonymousClass9JS(AnonymousClass05K.A1F, r28, 4)), new AnonymousClass9JS(num3, str3, 4));
        0sP r3 = r29;
        if (r29 != null) {
            r102 = new 2WX(r102, new AnonymousClass9JS(AnonymousClass05K.A03, r3, 4));
        }
        0sP r32 = r30;
        if (r30 != null) {
            r102 = new 2WX(r102, new AnonymousClass9JS(AnonymousClass05K.A04, r32, 4));
        }
        2Wd r02 = r24;
        if (r24 != null) {
            r102 = new 2WX(r102, new AnonymousClass9JR(num, 0, r02.A00));
        }
        UserSession userSession = this.A03;
        boolean A012 = C52180GHw.A01(context, userSession);
        int A023 = r20.Bnf().A02(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        if (A012) {
            floatToRawIntBits = C52180GHw.A00(context);
        } else {
            floatToRawIntBits = ((long) Float.floatToRawIntBits(12.0f)) | 9221683186994511872L;
        }
        0qQ.A0B(userSession, 0);
        0Tu r142 = 0Tu.A05;
        if (182.A06(r142, userSession, 36329401780289626L)) {
            A022 = GHW.A02(userSession, r20.Bnf().A02(R.color.black));
        } else {
            A022 = r20.Bnf().A02(2Yu.A0H(context, R.attr.igds_color_shadow_on_media));
        }
        if (182.A06(r142, userSession, 36329401780289626L)) {
            j3 = Double.doubleToRawLongBits((double) GHW.A01(userSession));
        } else {
            j3 = ((long) ((int) typedValue.getFloat())) | 9221401712017801216L;
        }
        Typeface create = Typeface.create("sans-serif-medium", 0);
        0qQ.A07(create);
        Typeface A032 = 0oh.A03(context, create, num4);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits((double) GHW.A00(userSession));
        Integer A052 = GHW.A05(userSession, r20.Bnf().A02(R.color.black));
        long doubleToRawLongBits3 = Double.doubleToRawLongBits(0.0d);
        C244103ae A002 = 2WW.A00(Aqq, 0);
        A002.A0V(str);
        A002.A0U((2V5) null);
        A002.A0P(A023);
        A002.A0Q(2Wd.A00(r20.Bnf(), floatToRawIntBits));
        A002.A0R(0);
        A002.A0S(A032);
        A002.A0O(A022);
        A002.A0K((float) 2Wd.A00(r20.Bnf(), j3));
        A002.A0I((float) 2Wd.A00(r20.Bnf(), doubleToRawLongBits3));
        A002.A0J((float) 2Wd.A00(r20.Bnf(), doubleToRawLongBits3));
        A002.A0H((float) 2Wd.A00(r20.Bnf(), doubleToRawLongBits2));
        if (A052 != null) {
            A002.A01.A0I = A052.intValue();
        }
        A002.A0W(num2);
        A002.A0C();
        A002.A0X(num);
        A002.A0L(1.33f);
        A002.A0a(false);
        A002.A0N(0);
        A002.A0M(1);
        A002.A0b(true);
        A002.A0Y(false);
        A002.A0Z(true);
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        if (truncateAt != null) {
            A002.A0T(truncateAt2);
        }
        A002.A05((AnonymousClass2VW) null);
        C244123ag.A00(A002, r102);
        return A002.A0A();
    }

    private final 2WW A05(C70832Wc r21, long j, long j2) {
        Integer num;
        UserSession userSession = this.A03;
        boolean A062 = 182.A06(0Tu.A06, userSession, 36325063863251541L);
        1Xj r0 = this.A01.A02;
        if (r0 != null) {
            num = r0.A0C.BpM();
        } else {
            num = null;
        }
        if (!C55114HcN.A00(userSession, num, AnonymousClass05K.A01) || num == null) {
            return null;
        }
        C70832Wc r7 = r21;
        String A002 = C14066TpE.A00(C51971G9r.A0M(r7), num, (Integer) null, false);
        0qQ.A07(A002);
        return A04((TextUtils.TruncateAt) null, r7, (2Wd) null, A002, C244013aV.A0F(r7, num, 2131976669), "save_count", new C58736Iwj(41, this, A062), new C58736Iwj(42, this, A062), (0sP) null, j, j2, false);
    }

    private final GH5 A06(C70832Wc r8, C267324bN r9, long j, long j2) {
        UserSession userSession = this.A03;
        if (!AnonymousClass3ZC.A0L(r9, userSession)) {
            return null;
        }
        long A0C2 = C244013aV.A0C(r8, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
        AnonymousClass3XV r2 = 2WX.A02;
        1Xj r3 = r9.A02;
        if (r3 != null && r3.A11() > 0 && !C243353Yk.A01(userSession, r3) && AnonymousClass3ZC.A09(this.A00, this.A01, userSession) && !GL7.A01(userSession)) {
            A0C2 = C51969G9p.A0D();
        }
        if (!A08()) {
            j2 = C51969G9p.A0D();
        }
        Integer num = AnonymousClass05K.A08;
        2WX A0Y = C51971G9r.A0Y(C51974G9v.A0F((2WX) null, C51965G9l.A0c(num, 0, A0C2), 0, j2), AnonymousClass05K.A0D, "clips_ufi_more_button_component", 4);
        Integer num2 = AnonymousClass05K.A00;
        2WX A002 = AnonymousClass9JR.A00(A0Y, num2, 0, j);
        Integer num3 = AnonymousClass05K.A01;
        return new GH5(C244013aV.A0D(r8, R.drawable.instagram_more_vertical_outline_44), ImageView.ScaleType.FIT_CENTER, C51971G9r.A0Y(C51972G9s.A0U(C51972G9s.A0V(C51971G9r.A0Y(C51974G9v.A0J(AnonymousClass9JR.A00(A002, num3, 0, j), C51972G9s.A0W(r8, 2131966723, 0), num2), num, "more_button", 4), this.A0C), num3, 0), AnonymousClass05K.A0B, Integer.valueOf(R.id.clips_ufi_more_button_component), 4), false);
    }

    private final C52298GMo A07(long j, long j2) {
        Integer num;
        C267324bN r5 = this.A01;
        1Xj r0 = r5.A02;
        if (r0 != null) {
            num = r0.A0C.BpM();
        } else {
            num = null;
        }
        UserSession userSession = this.A03;
        0qQ.A0B(userSession, 1);
        if (num == null || !182.A06(0Tu.A05, userSession, 36325063863120467L)) {
            return null;
        }
        return new C52298GMo(r5, this.A02, this.A08.A0F, this.A07, j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A03, 36329805506953551L) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r6.A0E.A00 == X.GJ5.QP) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08() {
        /*
            r6 = this;
            X.4bN r2 = r6.A01
            boolean r0 = r2.CcK()
            r5 = 1
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r4 = r6.A03
            X.0Tu r3 = X.0Tu.A05
            r0 = 36329805506953551(0x8111c40000414f, double:3.038453518757724E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r4 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            boolean r0 = r6.A0F
            if (r0 != 0) goto L_0x0029
            if (r4 != 0) goto L_0x0029
            X.GEG r0 = r6.A0E
            X.GJ5 r1 = r0.A00
            X.GJ5 r0 = X.GJ5.QP
            r3 = 0
            if (r1 != r0) goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            X.1Xj r0 = r2.A02
            if (r4 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x0085
            X.1Xy r0 = r0.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0085
            r0.Bh3()
        L_0x003b:
            r1 = 1
        L_0x003c:
            if (r3 == 0) goto L_0x0087
            X.GEG r0 = r6.A0E
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0087
            X.1Xj r1 = r2.A02
            com.instagram.common.session.UserSession r0 = r6.A03
            boolean r0 = X.AnonymousClass3ZJ.A0D(r0, r1)
            if (r0 != 0) goto L_0x0087
            return r5
        L_0x0051:
            if (r0 == 0) goto L_0x0061
            X.1Xy r0 = r0.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0061
            X.46i r0 = X.C291335gz.A01(r0)
            if (r0 != 0) goto L_0x003b
        L_0x0061:
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x0085
            X.1Xy r0 = r0.A0C
            X.1dn r0 = r0.getMusicMetadata()
            if (r0 == 0) goto L_0x0085
            com.instagram.api.schemas.MusicInfo r1 = r0.BUr()
            if (r1 == 0) goto L_0x0079
            X.46h r0 = new X.46h
            r0.<init>(r1)
            goto L_0x003b
        L_0x0079:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r0.BZB()
            if (r1 == 0) goto L_0x0085
            X.5Bc r0 = new X.5Bc
            r0.<init>(r1)
            goto L_0x003b
        L_0x0085:
            r1 = 0
            goto L_0x003c
        L_0x0087:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52244GKl.A08():boolean");
    }

    public static final long A00(C70832Wc r5, float f, long j, long j2) {
        AnonymousClass2V4 r4 = r5.Aqq().A0D;
        0qQ.A07(r4);
        int A002 = 2Wd.A00(r5.Bnf(), j) + 2Wd.A00(r5.Bnf(), 2Wd.A02(2Wd.A01(f, j2)));
        return Double.doubleToRawLongBits((double) (((float) A002) / r4.A01.getDisplayMetrics().density));
    }
}
