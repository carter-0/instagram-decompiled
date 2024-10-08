package X;

/* renamed from: X.IFc  reason: case insensitive filesystem */
public final class C56855IFc implements JNU {
    public static final C56855IFc A00 = new C56855IFc();

    public final long AhR(C56033Hrg hrg, int i) {
        String str = hrg.A03.A04.A03.A00;
        int i2 = i;
        while (true) {
            if (i2 > 0) {
                if (str.charAt(i2 - 1) == 10) {
                    break;
                }
                i2--;
            } else {
                i2 = 0;
                break;
            }
        }
        int length = str.length();
        while (true) {
            if (i < length) {
                if (str.charAt(i) == 10) {
                    break;
                }
                i++;
            } else {
                i = length;
                break;
            }
        }
        return C3026964x.A00(i2, i);
    }
}
