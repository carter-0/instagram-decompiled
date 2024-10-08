package X;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6xu  reason: invalid class name and case insensitive filesystem */
public class C323666xu {
    public static RectF A00(View view, TabLayout tabLayout) {
        float left;
        float top;
        float right;
        float bottom;
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.A0M || !(view instanceof C324756zq)) {
            left = (float) view.getLeft();
            top = (float) view.getTop();
            right = (float) view.getRight();
            bottom = (float) view.getBottom();
        } else {
            C324756zq r5 = (C324756zq) view;
            int contentWidth = r5.getContentWidth();
            int contentHeight = r5.getContentHeight();
            int A00 = (int) C295305nv.A00(r5.getContext(), 24);
            if (contentWidth < A00) {
                contentWidth = A00;
            }
            int left2 = (r5.getLeft() + r5.getRight()) / 2;
            int top2 = (r5.getTop() + r5.getBottom()) / 2;
            int i = contentWidth / 2;
            int i2 = left2 - i;
            int i3 = i + left2;
            left = (float) i2;
            top = (float) (top2 - (contentHeight / 2));
            right = (float) i3;
            bottom = (float) (top2 + (left2 / 2));
        }
        return new RectF(left, top, right, bottom);
    }
}
