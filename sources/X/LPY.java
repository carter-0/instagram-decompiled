package X;

import android.graphics.RectF;
import java.util.List;

public abstract class LPY {
    public static final RectF A00(String str) {
        if (str == null) {
            return null;
        }
        List A0Q = 00l.A0Q(str, new char[]{','}, 0);
        if (A0Q.size() < 4) {
            return AnonymousClass7TE.A0Y();
        }
        return new RectF(Float.parseFloat(AnonymousClass7TE.A19(A0Q, 0)), Float.parseFloat(AnonymousClass7TE.A19(A0Q, 1)), Float.parseFloat(AnonymousClass7TE.A19(A0Q, 2)), Float.parseFloat(AnonymousClass7TE.A19(A0Q, 3)));
    }

    public static final String A01(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(rectF.left);
        A1A.append(',');
        A1A.append(rectF.top);
        A1A.append(',');
        A1A.append(rectF.right);
        A1A.append(',');
        A1A.append(rectF.bottom);
        return A1A.toString();
    }

    public static String A02(1WE r3, C61035JvZ jvZ) {
        r3.ADa(18, (long) jvZ.A03);
        r3.ADa(19, (long) jvZ.A02);
        r3.ADa(20, (long) jvZ.A01);
        r3.ADa(21, jvZ.A0Q ? 1 : 0);
        r3.ADa(22, jvZ.A0W ? 1 : 0);
        return A01(jvZ.A0D);
    }
}
