package X;

import android.os.Bundle;

/* renamed from: X.UvP  reason: case insensitive filesystem */
public final class C16469UvP extends C15391Ubu {
    public static final String __redex_internal_original_name = "ReelPollVotersListFragment";
    public int A00;

    public final void DhN() {
    }

    public final String getModuleName() {
        return "reel_poll_voters_list";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(626231827);
        super.onCreate(bundle);
        this.A00 = requireArguments().getInt("ReelUserListFragment.POLL_OPTION_INDEX", -1);
        AnonymousClass0fD.A09(-1935099047, A02);
    }
}
