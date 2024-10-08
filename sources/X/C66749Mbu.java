package X;

/* renamed from: X.Mbu  reason: case insensitive filesystem */
public abstract class C66749Mbu {
    public static final Integer A00(int i) {
        int i2;
        for (Integer num : AnonymousClass05K.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            if (i2 == i) {
                return num;
            }
        }
        return null;
    }
}
