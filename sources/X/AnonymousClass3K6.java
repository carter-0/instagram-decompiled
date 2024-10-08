package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.3K6  reason: invalid class name */
public final class AnonymousClass3K6 extends 0vM {
    public final /* synthetic */ AnonymousClass3GH A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3K6(AnonymousClass3GH r3) {
        super("createReelViewerAnimator", 1118707661);
        this.A00 = r3;
    }

    public final void loggedRun() {
        AnonymousClass3GH r2 = this.A00;
        FragmentActivity activity = r2.A0I.getActivity();
        if (activity != null) {
            AnonymousClass3K2 A07 = 1OP.A07(activity, r2.A06);
            if (A07.A0Z() && A07.A0H == AnonymousClass3BQ.FEED_ITEM_HEADER) {
                A07.A0X(AnonymousClass2kO.A00);
            }
        }
    }
}
