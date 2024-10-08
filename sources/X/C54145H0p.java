package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H0p  reason: case insensitive filesystem */
public final class C54145H0p extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditVisibilityFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r3) {
        r3.ErN(DbT.A06(this, r3, 0).getString(2131961431));
        r3.Eiy(requireContext().getString(2131972502), ID1.A00(this, 2));
    }

    public final String getModuleName() {
        return "school_settings_edit_visibility";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C54145H0p() {
        C20608Wvp wvp = new C20608Wvp(this, 0);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58681Ivq(new C58681Ivq(this, 47), 48));
        this.A01 = DbS.A0I(new C58681Ivq(A002, 49), wvp, new C58691Iw0(31, (Object) null, A002), DbS.A0z(C52985Ggc.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-472066734);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 47), 1020276171);
        AnonymousClass0fD.A09(1258139133, A02);
        return A0H;
    }
}
