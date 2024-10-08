package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;

/* renamed from: X.7Rv  reason: invalid class name and case insensitive filesystem */
public final class C331657Rv extends C331667Rw {
    public final UserSession A00;

    public C331657Rv(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025f, code lost:
        if (r2 == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031b, code lost:
        if (r2 == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03a9, code lost:
        if (r5 != null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03c1, code lost:
        if (X.182.A06(r6, r4, 36330226413814289L) != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x043a, code lost:
        if (r1 != null) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0476, code lost:
        if (X.182.A06(r6, r11, r1) == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x048b, code lost:
        r20 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04e4, code lost:
        if (r2 == null) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36323259976789027L) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04f4, code lost:
        if (r8.length() != 0) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C330147Lp A00(android.content.Context r26, X.C331657Rv r27, X.AnonymousClass7LZ r28) {
        /*
            r0 = r28
            if (r28 != 0) goto L_0x0006
            r13 = 0
            return r13
        L_0x0006:
            boolean r5 = r0.A0b
            r7 = r27
            if (r5 != 0) goto L_0x004b
            com.instagram.user.model.User r3 = r0.A0E
            r2 = 1
            if (r3 == 0) goto L_0x04fc
            boolean r1 = r3.A1x()
            if (r1 == r2) goto L_0x001d
            boolean r1 = r3.A20()
            if (r1 != r2) goto L_0x04fc
        L_0x001d:
            r3 = 1
        L_0x001e:
            int r2 = r0.A08
            r1 = 29
            if (r2 == r1) goto L_0x004b
            r1 = 32
            if (r2 == r1) goto L_0x004b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r1 = X.AnonymousClass48O.A06(r1)
            if (r1 != 0) goto L_0x004b
            if (r3 != 0) goto L_0x004b
            com.instagram.common.session.UserSession r4 = r7.A00
            boolean r1 = X.I5N.A03(r4)
            if (r1 != 0) goto L_0x004b
            X.0Tu r3 = X.0Tu.A05
            r1 = 36323259976789027(0x810bd000002c23, double:3.0343140991249445E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r22 = 1
            if (r1 != 0) goto L_0x004d
        L_0x004b:
            r22 = 0
        L_0x004d:
            int r2 = r0.A05
            if (r2 <= 0) goto L_0x04f8
            java.lang.String r19 = "requests"
        L_0x0053:
            java.lang.String r4 = r0.A0J
            boolean r3 = r0.A0r
            boolean r1 = r0.A0Z
            r28 = r5 ^ 1
            X.7Co r17 = new X.7Co
            r23 = r28
            r18 = r4
            r20 = r3
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            boolean r1 = r0.A0W
            r4 = 0
            r6 = 1
            r5 = r26
            if (r1 == 0) goto L_0x04ec
            r1 = 2131959634(0x7f131f52, float:1.9555914E38)
            java.lang.String r8 = r5.getString(r1)
            X.0qQ.A07(r8)
        L_0x0084:
            r3.add(r8)
        L_0x0087:
            boolean r9 = r0.A0q
            if (r9 == 0) goto L_0x0098
            r1 = 2131960577(0x7f132301, float:1.9557827E38)
            java.lang.String r1 = r5.getString(r1)
            X.0qQ.A07(r1)
            r3.add(r1)
        L_0x0098:
            if (r2 <= 0) goto L_0x00c6
            android.content.res.Resources r11 = r5.getResources()
            r8 = 2131820669(0x7f11007d, float:1.927406E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r11.getQuantityString(r8, r2, r1)
            X.0qQ.A07(r1)
            r3.add(r1)
            int r1 = r3.size()
            int r1 = r1 - r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 2130970270(0x7f04069e, float:1.7549245E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.put(r2, r1)
        L_0x00c6:
            int r2 = r0.A04
            if (r2 <= 0) goto L_0x0119
            boolean r1 = r0.A0S
            if (r1 != 0) goto L_0x0119
            java.util.Calendar r12 = java.util.Calendar.getInstance()
            X.0qQ.A07(r12)
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            X.0qQ.A07(r11)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = (long) r2
            long r1 = r8.toMillis(r1)
            r11.setTimeInMillis(r1)
            long r1 = r11.getTimeInMillis()
            long r11 = r12.getTimeInMillis()
            long r1 = r1 - r11
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r13 = r8.toHours(r1)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            r1 = 1
            long r11 = r8.toHours(r1)
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0119
            android.content.res.Resources r8 = r5.getResources()
            r2 = 2131960521(0x7f1322c9, float:1.9557713E38)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r8.getString(r2, r1)
            if (r1 == 0) goto L_0x0119
            r3.add(r1)
        L_0x0119:
            java.lang.CharSequence r8 = r0.A0F
            boolean r1 = X.00k.A0u(r3, r8)
            if (r1 != 0) goto L_0x0135
            if (r8 == 0) goto L_0x0135
            com.instagram.common.session.UserSession r12 = r7.A00
            X.0Tu r11 = X.0Tu.A05
            r1 = 36329968715776396(0x8111ea0001418c, double:3.03855673267448E-306)
            boolean r1 = X.182.A06(r11, r12, r1)
            if (r1 == 0) goto L_0x0135
            r3.add(r4, r8)
        L_0x0135:
            X.9Iv r2 = r0.A0A
            boolean r1 = r7.A04(r0)
            r22 = 0
            if (r1 == 0) goto L_0x04e2
            if (r2 == 0) goto L_0x04e2
            java.lang.Object r11 = r2.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A06
            if (r11 == r1) goto L_0x0491
            java.lang.Integer r1 = X.AnonymousClass05K.A05
            if (r11 == r1) goto L_0x0491
            java.lang.String r1 = r2.A02
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r1)
        L_0x0152:
            java.lang.Object r1 = r2.A01
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x04e8
            com.instagram.common.session.UserSession r11 = r7.A00
            int r1 = r1.intValue()
            r20 = 0
            switch(r1) {
                case 4: goto L_0x047c;
                case 5: goto L_0x0480;
                case 6: goto L_0x0484;
                case 7: goto L_0x0488;
                case 8: goto L_0x047c;
                case 9: goto L_0x0163;
                case 10: goto L_0x0478;
                case 11: goto L_0x0463;
                case 12: goto L_0x046b;
                case 13: goto L_0x0480;
                case 14: goto L_0x0478;
                default: goto L_0x0163;
            }
        L_0x0163:
            java.lang.Integer r6 = r0.A0I
            java.lang.Integer r1 = r0.A0H
            if (r1 == 0) goto L_0x0172
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r22 = java.lang.Long.valueOf(r1)
        L_0x0172:
            r26 = 0
            if (r8 == 0) goto L_0x0178
            r26 = 1
        L_0x0178:
            X.9Ik r14 = new X.9Ik
            r18 = r14
            r19 = r4
            r21 = r6
            r23 = r3
            r24 = r10
            r25 = r9
            r18.<init>((java.lang.CharSequence) r19, (java.lang.Integer) r20, (java.lang.Integer) r21, (java.lang.Long) r22, (java.util.List) r23, (java.util.Map) r24, (boolean) r25, (boolean) r26)
            boolean r1 = r0.A0n
            if (r1 == 0) goto L_0x044e
            r1 = 2130970900(0x7f040914, float:1.7550523E38)
        L_0x0190:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r1)
        L_0x0194:
            boolean r13 = r0.A0O
            X.34S r12 = r0.A09
            java.util.List r11 = r0.A0K
            com.instagram.model.reels.Reel r10 = r0.A0D
            boolean r9 = r0.A0Y
            boolean r8 = r0.A0j
            com.instagram.direct.model.messaginguser.MessagingUser r3 = r0.A0B
            com.instagram.common.session.UserSession r4 = r7.A00
            X.0Tu r6 = X.0Tu.A05
            r1 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            boolean r27 = X.182.A06(r6, r4, r1)
            X.7Cp r16 = new X.7Cp
            r18 = r16
            r19 = r12
            r20 = r3
            r21 = r10
            r23 = r11
            r24 = r13
            r25 = r9
            r26 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r2 = r0.A0L
            if (r2 == 0) goto L_0x043d
            X.7Cq r10 = X.C327897Cq.A0E
        L_0x01ca:
            r9 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r15 = new X.7Cr
            r8 = r15
            r11 = r9
            r12 = r9
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x01d5:
            int r8 = r0.A08
            r1 = 29
            if (r8 == r1) goto L_0x03c5
            r1 = 32
            if (r8 == r1) goto L_0x03ad
            r1 = 62
            if (r8 == r1) goto L_0x03ad
            java.util.ArrayList r3 = new java.util.ArrayList
            switch(r8) {
                case 1012: goto L_0x0347;
                case 1013: goto L_0x0347;
                case 1014: goto L_0x0347;
                default: goto L_0x01e8;
            }
        L_0x01e8:
            r3.<init>()
            if (r2 != 0) goto L_0x02aa
            boolean r1 = r0.A0w
            r19 = 0
            if (r1 == 0) goto L_0x020a
            boolean r1 = r0.A0R
            if (r1 != 0) goto L_0x02fe
            X.7Cq r20 = X.C327897Cq.A0D
            r23 = 1050253722(0x3e99999a, float:0.3)
        L_0x01fc:
            X.7Cr r1 = new X.7Cr
            r18 = r1
            r21 = r19
            r22 = r19
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x0207:
            r3.add(r1)
        L_0x020a:
            boolean r1 = r0.A0P
            if (r1 == 0) goto L_0x0220
            X.7Cq r20 = X.C327897Cq.A04
            r23 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r18 = r1
            r21 = r19
            r22 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r1)
        L_0x0220:
            java.util.ArrayList r2 = r7.A03(r0)
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x022f
            r3.addAll(r2)
        L_0x022f:
            boolean r1 = r0.A0p
            r20 = 0
            if (r1 == 0) goto L_0x028b
            boolean r1 = r7.A04(r0)
            if (r1 == 0) goto L_0x02cc
            X.1Av r1 = X.1Au.A00(r4)
            boolean r1 = r1.A1s()
            if (r1 != 0) goto L_0x0277
            r1 = 36316830411461282(0x8105f7000b12a2, double:3.030248016121897E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            if (r1 == 0) goto L_0x0277
            X.1QG r2 = X.1QE.A0E()
            X.1QG r1 = X.1QG.A04
            if (r2 != r1) goto L_0x0261
            boolean r2 = X.C61670oa.A0B()
            r1 = 2130970346(0x7f0406ea, float:1.75494E38)
            if (r2 != 0) goto L_0x0264
        L_0x0261:
            r1 = 2130970250(0x7f04068a, float:1.7549205E38)
        L_0x0264:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r1)
            r25 = 2
            r26 = 13
            X.9IV r21 = new X.9IV
            r23 = r19
            r24 = r19
            r21.<init>(r22, r23, r24, r25, r26)
            r19 = r21
        L_0x0277:
            X.7Cq r23 = X.C327897Cq.A0S
            r26 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r21 = r1
            r24 = r20
            r25 = r20
            r22 = r19
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x0288:
            r3.add(r1)
        L_0x028b:
            X.7Cr r1 = A02(r0)
            if (r1 == 0) goto L_0x0294
            r3.add(r1)
        L_0x0294:
            boolean r1 = r0.A0l
            if (r1 == 0) goto L_0x02aa
            X.7Cq r21 = X.C327897Cq.A0O
            r24 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r5 = new X.7Cr
            r19 = r5
            r22 = r20
            r23 = r20
            r19.<init>(r20, r21, r22, r23, r24)
        L_0x02a7:
            r3.add(r5)
        L_0x02aa:
            int r6 = r0.A00
            int r5 = r0.A03
            int r4 = r0.A01
            int r2 = r0.A02
            int r1 = r0.A07
            boolean r0 = r0.A0x
            X.7Lp r13 = new X.7Lp
            r25 = r0
            r18 = r3
            r19 = r6
            r20 = r5
            r21 = r4
            r22 = r2
            r23 = r1
            r24 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r13
        L_0x02cc:
            boolean r1 = X.C66700Mb7.A01(r4)
            if (r1 == 0) goto L_0x028b
            r1 = 36330110449631703(0x81120b000041d7, double:3.038646365735293E-306)
            boolean r2 = X.182.A06(r6, r4, r1)
            boolean r1 = r0.A0c
            if (r2 == 0) goto L_0x02f6
            if (r1 == 0) goto L_0x02f3
            X.7Cq r23 = X.C327897Cq.A0K
        L_0x02e3:
            r26 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r21 = r1
            r22 = r19
            r24 = r19
            r25 = r19
            r21.<init>(r22, r23, r24, r25, r26)
            goto L_0x0288
        L_0x02f3:
            X.7Cq r23 = X.C327897Cq.A0P
            goto L_0x02e3
        L_0x02f6:
            if (r1 == 0) goto L_0x02fb
            X.7Cq r23 = X.C327897Cq.A0Q
            goto L_0x02e3
        L_0x02fb:
            X.7Cq r23 = X.C327897Cq.A0R
            goto L_0x02e3
        L_0x02fe:
            boolean r1 = r0.A0u
            if (r1 == 0) goto L_0x0308
            X.7Cq r20 = X.C327897Cq.A0D
            r23 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01fc
        L_0x0308:
            boolean r1 = r0.A0v
            if (r1 == 0) goto L_0x0344
            X.1QG r2 = X.1QE.A0E()
            X.1QG r1 = X.1QG.A04
            if (r2 != r1) goto L_0x031d
            boolean r2 = X.C61670oa.A0B()
            r1 = 2130970346(0x7f0406ea, float:1.75494E38)
            if (r2 != 0) goto L_0x0320
        L_0x031d:
            r1 = 2130970250(0x7f04068a, float:1.7549205E38)
        L_0x0320:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r1)
            r24 = 2
            r25 = 13
            X.9IV r20 = new X.9IV
            r22 = r19
            r23 = r19
            r20.<init>(r21, r22, r23, r24, r25)
        L_0x0331:
            X.7Cq r23 = X.C327897Cq.A0C
            r26 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r21 = r1
            r24 = r19
            r25 = r19
            r22 = r20
            r21.<init>(r22, r23, r24, r25, r26)
            goto L_0x0207
        L_0x0344:
            r20 = r19
            goto L_0x0331
        L_0x0347:
            r3.<init>()
            java.util.ArrayList r2 = r7.A03(r0)
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0359
            r3.addAll(r2)
        L_0x0359:
            boolean r1 = r0.A0g
            if (r1 == 0) goto L_0x0371
            X.7Cq r20 = X.C327897Cq.A08
            r19 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r18 = r1
            r21 = r19
            r22 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r1)
        L_0x0371:
            boolean r1 = r0.A0f
            if (r1 == 0) goto L_0x0389
            X.7Cq r20 = X.C327897Cq.A07
            r19 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r18 = r1
            r21 = r19
            r22 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r1)
        L_0x0389:
            boolean r1 = r0.A0i
            if (r1 != 0) goto L_0x0391
            boolean r1 = r0.A0e
            if (r1 == 0) goto L_0x03a5
        L_0x0391:
            X.7Cq r20 = X.C327897Cq.A06
            r19 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r18 = r1
            r21 = r19
            r22 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r1)
        L_0x03a5:
            X.7Cr r5 = A02(r0)
            if (r5 == 0) goto L_0x02aa
            goto L_0x02a7
        L_0x03ad:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.7Cr r5 = A01(r0)
            if (r5 == 0) goto L_0x02aa
            r1 = 36330226413814289(0x81122600014211, double:3.0387197019513105E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            if (r1 == 0) goto L_0x02aa
            goto L_0x02a7
        L_0x03c5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r5 = r0.A0a
            if (r5 == 0) goto L_0x0436
            boolean r1 = r0.A0S
            if (r1 != 0) goto L_0x0436
            r1 = 36319407395052878(0x81084f003c1d4e, double:3.0318777109219024E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            if (r1 == 0) goto L_0x0436
            r1 = 36319407394987341(0x81084f003b1d4d, double:3.0318777108804565E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            if (r1 == 0) goto L_0x0433
            X.7Cq r20 = X.C327897Cq.A0H
        L_0x03ea:
            r19 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r1 = new X.7Cr
            r18 = r1
            r21 = r19
            r22 = r19
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x03f9:
            r3.add(r1)
        L_0x03fc:
            if (r5 != 0) goto L_0x0402
            boolean r1 = r0.A0T
            if (r1 == 0) goto L_0x02aa
        L_0x0402:
            boolean r1 = r0.A0p
            if (r1 == 0) goto L_0x02aa
            r1 = 36330110449631703(0x81120b000041d7, double:3.038646365735293E-306)
            boolean r2 = X.182.A06(r6, r4, r1)
            boolean r1 = r0.A0c
            if (r2 == 0) goto L_0x042b
            if (r1 == 0) goto L_0x0428
            X.7Cq r20 = X.C327897Cq.A0K
        L_0x0417:
            r19 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r5 = new X.7Cr
            r18 = r5
            r21 = r19
            r22 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x02a7
        L_0x0428:
            X.7Cq r20 = X.C327897Cq.A0P
            goto L_0x0417
        L_0x042b:
            if (r1 == 0) goto L_0x0430
            X.7Cq r20 = X.C327897Cq.A0Q
            goto L_0x0417
        L_0x0430:
            X.7Cq r20 = X.C327897Cq.A0R
            goto L_0x0417
        L_0x0433:
            X.7Cq r20 = X.C327897Cq.A0G
            goto L_0x03ea
        L_0x0436:
            X.7Cr r1 = A01(r0)
            if (r1 == 0) goto L_0x03fc
            goto L_0x03f9
        L_0x043d:
            boolean r1 = r0.A0t
            if (r1 == 0) goto L_0x044b
            boolean r1 = X.C66732Mbd.A03(r5, r4)
            if (r1 != 0) goto L_0x044b
            X.7Cq r10 = X.C327897Cq.A0B
            goto L_0x01ca
        L_0x044b:
            r15 = 0
            goto L_0x01d5
        L_0x044e:
            boolean r1 = r0.A0m
            if (r1 == 0) goto L_0x045f
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A0B
            if (r1 == 0) goto L_0x045a
            com.instagram.api.schemas.IGAIAgentType r1 = r1.A01
            if (r1 != 0) goto L_0x045f
        L_0x045a:
            r1 = 2130970844(0x7f0408dc, float:1.755041E38)
            goto L_0x0190
        L_0x045f:
            r22 = 0
            goto L_0x0194
        L_0x0463:
            X.0Tu r6 = X.0Tu.A05
            r1 = 36316830411723430(0x8105f7000f12a6, double:3.0302480162876805E-306)
            goto L_0x0472
        L_0x046b:
            X.0Tu r6 = X.0Tu.A05
            r1 = 36316830411788967(0x8105f7001012a7, double:3.0302480163291264E-306)
        L_0x0472:
            boolean r1 = X.182.A06(r6, r11, r1)
            if (r1 == 0) goto L_0x0163
        L_0x0478:
            r1 = 2130970230(0x7f040676, float:1.7549164E38)
            goto L_0x048b
        L_0x047c:
            r1 = 2130970229(0x7f040675, float:1.7549162E38)
            goto L_0x048b
        L_0x0480:
            r1 = 2130970228(0x7f040674, float:1.754916E38)
            goto L_0x048b
        L_0x0484:
            r1 = 2130970331(0x7f0406db, float:1.754937E38)
            goto L_0x048b
        L_0x0488:
            r1 = 2130970224(0x7f040670, float:1.7549152E38)
        L_0x048b:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r1)
            goto L_0x0163
        L_0x0491:
            r1 = 2131237928(0x7f081c28, float:1.809212E38)
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r1)
            if (r1 == 0) goto L_0x04ff
            int r12 = r1.getIntrinsicWidth()
            int r11 = r1.getIntrinsicHeight()
            r1.setBounds(r4, r4, r12, r11)
            java.lang.Object r11 = r2.A01
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Integer r11 = X.C69998Nvc.A00(r11)
            if (r11 == 0) goto L_0x04c2
            int r11 = r11.intValue()
            int r11 = X.2Yu.A0H(r5, r11)
            int r11 = r5.getColor(r11)
            android.graphics.ColorFilter r11 = X.AnonymousClass37O.A00(r11)
            r1.setColorFilter(r11)
        L_0x04c2:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            java.lang.String r12 = "  "
            r11.append(r12)
            java.lang.String r12 = r2.A02
            r11.append(r12)
            X.46l r12 = new X.46l
            r12.<init>(r1)
            r1 = 33
            r11.setSpan(r12, r4, r6, r1)
            android.text.SpannedString r4 = new android.text.SpannedString
            r4.<init>(r11)
            goto L_0x0152
        L_0x04e2:
            r4 = r22
            if (r2 == 0) goto L_0x04e8
            goto L_0x0152
        L_0x04e8:
            r20 = r22
            goto L_0x0163
        L_0x04ec:
            java.lang.CharSequence r8 = r0.A0G
            if (r8 == 0) goto L_0x0087
            int r1 = r8.length()
            if (r1 != 0) goto L_0x0084
            goto L_0x0087
        L_0x04f8:
            java.lang.String r19 = "thread_name"
            goto L_0x0053
        L_0x04fc:
            r3 = 0
            goto L_0x001e
        L_0x04ff:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331657Rv.A00(android.content.Context, X.7Rv, X.7LZ):X.7Lp");
    }

    public static final C327907Cr A01(AnonymousClass7LZ r5) {
        C327897Cq r2;
        if (!r5.A0Q || r5.A0S || r5.A0a) {
            return null;
        }
        if (r5.A0d) {
            r2 = C327897Cq.A0I;
        } else {
            r2 = C327897Cq.A0F;
        }
        return new C327907Cr((AnonymousClass9IV) null, r2, (Integer) null, (Integer) null, 1.0f);
    }

    public static final C327907Cr A02(AnonymousClass7LZ r8) {
        AnonymousClass9IV r3 = null;
        if (!r8.A0k) {
            return null;
        }
        int i = r8.A05;
        if (i > 0) {
            Integer valueOf = Integer.valueOf(R.attr.infoButtonIcon);
            if (i > 10000) {
                i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
            }
            r3 = new AnonymousClass9IV(valueOf, Integer.valueOf(i), 13);
        }
        return new C327907Cr(r3, C327897Cq.A0L, (Integer) null, (Integer) null, 1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r3 == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A03(X.AnonymousClass7LZ r10) {
        /*
            r9 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r10.A0h
            if (r2 != 0) goto L_0x000e
            boolean r0 = r10.A0s
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            return r1
        L_0x000e:
            boolean r0 = r10.A0M
            if (r0 != 0) goto L_0x0044
            boolean r0 = r10.A0N
            if (r0 == 0) goto L_0x002c
            X.7Cq r4 = X.C327897Cq.A0N
        L_0x0018:
            r3 = 0
            r0 = 2131959524(0x7f131ee4, float:1.955569E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r2 = new X.7Cr
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0028:
            r1.add(r2)
            return r1
        L_0x002c:
            if (r2 == 0) goto L_0x0047
            boolean r0 = r10.A0s
            if (r0 == 0) goto L_0x0047
            boolean r0 = r10.A0P
            if (r0 == 0) goto L_0x0047
            X.7Cq r4 = X.C327897Cq.A0J
            r3 = 0
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r2 = new X.7Cr
            r5 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0028
        L_0x0044:
            X.7Cq r4 = X.C327897Cq.A0M
            goto L_0x0018
        L_0x0047:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x0061
            boolean r2 = r10.A0o
            if (r2 == 0) goto L_0x00b8
            X.7Cq r4 = X.C327897Cq.A05
        L_0x0054:
            r3 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r2 = new X.7Cr
            r5 = r3
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
        L_0x0061:
            boolean r2 = r10.A0s
            if (r2 == 0) goto L_0x009c
            boolean r2 = r10.A0m
            r5 = 0
            if (r2 == 0) goto L_0x00b6
            X.1QG r3 = X.1QE.A0E()
            X.1QG r2 = X.1QG.A04
            if (r3 != r2) goto L_0x007b
            boolean r3 = X.C61670oa.A0B()
            r2 = 2130970346(0x7f0406ea, float:1.75494E38)
            if (r3 != 0) goto L_0x007e
        L_0x007b:
            r2 = 2130970250(0x7f04068a, float:1.7549205E38)
        L_0x007e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r7 = 2
            r8 = 13
            X.9IV r3 = new X.9IV
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x008b:
            boolean r2 = r10.A0o
            if (r2 == 0) goto L_0x00a8
            X.7Cq r4 = X.C327897Cq.A09
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r2 = new X.7Cr
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
        L_0x009c:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x000d
            r1.addAll(r0)
            return r1
        L_0x00a8:
            X.7Cq r4 = X.C327897Cq.A0T
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7Cr r2 = new X.7Cr
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            goto L_0x009c
        L_0x00b6:
            r3 = r5
            goto L_0x008b
        L_0x00b8:
            X.7Cq r4 = X.C327897Cq.A0A
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331657Rv.A03(X.7LZ):java.util.ArrayList");
    }

    private final boolean A04(AnonymousClass7LZ r5) {
        if (r5.A0U || r5.A0V) {
            return false;
        }
        UserSession userSession = this.A00;
        if (AnonymousClass431.A01(userSession)) {
            return true;
        }
        if (2Ek.A01(AnonymousClass0t1.A01.A01(userSession))) {
            return 182.A06(0Tu.A05, userSession, 36316830411002524L);
        }
        return false;
    }
}
