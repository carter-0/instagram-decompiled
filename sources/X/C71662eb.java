package X;

import android.view.View;
import android.view.ViewStub;

@Deprecated
/* renamed from: X.2eb  reason: invalid class name and case insensitive filesystem */
public final class C71662eb {
    public View A00;
    public ViewStub A01;
    public C2365734g A02;

    public final int A00() {
        View view = this.A00;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public final View A01() {
        ViewStub viewStub;
        View view = this.A00;
        if (view == null && (viewStub = this.A01) != null) {
            view = viewStub.inflate();
            this.A00 = view;
            this.A01 = null;
        }
        C2365734g r0 = this.A02;
        if (!(r0 == null || view == null)) {
            r0.DKS(view);
            this.A02 = null;
        }
        return this.A00;
    }

    public final void A02() {
        A03(8);
    }

    public final void A03(int i) {
        View A012;
        if (i == 8) {
            A012 = this.A00;
            if (A012 == null) {
                return;
            }
        } else {
            A012 = A01();
        }
        A012.setVisibility(i);
    }

    public final boolean A04() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public C71662eb(ViewStub viewStub) {
        this.A01 = viewStub;
    }
}
