package X;

import java.io.IOException;

public final class SNH {
    public final TS1 A00;
    public final String[] A01;

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.TPe] */
    public static SNH A01(String... strArr) {
        String str;
        try {
            int length = strArr.length;
            TAH[] tahArr = new TAH[length];
            ? obj = new Object();
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = C12828T8z.A04;
                obj.A0B(34);
                int length2 = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                    } else if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i2 < i3) {
                        obj.A0G(str2, i2, i3);
                    }
                    obj.FOH(str);
                    i2 = i3 + 1;
                }
                if (i2 < length2) {
                    obj.A0G(str2, i2, length2);
                }
                obj.A0B(34);
                obj.readByte();
                tahArr[i] = obj.A08();
            }
            return new SNH(TS1.A00(tahArr), (String[]) strArr.clone());
        } catch (IOException e) {
            throw Pxe.A0e(e);
        }
    }

    public SNH(TS1 ts1, String[] strArr) {
        this.A01 = strArr;
        this.A00 = ts1;
    }

    public static SNH A00(String str, String str2) {
        return A01(str, str2);
    }
}
