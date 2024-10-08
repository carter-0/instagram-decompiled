package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.Dhk  reason: case insensitive filesystem */
public final class C46604Dhk {
    public static final C46604Dhk A00 = new Object();

    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final Object A01(Context context) {
        C46604Dhk dhk = A00;
        List A03 = A03(A00(context));
        if (A03 == null || A03.isEmpty()) {
            return null;
        }
        return dhk.A02(A03);
    }

    private final Object A02(List list) {
        Class<G9A> cls = G9A.class;
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            Fragment fragment = (Fragment) list.get(size);
            if (cls.isInstance(fragment)) {
                return cls.cast(fragment);
            }
            List A04 = fragment.getChildFragmentManager().A0U.A04();
            0qQ.A07(A04);
            Object A02 = A02(A04);
            if (A02 != null) {
                return A02;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final List A03(Activity activity) {
        if (activity instanceof FragmentActivity) {
            return DbT.A0F((FragmentActivity) activity).A0U.A04();
        }
        return null;
    }
}
