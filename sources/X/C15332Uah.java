package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Uah  reason: case insensitive filesystem */
public final class C15332Uah extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ProductCollectionPickerFragment";
    public final AnonymousClass0eM A00 = C20701WxY.A01(this, 18);
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969800);
    }

    public final String getModuleName() {
        return "product_collection_picker";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass3AR r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AnonymousClass7TE.A0b(view, R.id.search_box);
        igdsInlineSearchBox.A02 = new WY1(this, 2);
        igdsInlineSearchBox.setImeOptions(6);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.recycler_view);
        AnonymousClass3AS r12 = recyclerView.A0C;
        if ((r12 instanceof AnonymousClass3AR) && (r1 = (AnonymousClass3AR) r12) != null) {
            r1.A00 = false;
        }
        recyclerView.setAdapter(((C17802VgF) this.A00.getValue()).A00);
        UB1.A00(recyclerView, igdsInlineSearchBox, 15);
        JTQ.A0y(recyclerView.A0D, recyclerView, new WWL(this, 9), C3251771i.A0B);
        DbV.A0J(this).A00(new MG4(this, (AnonymousClass4D7) null, 36));
        ((C14768U8e) this.A02.getValue()).A00.A06(getViewLifecycleOwner(), new WEB(this, 2));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C15332Uah() {
        C20701WxY wxY = new C20701WxY(this, 22);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20701WxY(new C20701WxY(this, 19), 20));
        this.A02 = new C227862kA(new C20701WxY(A002, 21), wxY, new C20613Wvu(31, A002, (Object) null), new 0Yh(C14768U8e.class));
        this.A01 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-406415292);
        C15332Uah.super.onCreate(bundle);
        C14768U8e u8e = (C14768U8e) this.A02.getValue();
        C58729Iwc iwc = new C58729Iwc("", 1);
        C13991Tnr.A0y(u8e.A00, u8e.A01, iwc);
        C16227Uqq uqq = u8e.A03;
        uqq.A01 = "";
        uqq.A03(true);
        AnonymousClass0fD.A09(1280491710, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(79875888);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.product_collection_picker_fragment, false);
        AnonymousClass0fD.A09(2110840149, A022);
        return A0D;
    }
}
