package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gzi  reason: case insensitive filesystem */
public final class C54113Gzi extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BlendViewerNuxFragment";
    public final AnonymousClass0eM A00 = C51804G2n.A01(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0eO.A02, 41);
    public final AnonymousClass0eM A01;
    public final AnonymousClass4DU A02;
    public final String A03;

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C54113Gzi() {
        AnonymousClass2kQ A012 = C227942kP.A01("blend_viewer_nux_fragment", true, false);
        this.A02 = A012;
        this.A03 = A012.A00;
        this.A01 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageUrl imageUrl;
        int A022 = AnonymousClass0fD.A02(-411991528);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r1 = this.A01;
        C317756nm.A03(requireActivity, this, AnonymousClass7TE.A0l(r1), false, true);
        1Xj A023 = DbX.A0d(r1).A02(DbS.A0t(this.A00));
        if (A023 != null) {
            imageUrl = A023.A1Q();
        } else {
            imageUrl = null;
        }
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new JG0(18, imageUrl, this), -1631860901, true), true, false);
        AnonymousClass0fD.A09(194622658, A022);
        return A012;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1988277820);
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A01), false, true);
        super.onDestroyView();
        AnonymousClass0fD.A09(-126290169, A022);
    }
}
