package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.3fs  reason: invalid class name and case insensitive filesystem */
public abstract class C247163fs {
    public static final boolean A00(Context context) {
        0qQ.A0B(context, 0);
        if (Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 0.0f) == 0.0f) {
            return true;
        }
        return false;
    }
}
