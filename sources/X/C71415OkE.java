package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OkE  reason: case insensitive filesystem */
public final class C71415OkE implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71415OkE(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj3;
        this.A03 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 0);
                04k A002 = C586203k.A00(view);
                if (A002 != null && A002.A00.A0I(8)) {
                    view.removeOnLayoutChangeListener(this);
                    C334027aY r0 = (C334027aY) this.A01;
                    ((View) this.A03).postDelayed(new C40987AmX((C334997cD) this.A02, r0), ((C335537d7) r0).A00);
                    return;
                }
                return;
            case 1:
                C60702Jpn jpn = (C60702Jpn) this.A03;
                jpn.A04.removeOnLayoutChangeListener(this);
                jpn.A00 = null;
                jpn.A00((Bitmap) this.A01, (Medium) this.A02);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                AnonymousClass7H6 r6 = (AnonymousClass7H6) this.A03;
                NR3 nr3 = r6.A0H;
                String str = "pagerAdapter";
                if (nr3 != null) {
                    0rk r5 = (0rk) this.A01;
                    nr3.A00 = r5.A00;
                    nr3.A05 = true;
                    Collection collection = (Collection) this.A02;
                    0qQ.A0B(collection, 0);
                    List list = nr3.A0D;
                    list.clear();
                    list.addAll(collection);
                    ReboundViewPager reboundViewPager = r6.A0C;
                    if (reboundViewPager == null) {
                        str = "viewPager";
                    } else {
                        float f = (float) r5.A00;
                        reboundViewPager.A02 = reboundViewPager.A01;
                        reboundViewPager.A0J(f, true, false);
                        reboundViewPager.A02 = -1.0f;
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 3:
                Resources resources = (Resources) this.A02;
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
                int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.menu_popup_panel_shadow_offset);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.A01;
                autoCompleteTextView.setDropDownWidth(((View) this.A03).getWidth() + (dimensionPixelOffset2 * -2) + (dimensionPixelOffset * 2));
                autoCompleteTextView.setDropDownHorizontalOffset(dimensionPixelOffset2 - dimensionPixelOffset);
                return;
            default:
                View view2 = (View) this.A01;
                if (view2.getMeasuredWidth() != 0) {
                    int measuredWidth = view2.getMeasuredWidth();
                    C67340MmG mmG = (C67340MmG) this.A02;
                    if (measuredWidth != mmG.A00) {
                        C67337MmD.A00((C67337MmD) this.A03);
                        mmG.A00 = view2.getMeasuredWidth();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
