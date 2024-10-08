package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OVG {
    public final Context A00;
    public final C70409O5m A01;
    public final UserSession A02;

    public /* synthetic */ OVG(Context context, UserSession userSession) {
        C70409O5m o5m = new C70409O5m(context);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = o5m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (X.AnonymousClass7TE.A1b(r6) != true) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        if (r47 != false) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C68295N9i A00(X.N54 r58, java.lang.Integer r59) {
        /*
            r57 = this;
            r15 = r58
            java.lang.Integer r1 = r15.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r4 = 0
            r3 = 1
            boolean r47 = X.AnonymousClass7TF.A1W(r1, r0)
            X.N2c r0 = r15.A02
            java.util.List r6 = r15.A09
            if (r0 == 0) goto L_0x00c3
            float r2 = r0.A00
        L_0x0014:
            r5 = r57
            X.O5m r1 = r5.A01
            X.0qQ.A0B(r6, r4)
            boolean r0 = r6.isEmpty()
            r9 = 0
            if (r0 != 0) goto L_0x00c0
            int r0 = r6.size()
            if (r0 != r3) goto L_0x0088
            java.lang.Object r9 = r6.get(r4)
            X.MbR r9 = (X.C66720MbR) r9
        L_0x002e:
            if (r9 == 0) goto L_0x00c0
            java.lang.String r6 = r9.A03
            int r1 = r9.A01
            int r0 = r9.A00
            com.instagram.common.typedurl.SimpleImageUrl r9 = new com.instagram.common.typedurl.SimpleImageUrl
            r9.<init>(r6, r1, r0)
        L_0x003b:
            r33 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r33 ? 1 : (r2 == r33 ? 0 : -1))
            boolean r48 = X.Dba.A1U(r0)
            boolean r7 = r15.A0A
            if (r7 == 0) goto L_0x0085
            if (r47 != 0) goto L_0x0085
            X.3TO r18 = X.AnonymousClass3TO.AUTOPLAY
        L_0x004b:
            com.instagram.common.session.UserSession r8 = r5.A02
            X.0Tu r6 = X.0Tu.A05
            r0 = 36314266315262454(0x8103a2000009f6, double:3.0286264713609716E-306)
            boolean r49 = X.182.A06(r6, r8, r0)
            java.util.List r6 = r15.A08
            if (r6 == 0) goto L_0x0063
            boolean r1 = X.AnonymousClass7TE.A1b(r6)
            r0 = 1
            if (r1 == r3) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            r14 = 0
            if (r0 == 0) goto L_0x00ed
            if (r6 == 0) goto L_0x00ed
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x0071:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r6.next()
            X.N54 r0 = (X.N54) r0
            X.N9i r0 = r5.A00(r0, r14)
            r1.add(r0)
            goto L_0x0071
        L_0x0085:
            X.3TO r18 = X.AnonymousClass3TO.GONE
            goto L_0x004b
        L_0x0088:
            android.content.Context r0 = r1.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            int r1 = r0.widthPixels
            r0 = 1080(0x438, float:1.513E-42)
            int r11 = java.lang.Math.min(r1, r0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            java.util.Iterator r10 = r6.iterator()
        L_0x009d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r7 = r10.next()
            X.MbR r7 = (X.C66720MbR) r7
            int r6 = r7.A01
            int r0 = r11 / 20
            int r0 = r0 + r11
            int r0 = r0 - r6
            int r1 = java.lang.Math.abs(r0)
            if (r1 < r8) goto L_0x00bd
            if (r9 == 0) goto L_0x009d
            if (r1 != r8) goto L_0x009d
            int r0 = r9.A01
            if (r6 >= r0) goto L_0x009d
        L_0x00bd:
            r9 = r7
            r8 = r1
            goto L_0x009d
        L_0x00c0:
            r9 = 0
            goto L_0x003b
        L_0x00c3:
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r6.get(r4)
            X.MbR r0 = (X.C66720MbR) r0
            int r1 = r0.A00
            java.lang.Object r0 = r6.get(r4)
            X.MbR r0 = (X.C66720MbR) r0
            int r0 = r0.A01
            if (r0 <= 0) goto L_0x00e2
            if (r1 <= 0) goto L_0x00e2
            float r2 = (float) r0
            float r0 = (float) r1
            float r2 = r2 / r0
            goto L_0x0014
        L_0x00e2:
            java.lang.String r1 = "RtcCoWatchPlaybackViewModelFactory"
            java.lang.String r0 = "Attempt to calculate aspect ratio without video or image."
            X.0wb.A03(r1, r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0014
        L_0x00ed:
            r1 = r14
        L_0x00ee:
            int r5 = X.AnonymousClass7TG.A0A(r59)
            if (r7 == 0) goto L_0x00f7
            r8 = 1
            if (r47 == 0) goto L_0x00f8
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            if (r1 == 0) goto L_0x0110
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 != r3) goto L_0x0110
            int r0 = X.DbT.A02(r1, r3)
            int r5 = X.C229632nm.A03(r5, r4, r0)
            java.lang.Object r0 = r1.get(r5)
            X.N9i r0 = (X.C68295N9i) r0
            boolean r8 = r0.A0N
        L_0x0110:
            java.lang.String r12 = r15.A05
            r41 = r7 ^ 1
            X.Jvb r6 = r15.A01
            if (r6 == 0) goto L_0x018e
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x018e
            com.instagram.common.typedurl.SimpleImageUrl r16 = X.DbS.A0V(r0)
        L_0x0120:
            java.lang.String r11 = r6.A02
        L_0x0122:
            X.0qQ.A0A(r6)
            java.lang.String r0 = r6.A01
            java.lang.String r10 = "_"
            int r10 = X.00l.A08(r0, r10, r4, r4)
            X.0qQ.A0A(r6)
            if (r10 < 0) goto L_0x0138
            int r6 = r10 + 1
            java.lang.String r0 = X.C66580MXl.A0z(r0, r6)
        L_0x0138:
            X.N49 r6 = r15.A00
            if (r6 == 0) goto L_0x018b
            java.lang.String r10 = r6.A00
            java.lang.String r6 = r6.A01
        L_0x0140:
            r34 = 1064514355(0x3f733333, float:0.95)
            X.N9i r13 = new X.N9i
            r19 = r14
            r20 = r14
            r23 = r0
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r10
            r29 = r6
            r30 = r1
            r31 = r14
            r32 = r2
            r35 = r5
            r36 = r3
            r37 = r7
            r38 = r4
            r39 = r3
            r40 = r4
            r42 = r7
            r43 = r4
            r44 = r4
            r45 = r4
            r46 = r8
            r50 = r4
            r51 = r3
            r52 = r4
            r53 = r3
            r54 = r4
            r55 = r4
            r56 = r4
            r21 = r12
            r22 = r11
            r17 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            return r13
        L_0x018b:
            r10 = r14
            r6 = r14
            goto L_0x0140
        L_0x018e:
            r16 = r14
            if (r6 != 0) goto L_0x0120
            r11 = r14
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVG.A00(X.N54, java.lang.Integer):X.N9i");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (X.182.A06(r4, r5, 36314266315262454L) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C68295N9i A01(X.C74438Put r50, java.lang.Integer r51) {
        /*
            r49 = this;
            r7 = r50
            r27 = 0
            boolean r0 = r7 instanceof X.N54
            r2 = r49
            if (r0 == 0) goto L_0x0013
            X.N54 r7 = (X.N54) r7
            r0 = r51
            X.N9i r5 = r2.A00(r7, r0)
            return r5
        L_0x0013:
            boolean r0 = r7 instanceof X.N53
            if (r0 == 0) goto L_0x00be
            X.N53 r7 = (X.N53) r7
            X.MbR r0 = r7.A00
            if (r0 == 0) goto L_0x00bb
            java.lang.String r3 = r0.A03
            int r1 = r0.A01
            int r0 = r0.A00
            com.instagram.common.typedurl.SimpleImageUrl r9 = new com.instagram.common.typedurl.SimpleImageUrl
            r9.<init>(r3, r1, r0)
        L_0x0028:
            X.N2c r0 = r7.A01
            float r3 = r0.A00
            r25 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            boolean r40 = X.Dba.A1U(r0)
            com.instagram.common.session.UserSession r5 = r2.A02
            X.0Tu r4 = X.0Tu.A05
            r0 = 36310555463516348(0x810042000000bc, double:3.0262797137743335E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x004b
            java.util.List r0 = r7.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x0058
        L_0x004b:
            r0 = 36314266315262454(0x8103a2000009f6, double:3.0286264713609716E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r41 = 0
            if (r0 == 0) goto L_0x005a
        L_0x0058:
            r41 = 1
        L_0x005a:
            java.lang.String r13 = r7.A02
            boolean r1 = r7.A08
            r33 = r1 ^ 1
            java.lang.String r14 = r7.A04
            java.lang.String r0 = r7.A03
            if (r0 != 0) goto L_0x0073
            android.content.Context r0 = r2.A00
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131956814(0x7f13144e, float:1.9550194E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r2, r0)
        L_0x0073:
            boolean r2 = r7.A06
            r6 = 0
            r28 = 1
            X.3TO r10 = X.AnonymousClass3TO.GONE
            r26 = 1064514355(0x3f733333, float:0.95)
            X.N9i r5 = new X.N9i
            r8 = r6
            r11 = r6
            r12 = r6
            r15 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r3
            r29 = r1
            r30 = r27
            r31 = r28
            r32 = r27
            r34 = r1
            r35 = r27
            r36 = r27
            r37 = r27
            r38 = r27
            r39 = r28
            r42 = r27
            r43 = r28
            r44 = r27
            r45 = r28
            r46 = r2
            r47 = r27
            r48 = r27
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return r5
        L_0x00bb:
            r9 = 0
            goto L_0x0028
        L_0x00be:
            boolean r0 = r7 instanceof X.N51
            if (r0 == 0) goto L_0x011b
            X.N51 r7 = (X.N51) r7
            java.lang.String r2 = r7.A01
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r7.A02
            r6 = 0
            r28 = 1
            r24 = 1065353216(0x3f800000, float:1.0)
            X.3TO r10 = X.AnonymousClass3TO.GONE
            r26 = 1064514355(0x3f733333, float:0.95)
            X.N9i r5 = new X.N9i
            r8 = r6
            r9 = r6
            r11 = r6
            r12 = r6
            r13 = r2
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r1
            r18 = r0
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r25 = r24
            r29 = r27
            r30 = r27
            r31 = r28
            r32 = r27
            r33 = r27
            r34 = r27
            r35 = r27
            r36 = r28
            r37 = r27
            r38 = r27
            r39 = r27
            r40 = r27
            r41 = r27
            r42 = r27
            r43 = r28
            r44 = r27
            r45 = r28
            r46 = r27
            r47 = r27
            r48 = r27
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return r5
        L_0x011b:
            boolean r0 = r7 instanceof X.N52
            if (r0 == 0) goto L_0x0194
            X.N52 r7 = (X.N52) r7
            boolean r3 = r7.A07
            if (r3 == 0) goto L_0x0191
            X.3TO r10 = X.AnonymousClass3TO.AUTOPLAY
        L_0x0127:
            X.N2c r0 = r7.A00
            if (r0 == 0) goto L_0x018e
            float r2 = r0.A00
        L_0x012d:
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r7.A05
            com.instagram.common.typedurl.SimpleImageUrl r9 = X.DbS.A0V(r0)
            r33 = r3 ^ 1
            java.lang.String r0 = r7.A03
            if (r0 == 0) goto L_0x018c
            com.instagram.common.typedurl.SimpleImageUrl r8 = X.DbS.A0V(r0)
        L_0x013f:
            java.lang.String r0 = r7.A02
            r6 = 0
            r28 = 1
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 1064514355(0x3f733333, float:0.95)
            X.N9i r5 = new X.N9i
            r11 = r6
            r12 = r6
            r13 = r1
            r14 = r0
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r2
            r29 = r3
            r30 = r27
            r31 = r28
            r32 = r27
            r34 = r3
            r35 = r27
            r36 = r27
            r37 = r27
            r38 = r3
            r39 = r27
            r40 = r27
            r41 = r27
            r42 = r27
            r43 = r28
            r44 = r27
            r45 = r28
            r46 = r27
            r47 = r27
            r48 = r27
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return r5
        L_0x018c:
            r8 = 0
            goto L_0x013f
        L_0x018e:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x012d
        L_0x0191:
            X.3TO r10 = X.AnonymousClass3TO.GONE
            goto L_0x0127
        L_0x0194:
            boolean r0 = r7 instanceof X.N50
            if (r0 == 0) goto L_0x01fd
            X.N50 r7 = (X.N50) r7
            java.lang.String r4 = r7.A01
            X.MbR r0 = r7.A00
            java.lang.String r3 = r0.A03
            int r1 = r0.A01
            int r0 = r0.A00
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r3, r1, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r6 = 0
            r28 = 1
            X.3TO r10 = X.AnonymousClass3TO.GONE
            r25 = 1056964608(0x3f000000, float:0.5)
            r26 = 1064514355(0x3f733333, float:0.95)
            X.N9i r5 = new X.N9i
            r8 = r6
            r9 = r2
            r11 = r6
            r12 = r6
            r13 = r4
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r1
            r29 = r27
            r30 = r27
            r31 = r28
            r32 = r27
            r33 = r27
            r34 = r27
            r35 = r27
            r36 = r27
            r37 = r27
            r38 = r27
            r39 = r27
            r40 = r27
            r41 = r27
            r42 = r27
            r43 = r27
            r44 = r27
            r45 = r28
            r46 = r27
            r47 = r27
            r48 = r27
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return r5
        L_0x01fd:
            boolean r0 = r7 instanceof X.N4z
            if (r0 == 0) goto L_0x0256
            X.N4z r7 = (X.N4z) r7
            java.lang.String r0 = r7.A00
            r6 = 0
            r28 = 1
            r24 = 1065353216(0x3f800000, float:1.0)
            X.3TO r10 = X.AnonymousClass3TO.GONE
            r26 = 1064514355(0x3f733333, float:0.95)
            X.N9i r5 = new X.N9i
            r8 = r6
            r9 = r6
            r11 = r6
            r12 = r6
            r13 = r0
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r25 = r24
            r29 = r27
            r30 = r27
            r31 = r28
            r32 = r27
            r33 = r27
            r34 = r27
            r35 = r27
            r36 = r27
            r37 = r27
            r38 = r27
            r39 = r27
            r40 = r27
            r41 = r27
            r42 = r27
            r43 = r28
            r44 = r28
            r45 = r28
            r46 = r27
            r47 = r27
            r48 = r27
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return r5
        L_0x0256:
            java.lang.String r13 = r7.Aqe()
            X.N9i r5 = new X.N9i
            r6 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r31 = 1
            X.3TO r10 = X.AnonymousClass3TO.GONE
            r26 = 1064514355(0x3f733333, float:0.95)
            r8 = r6
            r9 = r6
            r11 = r6
            r12 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r25 = r24
            r28 = r27
            r29 = r27
            r30 = r27
            r32 = r27
            r33 = r27
            r34 = r27
            r35 = r27
            r36 = r27
            r37 = r27
            r38 = r27
            r39 = r27
            r40 = r27
            r41 = r27
            r42 = r27
            r43 = r31
            r44 = r27
            r45 = r31
            r46 = r27
            r47 = r27
            r48 = r27
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVG.A01(X.Put, java.lang.Integer):X.N9i");
    }
}
