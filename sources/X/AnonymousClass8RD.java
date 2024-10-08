package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;

/* renamed from: X.8RD  reason: invalid class name */
public final class AnonymousClass8RD {
    public C331157Pu A00;
    public final Fragment A01;
    public final UserSession A02;

    public final void A00(C59725JVj jVj, TargetViewSizeProvider targetViewSizeProvider, C273414mX r11, Integer num, boolean z) {
        UserSession userSession = this.A02;
        Bundle bundle = new Bundle();
        bundle.putParcelable(AnonymousClass000.A00(866), targetViewSizeProvider);
        bundle.putSerializable(AnonymousClass000.A00(2095), jVj);
        if (num != null) {
            bundle.putInt(AnonymousClass000.A00(2092), num.intValue());
        }
        AnonymousClass0Dg.A00(bundle, userSession);
        GiphyClipsBrowserFragment giphyClipsBrowserFragment = new GiphyClipsBrowserFragment();
        giphyClipsBrowserFragment.setArguments(bundle);
        C331127Pr r6 = new C331127Pr(userSession);
        r6.A0a = true;
        r6.A03 = 0.9f;
        Fragment fragment = this.A01;
        r6.A06 = fragment.requireContext().getColor(2Yu.A0H(fragment.requireContext(), R.attr.igds_color_elevated_background_dark));
        r6.A1O = false;
        r6.A0u = !z;
        if (r11 != null) {
            r6.A0U = r11;
        }
        C331157Pu A002 = r6.A00();
        this.A00 = A002;
        A002.A02(fragment.requireActivity(), giphyClipsBrowserFragment);
    }

    public AnonymousClass8RD(Fragment fragment, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = fragment;
    }
}
