package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.LinkedHashSet;

public final class I0F {
    public static final LinkedHashSet A00(ViewGroup viewGroup, I0F i0f, int i) {
        LinkedHashSet A0y = DbS.A0y();
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (0qQ.A0K(childAt.getTag(R.id.bk_extension_viewtag_int), Integer.valueOf(i))) {
                A0y.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                A0y.addAll(A00((ViewGroup) childAt, i0f, i));
            }
        }
        return A0y;
    }

    public final LinkedHashSet A01(ViewGroup viewGroup, int i) {
        return A00(viewGroup, this, i);
    }
}
