package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.37O  reason: invalid class name */
public abstract class AnonymousClass37O {
    public static final Map A00 = new HashMap();

    public static final ColorFilter A00(int i) {
        Map map = A00;
        Integer valueOf = Integer.valueOf(i);
        ColorFilter colorFilter = (ColorFilter) map.get(valueOf);
        if (colorFilter != null) {
            return colorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        map.put(valueOf, porterDuffColorFilter);
        return porterDuffColorFilter;
    }
}
