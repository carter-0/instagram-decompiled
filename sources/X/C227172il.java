package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.2il  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C227172il implements C227182im {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C227162ik A01;

    public /* synthetic */ C227172il(View view, C227162ik r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void DmH(int i, int i2) {
        C227162ik r4 = this.A01;
        View view = this.A00;
        int i3 = r4.A05;
        int i4 = 0;
        view.setBackground(new LayerDrawable(new Drawable[]{new C240723Lz(i3, i), new AnonymousClass3M0(i3, i2)}));
        Activity activity = r4.A06;
        View requireViewById = activity.requireViewById(R.id.layout_container_center_right_coordinator_layout);
        View requireViewById2 = activity.requireViewById(R.id.overlay_layout_container);
        if (i2 <= 0) {
            0wb.A03(002.A0R("SwipeNavigationStatusBarManagerHideNavBarLayout", "_stable_nav_bar"), 002.A0O("stable nav bar height is ", i2));
        }
        0nA.A0T(requireViewById, i2);
        0nA.A0T(requireViewById2, i2);
        View findViewById = activity.findViewById(R.id.modal_container_stub);
        if (findViewById == null) {
            findViewById = activity.requireViewById(R.id.modal_container);
        }
        0nA.A0T(findViewById, i2);
        if (C61290mR.A07()) {
            i4 = C61290mR.A00();
        }
        ViewGroup viewGroup = r4.A07;
        0nA.A0e(viewGroup, i4);
        0nA.A0T(viewGroup, i2);
    }
}
