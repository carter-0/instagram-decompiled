package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.Lzy  reason: case insensitive filesystem */
public final class C65806Lzy implements C227182im {
    public final /* synthetic */ IgFragmentActivity A00;

    public C65806Lzy(IgFragmentActivity igFragmentActivity) {
        this.A00 = igFragmentActivity;
    }

    public final void DmH(int i, int i2) {
        IgFragmentActivity igFragmentActivity = this.A00;
        View findViewById = igFragmentActivity.findViewById(16908290);
        0qQ.A0C(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        View childAt = ((ViewGroup) findViewById).getChildAt(0);
        if (childAt != null) {
            0nA.A0i(childAt, i, i2);
        }
        if (!igFragmentActivity.isTransparentThemeAndroid15()) {
            igFragmentActivity.configureBackgroundColorAndroid15();
        }
    }
}
