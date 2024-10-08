package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.E2h  reason: case insensitive filesystem */
public final class C47435E2h extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacLandingFragment";
    public Bundle A00;
    public ViewStub A01;
    public ViewStub A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new MML(this, 0));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new MML(this, 1));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new MML(this, 2));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131975697));
        r2.Ets(this.A03);
        r2.setIsLoading(this.A03);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = this.A01;
        if (viewStub == null) {
            0qQ.A0F("loadingViewStub");
            throw AnonymousClass00P.createAndThrow();
        } else {
            viewStub.inflate();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1131148672);
        C47435E2h.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r5 = this.A06;
        0lg A0X = DbT.A0X(r5);
        String A0w = DbT.A0w(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "");
        0qQ.A0B(A0X, 0);
        if (!NetInfoModule.CONNECTION_TYPE_NONE.equals(A0w)) {
            1Q9.A00(C49852F9r.A01, "two_factor").A08();
            C49852F9r.A00 = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, A0X), "instagram_two_fac_setup_entry");
        A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0w);
        Dbc.A0W(A0e);
        A0e.Cgf();
        FCE.A02(AnonymousClass7TE.A0l(r5), "education");
        AnonymousClass0fD.A09(575795709, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-4914501);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_landing_fragment, viewGroup, false);
        this.A01 = DbS.A0F(inflate, R.id.two_fac_loading_spinner_stub);
        this.A02 = DbS.A0F(inflate, R.id.two_fac_landing_success_stub);
        Dbb.A1N(this);
        AnonymousClass0fD.A09(2031407002, A022);
        return inflate;
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(770611821);
        C47435E2h.super.onStart();
        1OC A012 = FFP.A01(requireContext(), AnonymousClass7TE.A0l(this.A06));
        A012.A00 = (1P0) this.A04.getValue();
        schedule(A012);
        AnonymousClass0fD.A09(1932334383, A022);
    }
}
