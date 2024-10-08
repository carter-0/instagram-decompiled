package X;

import android.content.res.TypedArray;

/* renamed from: X.3O4  reason: invalid class name */
public abstract class AnonymousClass3O4 {
    public final AnonymousClass3O5 A00 = new AnonymousClass3O5();

    public AnonymousClass3O4 A00(TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            AnonymousClass3O5 r1 = this.A00;
            r1.A0I = typedArray.getBoolean(3, r1.A0I);
        }
        if (typedArray.hasValue(0)) {
            AnonymousClass3O5 r12 = this.A00;
            r12.A0H = typedArray.getBoolean(0, r12.A0H);
        }
        if (typedArray.hasValue(1)) {
            A02(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            A03(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            A04((long) typedArray.getInt(7, (int) this.A00.A0D));
        }
        if (typedArray.hasValue(14)) {
            AnonymousClass3O5 r13 = this.A00;
            r13.A0A = typedArray.getInt(14, r13.A0A);
        }
        if (typedArray.hasValue(15)) {
            AnonymousClass3O5 r8 = this.A00;
            long j = (long) typedArray.getInt(15, (int) r8.A0E);
            if (j >= 0) {
                r8.A0E = j;
            } else {
                throw new IllegalArgumentException(002.A0Q("Given a negative repeat delay: ", j));
            }
        }
        if (typedArray.hasValue(16)) {
            AnonymousClass3O5 r14 = this.A00;
            r14.A0B = typedArray.getInt(16, r14.A0B);
        }
        if (typedArray.hasValue(18)) {
            AnonymousClass3O5 r82 = this.A00;
            long j2 = (long) typedArray.getInt(18, (int) r82.A0F);
            if (j2 >= 0) {
                r82.A0F = j2;
            } else {
                throw new IllegalArgumentException(002.A0Q("Given a negative start delay: ", j2));
            }
        }
        if (typedArray.hasValue(5)) {
            AnonymousClass3O5 r2 = this.A00;
            int i = typedArray.getInt(5, r2.A06);
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        r2.A06 = 0;
                    }
                }
                r2.A06 = i2;
            } else {
                r2.A06 = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            AnonymousClass3O5 r15 = this.A00;
            if (typedArray.getInt(17, r15.A0C) != 1) {
                r15.A0C = 0;
            } else {
                r15.A0C = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            AnonymousClass3O5 r22 = this.A00;
            float f = typedArray.getFloat(6, r22.A00);
            if (f >= 0.0f) {
                r22.A00 = f;
            } else {
                throw new IllegalArgumentException(002.A0N("Given invalid dropoff value: ", f));
            }
        }
        if (typedArray.hasValue(9)) {
            AnonymousClass3O5 r23 = this.A00;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, r23.A08);
            if (dimensionPixelSize >= 0) {
                r23.A08 = dimensionPixelSize;
            } else {
                throw new IllegalArgumentException(002.A0O("Given invalid width: ", dimensionPixelSize));
            }
        }
        if (typedArray.hasValue(8)) {
            AnonymousClass3O5 r24 = this.A00;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, r24.A07);
            if (dimensionPixelSize2 >= 0) {
                r24.A07 = dimensionPixelSize2;
            } else {
                throw new IllegalArgumentException(002.A0O("Given invalid height: ", dimensionPixelSize2));
            }
        }
        if (typedArray.hasValue(13)) {
            AnonymousClass3O5 r25 = this.A00;
            float f2 = typedArray.getFloat(13, r25.A02);
            if (f2 >= 0.0f) {
                r25.A02 = f2;
            } else {
                throw new IllegalArgumentException(002.A0N("Given invalid intensity value: ", f2));
            }
        }
        if (typedArray.hasValue(20)) {
            AnonymousClass3O5 r26 = this.A00;
            float f3 = typedArray.getFloat(20, r26.A04);
            if (f3 >= 0.0f) {
                r26.A04 = f3;
            } else {
                throw new IllegalArgumentException(002.A0N("Given invalid width ratio: ", f3));
            }
        }
        if (typedArray.hasValue(10)) {
            AnonymousClass3O5 r27 = this.A00;
            float f4 = typedArray.getFloat(10, r27.A01);
            if (f4 >= 0.0f) {
                r27.A01 = f4;
            } else {
                throw new IllegalArgumentException(002.A0N("Given invalid height ratio: ", f4));
            }
        }
        if (typedArray.hasValue(19)) {
            AnonymousClass3O5 r16 = this.A00;
            r16.A03 = typedArray.getFloat(19, r16.A03);
        }
        return this;
    }

    public final void A02(float f) {
        AnonymousClass3O5 r3 = this.A00;
        r3.A05 = (((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24) | (r3.A05 & 16777215);
    }

    public final void A03(float f) {
        AnonymousClass3O5 r3 = this.A00;
        r3.A09 = (((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24) | (r3.A09 & 16777215);
    }

    public final AnonymousClass3O5 A01() {
        int i;
        AnonymousClass3O5 r4 = this.A00;
        int i2 = r4.A0C;
        int[] iArr = r4.A0L;
        if (i2 != 1) {
            i = r4.A05;
            iArr[0] = i;
            int i3 = r4.A09;
            iArr[1] = i3;
            iArr[2] = i3;
        } else {
            int i4 = r4.A09;
            iArr[0] = i4;
            iArr[1] = i4;
            i = r4.A05;
            iArr[2] = i;
        }
        iArr[3] = i;
        float[] fArr = r4.A0K;
        if (i2 != 1) {
            float f = r4.A02;
            float f2 = 1.0f - f;
            float f3 = r4.A00;
            fArr[0] = Math.max((f2 - f3) / 2.0f, 0.0f);
            fArr[1] = Math.max((f2 - 0.001f) / 2.0f, 0.0f);
            float f4 = f + 1.0f;
            fArr[2] = Math.min((f4 + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min((f4 + f3) / 2.0f, 1.0f);
            return r4;
        }
        fArr[0] = 0.0f;
        float f5 = r4.A02;
        fArr[1] = Math.min(f5, 1.0f);
        fArr[2] = Math.min(f5 + r4.A00, 1.0f);
        fArr[3] = 1.0f;
        return r4;
    }

    public final void A04(long j) {
        if (j >= 0) {
            this.A00.A0D = j;
            return;
        }
        throw new IllegalArgumentException(002.A0Q("Given a negative duration: ", j));
    }
}
