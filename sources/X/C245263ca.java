package X;

/* renamed from: X.3ca  reason: invalid class name and case insensitive filesystem */
public final class C245263ca implements C245273cb {
    public static final C245263ca A00 = new Object();

    public final int AH5(CharSequence charSequence, int i, int i2) {
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            i3 = 1;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            continue;
                    }
                }
                i3 = 0;
            }
        }
        return i3;
    }
}
