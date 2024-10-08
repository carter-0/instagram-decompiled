package X;

import android.app.Application;
import android.graphics.Matrix;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8M1  reason: invalid class name */
public final class AnonymousClass8M1 extends C361478gI {
    public static final List A09 = 0sr.A1P(new 0eP[]{new 0eP(Float.valueOf(0.5625f), AnonymousClass8M2.CROP_9_16), new 0eP(Float.valueOf(0.75f), AnonymousClass8M2.CROP_3_4), new 0eP(Float.valueOf(1.0f), AnonymousClass8M2.CROP_1_1), new 0eP(Float.valueOf(1.3333334f), AnonymousClass8M2.CROP_4_3), new 0eP(Float.valueOf(1.7777778f), AnonymousClass8M2.CROP_16_9)});
    public final Application A00;
    public final AnonymousClass2Fj A01 = new AnonymousClass2Fj();
    public final UserSession A02;
    public final AnonymousClass8A5 A03;
    public final ClipsCreationViewModel A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final 05G A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8M1(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        super(application);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(clipsCreationViewModel, 3);
        this.A00 = application;
        this.A02 = userSession;
        this.A04 = clipsCreationViewModel;
        02z A012 = 106.A01(0sn.A00);
        this.A08 = A012;
        02z A013 = 106.A01((Object) null);
        this.A06 = A013;
        this.A07 = A012;
        this.A05 = A013;
        this.A03 = AnonymousClass8A4.A00(application, userSession);
    }

    public static final C381529bu A00(AnonymousClass8M1 r0) {
        AnonymousClass88W r02 = (AnonymousClass88W) r0.A01.A02();
        if (r02 != null) {
            return (C381529bu) r02.A01;
        }
        return null;
    }

