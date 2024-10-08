package X;

import android.os.Bundle;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Vp0  reason: case insensitive filesystem */
public abstract class C18280Vp0 {
    public static final ReelViewerFragment A01(Bundle bundle) {
        ReelViewerFragment reelViewerFragment = new ReelViewerFragment();
        reelViewerFragment.setArguments(bundle);
        return reelViewerFragment;
    }

    public static final C15394Ubx A00(String str, String str2, int i) {
        AnonymousClass7TG.A1N(str, str2);
        C15394Ubx ubx = new C15394Ubx();
        Bundle bundle = new Bundle();
        bundle.putString("ReelQuizRespondersListFragment.REEL_ID", str);
        bundle.putString("ReelQuizRespondersListFragment.REEL_ITEM_ID", str2);
        bundle.putInt("ReelQuizRespondersListFragment.QUIZ_OPTION_INDEX", i);
        ubx.setArguments(bundle);
        return ubx;
    }
}
