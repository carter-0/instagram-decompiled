package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profilecard.domain.ProfileCardViewModel;

public final class E5O extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ProfileCardFragment";
    public final AnonymousClass0eM A00 = C51795G2e.A00(this, 42);
    public final AnonymousClass0eM A01 = C51795G2e.A00(this, 43);
    public final AnonymousClass0eM A02 = C51795G2e.A00(this, 44);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C51795G2e.A00(this, 45);
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public E5O() {
        C51795G2e g2e = new C51795G2e(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51795G2e(new C51795G2e(this, 46), 47));
        this.A05 = DbS.A0I(new C51795G2e(A002, 48), g2e, new MJ4(49, (Object) null, A002), DbS.A0z(ProfileCardViewModel.class));
        this.A03 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2035468002);
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A05.getValue();
        1Ng A002 = AnonymousClass1Nd.A00(profileCardViewModel.A0F);
        A002.A01(profileCardViewModel.A0E, C50278FWj.class);
        A002.A01(profileCardViewModel.A0A, FWU.class);
        A002.A01(profileCardViewModel.A0C, FWP.class);
        A002.A01(profileCardViewModel.A0B, FWW.class);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 15), -1261705210);
        AnonymousClass0fD.A09(-365839002, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1444340892);
        super.onDestroy();
        AnonymousClass0eM r5 = this.A05;
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) r5.getValue();
        1Ng A002 = AnonymousClass1Nd.A00(profileCardViewModel.A0F);
        A002.A02(profileCardViewModel.A0E, C50278FWj.class);
        A002.A02(profileCardViewModel.A0A, FWU.class);
        A002.A02(profileCardViewModel.A0C, FWP.class);
        A002.A02(profileCardViewModel.A0B, FWW.class);
        ProfileCardViewModel profileCardViewModel2 = (ProfileCardViewModel) r5.getValue();
        C234502xy r0 = profileCardViewModel2.A03;
        if (r0 != null) {
            r0.release();
        }
        profileCardViewModel2.A07 = false;
        AnonymousClass0fD.A09(2088062676, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2073347238);
        E5O.super.onPause();
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A05.getValue();
        C234502xy r1 = profileCardViewModel.A03;
        if (r1 != null && r1.isPlaying()) {
            r1.pause();
            profileCardViewModel.A07 = true;
        }
        AnonymousClass0fD.A09(-1792002357, A022);
    }

    public final void onResume() {
        Window window;
        int A022 = AnonymousClass0fD.A02(1109005308);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.addFlags(512);
        }
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A05.getValue();
        if (profileCardViewModel.A07) {
            C234502xy r0 = profileCardViewModel.A03;
            if (r0 != null) {
                r0.E2p();
            }
            profileCardViewModel.A07 = false;
        }
        AnonymousClass0fD.A09(1866608626, A022);
    }
}
