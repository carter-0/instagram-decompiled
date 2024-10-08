package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.GKr  reason: case insensitive filesystem */
public final class C52250GKr extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final JTC A02;
    public final GFO A03;
    public final JTI A04;
    public final C52091GEl A05;
    public final WeakReference A06;
    public final 0sP A07 = J6J.A00(this, 26);
    public final boolean A08;

    public C52250GKr(UserSession userSession, AnonymousClass4DU r3, JTC jtc, GFO gfo, JTI jti, C52091GEl gEl, WeakReference weakReference, boolean z) {
        0qQ.A0B(jti, 2);
        this.A05 = gEl;
        this.A04 = jti;
        this.A02 = jtc;
        this.A06 = weakReference;
        this.A00 = userSession;
        this.A01 = r3;
        this.A08 = z;
        this.A03 = gfo;
    }

    /* JADX WARNING: type inference failed for: r3v13, types: [X.GH5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r66) {
        /*
            r65 = this;
            r13 = 0
            r7 = r66
            X.0qQ.A0B(r7, r13)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            long r18 = X.C244013aV.A0C(r7, r0)
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            long r62 = X.C244013aV.A0C(r7, r0)
            long r16 = X.C244013aV.A0A(r7)
            r4 = r65
            X.GEl r6 = r4.A05
            int r0 = r6.A00
            long r10 = X.C244013aV.A0C(r7, r0)
            com.instagram.common.session.UserSession r12 = r4.A00
            boolean r3 = r6.A0I
            X.0qQ.A0B(r12, r13)
            if (r3 == 0) goto L_0x0438
            r33 = 0
        L_0x002d:
            r20 = r7
            r21 = r33
            r22 = r16
            r24 = r18
            long r36 = A00(r20, r21, r22, r24)
            r2 = 0
            int r0 = (r33 > r2 ? 1 : (r33 == r2 ? 0 : -1))
            boolean r39 = X.AnonymousClass7TF.A1R(r0)
            if (r3 == 0) goto L_0x042b
            r57 = 0
        L_0x0044:
            r21 = r57
            long r60 = A00(r20, r21, r22, r24)
            int r0 = (r57 > r2 ? 1 : (r57 == r2 ? 0 : -1))
            boolean r40 = X.AnonymousClass7TF.A1R(r0)
            if (r3 == 0) goto L_0x041e
            r41 = 0
        L_0x0054:
            r21 = r41
            long r44 = A00(r20, r21, r22, r24)
            int r0 = (r41 > r2 ? 1 : (r41 == r2 ? 0 : -1))
            boolean r47 = X.AnonymousClass7TF.A1R(r0)
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r9 = 4
            X.9JS r0 = X.C51965G9l.A0d(r1, r0, r9)
            r15 = 0
            X.2WX r3 = X.C51965G9l.A0X(r15, r0)
            long r0 = X.C244013aV.A0A(r7)
            X.9JR r0 = X.C51967G9n.A0T(r13, r0)
            X.2WX r24 = X.C51974G9v.A0F(r3, r0, r13, r10)
            boolean r0 = r6.A0J
            if (r0 == 0) goto L_0x0097
            X.2Wb r5 = X.C51972G9s.A0Q(r7)
            r8 = r4
            r9 = r5
            r10 = r18
            r12 = r16
            X.GH5 r3 = r8.A06(r9, r10, r12)
        L_0x0090:
            r0 = r24
            X.2Tl r0 = X.C51967G9n.A0N(r3, r5, r7, r0)
            return r0
        L_0x0097:
            X.GKs r0 = X.C52251GKs.A00
            X.2Wa r23 = X.C243643Zq.A00(r7, r0)
            X.GKt r0 = X.C52252GKt.A00
            X.2Wa r22 = X.C243643Zq.A00(r7, r0)
            X.2V5 r2 = X.C51968G9o.A0Z(r7, r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.2V5 r8 = X.C51968G9o.A0Z(r7, r0)
            r0 = 18
            X.I83 r5 = new X.I83
            r5.<init>((X.2V5) r2, (X.2V5) r8, (int) r0)
            X.GcU r3 = new X.GcU
            r1 = r23
            r0 = r22
            r3.<init>(r9, r1, r0)
            X.9IE r0 = X.C249213jJ.A00(r3, r5, r12)
            java.lang.Object r14 = r0.A00
            android.animation.Animator r14 = (android.animation.Animator) r14
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r21 = 1
            X.9JS r0 = new X.9JS
            r0.<init>(r2, r1)
            X.2WX r1 = X.C51974G9v.A0A(r2, r15, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2WX r1 = X.C51971G9r.A0W(r8, r1, r0)
            X.2WX r0 = X.C51974G9v.A0B(r15)
            X.2WX r49 = r1.A00(r0)
            X.GKu r0 = X.C52253GKu.A00
            X.2Wa r0 = X.C243643Zq.A00(r7, r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r3 = 7
            X.Iw1 r1 = X.C58692Iw1.A00(r0, r4, r3)
            java.lang.Object r11 = X.AnonymousClass3Zw.A00(r7, r1, r2)
            X.3fc r11 = (X.C247003fc) r11
            r1 = 27
            X.J6J r0 = X.J6J.A00(r0, r1)
            X.0sP r32 = X.AnonymousClass3j0.A01(r7, r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325063863186004(0x810d7400023254, double:3.03545488414606E-306)
            boolean r20 = X.182.A06(r2, r12, r0)
            X.2Wb r5 = X.C51972G9s.A0Q(r7)
            boolean r0 = r6.A0M
            if (r0 == 0) goto L_0x03ee
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x01c0
            X.JN4 r10 = r6.A0D
            X.JTI r9 = r4.A04
            X.GDe r8 = r6.A04
            X.JTC r2 = r4.A02
            X.4DU r1 = r4.A01
            X.GHZ r0 = new X.GHZ
            r25 = r0
            r26 = r8
            r27 = r12
            r28 = r1
            r29 = r2
            r30 = r10
            r31 = r9
            r34 = r18
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
        L_0x0135:
            r5.A00(r0)
            X.JN3 r0 = r6.A0B
            boolean r1 = r0 instanceof X.GJM
            if (r1 == 0) goto L_0x0187
            X.GJM r0 = (X.GJM) r0
            int r1 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r29 = X.C51973G9u.A0h(r5, r1)
            r2 = 2131976636(0x7f1361bc, float:1.9590398E38)
            java.lang.String r30 = X.C244013aV.A0F(r5, r1, r2)
            X.JN2 r0 = r0.A01
            X.J6Q r32 = X.J6Q.A00(r0, r4, r3)
            java.lang.String r31 = "ufi_count"
            r28 = r15
            r33 = r15
            r34 = r15
            r35 = r18
            r37 = r16
            r25 = r4
            r26 = r15
            r27 = r5
            X.2WW r0 = r25.A04(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
        L_0x016d:
            r5.A00(r0)
            X.JN1 r1 = r6.A07
            boolean r0 = r1 instanceof X.GLC
            if (r0 != 0) goto L_0x01c3
            boolean r0 = r1 instanceof X.GIA
            if (r0 != 0) goto L_0x01c3
            boolean r0 = r1 instanceof X.C53583Gqy
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r1 instanceof X.GJC
            if (r0 != 0) goto L_0x01e3
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0187:
            boolean r1 = r0 instanceof X.GLW
            if (r1 == 0) goto L_0x01ba
            r1 = 2131963330(0x7f132dc2, float:1.956341E38)
            java.lang.String r29 = X.C244013aV.A0E(r5, r1)
            r1 = 2131976637(0x7f1361bd, float:1.95904E38)
            java.lang.String r30 = X.C244013aV.A0E(r5, r1)
            X.GLW r0 = (X.GLW) r0
            X.JN2 r0 = r0.A00
            X.J6Q r32 = X.J6Q.A00(r0, r4, r3)
            android.text.TextUtils$TruncateAt r26 = android.text.TextUtils.TruncateAt.END
            X.2Wd r28 = X.C51965G9l.A0e(r18)
            java.lang.String r31 = "ufi_count"
            r25 = r4
            r27 = r5
            r33 = r15
            r34 = r15
            r35 = r18
            r37 = r16
            X.2WW r0 = r25.A04(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
            goto L_0x016d
        L_0x01ba:
            boolean r0 = r0 instanceof X.GNE
            if (r0 == 0) goto L_0x0445
            r0 = 0
            goto L_0x016d
        L_0x01c0:
            r0 = 0
            goto L_0x0135
        L_0x01c3:
            X.GEe r10 = r6.A0C
            X.JTI r9 = r4.A04
            X.4bN r8 = r6.A03
            X.GDe r3 = r6.A04
            X.GFO r2 = r4.A03
            X.GHl r0 = new X.GHl
            r50 = r0
            r51 = r8
            r52 = r3
            r53 = r12
            r54 = r2
            r55 = r9
            r56 = r10
            r58 = r18
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r60)
            goto L_0x01e4
        L_0x01e3:
            r0 = 0
        L_0x01e4:
            r5.A00(r0)
            boolean r2 = r1 instanceof X.GIA
            r0 = 0
            if (r2 == 0) goto L_0x021d
            X.GIA r1 = (X.GIA) r1
            if (r1 == 0) goto L_0x021d
            int r0 = r1.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r30 = X.C51973G9u.A0h(r5, r1)
            r0 = 2131976621(0x7f1361ad, float:1.9590368E38)
            java.lang.String r31 = X.C244013aV.A0F(r5, r1, r0)
            r0 = 21
            X.J6J r33 = X.J6J.A00(r4, r0)
            java.lang.String r32 = "ufi_count"
            r26 = r4
            r27 = r15
            r28 = r5
            r29 = r15
            r34 = r15
            r35 = r15
            r36 = r18
            r38 = r16
            X.2WW r0 = r26.A04(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
        L_0x021d:
            r5.A00(r0)
            if (r20 == 0) goto L_0x023c
            r2 = r18
            r0 = r16
            X.GMo r0 = r4.A07(r2, r0)
            r5.A00(r0)
            r25 = r4
            r26 = r5
            r27 = r18
            r29 = r16
            X.2WW r0 = r25.A05(r26, r27, r29)
            r5.A00(r0)
        L_0x023c:
            X.2Wb r1 = X.G9t.A0w(r5)
            boolean r46 = X.C51969G9p.A1V(r22)
            X.JN1 r0 = r6.A0A
            boolean r2 = r0 instanceof X.GLC
            if (r2 != 0) goto L_0x025b
            boolean r2 = r0 instanceof X.GIA
            if (r2 != 0) goto L_0x025b
            boolean r2 = r0 instanceof X.C53583Gqy
            if (r2 != 0) goto L_0x027d
            boolean r2 = r0 instanceof X.GJC
            if (r2 != 0) goto L_0x027d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x025b:
            X.JTI r10 = r4.A04
            X.Jvl r9 = r6.A02
            X.4DU r8 = r4.A01
            X.GFO r3 = r4.A03
            X.GHa r2 = new X.GHa
            r32 = r2
            r33 = r14
            r34 = r9
            r35 = r23
            r36 = r8
            r37 = r12
            r38 = r11
            r39 = r3
            r40 = r10
            r42 = r18
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46)
            goto L_0x027e
        L_0x027d:
            r2 = 0
        L_0x027e:
            r1.A00(r2)
            boolean r14 = X.C51969G9p.A1V(r23)
            if (r14 == 0) goto L_0x02c2
            X.3gK r9 = r6.A05
            X.0qQ.A0B(r9, r13)
            boolean r2 = r9 instanceof X.C247413gI
            if (r2 == 0) goto L_0x0364
            X.3gI r9 = (X.C247413gI) r9
            X.3fc r2 = r9.A00
            X.4DU r11 = r4.A01
            java.lang.ref.WeakReference r10 = r4.A06
            X.JTI r8 = r4.A04
            X.IPx r3 = new X.IPx
            r3.<init>(r2, r4)
            r2 = 6
            X.Iw1 r56 = X.C58692Iw1.A00(r15, r4, r2)
            r2 = 25
            X.J6J r57 = X.J6J.A00(r4, r2)
            X.Gx1 r2 = new X.Gx1
            r48 = r2
            r50 = r12
            r51 = r3
            r52 = r8
            r53 = r9
            r54 = r11
            r55 = r10
            r58 = r18
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
        L_0x02bf:
            r1.A00(r2)
        L_0x02c2:
            X.2Tl r1 = X.C243563Zg.A00(r1)
            r5.A00(r1)
            if (r14 == 0) goto L_0x0324
            r0 = 2131956635(0x7f13139b, float:1.9549831E38)
            java.lang.String r37 = X.C244013aV.A0E(r5, r0)
            java.lang.String r38 = X.C244013aV.A0E(r5, r0)
            X.J5x r40 = X.C59090J5x.A00
            java.lang.String r39 = "ufi_count"
            r33 = r4
            r34 = r15
            r35 = r5
            r36 = r15
            r41 = r15
            r42 = r15
            r43 = r18
            r45 = r16
            X.2WW r0 = r33.A04(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47)
        L_0x02ee:
            r5.A00(r0)
            if (r20 != 0) goto L_0x030d
            r2 = r18
            r0 = r16
            X.GMo r0 = r4.A07(r2, r0)
            r5.A00(r0)
            r25 = r4
            r26 = r5
            r27 = r18
            r29 = r16
            X.2WW r0 = r25.A05(r26, r27, r29)
            r5.A00(r0)
        L_0x030d:
            X.JN1 r9 = r6.A08
            boolean r8 = r9 instanceof X.C53583Gqy
            if (r8 != 0) goto L_0x0367
            boolean r0 = r9 instanceof X.GLC
            if (r0 != 0) goto L_0x0367
            boolean r0 = r9 instanceof X.GIA
            if (r0 != 0) goto L_0x0381
            boolean r0 = r9 instanceof X.GJC
            if (r0 != 0) goto L_0x0381
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0324:
            boolean r1 = r0 instanceof X.GIA
            if (r1 == 0) goto L_0x0362
            X.GIA r0 = (X.GIA) r0
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r29 = X.C51973G9u.A0h(r5, r1)
            r0 = 2131976666(0x7f1361da, float:1.9590459E38)
            java.lang.String r30 = X.C244013aV.A0F(r5, r1, r0)
            r0 = 22
            X.J6J r32 = X.J6J.A00(r4, r0)
            r0 = 23
            X.J6J r33 = X.J6J.A00(r4, r0)
            r0 = 24
            X.J6J r34 = X.J6J.A00(r4, r0)
            java.lang.String r31 = "ufi_count"
            r25 = r4
            r26 = r15
            r27 = r5
            r28 = r15
            r35 = r18
            r37 = r16
            r39 = r47
            X.2WW r0 = r25.A04(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
            goto L_0x02ee
        L_0x0362:
            r0 = 0
            goto L_0x02ee
        L_0x0364:
            r2 = 0
            goto L_0x02bf
        L_0x0367:
            X.Jvl r3 = r6.A01
            X.JTC r2 = r4.A02
            X.JTI r1 = r4.A04
            X.GuX r0 = new X.GuX
            r25 = r0
            r26 = r3
            r27 = r12
            r28 = r2
            r29 = r1
            r30 = r18
            r32 = r16
            r25.<init>(r26, r27, r28, r29, r30, r32)
            goto L_0x0382
        L_0x0381:
            r0 = 0
        L_0x0382:
            r5.A00(r0)
            r0 = 0
            if (r8 == 0) goto L_0x03bc
            X.Gqy r9 = (X.C53583Gqy) r9
            if (r9 == 0) goto L_0x03bc
            android.content.Context r1 = X.C243803a8.A00(r5)
            X.4Yx r0 = r9.A01
            java.lang.String r29 = X.C51968G9o.A11(r1, r0)
            android.content.Context r0 = X.C243803a8.A00(r5)
            X.4Yx r1 = r9.A00
            java.lang.String r30 = X.C51968G9o.A11(r0, r1)
            android.text.TextUtils$TruncateAt r26 = android.text.TextUtils.TruncateAt.END
            X.J5w r32 = X.C59089J5w.A00
            X.2Wd r28 = X.C51965G9l.A0e(r18)
            java.lang.String r31 = "ufi_count"
            r25 = r4
            r27 = r5
            r33 = r15
            r34 = r15
            r35 = r18
            r37 = r16
            r39 = r13
            X.2WW r0 = r25.A04(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
        L_0x03bc:
            r5.A00(r0)
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0419
            X.4bN r8 = r6.A03
            X.GDe r3 = r6.A04
            X.JTI r2 = r4.A04
            X.JN7 r1 = r6.A0G
            X.GuE r0 = new X.GuE
            r28 = r2
            r29 = r1
            r30 = r16
            r25 = r0
            r26 = r8
            r27 = r3
            r25.<init>(r26, r27, r28, r29, r30)
        L_0x03dc:
            r5.A00(r0)
            r25 = r4
            r26 = r5
            r27 = r18
            r29 = r16
            X.GH5 r0 = r25.A06(r26, r27, r29)
            r5.A00(r0)
        L_0x03ee:
            X.JN5 r2 = r6.A0E
            X.GHh r1 = r6.A06
            X.0qQ.A0B(r2, r13)
            r0 = r21
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x041b
            boolean r0 = r2 instanceof X.C52085GEf
            if (r0 == 0) goto L_0x041b
            X.JTI r1 = r4.A04
            X.GEf r2 = (X.C52085GEf) r2
            boolean r0 = r4.A08
            X.GIG r3 = new X.GIG
            r58 = r3
            r59 = r12
            r60 = r1
            r61 = r2
            r64 = r0
            r58.<init>(r59, r60, r61, r62, r64)
            goto L_0x0090
        L_0x0419:
            r0 = 0
            goto L_0x03dc
        L_0x041b:
            r3 = 0
            goto L_0x0090
        L_0x041e:
            X.0Tu r3 = X.0Tu.A05
            r0 = 37173551833285212(0x8411260010025c, double:3.57204209302362E-306)
            float r41 = X.C51965G9l.A00(r3, r12, r0)
            goto L_0x0054
        L_0x042b:
            X.0Tu r5 = X.0Tu.A05
            r0 = 37173551833154138(0x841126000e025a, double:3.572042092940728E-306)
            float r57 = X.C51965G9l.A00(r5, r12, r0)
            goto L_0x0044
        L_0x0438:
            X.0Tu r2 = X.0Tu.A05
            r0 = 37173551833219675(0x841126000f025b, double:3.572042092982174E-306)
            float r33 = X.C51965G9l.A00(r2, r12, r0)
            goto L_0x002d
        L_0x0445:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52250GKr.A0X(X.3Y5):X.3mp");
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
        long A0C = C244013aV.A0C(r20, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
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
        2WX r3 = new 2WX(new 2WX(r12, new AnonymousClass9JR(num3, 0, A0C)), new AnonymousClass9JR(AnonymousClass05K.A0A, 0, doubleToRawLongBits));
        if (z) {
            j4 = Double.doubleToRawLongBits(0.0d);
        }
        2WX r2 = new 2WX(r3, new AnonymousClass9JR(AnonymousClass05K.A1I, 0, j4));
        String str4 = str2;
        if (str2 != null) {
            r2 = new 2WX(r2, new AnonymousClass9JS(AnonymousClass05K.A0N, str4, 0));
        }
        Integer num4 = AnonymousClass05K.A01;
        2WX r102 = new 2WX(new 2WX(new 2WX(r2, new AnonymousClass9JS(num4, "android.widget.Button", 0)), new AnonymousClass9JS(AnonymousClass05K.A1F, r28, 4)), new AnonymousClass9JS(num3, str3, 4));
        0sP r32 = r29;
        if (r29 != null) {
            r102 = new 2WX(r102, new AnonymousClass9JS(AnonymousClass05K.A03, r32, 4));
        }
        0sP r33 = r30;
        if (r30 != null) {
            r102 = new 2WX(r102, new AnonymousClass9JS(AnonymousClass05K.A04, r33, 4));
        }
        2Wd r02 = r24;
        if (r24 != null) {
            r102 = new 2WX(r102, new AnonymousClass9JR(num, 0, r02.A00));
        }
        UserSession userSession = this.A00;
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

    private final 2WW A05(C70832Wc r20, long j, long j2) {
        GIA gia;
        boolean A062 = 182.A06(0Tu.A06, this.A00, 36325063863251541L);
        JN1 jn1 = this.A05.A09;
        if (!(jn1 instanceof GIA) || (gia = (GIA) jn1) == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(gia.A00);
        C70832Wc r6 = r20;
        String A002 = C14066TpE.A00(C51971G9r.A0M(r6), valueOf, (Integer) null, false);
        0qQ.A07(A002);
        return A04((TextUtils.TruncateAt) null, r6, (2Wd) null, A002, C244013aV.A0F(r6, valueOf, 2131976669), "save_count", new C58736Iwj(39, this, A062), new C58736Iwj(40, this, A062), (0sP) null, j, j2, false);
    }

    private final GH5 A06(C70832Wc r8, long j, long j2) {
        C52091GEl gEl = this.A05;
        if (!gEl.A0L) {
            return null;
        }
        long A0C = C244013aV.A0C(r8, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
        AnonymousClass3XV r2 = 2WX.A02;
        if (gEl.A0A instanceof GIA) {
            A0C = C51969G9p.A0D();
        }
        if (!gEl.A06.A00) {
            j2 = C51969G9p.A0D();
        }
        Integer num = AnonymousClass05K.A08;
        2WX A0Y = C51971G9r.A0Y(C51974G9v.A0F((2WX) null, C51965G9l.A0c(num, 0, A0C), 0, j2), AnonymousClass05K.A0D, "clips_ufi_more_button_component", 4);
        Integer num2 = AnonymousClass05K.A00;
        2WX A002 = AnonymousClass9JR.A00(A0Y, num2, 0, j);
        Integer num3 = AnonymousClass05K.A01;
        return new GH5(C244013aV.A0D(r8, R.drawable.instagram_more_vertical_outline_44), ImageView.ScaleType.FIT_CENTER, C51971G9r.A0Y(C51972G9s.A0U(C51972G9s.A0V(C51971G9r.A0Y(C51974G9v.A0J(AnonymousClass9JR.A00(A002, num3, 0, j), C51972G9s.A0W(r8, 2131966723, 0), num2), num, "more_button", 4), this.A07), num3, 0), AnonymousClass05K.A0B, Integer.valueOf(R.id.clips_ufi_more_button_component), 4), false);
    }

    private final C52298GMo A07(long j, long j2) {
        C52091GEl gEl = this.A05;
        JN1 jn1 = gEl.A09;
        if ((jn1 instanceof GIA) || (jn1 instanceof GLC)) {
            return new C52298GMo(gEl.A03, gEl.A04, gEl.A0F, this.A04, j, j2);
        }
        if ((jn1 instanceof C53583Gqy) || (jn1 instanceof GJC)) {
            return null;
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final long A00(C70832Wc r5, float f, long j, long j2) {
        AnonymousClass2V4 r4 = r5.Aqq().A0D;
        0qQ.A07(r4);
        int A002 = 2Wd.A00(r5.Bnf(), j) + 2Wd.A00(r5.Bnf(), 2Wd.A02(2Wd.A01(f, j2)));
        return Double.doubleToRawLongBits((double) (((float) A002) / r4.A01.getDisplayMetrics().density));
    }
}
