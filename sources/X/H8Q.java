package X;

import androidx.fragment.app.FragmentActivity;

public final class H8Q extends 0vM {
    public final /* synthetic */ C227802jw A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8Q(C227802jw r7) {
        super("scheduleMegaphone", 696053296, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C227802jw r2 = this.A00;
        FragmentActivity activity = r2.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C57796Igb(r2));
        }
    }
}
