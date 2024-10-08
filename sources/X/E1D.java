package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class E1D extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AddAccountBottomSheetFragment";
    public UserSession A00;
    public FBZ A01;
    public String A02;
    public FxSsoViewModel A03;
    public final C49867FAk A04 = new Object();

    public final String getModuleName() {
        return AnonymousClass000.A00(498);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1512729380);
        E1D.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A02 = requireArguments.getString("AddAccountBottomSheetFragment.ARGUMENT_ENTRY_POINT");
        this.A01 = new FBZ(requireActivity(), this.A00, true);
        this.A03 = DbY.A0V(requireActivity());
        AnonymousClass0fD.A09(472094527, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int i;
        int A022 = AnonymousClass0fD.A02(-1739718917);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            igdsBottomButtonLayout = null;
            i = -792248591;
        } else {
            0qQ.A0B(this.A00, 2);
            DbX.A0z(activity);
            0BQ A002 = AnonymousClass0BO.A00(this.A00);
            Bundle bundle2 = A002.AEO(activity, (Uri) null, this.A00, this.A02, false).A00;
            igdsBottomButtonLayout = new IgdsBottomButtonLayout(requireContext());
            igdsBottomButtonLayout.setPrimaryAction(activity.getResources().getString(2131965543), new FPH(60, (Object) this, (Object) bundle2, (Object) activity));
            FBZ fbz = this.A01;
            if (fbz != null && fbz.A02()) {
                this.A03.A03(requireActivity(), bundle2, this.A00);
                DbT.A0H(this.A03.A03).A06(activity, new C50137FQu(1, bundle2, activity, igdsBottomButtonLayout, this));
            }
            igdsBottomButtonLayout.setSecondaryAction(activity.getResources().getString(2131956873), new FPH(59, (Object) this, (Object) A002, (Object) activity));
            i = -1566353457;
        }
        AnonymousClass0fD.A09(i, A022);
        return igdsBottomButtonLayout;
    }
}
