package X;

/* renamed from: X.6Fc  reason: invalid class name and case insensitive filesystem */
public final class C304756Fc implements C287355a0 {
    public final float A00;
    public final float A01;
    public final 0sL A02;
    public final boolean A03;

    public final void ACQ(C268024cd r11, AnonymousClass5Q8 r12, int[] iArr, int[] iArr2, int i) {
        int i2;
        int i3;
        0sL r1;
        int length = iArr.length;
        if (length != 0) {
            int EJS = r11.EJS(this.A00);
            if (this.A03) {
                i3 = 0;
                i2 = 0;
                if (r12 == AnonymousClass5Q8.Rtl) {
                    for (int i4 = length - 1; -1 < i4; i4--) {
                        int i5 = iArr[i4];
                        int min = Math.min(i3, i - i5);
                        iArr2[i4] = min;
                        i2 = Math.min(EJS, (i - min) - i5);
                        i3 = min + i5 + i2;
                    }
                    int i6 = i3 - i2;
                    r1 = this.A02;
                    if (r1 != null && i6 < i) {
                        int intValue = ((Number) r1.invoke(Integer.valueOf(i - i6), r12)).intValue();
                        int length2 = iArr2.length;
                        for (int i7 = 0; i7 < length2; i7++) {
                            iArr2[i7] = iArr2[i7] + intValue;
                        }
                        return;
                    }
                }
            }
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i8 < length) {
                int i12 = iArr[i8];
                int min2 = Math.min(i3, i - i12);
                iArr2[i11] = min2;
                i10 = Math.min(EJS, (i - min2) - i12);
                i9 = min2 + i12 + i10;
                i8++;
                i11++;
            }
            int i62 = i3 - i2;
            r1 = this.A02;
            if (r1 != null) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C304756Fc) {
                C304756Fc r5 = (C304756Fc) obj;
                if (!C289095d0.A01(this.A00, r5.A00) || this.A03 != r5.A03 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void ACR(C268024cd r7, int[] iArr, int[] iArr2, int i) {
        ACQ(r7, AnonymousClass5Q8.Ltr, iArr, iArr2, i);
    }

    public final float By0() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.A00) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = (floatToIntBits + i) * 31;
        0sL r0 = this.A02;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.A03) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb.append(str);
        sb.append("Arrangement#spacedAligned(");
        sb.append(C289095d0.A00(this.A00));
        sb.append(", ");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C304756Fc(0sL r1, float f, boolean z) {
        this.A00 = f;
        this.A03 = z;
        this.A02 = r1;
        this.A01 = f;
    }
}
