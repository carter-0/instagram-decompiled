package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.model.shopping.ProductSource;
import com.instagram.shopping.intf.productpicker.MultiProductPickerResult;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.ProductCollection;
import java.util.Set;

/* renamed from: X.Uar  reason: case insensitive filesystem */
public final class C15341Uar extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C268594df {
    public static final String __redex_internal_original_name = "MultiProductPickerFragment";
    public int A00 = -1;
    public 1wn A01;
    public IgdsInlineSearchBox A02;
    public C17802VgF A03;
    public VWV A04;
    public C17870VhN A05;
    public C16581Uxb A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public RecyclerView A0B;
    public RecyclerView A0C;
    public IgSegmentedTabLayout A0D;
    public boolean A0E = true;
    public boolean A0F = true;
    public final C17961Viu A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N = C20701WxY.A01(this, 34);
    public final AnonymousClass0eM A0O = C20701WxY.A01(this, 35);
    public final AnonymousClass2Fj A0P = new 2Fk(C16498Uvu.PRODUCTS);
    public final G77 A0Q;
    public final X1Z A0R;
    public final C20924X4p A0S;
    public final C20925X4q A0T;
    public final C20848X1a A0U;
    public final X51 A0V;

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final boolean CPc() {
        return true;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final String getModuleName() {
        return "multi_product_search";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        view2.requireViewById(R.id.drag_handle).setVisibility(DbW.A01(requireArguments().getBoolean(C273654mx.A00(3345)) ? 1 : 0));
        this.A04 = new VWV(requireContext(), this, this.A0R, this.A0S, this.A0U);
        UB1 ub1 = new UB1(this, 16);
        RecyclerView A0F2 = DbZ.A0F(view2, R.id.products_recycler_view);
        A0F2.A15(ub1);
        VWV vwv = this.A04;
        if (vwv == null) {
            str = "productsAdapterWrapper";
        } else {
            A0F2.setAdapter(vwv.A00.A00);
            this.A0C = A0F2;
            AnonymousClass3AQ r1 = new AnonymousClass3AQ();
            r1.A00 = false;
            str = "productsRecyclerView";
            A0F2.setItemAnimator(r1);
            WWL wwl = new WWL(this, 10);
            C3251771i r10 = C3251771i.A0B;
            RecyclerView recyclerView = this.A0C;
            if (recyclerView != null) {
                C3251871j r7 = new C3251871j(recyclerView.A0D, wwl, r10, false, false);
                RecyclerView recyclerView2 = this.A0C;
                if (recyclerView2 != null) {
                    recyclerView2.A15(r7);
                    this.A03 = new C17802VgF(requireContext(), this, this.A0T);
                    RecyclerView A0F3 = DbZ.A0F(view2, R.id.collections_recycler_view);
                    A0F3.A15(ub1);
                    C17802VgF vgF = this.A03;
                    if (vgF == null) {
                        str = "collectionAdapterWrapper";
                    } else {
                        A0F3.setAdapter(vgF.A00);
                        this.A0B = A0F3;
                        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view2.findViewById(R.id.search_box);
                        igdsInlineSearchBox.A02 = this.A0Q;
                        igdsInlineSearchBox.setImeOptions(6);
                        igdsInlineSearchBox.setHint(2131972797);
                        this.A02 = igdsInlineSearchBox;
                        WBC.A00(view2.findViewById(R.id.done_button), 62, this);
                        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) view2.findViewById(R.id.search_type_tab);
                        if (!this.A0E) {
                            igSegmentedTabLayout.setVisibility(8);
                        } else {
                            igSegmentedTabLayout.setVisibility(0);
                            igSegmentedTabLayout.A02(new WBC(this, 63), new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131974926, false));
                            igSegmentedTabLayout.A02(new WBC(this, 64), new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131974923, false));
                        }
                        this.A0D = igSegmentedTabLayout;
                        C17870VhN vhN = new C17870VhN(view2, this.A0V);
                        AnonymousClass0eM r4 = this.A0J;
                        vhN.A00(((C14780U8q) r4.getValue()).A03);
                        this.A05 = vhN;
                        registerLifecycleListener((C230882qT) this.A0L.getValue());
                        2bu r2 = (2bu) this.A0K.getValue();
                        C16581Uxb uxb = this.A06;
                        str = "surface";
                        if (uxb != null) {
                            r2.Dh4(AnonymousClass7TF.A0w(str, uxb.A00));
                            DbV.A0J(this).A00(new MG4(this, (AnonymousClass4D7) null, 37));
                            View A0G2 = AnonymousClass7TF.A0G(view2, R.id.pin_products_cta);
                            0qQ.A07(A0G2.requireViewById(R.id.pin_product_button));
                            0qQ.A07(A0G2.requireViewById(R.id.pin_product_hint_text));
                            DbV.A1F(getViewLifecycleOwner(), ((C14780U8q) r4.getValue()).A01, new C20785Wyw(this, 1), 49);
                            DbV.A0J(this).A00(new MG4(this, (AnonymousClass4D7) null, 38));
                            DbV.A1F(getViewLifecycleOwner(), ((C14768U8e) this.A0H.getValue()).A00, new C20785Wyw(this, 2), 49);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final RecyclerView A00() {
        RecyclerView recyclerView;
        String str;
        Object A022 = this.A0P.A02();
        0qQ.A0A(A022);
        int ordinal = ((C16498Uvu) A022).ordinal();
        if (ordinal == 0) {
            recyclerView = this.A0C;
            if (recyclerView == null) {
                str = "productsRecyclerView";
            }
            return recyclerView;
        } else if (ordinal == 1) {
            recyclerView = this.A0B;
            if (recyclerView == null) {
                str = "collectionsRecyclerView";
            }
            return recyclerView;
        } else {
            throw new RuntimeException();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C16498Uvu uvu, C15341Uar uar) {
        String str;
        AnonymousClass2Fj r1 = uar.A0P;
        Object A022 = r1.A02();
        0qQ.A0A(A022);
        if (A022 != uvu) {
            r1.A0B(uvu);
            IgSegmentedTabLayout igSegmentedTabLayout = uar.A0D;
            if (igSegmentedTabLayout == null) {
                str = "tabLayout";
            } else {
                igSegmentedTabLayout.A01(uvu.ordinal(), true);
                RecyclerView recyclerView = uar.A0C;
                if (recyclerView == null) {
                    str = "productsRecyclerView";
                } else {
                    int i = 0;
                    int i2 = 8;
                    if (uvu == C16498Uvu.PRODUCTS) {
                        i2 = 0;
                    }
                    recyclerView.setVisibility(i2);
                    RecyclerView recyclerView2 = uar.A0B;
                    if (recyclerView2 == null) {
                        str = "collectionsRecyclerView";
                    } else {
                        if (uvu != C16498Uvu.COLLECTIONS) {
                            i = 8;
                        }
                        recyclerView2.setVisibility(i);
                        IgdsInlineSearchBox igdsInlineSearchBox = uar.A02;
                        if (igdsInlineSearchBox == null) {
                            str = "inlineSearchBox";
                        } else {
                            A02(uar, igdsInlineSearchBox.getSearchString());
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(C15341Uar uar, String str) {
        Object A022 = uar.A0P.A02();
        0qQ.A0A(A022);
        int ordinal = ((C16498Uvu) A022).ordinal();
        if (ordinal == 0) {
            C14780U8q A0X = C13990Tnq.A0X(uar);
            if (str == null) {
                str = "";
            }
            C58729Iwc iwc = new C58729Iwc(str, 2);
            C13991Tnr.A0y(A0X.A01, A0X.A02, iwc);
            C16230Uqt uqt = A0X.A04;
            uqt.A01 = str;
            uqt.A03(true);
        } else if (ordinal == 1) {
            C14768U8e u8e = (C14768U8e) uar.A0H.getValue();
            if (str == null) {
                str = "";
            }
            C58729Iwc iwc2 = new C58729Iwc(str, 1);
            C13991Tnr.A0y(u8e.A00, u8e.A01, iwc2);
            C16227Uqq uqq = u8e.A03;
            uqq.A01 = str;
            uqq.A03(true);
        } else {
            throw new RuntimeException();
        }
    }

    private final boolean A03() {
        C16659Uyv uyv;
        if (!C367088qA.A00(AnonymousClass7TE.A0l(this.A0M))) {
            ProductSource productSource = C13989Tnp.A0c(C13990Tnq.A0X(this).A01).A00;
            if (productSource != null) {
                uyv = productSource.A00;
            } else {
                uyv = null;
            }
            if (uyv == C16659Uyv.BRAND) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0M);
    }

    public C15341Uar() {
        C20701WxY wxY = new C20701WxY(this, 25);
        C20701WxY wxY2 = new C20701WxY(this, 28);
        0eO r8 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r8, new C20701WxY(wxY2, 29));
        this.A0J = new C227862kA(new C20701WxY(A002, 30), wxY, new C20613Wvu(32, A002, (Object) null), new 0Yh(C14780U8q.class));
        C20701WxY wxY3 = new C20701WxY(this, 23);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r8, new C20701WxY(new C20701WxY(this, 31), 32));
        this.A0H = new C227862kA(new C20701WxY(A003, 33), wxY3, new C20613Wvu(33, A003, (Object) null), new 0Yh(C14768U8e.class));
        this.A0I = C20701WxY.A01(this, 24);
        this.A0G = new C17961Viu();
        this.A0L = C20701WxY.A01(this, 27);
        this.A0K = C20701WxY.A01(this, 26);
        this.A0Q = new WY1(this, 3);
        this.A0V = new C19625Wco(this);
        this.A0U = new C19576Wc0(this, 1);
        this.A0R = new C19570Wbu(this, 1);
        this.A0S = new C19571Wbv(this);
        this.A0T = new C19575Wbz(this);
        this.A0M = C227642jf.A02(this);
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final int C8P() {
        return A00().getTop();
    }

    public final boolean isScrolledToTop() {
        RecyclerView A002 = A00();
        if (A002.getChildCount() == 0 || A002.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i != 1001) {
            return;
        }
        if (i2 == -1) {
            ProductSource A002 = W3U.A00(AnonymousClass7TE.A0l(this.A0M));
            C14780U8q A0X = C13990Tnq.A0X(this);
            if (A002 != null && (A002.A00 == C16659Uyv.CATALOG || !A002.equals(C13989Tnp.A0c(A0X.A01).A00))) {
                C20785Wyw wyw = new C20785Wyw(A002, 8);
                C13991Tnr.A0y(A0X.A01, A0X.A02, wyw);
                C16230Uqt uqt = A0X.A04;
                uqt.A02(A002);
                uqt.A01();
            }
            C17870VhN vhN = this.A05;
            if (vhN == null) {
                str = "productSourceRowController";
            } else {
                vhN.A00(A002);
                IgdsInlineSearchBox igdsInlineSearchBox = this.A02;
                if (igdsInlineSearchBox == null) {
                    str = "inlineSearchBox";
                } else {
                    igdsInlineSearchBox.A01();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else if (!A03()) {
            AnonymousClass7TF.A0D().post(new C20080Wke(this));
        }
    }

    public final boolean onBackPressed() {
        FragmentActivity requireActivity = requireActivity();
        Intent intent = new Intent();
        intent.putExtra(AnonymousClass000.A00(83), new MultiProductPickerResult((ProductCollectionFeedTaggingMeta) null, (ProductCollection) null, C13989Tnp.A0c(C13990Tnq.A0X(this).A01).A03, 0Yt.A0E()));
        requireActivity.setResult(-1, intent);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        C16581Uxb uxb;
        int A022 = AnonymousClass0fD.A02(-806703923);
        C15341Uar.super.onCreate(bundle);
        Set set = this.A0G.A00;
        set.add(C13990Tnq.A0Z(set, 37369682));
        02m.A0p.markerStart(37369682);
        this.A07 = C320236s2.A01(requireArguments(), "prior_module_name");
        this.A09 = requireArguments().getBoolean(C273654mx.A00(2131));
        this.A08 = C320236s2.A01(requireArguments(), "waterfall_id");
        this.A0E = requireArguments().getBoolean(C273654mx.A00(2909));
        this.A00 = requireArguments().getInt(C273654mx.A00(336));
        String string = requireArguments().getString("surface");
        if (string == null || (uxb = C16581Uxb.valueOf(string)) == null) {
            uxb = C16581Uxb.LIVE_BROADCAST_COMPOSER;
        }
        this.A06 = uxb;
        C14780U8q A0X = C13990Tnq.A0X(this);
        C58729Iwc iwc = new C58729Iwc("", 2);
        C13991Tnr.A0y(A0X.A01, A0X.A02, iwc);
        C16230Uqt uqt = A0X.A04;
        uqt.A01 = "";
        uqt.A03(true);
        this.A0P.A0B(C16498Uvu.PRODUCTS);
        ((W02) AnonymousClass7TE.A14(this.A0I)).A02();
        AnonymousClass0fD.A09(843290739, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(794483696);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.multi_product_picker, viewGroup, false);
        AnonymousClass0fD.A09(-2041393119, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1103081822);
        super.onDestroy();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A02;
        if (igdsInlineSearchBox == null) {
            0qQ.A0F("inlineSearchBox");
            throw AnonymousClass00P.createAndThrow();
        }
        igdsInlineSearchBox.A03();
        AnonymousClass0fD.A09(-1174480256, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-951364108);
        super.onDestroyView();
        this.A0F = true;
        unregisterLifecycleListener((C230882qT) this.A0L.getValue());
        AnonymousClass0fD.A09(1403202783, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1806960707);
        C15341Uar.super.onPause();
        this.A0G.A00();
        AnonymousClass0fD.A09(328479999, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1238210959);
        super.onResume();
        if (!A03() && this.A0F) {
            this.A0V.DZu();
        }
        this.A0F = false;
        AnonymousClass0fD.A09(597807443, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-445280947);
        C15341Uar.super.onStop();
        1wn r2 = this.A01;
        if (r2 != null) {
            DbX.A0R(this.A0M).A02(r2, WQI.class);
        }
        this.A0A = false;
        AnonymousClass0fD.A09(174817148, A022);
    }
}
