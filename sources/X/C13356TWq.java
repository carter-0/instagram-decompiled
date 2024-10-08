package X;

import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.TWq  reason: case insensitive filesystem */
public final class C13356TWq extends 0Yg implements 0sP {
    public static final C13356TWq A00 = new C13356TWq();

    public C13356TWq() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C226742hm r6 = (C226742hm) obj;
        0qQ.A0B(r6, 0);
        if (!(r6 instanceof Drawable)) {
            return "";
        }
        Drawable drawable = (Drawable) r6;
        int width = drawable.getBounds().width();
        return Pxe.A12(Locale.US, "%dx%d", Arrays.copyOf(C51968G9o.A1Z(Integer.valueOf(width), drawable.getBounds().height()), 2));
    }
}
