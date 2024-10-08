package X;

import android.text.Layout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6E3  reason: invalid class name */
public final class AnonymousClass6E3 {
    public char[] A00;
    public final Layout A01;
    public final List A02;
    public final List A03;
    public final boolean[] A04;

    public static final int A00(AnonymousClass6E3 r2, int i, int i2) {
        while (i > i2) {
            char charAt = r2.A01.getText().charAt(i - 1);
            if (!(charAt == ' ' || charAt == 10 || charAt == 5760)) {
                if (0qQ.A00(charAt, 8192) < 0 || 0qQ.A00(charAt, 8202) > 0) {
                    if (!(charAt == 8287 || charAt == 12288)) {
                        break;
                    }
                } else if (charAt == 8199) {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x017b, code lost:
        if (r17 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0182, code lost:
        if (r17 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x018b, code lost:
        if (r17 != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0196, code lost:
        if (r17 != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r12 != ((java.lang.Number) r2.get(r3)).intValue()) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A01(int r19, boolean r20, boolean r21) {
        /*
            r18 = this;
            r13 = r18
            r12 = r19
            if (r21 == 0) goto L_0x0017
            android.text.Layout r14 = r13.A01
            if (r19 > 0) goto L_0x00cd
            r11 = 0
        L_0x000b:
            int r10 = r14.getLineStart(r11)
            int r4 = r14.getLineEnd(r11)
            if (r12 == r10) goto L_0x002b
            if (r12 == r4) goto L_0x002b
        L_0x0017:
            android.text.Layout r1 = r13.A01
            int r0 = r1.getLineForOffset(r12)
            int r0 = r1.getLineEnd(r0)
            if (r12 <= r0) goto L_0x0024
            r12 = r0
        L_0x0024:
            if (r20 == 0) goto L_0x00f7
            float r0 = r1.getPrimaryHorizontal(r12)
            return r0
        L_0x002b:
            if (r19 == 0) goto L_0x0017
            java.lang.CharSequence r0 = r14.getText()
            int r0 = r0.length()
            if (r12 == r0) goto L_0x0017
            java.util.List r2 = r13.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            int r0 = r2.size()
            int r0 = X.0sr.A1J(r1, r2, r0)
            int r1 = r0 + 1
            if (r0 >= 0) goto L_0x004a
            int r1 = -r1
        L_0x004a:
            if (r1 <= 0) goto L_0x005a
            int r3 = r1 + -1
            java.lang.Object r0 = r2.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r12 == r0) goto L_0x005b
        L_0x005a:
            r3 = r1
        L_0x005b:
            if (r3 != 0) goto L_0x00c0
            r0 = 0
        L_0x005e:
            int r0 = r14.getLineForOffset(r0)
            int r1 = r14.getParagraphDirection(r0)
            r0 = -1
            r9 = 0
            if (r1 != r0) goto L_0x006b
            r9 = 1
        L_0x006b:
            r17 = r9
            int r16 = A00(r13, r4, r10)
            if (r3 != 0) goto L_0x00b3
            r0 = 0
        L_0x0074:
            int r2 = r10 - r0
            int r1 = r16 - r0
            java.text.Bidi r0 = r13.A02(r3)
            if (r0 == 0) goto L_0x010f
            java.text.Bidi r8 = r0.createLineBidi(r2, r1)
            r15 = 0
            r7 = 1
            if (r8 == 0) goto L_0x010f
            int r0 = r8.getRunCount()
            if (r0 == r7) goto L_0x010f
            int r6 = r8.getRunCount()
            X.VkK[] r5 = new X.C18037VkK[r6]
            r4 = 0
        L_0x0093:
            if (r4 >= r6) goto L_0x00fc
            int r3 = r8.getRunStart(r4)
            int r3 = r3 + r10
            int r2 = r8.getRunLimit(r4)
            int r2 = r2 + r10
            int r0 = r8.getRunLevel(r4)
            int r0 = r0 % 2
            r1 = 0
            if (r0 != r7) goto L_0x00a9
            r1 = 1
        L_0x00a9:
            X.VkK r0 = new X.VkK
            r0.<init>(r3, r2, r1)
            r5[r4] = r0
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00b3:
            int r0 = r3 + -1
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0074
        L_0x00c0:
            int r0 = r3 + -1
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x005e
        L_0x00cd:
            java.lang.CharSequence r0 = r14.getText()
            int r0 = r0.length()
            if (r12 < r0) goto L_0x00df
            int r0 = r14.getLineCount()
            int r11 = r0 + -1
            goto L_0x000b
        L_0x00df:
            int r11 = r14.getLineForOffset(r12)
            int r1 = r14.getLineStart(r11)
            int r0 = r14.getLineEnd(r11)
            if (r1 == r12) goto L_0x00f1
            if (r0 == r12) goto L_0x00f1
            goto L_0x000b
        L_0x00f1:
            if (r1 != r12) goto L_0x000b
            int r11 = r11 + -1
            goto L_0x000b
        L_0x00f7:
            float r0 = r1.getSecondaryHorizontal(r12)
            return r0
        L_0x00fc:
            int r3 = r8.getRunCount()
            byte[] r2 = new byte[r3]
            r1 = 0
        L_0x0103:
            if (r1 >= r3) goto L_0x0125
            int r0 = r8.getRunLevel(r1)
            byte r0 = (byte) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0103
        L_0x010f:
            boolean r0 = r14.isRtlCharAt(r10)
            if (r20 != 0) goto L_0x0117
            if (r9 != r0) goto L_0x011d
        L_0x0117:
            r17 = 0
            if (r9 != 0) goto L_0x011d
            r17 = 1
        L_0x011d:
            if (r12 != r10) goto L_0x0122
            if (r17 == 0) goto L_0x0184
            goto L_0x0147
        L_0x0122:
            if (r17 != 0) goto L_0x0184
            goto L_0x0147
        L_0x0125:
            java.text.Bidi.reorderVisually(r2, r15, r5, r15, r6)
            r1 = -1
            if (r12 != r10) goto L_0x014f
            r2 = 0
        L_0x012c:
            if (r2 >= r6) goto L_0x0135
            r0 = r5[r2]
            int r0 = r0.A01
            if (r0 != r12) goto L_0x014c
            r1 = r2
        L_0x0135:
            r0 = r5[r1]
            if (r20 != 0) goto L_0x013d
            boolean r0 = r0.A02
            if (r9 != r0) goto L_0x0143
        L_0x013d:
            r17 = 0
            if (r9 != 0) goto L_0x0143
            r17 = 1
        L_0x0143:
            if (r1 != 0) goto L_0x0177
            if (r17 == 0) goto L_0x0177
        L_0x0147:
            float r0 = r14.getLineLeft(r11)
            return r0
        L_0x014c:
            int r2 = r2 + 1
            goto L_0x012c
        L_0x014f:
            r0 = r16
            if (r12 <= r0) goto L_0x0157
            int r12 = A00(r13, r12, r10)
        L_0x0157:
            r2 = 0
        L_0x0158:
            if (r2 >= r6) goto L_0x0161
            r0 = r5[r2]
            int r0 = r0.A00
            if (r0 != r12) goto L_0x0174
            r1 = r2
        L_0x0161:
            r0 = r5[r1]
            if (r20 != 0) goto L_0x016f
            boolean r0 = r0.A02
            if (r9 == r0) goto L_0x016f
            r17 = 0
            if (r9 != 0) goto L_0x016f
            r17 = 1
        L_0x016f:
            if (r1 != 0) goto L_0x017e
            if (r17 == 0) goto L_0x017e
            goto L_0x0147
        L_0x0174:
            int r2 = r2 + 1
            goto L_0x0158
        L_0x0177:
            int r0 = r6 + -1
            if (r1 != r0) goto L_0x0194
            if (r17 != 0) goto L_0x0198
            goto L_0x0184
        L_0x017e:
            int r0 = r6 + -1
            if (r1 != r0) goto L_0x0189
            if (r17 != 0) goto L_0x018d
        L_0x0184:
            float r0 = r14.getLineRight(r11)
            return r0
        L_0x0189:
            int r0 = r1 + 1
            if (r17 == 0) goto L_0x018f
        L_0x018d:
            int r0 = r1 - r7
        L_0x018f:
            r0 = r5[r0]
            int r0 = r0.A00
            goto L_0x019e
        L_0x0194:
            int r0 = r1 + 1
            if (r17 == 0) goto L_0x019a
        L_0x0198:
            int r0 = r1 - r7
        L_0x019a:
            r0 = r5[r0]
            int r0 = r0.A01
        L_0x019e:
            float r0 = r14.getPrimaryHorizontal(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6E3.A01(int, boolean, boolean):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r6.getRunCount() == 1) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.text.Bidi A02(int r14) {
        /*
            r13 = this;
            boolean[] r2 = r13.A04
            boolean r0 = r2[r14]
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r13.A03
            java.lang.Object r6 = r0.get(r14)
            java.text.Bidi r6 = (java.text.Bidi) r6
            return r6
        L_0x000f:
            r8 = 0
            if (r14 != 0) goto L_0x0077
            r6 = 0
        L_0x0013:
            java.util.List r5 = r13.A02
            java.lang.Object r0 = r5.get(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            int r11 = r3 - r6
            char[] r7 = r13.A00
            if (r7 == 0) goto L_0x0028
            int r0 = r7.length
            if (r0 >= r11) goto L_0x002a
        L_0x0028:
            char[] r7 = new char[r11]
        L_0x002a:
            r1 = r7
            android.text.Layout r4 = r13.A01
            java.lang.CharSequence r0 = r4.getText()
            android.text.TextUtils.getChars(r0, r6, r3, r7, r8)
            boolean r0 = java.text.Bidi.requiresBidi(r7, r8, r11)
            r9 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0058
            if (r14 != 0) goto L_0x006a
            r0 = 0
        L_0x003f:
            int r0 = r4.getLineForOffset(r0)
            int r4 = r4.getParagraphDirection(r0)
            r0 = -1
            r12 = 0
            if (r4 != r0) goto L_0x004c
            r12 = 1
        L_0x004c:
            java.text.Bidi r6 = new java.text.Bidi
            r10 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r3) goto L_0x0059
        L_0x0058:
            r6 = r9
        L_0x0059:
            java.util.List r0 = r13.A03
            r0.set(r14, r6)
            r2[r14] = r3
            if (r6 == 0) goto L_0x0067
            char[] r1 = r13.A00
            if (r7 != r1) goto L_0x0067
            r1 = r9
        L_0x0067:
            r13.A00 = r1
            return r6
        L_0x006a:
            int r0 = r14 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x003f
        L_0x0077:
            java.util.List r1 = r13.A02
            int r0 = r14 + -1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6E3.A02(int):java.text.Bidi");
    }

    public AnonymousClass6E3(Layout layout) {
        this.A01 = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int A042 = 00l.A04(this.A01.getText(), 10, i);
            if (A042 < 0) {
                i = this.A01.getText().length();
            } else {
                i = A042 + 1;
            }
            arrayList.add(Integer.valueOf(i));
        } while (i < this.A01.getText().length());
        this.A02 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add((Object) null);
        }
        this.A03 = arrayList2;
        this.A04 = new boolean[arrayList.size()];
        arrayList.size();
    }
}
