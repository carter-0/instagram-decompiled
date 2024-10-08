package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.discovery.mediamap.fragment.LocationSearchFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;

/* renamed from: X.OkD  reason: case insensitive filesystem */
public final class C71414OkD implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71414OkD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        switch (this.A00) {
            case 1:
                view.removeOnLayoutChangeListener(this);
                ReboundViewPager reboundViewPager = ((AnonymousClass7H6) this.A02).A0C;
                if (reboundViewPager == null) {
                    0qQ.A0F("viewPager");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    reboundViewPager.A0G((float) ((0rk) this.A01).A00);
                    return;
                }
            case 2:
                if (i3 - i != 0 || i4 - i2 != 0) {
                    ((View) this.A02).removeOnLayoutChangeListener(this);
                    LocationSearchFragment locationSearchFragment = (LocationSearchFragment) this.A01;
                    MediaMapFragment mediaMapFragment = locationSearchFragment.mParentFragment;
                    mediaMapFragment.getClass();
                    mediaMapFragment.A0H(locationSearchFragment);
                    locationSearchFragment.A00 = 0.5f;
                    return;
                }
                return;
            case 3:
                0qQ.A0B(view, 0);
                view.removeOnLayoutChangeListener(this);
                ((C71139Odj) this.A02).A00 = null;
                ((Runnable) this.A01).run();
                return;
            case 6:
                View view3 = ((E66) this.A02).A00;
                if (view3 != null) {
                    0nA.A0X(view3, ((View) this.A01).getHeight());
                }
                view2 = (View) this.A01;
                break;
            default:
                View view4 = (View) this.A02;
                0qQ.A0A(view4);
                view2 = (View) this.A01;
                0nA.A0X(view4, view2.getHeight());
                break;
        }
        view2.removeOnLayoutChangeListener(this);
    }
}
