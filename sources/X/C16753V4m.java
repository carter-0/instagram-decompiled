package X;

/* renamed from: X.V4m  reason: case insensitive filesystem */
public abstract class C16753V4m {
    /* JADX WARNING: Removed duplicated region for block: B:146:0x027c A[LOOP:2: B:41:0x011b->B:146:0x027c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0113 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(android.graphics.RectF r22, android.text.Layout r23, X.AnonymousClass6E3 r24, X.C292075iM r25, X.XAM r26, X.0sL r27, int r28, boolean r29) {
        /*
            r0 = r23
            r6 = r28
            int r19 = r0.getLineTop(r6)
            int r18 = r0.getLineBottom(r6)
            int r12 = r0.getLineStart(r6)
            int r0 = r0.getLineEnd(r6)
            r11 = -1
            if (r12 != r0) goto L_0x0018
            return r11
        L_0x0018:
            int r0 = r0 - r12
            int r1 = r0 * 2
            float[] r10 = new float[r1]
            r2 = r25
            android.text.Layout r8 = r2.A09
            int r7 = r8.getLineStart(r6)
            int r5 = r2.A05(r6)
            int r0 = r5 - r7
            int r0 = r0 * 2
            r14 = 0
            r4 = 1
            if (r1 < r0) goto L_0x0294
            X.Vs2 r3 = new X.Vs2
            r3.<init>(r2)
            int r0 = r8.getParagraphDirection(r6)
            if (r0 == r4) goto L_0x003d
            r4 = 0
        L_0x003d:
            if (r7 >= r5) goto L_0x0087
            boolean r0 = r8.isRtlCharAt(r7)
            if (r4 == 0) goto L_0x006b
            if (r0 != 0) goto L_0x005e
            r0 = 0
            r1 = 1
            float r13 = X.C18454Vs2.A00(r3, r7, r0, r0, r1)
            int r0 = r7 + 1
            float r9 = X.C18454Vs2.A00(r3, r0, r1, r1, r1)
        L_0x0053:
            r10[r14] = r13
            int r0 = r14 + 1
            r10[r0] = r9
            int r14 = r14 + 2
            int r7 = r7 + 1
            goto L_0x003d
        L_0x005e:
            r2 = 0
            float r9 = X.C18454Vs2.A00(r3, r7, r2, r2, r2)
            int r1 = r7 + 1
            r0 = 1
            float r13 = X.C18454Vs2.A00(r3, r1, r0, r0, r2)
            goto L_0x0053
        L_0x006b:
            if (r0 == 0) goto L_0x007a
            r0 = 0
            r1 = 1
            float r9 = X.C18454Vs2.A00(r3, r7, r0, r0, r1)
            int r0 = r7 + 1
            float r13 = X.C18454Vs2.A00(r3, r0, r1, r1, r1)
            goto L_0x0053
        L_0x007a:
            r2 = 0
            float r13 = X.C18454Vs2.A00(r3, r7, r2, r2, r2)
            int r1 = r7 + 1
            r0 = 1
            float r9 = X.C18454Vs2.A00(r3, r1, r0, r0, r2)
            goto L_0x0053
        L_0x0087:
            r8 = r24
            android.text.Layout r5 = r8.A01
            int r7 = r5.getLineStart(r6)
            int r3 = r5.getLineEnd(r6)
            r6 = 0
            r14 = 2
            java.util.List r2 = r8.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            int r0 = r2.size()
            int r0 = X.0sr.A1J(r1, r2, r0)
            int r4 = r0 + 1
            if (r0 >= 0) goto L_0x00a8
            int r4 = -r4
        L_0x00a8:
            if (r4 != 0) goto L_0x00e2
            r0 = 0
        L_0x00ab:
            int r2 = r7 - r0
            int r1 = r3 - r0
            java.text.Bidi r0 = r8.A02(r4)
            r9 = 1
            if (r0 == 0) goto L_0x00e9
            java.text.Bidi r13 = r0.createLineBidi(r2, r1)
            if (r13 == 0) goto L_0x00e9
            int r5 = r13.getRunCount()
            X.VkK[] r8 = new X.C18037VkK[r5]
            r4 = 0
        L_0x00c3:
            if (r4 >= r5) goto L_0x00f6
            int r3 = r13.getRunStart(r4)
            int r3 = r3 + r7
            int r2 = r13.getRunLimit(r4)
            int r2 = r2 + r7
            int r0 = r13.getRunLevel(r4)
            int r0 = r0 % r14
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r9)
            X.VkK r0 = new X.VkK
            r0.<init>(r3, r2, r1)
            r8[r4] = r0
            int r4 = r4 + 1
            goto L_0x00c3
        L_0x00e2:
            int r0 = r4 + -1
            int r0 = X.C51971G9r.A0I(r2, r0)
            goto L_0x00ab
        L_0x00e9:
            boolean r1 = r5.isRtlCharAt(r7)
            X.VkK r0 = new X.VkK
            r0.<init>(r7, r3, r1)
            X.VkK[] r8 = new X.C18037VkK[]{r0}
        L_0x00f6:
            if (r29 == 0) goto L_0x028a
            X.0qQ.A0B(r8, r6)
            int r0 = r8.length
            int r0 = r0 + -1
            X.2HY r1 = new X.2HY
            r1.<init>(r6, r0)
        L_0x0103:
            int r7 = r1.A00
            int r0 = r1.A01
            r20 = r0
            int r0 = r1.A02
            r17 = r0
            if (r0 <= 0) goto L_0x0115
            r0 = r20
            if (r7 <= r0) goto L_0x011b
        L_0x0113:
            r5 = -1
            return r5
        L_0x0115:
            if (r0 >= 0) goto L_0x0113
            r0 = r20
            if (r0 > r7) goto L_0x0113
        L_0x011b:
            r1 = r8[r7]
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0286
            int r0 = r1.A00
            int r0 = r0 + -1
        L_0x0125:
            int r0 = r0 - r12
            int r0 = r0 * 2
            r15 = r10[r0]
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0280
            int r0 = r1.A01
        L_0x0130:
            int r0 = r0 - r12
            int r0 = r0 * 2
            int r0 = r0 + 1
            r5 = r10[r0]
            r14 = r22
            r13 = r26
            r21 = r27
            float r4 = r14.left
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r29 == 0) goto L_0x01dc
            if (r0 < 0) goto L_0x0278
            float r3 = r14.right
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0278
            boolean r6 = r1.A02
            if (r6 != 0) goto L_0x0179
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x017d
        L_0x0153:
            int r5 = r1.A01
            r16 = r5
            int r2 = r1.A00
        L_0x0159:
            r15 = r2
        L_0x015a:
            int r0 = r15 - r5
            if (r0 <= r9) goto L_0x0175
            int r0 = r15 + r5
            int r2 = r0 / 2
            int r0 = r2 - r12
            int r0 = r0 * 2
            r0 = r10[r0]
            if (r6 != 0) goto L_0x0170
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0159
        L_0x016e:
            r5 = r2
            goto L_0x015a
        L_0x0170:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x016e
            goto L_0x0159
        L_0x0175:
            if (r6 == 0) goto L_0x0181
            r5 = r15
            goto L_0x0181
        L_0x0179:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0153
        L_0x017d:
            int r5 = r1.A01
            r16 = r5
        L_0x0181:
            int r4 = r13.Cra(r5)
            if (r4 == r11) goto L_0x0278
            int r5 = r13.E4P(r4)
            int r3 = r1.A00
            if (r5 >= r3) goto L_0x0278
            r0 = r16
            if (r5 >= r0) goto L_0x0194
            r5 = r0
        L_0x0194:
            if (r4 <= r3) goto L_0x0197
            r4 = r3
        L_0x0197:
            r0 = r19
            float r0 = (float) r0
            r1 = r0
            r0 = r18
            float r0 = (float) r0
            r15 = 0
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r15, r1, r15, r0)
        L_0x01a4:
            int r0 = r5 - r12
            if (r6 == 0) goto L_0x01ab
            int r0 = r4 + -1
            int r0 = r0 - r12
        L_0x01ab:
            int r0 = r0 * 2
            r0 = r10[r0]
            r2.left = r0
            int r0 = r5 - r12
            if (r6 != 0) goto L_0x01b8
            int r0 = r4 + -1
            int r0 = r0 - r12
        L_0x01b8:
            int r0 = r0 * 2
            int r0 = r0 + 1
            r0 = r10[r0]
            r2.right = r0
            r0 = r21
            java.lang.Object r0 = r0.invoke(r2, r14)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0275
            int r5 = r13.Cre(r5)
            if (r5 == r11) goto L_0x0278
            if (r5 >= r3) goto L_0x0278
            int r4 = r13.Cra(r5)
            if (r4 <= r3) goto L_0x01a4
            r4 = r3
            goto L_0x01a4
        L_0x01dc:
            if (r0 < 0) goto L_0x0278
            float r2 = r14.right
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0278
            boolean r6 = r1.A02
            if (r6 != 0) goto L_0x0214
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0218
        L_0x01ec:
            int r5 = r1.A01
            int r3 = r1.A00
            r16 = r3
        L_0x01f2:
            int r0 = r16 - r5
            if (r0 <= r9) goto L_0x020f
            int r0 = r16 + r5
            int r0 = r0 / 2
            int r15 = r0 - r12
            int r15 = r15 * 2
            r15 = r10[r15]
            if (r6 != 0) goto L_0x0208
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 > 0) goto L_0x020c
        L_0x0206:
            r5 = r0
            goto L_0x01f2
        L_0x0208:
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 >= 0) goto L_0x0206
        L_0x020c:
            r16 = r0
            goto L_0x01f2
        L_0x020f:
            if (r6 == 0) goto L_0x021c
            r5 = r16
            goto L_0x021c
        L_0x0214:
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x01ec
        L_0x0218:
            int r3 = r1.A00
            int r5 = r3 - r9
        L_0x021c:
            int r0 = r5 + 1
            int r2 = r13.E4P(r0)
            if (r2 == r11) goto L_0x0278
            int r5 = r13.Cra(r2)
            int r4 = r1.A01
            if (r5 <= r4) goto L_0x0278
            if (r2 >= r4) goto L_0x022f
            r2 = r4
        L_0x022f:
            if (r5 <= r3) goto L_0x0232
            r5 = r3
        L_0x0232:
            r0 = r19
            float r0 = (float) r0
            r1 = r0
            r0 = r18
            float r0 = (float) r0
            r15 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r15, r1, r15, r0)
        L_0x023f:
            int r0 = r2 - r12
            if (r6 == 0) goto L_0x0246
            int r0 = r5 + -1
            int r0 = r0 - r12
        L_0x0246:
            int r0 = r0 * 2
            r0 = r10[r0]
            r3.left = r0
            if (r6 != 0) goto L_0x0250
            int r2 = r5 + -1
        L_0x0250:
            int r2 = r2 - r12
            int r0 = r2 * 2
            int r0 = r0 + 1
            r0 = r10[r0]
            r3.right = r0
            r0 = r21
            java.lang.Object r0 = r0.invoke(r3, r14)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0275
            int r5 = r13.E4N(r5)
            if (r5 == r11) goto L_0x0278
            if (r5 <= r4) goto L_0x0278
            int r2 = r13.E4P(r5)
            if (r2 >= r4) goto L_0x023f
            r2 = r4
            goto L_0x023f
        L_0x0275:
            if (r5 < 0) goto L_0x0278
            return r5
        L_0x0278:
            r0 = r20
            if (r7 == r0) goto L_0x0113
            int r7 = r7 + r17
            goto L_0x011b
        L_0x0280:
            int r0 = r1.A00
            int r0 = r0 + -1
            goto L_0x0130
        L_0x0286:
            int r0 = r1.A01
            goto L_0x0125
        L_0x028a:
            int r0 = r8.length
            int r0 = r0 + -1
            X.2HZ r1 = new X.2HZ
            r1.<init>(r0, r6, r11)
            goto L_0x0103
        L_0x0294:
            java.lang.String r1 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16753V4m.A00(android.graphics.RectF, android.text.Layout, X.6E3, X.5iM, X.XAM, X.0sL, int, boolean):int");
    }
}
