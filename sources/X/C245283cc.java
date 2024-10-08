package X;

/* renamed from: X.3cc  reason: invalid class name and case insensitive filesystem */
public final class C245283cc implements C245273cb {
    public static final C245283cc A00 = new Object();

    public final int AH5(CharSequence charSequence, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        if (z) {
            return 1;
        }
        return 2;
    }
}
