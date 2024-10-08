package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* renamed from: X.Mlc  reason: case insensitive filesystem */
public abstract class C67302Mlc {
    public static final Map A00 = AnonymousClass7TE.A1E();
    public static final C67306Mlg A01 = new C67306Mlg();

    public static final void A00(Resources resources, int i) {
        C226482gt r2;
        0qQ.A0B(resources, 0);
        C67306Mlg mlg = A01;
        0qQ.A0B(mlg, 2);
        Drawable drawable = resources.getDrawable(i);
        if ((drawable instanceof C226482gt) && (r2 = (C226482gt) drawable) != null && r2.A00.A02.A08 == null) {
            Map map = A00;
            synchronized (map) {
                map.put(r2, mlg);
            }
            r2.A02();
        }
    }
}
