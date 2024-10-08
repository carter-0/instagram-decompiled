package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

public final class UZP extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsFragmentV2";
    public ViewPager A00;
    public TabLayout A01;
    public C18620VvD A02;
    public C18643Vvl A03;
    public SpinnerImageView A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C20694WxQ(this, 8));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = new C227862kA(new C20694WxQ(this, 9), new C20694WxQ(this, 10), new C41566AwY(15, (Object) null, this), new 0Yh(U92.class));

    public final String getModuleName() {
        return "promote_create_audience_locations";
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.UZP, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.locations_view_pager);
        this.A01 = (TabLayout) view.requireViewById(R.id.locations_tab_layout);
        this.A04 = DbX.A0k(view);
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        0hp r5 = new 0hp(childFragmentManager, 0);
        r5.A01 = new ArrayList();
        r5.A00 = new ArrayList();
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList();
        C322576w3.A00().A02();
        AnonymousClass0eM r2 = this.A06;
        UserSession A0S = DbW.A0S(r2, 0);
        UZ7 uz7 = new UZ7();
        DbZ.A1B(uz7, "IgSessionManager.SESSION_TOKEN_KEY", A0S.A05);
        arrayList.add(uz7);
        C322576w3.A00().A02();
        UserSession A0S2 = DbW.A0S(r2, 0);
        UYz uYz = new UYz();
        DbZ.A1B(uYz, "IgSessionManager.SESSION_TOKEN_KEY", A0S2.A05);
        arrayList2.add(AnonymousClass7TE.A16(C66583MXo.A07(this, AnonymousClass7TE.A16(C66583MXo.A07(this, uYz, arrayList), 2131970332), arrayList2), 2131970331));
        r5.A01 = arrayList;
        r5.A00 = arrayList2;
        ViewPager viewPager = this.A00;
        String str = "viewPager";
        if (viewPager != null) {
            viewPager.setAdapter(r5);
            ViewPager viewPager2 = this.A00;
            if (viewPager2 != null) {
                viewPager2.A0J(new C18954WEh(this, 1));
                TabLayout tabLayout = this.A01;
                if (tabLayout == null) {
                    str = "tabLayout";
                } else {
                    ViewPager viewPager3 = this.A00;
                    if (viewPager3 != null) {
                        tabLayout.setupWithViewPager(viewPager3);
                        ViewPager viewPager4 = this.A00;
                        if (viewPager4 != null) {
                            viewPager4.setCurrentItem(((U92) this.A07.getValue()).A0A().A00);
                            C13988Tno.A1J(C13990Tnq.A0M(this.A05), C16678UzE.LOCATIONS_SELECTION);
                            View findViewById = view.findViewById(R.id.audience_potential_reach_view);
                            if (findViewById != null) {
                                this.A02 = new C18620VvD(AnonymousClass7TE.A0l(r2), getActivity(), findViewById);
                            }
                            MG7.A01(this, AnonymousClass07a.A00(this), 4);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(UZP uzp) {
        C18643Vvl vvl = uzp.A03;
        if (vvl != null) {
            vvl.A01(new C18887WAz(uzp, 64), AnonymousClass05K.A1F);
            vvl.A02(AnonymousClass7TE.A1b(((U92) uzp.A07.getValue()).A0B()));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void configureActionBar(2da r3) {
        this.A03 = new C18643Vvl(JTT.A0B(this, r3), r3);
        r3.Eom(2131970334);
        Dbc.A0k(r3);
        r3.Eu4(true);
        A00(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(882097699);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_create_audience_locations_view, false);
        AnonymousClass0fD.A09(921507766, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2099793295);
        super.onDestroyView();
        C18620VvD vvD = this.A02;
        if (vvD != null) {
            vvD.A01();
        }
        this.A02 = null;
        AnonymousClass0fD.A09(-1562357887, A022);
    }
}
