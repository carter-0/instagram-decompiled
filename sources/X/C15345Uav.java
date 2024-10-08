package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.Uav  reason: case insensitive filesystem */
public final class C15345Uav extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, AnonymousClass4DS, XCB {
    public static final String __redex_internal_original_name = "FeaturedProductSingleMediaViewerFragment";
    public 1Xj A00;
    public AnonymousClass3AD A01;
    public RecyclerView A02;
    public RefreshableNestedScrollingParent A03;
    public final 2el A04 = 2el.A00();
    public final C228172ku A05 = new C228172ku();
    public final AnonymousClass0eM A06 = C20693WxP.A00(this, 28);
    public final AnonymousClass0eM A07 = C20693WxP.A00(this, 29);
    public final AnonymousClass0eM A08 = C20693WxP.A00(this, 30);
    public final AnonymousClass0eM A09 = C20693WxP.A00(this, 31);
    public final AnonymousClass0eM A0A = C20693WxP.A00(this, 32);
    public final AnonymousClass0eM A0B = C20693WxP.A00(this, 33);
    public final AnonymousClass0eM A0C = C20693WxP.A00(this, 34);
    public final AnonymousClass0eM A0D = C20693WxP.A00(this, 35);
    public final AnonymousClass0eM A0E = C20693WxP.A00(this, 36);
    public final AnonymousClass0eM A0F = C20693WxP.A00(this, 37);
    public final AnonymousClass0eM A0G = C227642jf.A02(this);
    public final AnonymousClass0eM A0H = C20693WxP.A00(this, 38);
    public final AnonymousClass0eM A0I = C20693WxP.A00(this, 39);
    public final AnonymousClass0eM A0J = C20693WxP.A00(this, 40);

    public final void configureActionBar(2da r5) {
        int i;
        0qQ.A0B(r5, 0);
        r5.Eu4(true);
        1Xj r0 = this.A00;
        if (r0 != null) {
            int ordinal = r0.BR7().ordinal();
            if (ordinal == 0) {
                i = 2131969399;
            } else if (ordinal == 1) {
                i = 2131976403;
            } else if (ordinal != 4) {
                r5.setTitle("");
                return;
            } else {
                i = 2131969659;
            }
            r5.Eom(i);
        }
    }

    public final String getModuleName() {
        return "instagram_shopping_single_media_viewer";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A03;
        String str = "refreshableContainer";
        if (refreshableNestedScrollingParent != null) {
            C13990Tnq.A1O(refreshableNestedScrollingParent);
            AnonymousClass0eM r3 = this.A0G;
            this.A01 = C3253672c.A01(view, AnonymousClass7TE.A0l(r3), new C19760Wf1(this, 5));
            RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A03;
            if (refreshableNestedScrollingParent2 != null) {
                RecyclerView A0F2 = DbZ.A0F(refreshableNestedScrollingParent2, 16908298);
                this.A02 = A0F2;
                str = "recyclerView";
                if (A0F2 != null) {
                    A0F2.A15(this.A05);
                    Dba.A17(A0F2, this.A06);
                    A0F2.setItemAnimator((AnonymousClass3AS) null);
                    DbU.A15(requireContext(), A0F2, 1, false);
                    A0F2.A15((C249403jg) this.A08.getValue());
                    if (getScrollingViewProxy() instanceof C238143As) {
                        boolean A1a = C13991Tnr.A1a(r3);
                        C238133Ar scrollingViewProxy = getScrollingViewProxy();
                        0qQ.A0C(scrollingViewProxy, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
                        C238143As r32 = (C238143As) scrollingViewProxy;
                        if (A1a) {
                            AnonymousClass3AD r2 = this.A01;
                            if (r2 == null) {
                                0qQ.A0F("pullToRefresh");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C18948WEb.A00(r32, (C19763Wf4) r2, r2, this, 2);
                        } else {
                            r32.ErF(new C20071WkV(this));
                        }
                    }
                    2el r33 = this.A04;
                    AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                    RecyclerView recyclerView = this.A02;
                    if (recyclerView != null) {
                        r33.A08(recyclerView, A002, new AnonymousClass2eo[0]);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void AAk(Object obj) {
        0eP r2 = (0eP) obj;
        0qQ.A0B(r2, 0);
        ((C18558VuA) this.A0J.getValue()).A01(r2);
    }

    public final /* bridge */ /* synthetic */ void AAl(Object obj, Object obj2) {
        ((C18558VuA) this.A0J.getValue()).A01((0eP) obj);
    }

    public final void DgE(C42130BIj bIj) {
        ProductDetailsProductItemDict productDetailsProductItemDict = bIj.A01;
        if (productDetailsProductItemDict != null) {
            FragmentActivity requireActivity = requireActivity();
            Product A002 = C14502TxO.A00(productDetailsProductItemDict);
            WNN.A01(C249713kF.A00.A0L(requireActivity, AnonymousClass7TE.A0l(this.A0G), this, A002, AnonymousClass000.A00(1349), DbS.A0t(this.A0H)));
        }
    }

    public final /* bridge */ /* synthetic */ void ECF(View view, Object obj) {
        0eP r6 = (0eP) obj;
        0qQ.A0B(r6, 1);
        C18558VuA vuA = (C18558VuA) this.A0J.getValue();
        View view2 = this.mView;
        JTQ.A1K(view2);
        C13988Tno.A14(view2, vuA.A00, vuA.A01, C18558VuA.A00(r6));
    }

    public final C238133Ar getScrollingViewProxy() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar A002 = C238103Ao.A00(recyclerView);
        0qQ.A07(A002);
        return A002;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-257444026);
        C15345Uav.super.onCreate(bundle);
        C13990Tnq.A1D(this, this.A0D);
        C13990Tnq.A1E(this, this.A0C);
        registerLifecycleListener((AnonymousClass332) this.A08.getValue());
        ((C17886Vhd) this.A0I.getValue()).A00(DbS.A0t(this.A0B));
        ((C19610WcZ) this.A07.getValue()).FKG();
        AnonymousClass0fD.A09(-1162806952, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A0F2;
        View view;
        int A022 = AnonymousClass0fD.A02(-1238795172);
        0qQ.A0B(layoutInflater, 0);
        if (C13991Tnr.A1a(this.A0G)) {
            A0F2 = layoutInflater.inflate(R.layout.layout_media_feed_swipe_refreshable, viewGroup, false);
            view = A0F2.findViewById(R.id.refreshable_container);
        } else {
            A0F2 = C13990Tnq.A0F(layoutInflater, viewGroup, R.layout.layout_media_feed_refreshable);
            view = A0F2;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        0qQ.A0A(A0F2);
        AnonymousClass0fD.A09(949238481, A022);
        return A0F2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(758312692);
        super.onDestroy();
        C13990Tnq.A1F(this, this.A0D);
        C13990Tnq.A1G(this, this.A0C);
        unregisterLifecycleListener((AnonymousClass332) this.A08.getValue());
        AnonymousClass0fD.A09(-475680993, A022);
    }
}
