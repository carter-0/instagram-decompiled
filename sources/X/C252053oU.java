package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.3oU  reason: invalid class name and case insensitive filesystem */
public final class C252053oU implements C252063oV {
    public View A00;
    public ViewStub A01;
    public final boolean A02;
    public final AnonymousClass0eM A03;

    public C252053oU(ViewStub viewStub, boolean z, boolean z2) {
        0qQ.A0B(viewStub, 1);
        this.A02 = z2;
        this.A01 = viewStub;
        if (z) {
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type T of com.instagram.common.ui.widget.viewstubholder.ViewStubberImpl");
            this.A00 = inflate;
            this.A01 = null;
            inflate.setVisibility(8);
        }
        this.A03 = AnonymousClass0eN.A01(new AnonymousClass9LM(this, 25));
    }

    public final ViewGroup.LayoutParams BLw() {
        ViewGroup.LayoutParams layoutParams;
        ViewStub viewStub = this.A01;
        if (viewStub != null && (layoutParams = viewStub.getLayoutParams()) != null) {
            return layoutParams;
        }
        ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
        0qQ.A07(layoutParams2);
        return layoutParams2;
    }

    public final int CFV() {
        if (this.A01 == null) {
            return getView().getVisibility();
        }
        return 8;
    }

    public final boolean CVM() {
        if (this.A01 == null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ View E2D() {
        if (this.A01 == null) {
            return getView();
        }
        return null;
    }

    public final void Ebw(ViewGroup.LayoutParams layoutParams) {
        View view = this.A01;
        if (view == null) {
            view = getView();
        }
        view.setLayoutParams(layoutParams);
    }

    public final void EeU(C2365734g r3) {
        AnonymousClass3NA r1;
        if (r3 != null) {
            r1 = new AnonymousClass3NA(r3);
        } else {
            r1 = null;
        }
        ViewStub viewStub = this.A01;
        if (viewStub != null) {
            viewStub.setOnInflateListener(r1);
        }
    }

    public final View getView() {
        return (View) this.A03.getValue();
    }

    public final void setVisibility(int i) {
        if (this.A01 == null || i != 8) {
            getView().setVisibility(i);
        }
    }
}
