package X;

import android.graphics.Color;

/* renamed from: X.6AD  reason: invalid class name */
public class AnonymousClass6AD implements 2do {
    public int A00;
    public 2dn[] A01;

    public final int[] A00() {
        int i;
        int i2;
        2dn[] r0;
        int[] iArr = new int[this.A01.length];
        int i3 = 0;
        while (true) {
            i = this.A00;
            i2 = i;
            r0 = this.A01;
            if (i3 >= i) {
                break;
            }
            2dn r02 = r0[i3];
            iArr[i3] = Color.argb(r02.A00, r02.A03, r02.A02, r02.A01);
            i3++;
        }
        int length = r0.length;
        if (length > i) {
            while (i < length) {
                iArr[i] = iArr[i2 - 1];
                i++;
            }
        }
        return iArr;
    }

    public final /* bridge */ /* synthetic */ Object CNj(float f, Object obj, Object obj2) {
        AnonymousClass6AD r6 = (AnonymousClass6AD) obj;
        AnonymousClass6AD r7 = (AnonymousClass6AD) obj2;
        int i = this.A00;
        if (i == r6.A00) {
            r7.A00 = i;
            for (int i2 = 0; i2 < this.A00; i2++) {
                this.A01[i2].A00(r6.A01[i2], r7.A01[i2], f);
            }
            return r7;
        }
        throw new IllegalArgumentException("cannot interpolate between mismatched lengths");
    }
}
