package X;

import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Kt  reason: invalid class name and case insensitive filesystem */
public abstract class C240403Kt {
    public static final List A00(Fragment fragment) {
        List emptyList;
        if (fragment.isAdded()) {
            emptyList = fragment.getChildFragmentManager().A0U.A04();
        } else {
            emptyList = Collections.emptyList();
        }
        0qQ.A07(emptyList);
        return emptyList;
    }
}
