package X;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* renamed from: X.4Vb  reason: invalid class name and case insensitive filesystem */
public abstract class C265514Vb {
    public static /* synthetic */ boolean A00(ColorFilter colorFilter, ColorFilter colorFilter2) {
        if (!(colorFilter instanceof BlendModeColorFilter) || !(colorFilter2 instanceof BlendModeColorFilter) || ((BlendModeColorFilter) colorFilter).getColor() == ((BlendModeColorFilter) colorFilter2).getColor()) {
            return false;
        }
        return true;
    }
}
