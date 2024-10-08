package X;

public abstract class RW0 {
    public static void A00(int i) {
        int i2;
        Integer[] A00 = AnonymousClass05K.A00(4);
        int length = A00.length;
        int i3 = 0;
        while (i3 < length) {
            switch (JTO.A0A(A00, i3)) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != i) {
                i3++;
            } else {
                return;
            }
        }
        0KC.A0O("PendingUserActionHandlingType", "Update Ownership handling type: %d", AnonymousClass7TF.A1b(i));
    }
}
