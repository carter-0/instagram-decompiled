package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import java.util.Set;

/* renamed from: X.7N0  reason: invalid class name */
public final class AnonymousClass7N0 {
    public 0eP A00;
    public final int A01;
    public final int A02;
    public final LinearLayoutManager A03;

    public static final 0eP A00(AnonymousClass7N0 r5) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        LinearLayoutManager linearLayoutManager = r5.A03;
        int A1a = linearLayoutManager.A1a();
        if (A1a == -1) {
            return null;
        }
        View A1D = linearLayoutManager.A1D(A1a);
        int i2 = 0;
        if (A1D == null) {
            return null;
        }
        Object tag = A1D.getTag(R.id.direct_thread_view_layout_tag_key);
        if (!(tag instanceof Set) || !((Set) tag).contains(C390769ro.KEEP_TOP_IN_VIEWPORT)) {
            return null;
        }
        int top = A1D.getTop();
        ViewGroup.LayoutParams layoutParams = A1D.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            i = 0;
        } else {
            i = marginLayoutParams2.topMargin;
        }
        Integer valueOf = Integer.valueOf(top - i);
        int bottom = A1D.getBottom();
        ViewGroup.LayoutParams layoutParams2 = A1D.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        return new 0eP(valueOf, Integer.valueOf(bottom - i2));
    }

    public AnonymousClass7N0(Context context, LinearLayoutManager linearLayoutManager, int i) {
        int A04 = (int) 0nA.A04(context, i);
        this.A03 = linearLayoutManager;
        this.A01 = A04;
        this.A02 = (int) 0nA.A04(context, 12);
    }
}
