package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.concurrent.CancellationException;

/* renamed from: X.K5j  reason: case insensitive filesystem */
public final class C61389K5j extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "KirbyAiCreationEditProfilePictureFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = MMA.A00(this, 48);
    public final AnonymousClass0eM A02 = MMA.A00(this, 49);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = DbS.A0I(new MM7(this, 1), new MM7(this, 2), MMV.A00((Object) null, this, 49), JTT.A0w());
    public final String A05 = "kirby_ai_creation_edit_profile_picture_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A01);
        AnonymousClass0eM r0 = this.A04;
        String A022 = C60316JjJ.A02(r0);
        String A012 = C60316JjJ.A01(r0);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            JTT.A1G(A002, JTU.A0W(A002, "edit_ai_details_avatar_screen_shown", A022), A012);
        }
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        LTH A0T = JTO.A0T(this.A01);
        AnonymousClass0eM r4 = this.A04;
        String A022 = C60316JjJ.A02(r4);
        String A012 = C60316JjJ.A01(r4);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            JTT.A1G(A002, JTU.A0W(A002, "edit_ai_details_avatar_cancel_clicked", A022), A012);
        }
        if (JTO.A0R(r4).A0G()) {
            C63005Kpv.A00(requireContext(), new MM7(this, 0), C66230MJl.A00, 2131952805, 2131952804);
            return true;
        }
        AnonymousClass0eM r3 = this.A02;
        JTO.A0U(r3).A06.markerPoint(673058094, "avatar_gen_dismissed");
        JVT.A01(JTO.A0U(r3), AnonymousClass05K.A0C, 673058094);
        KX0 kx0 = JTO.A0R(r4).A00;
        C262204Co r0 = kx0.A02;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        kx0.A0Y.Epw((Object) null);
        DbT.A1I(this);
        return true;
    }

    public final void configureActionBar(2da r4) {
        boolean A1T = JTU.A1T(r4);
        r4.Eom(2131952760);
        LYC.A01(r4, this, 11, 2131960992);
        r4.ARb(A1T ? 1 : 0, ((C61005Jv2) JTO.A0R(this.A04).A0P.getValue()).A01 instanceof C61090Jx1);
        this.A00 = r4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1317297476);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 4), 652402944);
        AnonymousClass0fD.A09(480340177, A022);
        return A0H;
    }
}