    public static final Integer A01(0eP r2, int i) {
        int intValue;
        Number number = (Number) r2.A00;
        if (i < number.intValue()) {
            intValue = number.intValue() + 50;
        } else {
            Number number2 = (Number) r2.A01;
            if (i <= number2.intValue()) {
                return null;
            }
            intValue = number2.intValue() - 50;
        }
        return Integer.valueOf(intValue);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r15 == 90.0f) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A02(float r14, float r15) {
        /*
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r9 = r15
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0009
            r0 = 1
        L_0x0009:
            r1 = 1119092736(0x42b40000, float:90.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0047
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0047
            r6 = r14
        L_0x0014:
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            java.util.List r0 = A09
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x002a
            r3.add(r1)
            goto L_0x002a
        L_0x0047:
            float r6 = r6 / r14
            goto L_0x0014
        L_0x0049:
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0058:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r3.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r2 = r0.A01
            float r8 = r5 * r6
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r8 = r8 / r0
            r11 = 0
            r10 = 12
            r12 = 2
            X.9Hy r7 = new X.9Hy
            r13 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            X.59G r0 = new X.59G
            r0.<init>(r2, r7, r1)
            r4.add(r0)
            goto L_0x0058
        L_0x0088:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8M1.A02(float, float):java.util.List");
    }

    public static final void A03(C376429Hy r19, C376429Hy r20, AnonymousClass8M1 r21, Integer num, boolean z) {
        ArrayList arrayList;
        ClipsCreationViewModel clipsCreationViewModel = r21.A04;
        AnonymousClass831 r5 = (AnonymousClass831) clipsCreationViewModel.A0F.A02();
        if (r5 != null) {
            2HY A0C = C229632nm.A0C(0, r5.A01.size());
            arrayList = new ArrayList(0Yv.A1E(A0C, 10));
            0sh it = A0C.iterator();
            while (it.hasNext()) {
                int A002 = it.A00();
                Integer valueOf = Integer.valueOf(A002);
                C376429Hy r1 = null;
                if (num == null || A002 != num.intValue() || r20 == null) {
                    AnonymousClass51N r0 = (AnonymousClass51N) r5.A04(A002);
                    if (r0 != null) {
                        r1 = r0.A04();
                    }
                } else {
                    r1 = C39899AIg.A02(r20);
                }
                C376429Hy A032 = C39899AIg.A03(C39899AIg.A01(r1), r19);
                0qQ.A0B(A032, 0);
                float[] fArr = {A032.A00 * 0.5625f, A032.A01};
                Matrix matrix = new Matrix();
                float f = -A032.A02;
                matrix.setRotate(f);
                matrix.mapPoints(fArr);
                arrayList.add(new 0eP(valueOf, C39899AIg.A02(new C376429Hy(2, A032.A03 * 1.0f, f, (fArr[0] / 0.5625f) * 1.0f, fArr[1] * 1.0f))));
            }
        } else {
            arrayList = 0sn.A00;
        }
        clipsCreationViewModel.A0k(arrayList, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        if (r5 == 90.0f) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C381529bu r27, X.AnonymousClass8M1 r28) {
        /*
            r4 = r28
            X.2Fj r1 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsTransformViewModel.ClipsTransformEditEvent"
            r2 = r27
            X.0qQ.A0C(r2, r0)
            X.88W r0 = new X.88W
            r0.<init>(r2)
            r1.A0B(r0)
            X.9sM r0 = r2.A05
            boolean r0 = r0.A00
            X.05G r8 = r4.A08
            if (r0 == 0) goto L_0x028c
            float r0 = r2.A01
            X.9Hy r2 = r2.A04
            float r1 = r2.A02
            float r15 = X.C39899AIg.A00(r1)
            float r3 = r2.A03
            com.instagram.common.session.UserSession r6 = r4.A02
            r2 = 0
            X.0Tu r1 = X.0Tu.A06
            r4 = 36883044539892193(0x8308ef000901e1, double:3.3883241109028975E-306)
            java.lang.String r4 = X.182.A04(r1, r6, r4)
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0226
            X.0sn r1 = X.0sn.A00
        L_0x003d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r1.iterator()
        L_0x0046:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0261
            java.lang.Object r1 = r12.next()
            X.9sI r1 = (X.C391069sI) r1
            int r5 = r1.ordinal()
            if (r5 == r2) goto L_0x010c
            r1 = 1
            if (r5 == r1) goto L_0x00b3
            r1 = 2
            if (r5 == r1) goto L_0x00ae
            r1 = 3
            if (r5 == r1) goto L_0x0156
            r1 = 4
            if (r5 != r1) goto L_0x025b
            r5 = 1058013184(0x3f100000, float:0.5625)
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x009a
            r1 = 0
            int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0075
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x009a
        L_0x0075:
            X.8M2 r1 = X.AnonymousClass8M2.FIT
            float r14 = r0 / r5
            r17 = 0
            r16 = 12
            r18 = 2
            X.9Hy r13 = new X.9Hy
            r19 = r17
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x0086:
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            X.59G r5 = new X.59G
            r5.<init>(r1, r13, r6)
            java.util.List r1 = java.util.Collections.singletonList(r5)
            X.0qQ.A07(r1)
        L_0x0096:
            X.018.A16(r1, r4)
            goto L_0x0046
        L_0x009a:
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0222
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0075
            r1 = 1119092736(0x42b40000, float:90.0)
            int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0222
            goto L_0x0075
        L_0x00ae:
            java.util.List r1 = A02(r0, r15)
            goto L_0x0096
        L_0x00b3:
            r20 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r15 + r20
            float r5 = X.C39899AIg.A00(r1)
            r17 = 0
            int r1 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x00d5
            X.8M2 r1 = X.AnonymousClass8M2.ROTATE_BY_90
            r19 = 15
            r21 = 2
            X.9Hy r13 = new X.9Hy
            r16 = r13
            r18 = r17
            r20 = r17
            r22 = r17
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x0086
        L_0x00d5:
            int r1 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x00f7
            r18 = 1127481344(0x43340000, float:180.0)
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x00f1
            X.8M2 r1 = X.AnonymousClass8M2.ROTATE_BY_90
            r19 = 13
            r21 = 2
            X.9Hy r13 = new X.9Hy
            r16 = r13
            r20 = r17
            r22 = r17
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x0086
        L_0x00f1:
            r20 = 1119092736(0x42b40000, float:90.0)
            int r1 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x0222
        L_0x00f7:
            X.8M2 r1 = X.AnonymousClass8M2.ROTATE_BY_90
            r21 = 12
            r23 = 2
            X.9Hy r13 = new X.9Hy
            r18 = r13
            r19 = r0
            r22 = r17
            r24 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x0086
        L_0x010c:
            r1 = 3
            X.59G[] r1 = new X.AnonymousClass59G[r1]
            X.8M2 r9 = X.AnonymousClass8M2.ROTATE_NEGATIVE_90
            r18 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r20 = 0
            r19 = 12
            r21 = 2
            X.9Hy r7 = new X.9Hy
            r17 = r0
            r22 = r20
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            X.59G r6 = new X.59G
            r6.<init>(r9, r7, r5)
            r1[r2] = r6
            X.8M2 r9 = X.AnonymousClass8M2.ROTATE_180
            r18 = 1127481344(0x43340000, float:180.0)
            r19 = 13
            X.9Hy r6 = new X.9Hy
            r17 = r20
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.59G r7 = new X.59G
            r7.<init>(r9, r6, r5)
            r6 = 1
            r1[r6] = r7
            X.8M2 r7 = X.AnonymousClass8M2.ROTATE_POSITIVE_90
            r18 = 1119092736(0x42b40000, float:90.0)
            r19 = 12
            X.9Hy r6 = new X.9Hy
            r17 = r0
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x01ba
        L_0x0156:
            r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10 = 1127481344(0x43340000, float:180.0)
            r7 = 1119092736(0x42b40000, float:90.0)
            r5 = 1058013184(0x3f100000, float:0.5625)
            r9 = 2
            r17 = 0
            r21 = 1
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x020c
            int r1 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x016f
            int r1 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x020c
        L_0x016f:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r3 - r1
        L_0x0173:
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
        L_0x0176:
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f6
            int r1 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0182
            int r1 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x01f6
        L_0x0182:
            float r10 = r3 * r5
            float r10 = r10 / r0
        L_0x0185:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r1
        L_0x018b:
            int r1 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x01c7
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x0222
            X.59G[] r1 = new X.AnonymousClass59G[r9]
            X.8M2 r11 = X.AnonymousClass8M2.ALIGN_TOP
            r16 = 4
            X.9Hy r7 = new X.9Hy
            r13 = r7
            r14 = r3
            r18 = r9
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            X.59G r6 = new X.59G
            r6.<init>(r11, r7, r5)
            r1[r2] = r6
            X.8M2 r7 = X.AnonymousClass8M2.ALIGN_BOTTOM
            float r10 = -r10
            X.9Hy r6 = new X.9Hy
            r13 = r6
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x01ba:
            X.59G r9 = new X.59G
            r9.<init>(r7, r6, r5)
            r1[r21] = r9
            java.util.List r1 = X.0sr.A1P(r1)
            goto L_0x0096
        L_0x01c7:
            X.59G[] r1 = new X.AnonymousClass59G[r9]
            X.8M2 r11 = X.AnonymousClass8M2.ALIGN_LEFT
            r25 = 8
            X.9Hy r10 = new X.9Hy
            r22 = r10
            r23 = r3
            r24 = r15
            r26 = r6
            r27 = r9
            r28 = r17
            r22.<init>(r23, r24, r25, r26, r27, r28)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            X.59G r7 = new X.59G
            r7.<init>(r11, r10, r5)
            r1[r2] = r7
            X.8M2 r7 = X.AnonymousClass8M2.ALIGN_RIGHT
            float r10 = -r6
            X.9Hy r6 = new X.9Hy
            r22 = r6
            r26 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28)
            goto L_0x01ba
        L_0x01f6:
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x020a
            int r1 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0205
            int r1 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x020a
        L_0x0205:
            float r10 = r3 * r5
            float r10 = r10 * r0
            goto L_0x0185
        L_0x020a:
            r10 = 0
            goto L_0x018b
        L_0x020c:
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x021f
            int r1 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0218
            int r1 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x021f
        L_0x0218:
            float r6 = r3 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r1
            goto L_0x0173
        L_0x021f:
            r6 = 0
            goto L_0x0176
        L_0x0222:
            X.0sn r1 = X.0sn.A00
            goto L_0x0096
        L_0x0226:
            java.lang.String r13 = r4.toLowerCase()
            X.0qQ.A07(r13)
            int r12 = r13.length()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r12)
            r10 = 0
        L_0x0237:
            if (r10 >= r12) goto L_0x0255
            char r9 = r13.charAt(r10)
            X.9sI[] r7 = X.C391069sI.values()
            int r6 = r7.length
            r5 = 0
        L_0x0243:
            if (r5 >= r6) goto L_0x024e
            r4 = r7[r5]
            char r1 = r4.A00
            if (r1 == r9) goto L_0x024f
            int r5 = r5 + 1
            goto L_0x0243
        L_0x024e:
            r4 = 0
        L_0x024f:
            r11.add(r4)
            int r10 = r10 + 1
            goto L_0x0237
        L_0x0255:
            java.util.List r1 = X.00k.A0X(r11)
            goto L_0x003d
        L_0x025b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0261:
            boolean r1 = r4.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x028c
            X.8M2 r2 = X.AnonymousClass8M2.RESET
            r10 = 0
            r12 = 15
            r14 = 2
            X.9Hy r9 = new X.9Hy
            r11 = r10
            r13 = r10
            r15 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.59G r0 = new X.59G
            r0.<init>(r2, r9, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r0 = X.00k.A0S(r4, r0)
            goto L_0x028e
        L_0x028c:
            X.0sn r0 = X.0sn.A00
        L_0x028e:
            r8.Epw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8M1.A04(X.9bu, X.8M1):void");
    }

    public final 0eP A0E(int i) {
        int i2;
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        AnonymousClass831 r0 = (AnonymousClass831) clipsCreationViewModel.A0G.A02();
        if (r0 != null) {
            i2 = r0.A01(i);
        } else {
            i2 = 0;
        }
        05G r2 = clipsCreationViewModel.A0O.A02;
        int A012 = ((AnonymousClass831) r2.getValue()).A01(i) + ((AnonymousClass831) r2.getValue()).A00(i);
        if (A012 <= 0 || Integer.valueOf(A012) == null) {
            A012 = i2;
        }
        return new 0eP(Integer.valueOf(i2), Integer.valueOf(A012));
    }

    public final void A0F() {
        C381529bu A002 = A00(this);
        if (A002 != null && A002.A05.A00) {
            C391109sM r4 = C391109sM.CANCEL;
            int i = A002.A02;
            C376429Hy r2 = A002.A03;
            float f = A002.A00;
            float f2 = A002.A01;
            C376429Hy r3 = A002.A04;
            0qQ.A0B(r2, 2);
            0qQ.A0B(r3, 5);
            A04(new C381529bu(r2, r3, r4, f, f2, i), this);
        }
    }

    public final boolean A0G() {
        C391109sM r0;
        C381529bu A002 = A00(this);
        if (A002 == null || (r0 = A002.A05) == null || !r0.A00) {
            return false;
        }
        return true;
    }
}
