package X;

/* renamed from: X.6Iy  reason: invalid class name */
public abstract class AnonymousClass6Iy {
    public static final int A00(C285045Pl r5, int i) {
        int i2 = r5.A00 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = r5.A02;
            int i5 = ((AnonymousClass6It) objArr[i4]).A01;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((AnonymousClass6It) objArr[i3]).A01) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
