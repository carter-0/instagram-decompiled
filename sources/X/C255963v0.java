package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.3v0  reason: invalid class name and case insensitive filesystem */
public class C255963v0 implements C255973v1 {
    public final Rect A00 = new Rect();

    public void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        0qQ.A0B(reboundViewPager, 0);
        0qQ.A0B(view, 1);
        float pageSize = (((float) reboundViewPager.getPageSize()) * f) + (f * reboundViewPager.A00);
        if (reboundViewPager.A0M == AnonymousClass3TI.VERTICAL) {
            view.setTranslationY(pageSize);
        } else {
            view.setTranslationX(pageSize);
        }
    }

    public boolean FHR(ReboundViewPager reboundViewPager, float f, float f2) {
        int childCount = reboundViewPager.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        int i2 = -2147483647;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = reboundViewPager.getChildAt(i3);
            Rect rect = this.A00;
            childAt.getHitRect(rect);
            if (rect.contains(Math.round(f), Math.round(f2))) {
                return true;
            }
            i = Math.min(i, rect.left);
            i2 = Math.max(i2, rect.right);
        }
        if (f < ((float) i) || f > ((float) i2)) {
            return false;
        }
        return true;
    }

    public int AVk(ReboundViewPager reboundViewPager, float f) {
        double floor;
        double d = (double) f;
        if (reboundViewPager.A0S()) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return (int) floor;
    }

    public int CfQ(ReboundViewPager reboundViewPager, float f) {
        double ceil;
        double d = (double) f;
        if (reboundViewPager.A0S()) {
            ceil = Math.floor(d);
        } else {
            ceil = Math.ceil(d);
        }
        return (int) ceil;
    }
}
