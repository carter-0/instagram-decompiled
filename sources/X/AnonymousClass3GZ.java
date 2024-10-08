package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3GZ  reason: invalid class name */
public final class AnonymousClass3GZ {
    public static String A00;
    public static final AnonymousClass3GZ A01 = new Object();
    public static final List A02 = new ArrayList();

    public static final View A00(View view, AnonymousClass3GZ r4) {
        if ((view instanceof RecyclerView) || (view instanceof ReboundViewPager) || (view instanceof RefreshableListView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                0qQ.A07(childAt);
                View A002 = A00(childAt, r4);
                if (A002 != null) {
                    return A002;
                }
            }
        }
        return null;
    }
}
