package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.EnumMap;
import java.util.Map;

public abstract class GJN {
    public static Bitmap A00;
    public static final Paint A01;
    public static final Map A02 = new EnumMap(GJO.class);

    static {
        Paint A0V = AnonymousClass7TE.A0V(1);
        A0V.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        AnonymousClass7TE.A1Q(A0V);
        A01 = A0V;
    }
}
