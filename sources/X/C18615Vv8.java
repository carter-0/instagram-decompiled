package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vv8  reason: case insensitive filesystem */
public final class C18615Vv8 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final StringBuilder A05 = new StringBuilder();
    public final List A06;
    public final List A07 = new ArrayList();

    public static SpannableString A00(C18615Vv8 vv8) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vv8.A05);
        int length = spannableStringBuilder.length();
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        boolean z = false;
        while (true) {
            List list = vv8.A06;
            if (i2 >= list.size()) {
                break;
            }
            VV5 vv5 = (VV5) list.get(i2);
            boolean z2 = vv5.A02;
            int i8 = vv5.A01;
            if (i8 != 8) {
                z = true;
                if (i8 != 7) {
                    z = false;
                    if (i8 != 7) {
                        i7 = WMJ.A0U[i8];
                    }
                }
            }
            int i9 = vv5.A00;
            i2++;
            if (i2 < list.size()) {
                i = ((VV5) list.get(i2)).A00;
            } else {
                i = length;
            }
            if (i9 != i) {
                if (i3 != -1) {
                    if (!z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i9, 33);
                        i3 = -1;
                    }
                } else if (z2) {
                    i3 = i9;
                }
                if (i4 != -1) {
                    if (!z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i4, i9, 33);
                        i4 = -1;
                    }
                } else if (z) {
                    i4 = i9;
                }
                if (i7 != i6) {
                    if (i6 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, i9, 33);
                    }
                    i6 = i7;
                    i5 = i9;
                }
            }
        }
        if (!(i3 == -1 || i3 == length)) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
        }
        if (!(i4 == -1 || i4 == length)) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
        }
        if (!(i5 == length || i6 == -1)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r15 != 1) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r2 <= 0) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C264814Rj A01(int r20) {
        /*
            r19 = this;
            r3 = r19
            r15 = r20
            int r6 = r3.A02
            int r0 = r3.A04
            int r6 = r6 + r0
            int r5 = 32 - r6
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r2 = 0
        L_0x0011:
            java.util.List r1 = r3.A07
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0035
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r0 = r1.length()
            if (r0 <= r5) goto L_0x002a
            r0 = 0
            java.lang.CharSequence r1 = r1.subSequence(r0, r5)
        L_0x002a:
            r7.append(r1)
            r0 = 10
            r7.append(r0)
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0035:
            android.text.SpannableString r1 = A00(r3)
            int r0 = r1.length()
            if (r0 <= r5) goto L_0x0044
            r0 = 0
            java.lang.CharSequence r1 = r1.subSequence(r0, r5)
        L_0x0044:
            r7.append(r1)
            int r0 = r7.length()
            if (r0 != 0) goto L_0x004f
            r5 = 0
            return r5
        L_0x004f:
            int r0 = r7.length()
            int r5 = r5 - r0
            int r2 = r6 - r5
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 2
            r13 = 1
            if (r15 == r14) goto L_0x0094
            if (r15 == r13) goto L_0x00a7
        L_0x005e:
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r0 = 1107296256(0x42000000, float:32.0)
            if (r15 != r4) goto L_0x006a
            int r6 = 32 - r5
        L_0x006a:
            float r9 = (float) r6
            float r9 = r9 / r0
            float r9 = r9 * r1
            float r9 = r9 + r2
        L_0x006e:
            int r1 = r3.A03
            r0 = 7
            if (r1 <= r0) goto L_0x008b
            int r0 = r1 + -15
            int r1 = r0 + -2
        L_0x0077:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r8 = (float) r1
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.4Rj r5 = new X.4Rj
            r11 = r10
            r12 = r10
            r16 = r14
            r18 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        L_0x008b:
            int r0 = r3.A00
            if (r0 != r13) goto L_0x0077
            int r0 = r3.A01
            int r0 = r0 - r13
            int r1 = r1 - r0
            goto L_0x0077
        L_0x0094:
            int r0 = r3.A00
            if (r0 != r4) goto L_0x00a4
            int r1 = java.lang.Math.abs(r2)
            r0 = 3
            if (r1 < r0) goto L_0x00a6
            if (r5 < 0) goto L_0x00a6
            r15 = 2
            if (r2 > 0) goto L_0x005e
        L_0x00a4:
            r15 = 0
            goto L_0x005e
        L_0x00a6:
            r15 = 1
        L_0x00a7:
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18615Vv8.A01(int):X.4Rj");
    }

    public final void A02() {
        StringBuilder sb = this.A05;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            List list = this.A06;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    VV5 vv5 = (VV5) list.get(size);
                    if (vv5.A00 == length) {
                        vv5.A00--;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C18615Vv8(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        this.A00 = i;
        arrayList.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
        this.A01 = i2;
    }
}
