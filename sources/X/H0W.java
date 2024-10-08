package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;

public final class H0W extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "WallMediaPickerTabFragment";
    public ViewPager2 A00;
    public TabLayout A01;
    public C324826zy A02;
    public C60728JqH A03;
    public C55747Hmi A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        AnonymousClass0eM r4 = this.A07;
        int size = C51975G9x.A0m(((C53014Gh5) r4.getValue()).A02).size();
        String str = null;
        if (size > 0) {
            getString(2131976754, AnonymousClass7TF.A1b(size));
            if (this.A04 == null) {
                0qQ.A0F("pickerConfig");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            str = getString(2131976753);
        }
        r6.ErN(str);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131968361);
        DbX.A19(ID1.A00(this, 58), A0K, r6);
        int size2 = C51975G9x.A0m(((C53014Gh5) r4.getValue()).A02).size();
        boolean z = false;
        if (1 <= size2 && size2 <= 1) {
            z = true;
        }
        r6.ARb(0, z);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C55747Hmi hmi = this.A04;
        if (hmi == null) {
            str = "pickerConfig";
        } else {
            HMX hmx = HMX.GALLERY;
            HMX hmx2 = null;
            if (!hmi.A00) {
                hmx = null;
            }
            HMX hmx3 = HMX.USER_MEDIA;
            if (hmi.A02) {
                hmx2 = hmx3;
            }
            this.A03 = new C60728JqH(this, C51967G9n.A0s(new HMX[]{hmx, hmx2}), C59098J6g.A01(this, 12));
            ViewPager2 viewPager2 = (ViewPager2) view.requireViewById(R.id.viewpager);
            C60728JqH jqH = this.A03;
            if (jqH == null) {
                str = "tabPagerAdapter";
            } else {
                viewPager2.setAdapter(jqH);
                this.A00 = viewPager2;
                TabLayout tabLayout = (TabLayout) view.requireViewById(R.id.tab_layout);
                this.A01 = tabLayout;
                String str2 = "tabLayout";
                if (tabLayout != null) {
                    C60728JqH jqH2 = this.A03;
                    str = "tabPagerAdapter";
                    if (jqH2 != null) {
                        int itemCount = jqH2.getItemCount();
                        int i = 0;
                        if (itemCount <= 1) {
                            i = 8;
                        }
                        tabLayout.setVisibility(i);
                        C60728JqH jqH3 = this.A03;
                        if (jqH3 != null) {
                            if (jqH3.getItemCount() > 1) {
                                TabLayout tabLayout2 = this.A01;
                                if (tabLayout2 != null) {
                                    ViewPager2 viewPager22 = this.A00;
                                    if (viewPager22 == null) {
                                        str2 = "viewPager";
                                    } else {
                                        new C66992MgQ(viewPager22, tabLayout2, new C64447Lc2(this, 3)).A00();
                                    }
                                }
                            }
                            Object value = this.A07.getValue();
                            07U r4 = 07U.A05;
                            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                            AnonymousClass7TE.A1Z(new MGL(viewLifecycleOwner, r4, value, this, (AnonymousClass4D7) null, 4), AnonymousClass07a.A00(viewLifecycleOwner));
                            return;
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public H0W() {
        C58704IwD A012 = C58704IwD.A01(this, 36);
        C58704IwD A013 = C58704IwD.A01(this, 33);
        0eO r5 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r5, C58704IwD.A01(A013, 34));
        this.A07 = DbS.A0I(C58704IwD.A01(A002, 35), A012, C58687Ivw.A00((Object) null, A002, 1), DbS.A0z(C53014Gh5.class));
        this.A05 = AnonymousClass0eN.A00(r5, C58704IwD.A01(this, 32));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(68547968);
        H0W.super.onCreate(bundle);
        this.A04 = C55206Hdw.A00(AnonymousClass7TE.A0l(this.A06));
        AnonymousClass0fD.A09(1675281050, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1357232537);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_wall_media_picker_tab, false);
        AnonymousClass0fD.A09(1801439457, A022);
        return A0D;
    }
}
