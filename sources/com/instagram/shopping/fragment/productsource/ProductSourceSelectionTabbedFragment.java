package com.instagram.shopping.fragment.productsource;

import X.0hq;
import X.0qQ;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C15340Uaq;
import X.C15390Ubt;
import X.C16343UtG;
import X.C16659Uyv;
import X.C21048XBp;
import X.C227642jf;
import X.C249713kF;
import X.C51973G9u;
import X.DbS;
import X.DbW;
import X.DbY;
import X.JTR;
import X.OIJ;
import X.W3U;
import X.XBP;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;

public final class ProductSourceSelectionTabbedFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, XBP {
    public C16659Uyv A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final boolean A04 = true;
    public C16343UtG tabbedFragmentController;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969839);
    }

    public final String getModuleName() {
        return "product_source_selection";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        ViewPager A0b = AnonymousClass7TE.A0b(view, R.id.tabs_viewpager);
        FixedTabBar fixedTabBar = (FixedTabBar) AnonymousClass7TE.A0b(view, R.id.fixed_tabbar_view);
        ArrayList arrayList = new ArrayList();
        if (this.A01) {
            arrayList.add(C16659Uyv.BRAND);
        }
        if (this.A02) {
            arrayList.add(C16659Uyv.CATALOG);
        }
        this.tabbedFragmentController = new C16343UtG(childFragmentManager, A0b, fixedTabBar, this, arrayList, false, false);
        C16659Uyv A012 = W3U.A01(AnonymousClass7TE.A0l(this.A03));
        this.A00 = A012;
        C16343UtG utG = this.tabbedFragmentController;
        if (utG != null) {
            utG.A03(A012);
        } else {
            0qQ.A0F("tabbedFragmentController");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        Fragment ubt;
        C16659Uyv uyv = (C16659Uyv) obj;
        if (uyv != null) {
            int ordinal = uyv.ordinal();
            if (ordinal == 0) {
                C249713kF.A00.A0T();
                ubt = new C15390Ubt();
            } else if (ordinal == 1) {
                C249713kF.A00.A0T();
                ubt = new C15340Uaq();
            }
            Bundle A08 = DbY.A08(this);
            A08.putBoolean("is_tabbed", true);
            C16659Uyv uyv2 = this.A00;
            if (uyv2 != null) {
                A08.putString("initial_tab", uyv2.toString());
            }
            ubt.setArguments(A08);
            return ubt;
        }
        throw C51973G9u.A0g(uyv, "Invalid tab for product source selection: ", new StringBuilder());
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        String str;
        int i;
        C16659Uyv uyv = (C16659Uyv) obj;
        Resources A0R = JTR.A0R(this);
        if (uyv != null) {
            int ordinal = uyv.ordinal();
            if (ordinal == 0) {
                i = 2131969838;
            } else if (ordinal == 1) {
                i = 2131969837;
            }
            str = A0R.getString(i);
            return new OIJ((Drawable) null, (Drawable) null, (View) null, str, (String) null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
        }
        str = null;
        return new OIJ((Drawable) null, (Drawable) null, (View) null, str, (String) null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
    }

    public final /* bridge */ /* synthetic */ void DqK(Object obj) {
        C16659Uyv uyv;
        C16659Uyv uyv2 = (C16659Uyv) obj;
        if (isResumed() && uyv2 != (uyv = this.A00)) {
            C16343UtG utG = this.tabbedFragmentController;
            if (utG != null) {
                C21048XBp item = utG.getItem(utG.A00.indexOf(uyv));
                0qQ.A07(item);
                String A002 = AnonymousClass000.A00(3649);
                0qQ.A0C(item, A002);
                item.DVy();
                this.A00 = uyv2;
                C16343UtG utG2 = this.tabbedFragmentController;
                if (utG2 != null) {
                    C21048XBp item2 = utG2.getItem(utG2.A00.indexOf(uyv2));
                    0qQ.A07(item2);
                    0qQ.A0C(item2, A002);
                    item2.DW7();
                    return;
                }
            }
            0qQ.A0F("tabbedFragmentController");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean isContainerFragment() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        C16343UtG utG = this.tabbedFragmentController;
        if (utG != null) {
            AnonymousClass4DR A012 = utG.A01();
            if (!(A012 instanceof AnonymousClass4DR) || !A012.onBackPressed()) {
                return false;
            }
            return true;
        }
        0qQ.A0F("tabbedFragmentController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(634643220);
        ProductSourceSelectionTabbedFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getBoolean("show_brands_tab");
        requireArguments.getBoolean("show_collections_tab");
        this.A02 = requireArguments.getBoolean("show_catalogs_tab");
        AnonymousClass0fD.A09(-161087022, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-670259224);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.product_source_selection_tabbed_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1652118593, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2001112915);
        super.onDestroyView();
        this.tabbedFragmentController = null;
        AnonymousClass0fD.A09(-1561799197, A022);
    }
}
