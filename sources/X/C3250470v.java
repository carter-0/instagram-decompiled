package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.70v  reason: invalid class name and case insensitive filesystem */
public final class C3250470v {
    public static final C3250470v A00 = new Object();

    public static final int A00(UserSession userSession, int i, boolean z, boolean z2) {
        if (i != 1) {
            if (i == 2) {
                return z ? 8 : 3;
            }
            if (i != 3) {
                if (z2) {
                    if (userSession != null) {
                        0wj.A01.EFR(817899378, "Invalid button count after configuration changed");
                    }
                    return 0;
                }
                throw new IllegalStateException(002.A0O("Invalid button count for row: ", i));
            } else if (z) {
                return 5;
            } else {
                return 1;
            }
        } else if (z) {
            return 6;
        } else {
            return 4;
        }
    }

    public static final void A01(Context context, Map map, int i) {
        0qQ.A0B(context, 0);
        0qQ.A0B(map, 1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.afi_margin_top);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2;
        int i2 = i - (dimensionPixelSize * 2);
        if (context instanceof Activity) {
            i2 -= AnonymousClass72t.A00((Activity) context);
        }
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right) * 2;
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + dimensionPixelSize3;
        int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2;
        int i3 = dimensionPixelSize3 * 3;
        int i4 = (i2 - i3) / 3;
        map.put(1, Integer.valueOf(i4));
        int i5 = i2 - dimensionPixelSize4;
        map.put(5, Integer.valueOf((i5 - i3) / 3));
        int i6 = i2 - i4;
        int i7 = dimensionPixelSize3 * 2;
        map.put(2, Integer.valueOf(i6 - i7));
        map.put(3, Integer.valueOf((i2 - i7) / 2));
        map.put(8, Integer.valueOf((i5 - i7) / 2));
        int i8 = i2 - dimensionPixelSize3;
        map.put(4, Integer.valueOf(i8));
        map.put(6, Integer.valueOf(i8 - dimensionPixelSize4));
        map.put(7, Integer.valueOf((i - dimensionPixelSize5) - dimensionPixelSize2));
    }

    public static final void A02(ViewGroup viewGroup, UserSession userSession, List list, Map map) {
        String str;
        int childCount = viewGroup.getChildCount();
        int i = childCount;
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Object tag = childAt.getTag();
            if (tag != null) {
                str = tag.toString();
            } else {
                str = null;
            }
            if (0qQ.A0K(str, "chaining") || 0qQ.A0K(str, "overflow_menu")) {
                i--;
                z = true;
            } else {
                list.add(childAt);
            }
        }
        int A002 = A00(userSession, i, z, true);
        if (A002 != 0) {
            Object obj = map.get(Integer.valueOf(A002));
            obj.getClass();
            int intValue = ((Number) obj).intValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                layoutParams.width = intValue;
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
