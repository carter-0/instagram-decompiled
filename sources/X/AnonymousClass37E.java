package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.37E  reason: invalid class name */
public final class AnonymousClass37E {
    public final AnonymousClass37D A01(Activity activity) {
        C249443jn r3;
        AnonymousClass37D A01;
        if (activity != null) {
            Activity parent = activity.getParent();
            if (parent != null && (A01 = A01(parent)) != null) {
                return A01;
            }
            if ((activity instanceof C249443jn) && (r3 = (C249443jn) activity) != null) {
                return r3.getBottomSheetNavigator();
            }
        }
        return null;
    }

    public final AnonymousClass37D A02(Context context) {
        C249443jn r1;
        Activity parent;
        AnonymousClass37D A01;
        if (context != null) {
            Activity activity = (Activity) 0mE.A00(context, Activity.class);
            if (activity != null && (parent = activity.getParent()) != null && (A01 = A01(parent)) != null) {
                return A01;
            }
            if ((activity instanceof C249443jn) && (r1 = (C249443jn) activity) != null) {
                return r1.getBottomSheetNavigator();
            }
        }
        return null;
    }

    public static final 0hq A00(Activity activity) {
        if (activity instanceof FragmentActivity) {
            0hq supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            0qQ.A07(supportFragmentManager);
            return supportFragmentManager;
        }
        throw new UnsupportedOperationException(002.A0R("Activity not support ", activity.getClass().getName()));
    }
}
