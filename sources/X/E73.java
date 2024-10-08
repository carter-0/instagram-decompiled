package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

public final class E73 extends C273374mT implements C227272iw, XBP {
    public static final String __redex_internal_original_name = "RestrictHomeFragment";
    public 0wc A00;
    public C333937aO A01;
    public final 1YZ A02 = 1YZ.A02;
    public final C41800B1f A03 = new C51107Fob(this);

    public final /* bridge */ /* synthetic */ void DqK(Object obj) {
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbX.A1A(FP4.A00(this, 67), DbV.A0K(), r3);
        r3.Eom(2131972353);
    }

    public final void onAttachFragment(Fragment fragment) {
        C333937aO r0;
        0qQ.A0B(fragment, 0);
        if ((fragment instanceof C47517E6b) && (r0 = this.A01) != null) {
            ((C47517E6b) fragment).A03 = r0;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsBanner igdsBanner = (IgdsBanner) AnonymousClass7TF.A0F(view, R.id.restrict_home_description);
        int i = 2131972328;
        if (182.A06(0Tu.A06, getSession(), 36321486155294136L)) {
            i = 2131972344;
        }
        igdsBanner.setBody(i);
        igdsBanner.setAction(2131972326);
        igdsBanner.A00 = new C50468FcG(this, 15);
        C48076EUu eUu = C48076EUu.MEMBERS;
        List A1I = AnonymousClass7TE.A1I(eUu);
        FixedTabBar fixedTabBar = (FixedTabBar) AnonymousClass7TF.A0F(view, R.id.restrict_home_tab_bar);
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        new C16343UtG(childFragmentManager, AnonymousClass7TF.A0G(view, R.id.restrict_home_view_pager), fixedTabBar, this, A1I, false, false).A03(eUu);
        fixedTabBar.setVisibility(8);
        FP4.A01(AnonymousClass7TF.A0G(view, R.id.search_row), 68, this);
        0wc r3 = this.A00;
        if (r3 == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass73V.A0A(r3, (User) null, "impression", "restricted_accounts_list");
        }
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        C48076EUu eUu = (C48076EUu) obj;
        Bundle A0A = DbY.A0A(eUu);
        AnonymousClass0Dg.A00(A0A, getSession());
        A0A.putSerializable("list_tab", eUu);
        1YZ r0 = this.A02;
        if (r0 == null || r0.A00.getValue() == null) {
            return new Fragment();
        }
        C47517E6b e6b = new C47517E6b();
        e6b.setArguments(A0A);
        return e6b;
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        int i;
        int A022 = DbU.A02((C48076EUu) obj, 0);
        if (A022 == 0) {
            i = 2131972362;
        } else if (A022 == 1) {
            i = 2131968520;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return C18278Vot.A00(i);
    }

    public final boolean COC() {
        return false;
    }

    public final String getModuleName() {
        return "restrict_home";
    }

    public final void onCreate(Bundle bundle) {
        C333937aO r0;
        int A022 = AnonymousClass0fD.A02(1142976623);
        E73.super.onCreate(bundle);
        1YZ r1 = this.A02;
        if (r1 != null) {
            r0 = r1.A01(getSession());
        } else {
            r0 = null;
        }
        this.A01 = r0;
        this.A00 = AnonymousClass0kN.A01(this, getSession());
        AnonymousClass0fD.A09(-1246214322, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(398444225);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_restrict_home, false);
        AnonymousClass0fD.A09(275585815, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1142181823);
        E73.super.onPause();
        C333937aO r1 = this.A01;
        if (r1 != null) {
            r1.A02(this.A03);
        }
        AnonymousClass0fD.A09(1692492228, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-71898081);
        super.onResume();
        C333937aO r1 = this.A01;
        if (r1 != null) {
            C41800B1f b1f = this.A03;
            0qQ.A0B(b1f, 0);
            r1.A03.add(new WeakReference(b1f));
        }
        AnonymousClass0fD.A09(-1591417017, A022);
    }
}
