package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.6Sy  reason: invalid class name and case insensitive filesystem */
public abstract class C308156Sy {
    public static int A00(List list, int i) {
        if (list == null || list.isEmpty()) {
            return i;
        }
        int i2 = 0;
        for (Object next : list) {
            String obj = next.toString();
            switch (obj.hashCode()) {
                case -1699597560:
                    if (!obj.equals("bottom_right")) {
                        break;
                    } else {
                        i2 |= 4;
                        continue;
                    }
                case -966253391:
                    if (!obj.equals("top_left")) {
                        break;
                    } else {
                        i2 |= 1;
                        continue;
                    }
                case -609197669:
                    if (!obj.equals("bottom_left")) {
                        break;
                    } else {
                        i2 |= 8;
                        continue;
                    }
                case 116576946:
                    if (!obj.equals("top_right")) {
                        break;
                    } else {
                        i2 |= 2;
                        continue;
                    }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Can't parse corner: ");
            sb.append(next);
            throw new IOException(sb.toString());
        }
        return i2;
    }

    public static void A01(float[] fArr, float f, int i) {
        float f2 = 0.0f;
        if ((i & 1) != 0) {
            f2 = f;
        }
        float f3 = 0.0f;
        if ((i & 2) != 0) {
            f3 = f;
        }
        float f4 = 0.0f;
        if ((i & 4) != 0) {
            f4 = f;
        }
        if ((i & 8) == 0) {
            f = 0.0f;
        }
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f;
        fArr[6] = f;
    }

    public static boolean A02(int i) {
        if (i == 0) {
            return true;
        }
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0) {
            return false;
        }
        return true;
    }
}
