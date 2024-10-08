package X;

import java.util.Arrays;

/* renamed from: X.Sf9  reason: case insensitive filesystem */
public final class C11712Sf9 implements TZZ {
    public final C12835T9h A00;

    public C11712Sf9(int[] iArr) {
        C12835T9h t9h;
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            t9h = C12835T9h.A02;
        } else {
            t9h = new C12835T9h(Arrays.copyOf(iArr, length));
        }
        this.A00 = t9h;
    }
}
