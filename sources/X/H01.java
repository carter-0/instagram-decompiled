package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class H01 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BlendFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass4DU A0A;
    public final String A0B;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHK((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public H01() {
        AnonymousClass2kQ A012 = C227942kP.A01("blend_fragment", true, false);
        this.A0A = A012;
        0eO r3 = 0eO.A02;
        this.A08 = C51804G2n.A01(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3, 40);
        this.A00 = AnonymousClass0eN.A00(r3, new C51681Fyh(this));
        this.A01 = AnonymousClass0eN.A00(r3, new C51682Fyi(this));
        this.A02 = AnonymousClass0eN.A00(r3, new C51683Fyj(this));
        this.A03 = AnonymousClass0eN.A00(r3, new C51684Fyk(this));
        this.A05 = AnonymousClass0eN.A00(r3, new C51685Fyl(this));
        this.A07 = AnonymousClass0eN.A00(r3, new C73673Phm(true, this, "blend_membership_checked_status", 39));
        this.A04 = AnonymousClass0eN.A00(r3, new C73673Phm(true, this, "blend_is_eligible_to_reinvite", 40));
        C58679Ivo ivo = new C58679Ivo(this, 37);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C58679Ivo(new C58679Ivo(this, 34), 35));
        this.A09 = DbS.A0I(new C58679Ivo(A002, 36), ivo, C58690Ivz.A00((Object) null, A002, 1), DbS.A0z(C53006Ggx.class));
        this.A0B = A012.A00;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-694806883);
        C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A06), false, true);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new JGB(this, 8), 1512453917, true), true, false);
        AnonymousClass0fD.A09(1678069152, A022);
        return A012;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1732724700);
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A06), false, true);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1905813032, A022);
    }
}
