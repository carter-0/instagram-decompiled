package X;

import android.view.View;

/* renamed from: X.3bt  reason: invalid class name and case insensitive filesystem */
public abstract class C244873bt {
    public static final long A00(int i, int i2) {
        C244893bv r0;
        int i3;
        C244893bv r02;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            r0 = C244903bw.A00;
        } else if (mode == 1073741824) {
            r0 = C244883bu.A00;
        } else {
            throw new IllegalStateException("Unknown width spec mode.");
        }
        int i4 = r0.A01.A01;
        int mode2 = View.MeasureSpec.getMode(i);
        int i5 = 0;
        int A03 = C229632nm.A03(View.MeasureSpec.getSize(i), 0, i4);
        int i6 = Integer.MAX_VALUE;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = A03;
            A03 = 0;
        } else if (mode2 == 0) {
            A03 = 0;
            i3 = Integer.MAX_VALUE;
        } else if (mode2 == 1073741824) {
            i3 = A03;
        } else {
            throw new IllegalStateException("Unknown width spec mode.");
        }
        int mode3 = View.MeasureSpec.getMode(i2);
        if (mode3 == Integer.MIN_VALUE || mode3 == 0) {
            r02 = C244903bw.A00;
        } else if (mode3 == 1073741824) {
            r02 = C244883bu.A00;
        } else {
            throw new IllegalStateException("Unknown width spec mode.");
        }
        int i7 = r02.A01.A01;
        int mode4 = View.MeasureSpec.getMode(i2);
        int A032 = C229632nm.A03(View.MeasureSpec.getSize(i2), 0, i7);
        if (mode4 == Integer.MIN_VALUE) {
            i6 = A032;
        } else if (mode4 != 0) {
            if (mode4 == 1073741824) {
                i6 = A032;
                i5 = A032;
            } else {
                throw new IllegalStateException("Unknown height spec mode.");
            }
        }
        return C244913bx.A00.A00(A03, i3, i5, i6);
    }
}
