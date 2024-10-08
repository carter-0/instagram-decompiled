package X;

/* renamed from: X.Hu0  reason: case insensitive filesystem */
public abstract class C56171Hu0 {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        if (r15 <= r0.A03) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        if (r5 == false) goto L_0x0052;
     */
    @kotlin.Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this function in foundation is used by the legacy BasicTextField.")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.inputmethod.CursorAnchorInfo A00(android.graphics.Matrix r14, android.view.inputmethod.CursorAnchorInfo.Builder r15, X.AnonymousClass5VN r16, X.AnonymousClass5VN r17, X.C3022462f r18, X.JS3 r19, X.C285975Tl r20, boolean r21, boolean r22, boolean r23, boolean r24) {
        /*
            r10 = r15
            r15.reset()
            r15.setMatrix(r14)
            r1 = r20
            long r2 = r1.A00
            int r4 = X.C285965Tk.A01(r2)
            int r0 = X.C285965Tk.A00(r2)
            r15.setSelectionRange(r4, r0)
            r3 = r18
            r7 = r19
            r0 = r16
            if (r21 == 0) goto L_0x005c
            if (r4 < 0) goto L_0x005c
            int r2 = r7.E1S(r4)
            X.5VN r8 = r3.A06(r2)
            float r9 = r8.A01
            r6 = 0
            long r4 = r3.A02
            int r4 = X.C51965G9l.A04(r4)
            float r4 = (float) r4
            float r11 = X.C229632nm.A02(r9, r6, r4)
            float r12 = r8.A03
            boolean r6 = A01(r0, r11, r12)
            float r13 = r8.A00
            boolean r5 = A01(r0, r11, r13)
            X.GSi r4 = r3.A08(r2)
            X.GSi r2 = X.C52430GSi.Rtl
            r15 = 1
            boolean r2 = X.AnonymousClass7TF.A1W(r4, r2)
            if (r6 != 0) goto L_0x00e4
            if (r5 != 0) goto L_0x0052
            r15 = 0
        L_0x0052:
            r15 = r15 | 2
        L_0x0054:
            if (r2 == 0) goto L_0x0058
            r15 = r15 | 4
        L_0x0058:
            r14 = r13
            r10.setInsertionMarkerLocation(r11, r12, r13, r14, r15)
        L_0x005c:
            if (r22 == 0) goto L_0x00e8
            X.5Tk r2 = r1.A02
            if (r2 == 0) goto L_0x00e8
            long r4 = r2.A00
            int r11 = X.C285965Tk.A01(r4)
            int r6 = X.C285965Tk.A00(r4)
            if (r11 < 0) goto L_0x00e8
            if (r11 >= r6) goto L_0x00e8
            X.5Tq r1 = r1.A01
            java.lang.String r1 = r1.A00
            java.lang.CharSequence r1 = r1.subSequence(r11, r6)
            r10.setComposingText(r11, r1)
            int r5 = r7.E1S(r11)
            int r2 = r7.E1S(r6)
            int r1 = r2 - r5
            int r1 = r1 * 4
            float[] r4 = new float[r1]
            X.62d r8 = r3.A03
            long r1 = X.C3026964x.A00(r5, r2)
            r8.A0B(r4, r1)
        L_0x0092:
            if (r11 >= r6) goto L_0x00e8
            int r1 = r7.E1S(r11)
            int r2 = r1 - r5
            int r8 = r2 * 4
            r12 = r4[r8]
            int r2 = r8 + 1
            r13 = r4[r2]
            int r2 = r8 + 2
            r14 = r4[r2]
            int r2 = r8 + 3
            r15 = r4[r2]
            float r2 = r0.A02
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c4
            float r2 = r0.A01
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c4
            float r2 = r0.A00
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c4
            float r2 = r0.A03
            int r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            r16 = 1
            if (r2 > 0) goto L_0x00c6
        L_0x00c4:
            r16 = 0
        L_0x00c6:
            boolean r2 = A01(r0, r12, r13)
            if (r2 == 0) goto L_0x00d2
            boolean r2 = A01(r0, r14, r15)
            if (r2 != 0) goto L_0x00d4
        L_0x00d2:
            r16 = r16 | 2
        L_0x00d4:
            X.GSi r2 = r3.A08(r1)
            X.GSi r1 = X.C52430GSi.Rtl
            if (r2 != r1) goto L_0x00de
            r16 = r16 | 4
        L_0x00de:
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L_0x0092
        L_0x00e4:
            if (r5 != 0) goto L_0x0054
            goto L_0x0052
        L_0x00e8:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r2 < r1) goto L_0x00fe
            if (r23 == 0) goto L_0x00f5
            r1 = r17
            X.XUA.A00(r10, r1)
        L_0x00f5:
            r1 = 34
            if (r2 < r1) goto L_0x00fe
            if (r24 == 0) goto L_0x00fe
            X.C54752HRk.A00(r10, r0, r3)
        L_0x00fe:
            android.view.inputmethod.CursorAnchorInfo r0 = r10.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56171Hu0.A00(android.graphics.Matrix, android.view.inputmethod.CursorAnchorInfo$Builder, X.5VN, X.5VN, X.62f, X.JS3, X.5Tl, boolean, boolean, boolean, boolean):android.view.inputmethod.CursorAnchorInfo");
    }

    public static final boolean A01(AnonymousClass5VN r3, float f, float f2) {
        float f3 = r3.A01;
        if (f > r3.A02 || f3 > f) {
            return false;
        }
        float f4 = r3.A03;
        if (f2 > r3.A00 || f4 > f2) {
            return false;
        }
        return true;
    }
}
