package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Uai  reason: case insensitive filesystem */
public final class C15333Uai extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final /* synthetic */ AnonymousClass0YZ[] A0E;
    public static final String __redex_internal_original_name = "ShoppingShopManagementEditFragment";
    public final C19576Wc0 A00 = new C19576Wc0(this, 3);
    public final C319956rV A01;
    public final C319956rV A02;
    public final X1Z A03 = new C19570Wbu(this, 3);
    public final C20924X4p A04 = new C19573Wbx(this);
    public final VPC A05 = new VPC(this);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final C249403jg A0C = new UB1(this, 21);
    public final G77 A0D = new WY1(this, 6);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131961509);
        AnonymousClass3JR r2 = new AnonymousClass3JR();
        r2.A0K = getString(2131960992);
        DbX.A19(new WBC(this, 70), r2, r4);
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(3976);
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
        C319956rV r2 = this.A02;
        AnonymousClass0YZ[] r5 = A0E;
        ((RecyclerView) r2.A03(this, r5[1])).A15(this.A0C);
        ((RecyclerView) r2.A03(this, r5[1])).setAdapter(((VTW) this.A08.getValue()).A01);
        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
        r0.A00 = false;
        ((RecyclerView) r2.A03(this, r5[1])).setItemAnimator(r0);
        C319956rV r3 = this.A01;
        ((IgdsInlineSearchBox) r3.A03(this, r5[0])).A02 = this.A0D;
        ((IgdsInlineSearchBox) r3.A03(this, r5[0])).setImeOptions(6);
        ((RecyclerView) r2.A03(this, r5[1])).A15(new C3251871j(((RecyclerView) r2.A03(this, r5[1])).A0D, new WWL(this, 12), C3251771i.A0B, false, false));
        DbV.A0J(this).A00(new MG4(this, (AnonymousClass4D7) null, 40));
        AnonymousClass0eM r52 = this.A0A;
        ((C14781U8r) r52.getValue()).A01.A06(getViewLifecycleOwner(), new WEB(this, 4));
        C14781U8r u8r = (C14781U8r) r52.getValue();
        C14781U8r.A00(u8r, new C58729Iwc("", 3));
        C16228Uqr uqr = u8r.A03;
        uqr.A01 = "";
        uqr.A03(true);
    }

    static {
        Class<C15333Uai> cls = C15333Uai.class;
        A0E = new AnonymousClass0YZ[]{new 01B(cls, "inlineSearchBox", "getInlineSearchBox()Lcom/instagram/igds/components/search/IgdsInlineSearchBox;", 0), new 01B(cls, "productRecyclerView", "getProductRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.Dde, X.6rV] */
    /* JADX WARNING: type inference failed for: r0v24, types: [X.Dde, X.6rV] */
    public C15333Uai() {
        C20689WxL wxL = new C20689WxL(this, 27);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20689WxL(new C20689WxL(this, 24), 25));
        this.A0A = new C227862kA(new C20689WxL(A002, 26), wxL, new C20613Wvu(36, A002, (Object) null), new 0Yh(C14781U8r.class));
        this.A0B = AnonymousClass1YB.A00(new C20689WxL(this, 28));
        this.A07 = AnonymousClass1YB.A00(new C20689WxL(this, 22));
        this.A06 = AnonymousClass1YB.A00(new C20689WxL(this, 21));
        this.A08 = AnonymousClass1YB.A00(new C20689WxL(this, 23));
        this.A01 = new C46362Dde(this, new MJ3(R.id.search_box, 12, this));
        this.A02 = new C46362Dde(this, new MJ3(R.id.products_recycler_view, 12, this));
        this.A09 = C227642jf.A02(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10 && i2 == 1002) {
            C14781U8r u8r = (C14781U8r) this.A0A.getValue();
            C16228Uqr uqr = u8r.A03;
            uqr.A01();
            Object A022 = u8r.A01.A02();
            0qQ.A0A(A022);
            String str = ((C53382GnE) A022).A03;
            0qQ.A0B(str, 0);
            C14781U8r.A00(u8r, new C58729Iwc(str, 3));
            uqr.A01 = str;
            uqr.A03(true);
            C14781U8r.A00(u8r, C20761WyY.A00);
            requireActivity().setResult(1002);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1819194717);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.shop_management_edit_fragment, false);
        AnonymousClass0fD.A09(-779510713, A022);
        return A0D2;
    }
}
