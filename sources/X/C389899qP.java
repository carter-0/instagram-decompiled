package X;

import com.instagram.notifications.badging.ui.component.ToastingBadge;

/* renamed from: X.9qP  reason: invalid class name and case insensitive filesystem */
public final class C389899qP extends C262934Go {
    public final /* synthetic */ C226142fk A00;

    public C389899qP(C226142fk r1) {
        this.A00 = r1;
    }

    public final void Cv6(float f) {
        ToastingBadge toastingBadge = this.A00.A00;
        if (toastingBadge != null) {
            AnonymousClass5Gv r1 = toastingBadge.A02;
            if (r1 != null) {
                r1.A08(false);
            }
            AnonymousClass7TF.A1O(toastingBadge.getViewModel().A0J, true);
        }
    }

    public final void D9d() {
        ToastingBadge toastingBadge = this.A00.A00;
        if (toastingBadge != null) {
            toastingBadge.A0A();
        }
    }
}
