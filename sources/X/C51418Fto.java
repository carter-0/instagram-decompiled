package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fto  reason: case insensitive filesystem */
public final class C51418Fto implements Runnable {
    public final /* synthetic */ C54174H1u A00;
    public final /* synthetic */ String A01;

    public C51418Fto(C54174H1u h1u, String str) {
        this.A00 = h1u;
        this.A01 = str;
    }

    public final void run() {
        C54174H1u h1u = this.A00;
        FragmentActivity requireActivity = h1u.requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        Fragment A0R = requireActivity.getSupportFragmentManager().A0R(C54174H1u.class.getCanonicalName());
        FragmentActivity requireActivity2 = h1u.requireActivity();
        AnonymousClass0eM r0 = h1u.A0J;
        C309516Yo A0N = DbX.A0N(requireActivity2, r0);
        if (A0R != null) {
            A0N.A0C(A0R);
        }
        C46474Dfc.A03(A0N, AnonymousClass7TE.A0l(r0), C46447Df9.A02(), C46548Dgp.A01(AnonymousClass7TE.A0l(r0), this.A01, "short_url_to_profile", "feed_short_url"));
    }
}
