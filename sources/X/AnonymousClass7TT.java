package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.7TT  reason: invalid class name */
public final class AnonymousClass7TT implements C252213ok {
    public final /* synthetic */ AnonymousClass7TI A00;

    public final void DMr(int i, boolean z) {
        float f;
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00.A0E;
        if (z2) {
            if (refreshableNestedScrollingParent != null) {
                f = 0.7f;
            }
            0qQ.A0F("nestedScrollingParent");
            throw AnonymousClass00P.createAndThrow();
        }
        if (refreshableNestedScrollingParent != null) {
            f = 0.5f;
        }
        0qQ.A0F("nestedScrollingParent");
        throw AnonymousClass00P.createAndThrow();
        refreshableNestedScrollingParent.A00 = f;
    }

    public AnonymousClass7TT(AnonymousClass7TI r1) {
        this.A00 = r1;
    }
}
