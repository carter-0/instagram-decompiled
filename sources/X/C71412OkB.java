package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.OkB  reason: case insensitive filesystem */
public final class C71412OkB implements View.OnLayoutChangeListener {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public C71412OkB(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        AnonymousClass7H6 r0 = this.A00;
        ReboundViewPager reboundViewPager = r0.A0C;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            reboundViewPager.A0G((float) r0.A03);
        }
    }
}
