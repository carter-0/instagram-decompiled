package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.NJs  reason: case insensitive filesystem */
public final class C68475NJs extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UserListFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1C(r3, requireContext().getString(2131958974));
    }

    public final String getModuleName() {
        return "direct_thread_one_one_one_user_list";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C68475NJs() {
        C73655PhU phU = new C73655PhU(this, 38);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73655PhU(new C73655PhU(this, 35), 36));
        this.A01 = DbS.A0I(new C73655PhU(A002, 37), phU, new C73665Phe(14, A002, (Object) null), DbS.A0z(C67727Mtg.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-876505493);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 34), 1459313678);
        AnonymousClass0fD.A09(-1544063575, A02);
        return A0H;
    }
}
