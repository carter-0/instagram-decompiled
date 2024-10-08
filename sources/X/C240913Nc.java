package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3Nc  reason: invalid class name and case insensitive filesystem */
public final class C240913Nc {
    public View A00;
    public final int A01;
    public final View A02;
    public final ViewStub A03;

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        ViewStub viewStub = this.A03;
        if (viewStub == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (viewStub.getParent() != null) {
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type T of com.instagram.ui.autostub.AutoViewStub._get_view_$lambda$2");
            inflate.setTag(Integer.valueOf(this.A01));
            this.A00 = inflate;
            return inflate;
        } else {
            View findViewWithTag = this.A02.findViewWithTag(Integer.valueOf(this.A01));
            this.A00 = findViewWithTag;
            0qQ.A0A(findViewWithTag);
            return findViewWithTag;
        }
    }

    public final boolean A01() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public C240913Nc(View view, View view2, ViewStub viewStub, int i) {
        this.A01 = i;
        boolean z = true;
        if ((viewStub == null ? false : z) ^ (view2 != null)) {
            this.A02 = view;
            this.A00 = view2;
            this.A03 = viewStub;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
