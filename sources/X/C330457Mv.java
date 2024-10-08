package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.7Mv  reason: invalid class name and case insensitive filesystem */
public final class C330457Mv implements C238813Dn {
    public final /* synthetic */ AnonymousClass7TI A00;

    public C330457Mv(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final void Dcp() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00.A0E;
        if (refreshableNestedScrollingParent == null) {
            0qQ.A0F("nestedScrollingParent");
            throw AnonymousClass00P.createAndThrow();
        } else {
            refreshableNestedScrollingParent.performHapticFeedback(0);
        }
    }
}
