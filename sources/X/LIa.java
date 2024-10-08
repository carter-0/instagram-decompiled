package X;

import android.graphics.Rect;

public abstract class LIa {
    public static void A00(Rect rect, String str, StringBuilder sb) {
        sb.append(rect.width());
        sb.append('x');
        sb.append(rect.height());
        sb.append(str);
    }

    public static boolean A01(Rect rect, Rect rect2, int i) {
        boolean z;
        if (!C64138LPn.A01(((float) rect2.width()) / ((float) rect2.height()), i)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Invalid preview aspect ratio. Preview: ");
            A00(rect2, ", Fullsize: ", A1A);
            A00(rect, ", exif: ", A1A);
            A1A.append(i);
            0kD.A0C("CropUtil", AnonymousClass7TF.A0l("\")\n", A1A), (Throwable) null);
            z = false;
        } else {
            z = true;
        }
        if (C64138LPn.A01(((float) rect.width()) / ((float) rect.height()), i)) {
            return z;
        }
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append("Invalid full size aspect ratio. Preview: ");
        A00(rect2, ", Fullsize: ", A1A2);
        A00(rect, ", exif: ", A1A2);
        A1A2.append(i);
        0kD.A0C("CropUtil", A1A2.toString(), (Throwable) null);
        return false;
    }
}
