package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

public final class E5V extends AnonymousClass4DH implements C20954X6h {
    public static final String __redex_internal_original_name = "ProfileTabbedExplorerFragment";
    public 1Xj A00;
    public C16293UsB A01;
    public C323206x7 A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return "tabbed_explorer_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) AnonymousClass7TF.A0F(view, R.id.tab_layout);
        ViewPager A0F = AnonymousClass7TF.A0F(view, R.id.tab_layout_pager);
        View A0G = AnonymousClass7TF.A0G(view, R.id.tab_layout_header_container);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.tab_layout_header);
        DbT.A16(requireContext(), igSegmentedTabLayout, 2Yu.A02(getContext()));
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        this.A01 = new C16293UsB(childFragmentManager, A0F, this, igSegmentedTabLayout);
        A0F.A0J(new FR9(this, 1));
        DbV.A1F(getViewLifecycleOwner(), DbT.A0G(((C46752Dkf) this.A05.getValue()).A02), new C58768IxF(16, A0G, this, igSegmentedTabLayout, A0G2), 34);
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        int A022 = DbU.A02((C48096EVo) obj, 0);
        if (A022 == 1) {
            String A012 = C320236s2.A01(requireArguments(), "ProfileTabbedExplorerFragment.USER_ID");
            UserSession A0l = AnonymousClass7TE.A0l(this.A04);
            AnonymousClass7TG.A1N(A0l, A012);
            Bundle A0a = AnonymousClass7TE.A0a();
            E12 e12 = new E12();
            DbU.A1D(A0a, A0l);
            A0a.putString(AnonymousClass000.A00(886), A012);
            A0a.putString("ChannelsListFragment.ENTRY_POINT", (String) null);
            A0a.putBoolean(AnonymousClass000.A00(1496), false);
            e12.setArguments(A0a);
            return e12;
        } else if (A022 == 0) {
            String A013 = C320236s2.A01(requireArguments(), "ProfileTabbedExplorerFragment.USER_ID");
            UserSession A0l2 = AnonymousClass7TE.A0l(this.A04);
            C323206x7 r4 = this.A02;
            if (r4 == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            }
            1Xj r2 = this.A00;
            0qQ.A0B(A0l2, 0);
            Bundle A0B = DbV.A0B(A013, 1);
            E1K e1k = new E1K();
            DbU.A1D(A0B, A0l2);
            A0B.putString("LinksListFragment.USER_ID", A013);
            e1k.setArguments(A0B);
            e1k.A01 = r4;
            e1k.A00 = r2;
            return e1k;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final /* bridge */ /* synthetic */ C49627Ezk C3n(Object obj) {
        C48096EVo eVo = (C48096EVo) obj;
        0qQ.A0B(eVo, 0);
        return new C49627Ezk((Drawable) null, getString(eVo.A00), (CharSequence) null, -1, false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public E5V() {
        C51800G2j A002 = C51800G2j.A00(this, 3);
        C51800G2j A003 = C51800G2j.A00(this, 0);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r6, C51800G2j.A00(A003, 1));
        this.A05 = DbS.A0I(C51800G2j.A00(A004, 2), A002, new MJ4(28, (Object) null, A004), DbS.A0z(C46752Dkf.class));
        this.A03 = AnonymousClass0eN.A00(r6, new C51763G0f(this, 49));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1099683920);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_tabbed_explorer_fragment, false);
        AnonymousClass0fD.A09(-473744090, A022);
        return A0D;
    }
}
