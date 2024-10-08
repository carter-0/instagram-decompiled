package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UZs  reason: case insensitive filesystem */
public final class C15287UZs extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectConversationStarterCameraFragment";
    public 28D A00 = 28D.A03;
    public AnonymousClass80Q A01;
    public AnonymousClass80C A02;
    public final C41837B2s A03 = new WUO(3);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A02 = r0;
        registerLifecycleListener(r0);
        this.A00 = AnonymousClass7TH.A07(requireArguments, C66579MXk.A00(504));
        ViewGroup A0E = DbS.A0E(view, R.id.direct_quick_camera_container);
        AnonymousClass80D r4 = new AnonymousClass80D();
        C41837B2s b2s = this.A03;
        b2s.getClass();
        r4.A0l = b2s;
        AnonymousClass0eM r02 = this.A04;
        C13992Tns.A0u(this, r4, r02);
        AnonymousClass80I r5 = AnonymousClass80H.A02;
        UserSession A0l = AnonymousClass7TE.A0l(r02);
        AnonymousClass80M r1 = AnonymousClass80M.A00;
        AnonymousClass80D.A08(A0l, r5, r1, r4);
        r4.A3h = true;
        r4.A0R = this.volumeKeyPressController;
        C13991Tnr.A0v(A0E, r4, this.A02);
        r4.A0B = this.A00;
        r4.A0O = this;
        r4.A3H = true;
        r4.A3Q = true;
        r4.A3G = true;
        r4.A3i = true;
        r4.A3t = false;
        r4.A3s = true;
        r4.A44 = false;
        r4.A47 = true;
        r4.A3L = false;
        r4.A03 = 8;
        r4.A28 = AnonymousClass05K.A00;
        r4.A0V = C358098aM.A00(r1, new C358088aL[0]);
        r4.A3J = true;
        Window A0G = DbV.A0G(this);
        0qQ.A07(A0G);
        2db.A07(C66581MXm.A0A(requireActivity()), A0G, false);
        AnonymousClass7TF.A17(this, new C20204Wn4(r4, this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A01;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1215747448);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-872069539, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(927119031);
        Window A0G = DbV.A0G(this);
        0qQ.A07(A0G);
        2db.A07(C66581MXm.A0A(requireActivity()), A0G, true);
        super.onDestroyView();
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        AnonymousClass80C r0 = this.A02;
        if (r0 != null) {
            r0.onDestroyView();
        }
        this.A02 = null;
        AnonymousClass0fD.A09(86724197, A022);
    }
}
