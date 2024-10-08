package X;

public abstract class SKr {
    public static String A00(String str, int i, int i2) {
        Object[] A1a;
        String str2;
        if (i < 0) {
            A1a = C51968G9o.A1Z(str, i);
            str2 = "%s (%s) must not be negative";
        } else if (i2 >= 0) {
            A1a = Pxg.A1a(str, i, i2);
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            throw AnonymousClass7TE.A0w(Pxg.A0t("negative size: ", Pxe.A14(26), i2));
        }
        return C9714RfX.A00(str2, A1a);
    }

    public static void A01(int i, int i2) {
        Object[] objArr;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                objArr = C51968G9o.A1Z("index", i);
                str = "%s (%s) must not be negative";
            } else if (i2 < 0) {
                throw AnonymousClass7TE.A0w(Pxg.A0t("negative size: ", Pxe.A14(26), i2));
            } else {
                objArr = Pxg.A1a("index", i, i2);
                str = "%s (%s) must be less than size (%s)";
            }
            throw Pxe.A0k(C9714RfX.A00(str, objArr));
        }
    }

    public static void A02(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = A00("end index", i2, i3);
                } else {
                    str = C9714RfX.A00("end index (%s) must not be less than start index (%s)", C51968G9o.A1Z(Integer.valueOf(i2), i));
                }
                throw Pxe.A0k(str);
            }
        }
        str = A00("start index", i, i3);
        throw Pxe.A0k(str);
    }
}
