package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public abstract class UZ3 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BrandedContentSearchFragmentBase";
    public TextView A00;
    public RecyclerView A01;
    public IgdsInlineSearchBox A02;
    public C15475UdQ A03;
    public C17637VbT A04;
    public C14200Trf A05;
    public SpinnerImageView A06;
    public final X4Z A07 = new C14503TxP(this, 0);
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final int A09 = R.layout.branded_content_search_screen_general;

    public abstract X8a A0B();

    public abstract VWN A0C();

    public abstract String A0D();

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0G = DbU.A0G(view, R.id.description);
        0qQ.A0B(A0G, 0);
        this.A00 = A0G;
        SpinnerImageView A0k = DbX.A0k(view);
        0qQ.A0B(A0k, 0);
        this.A06 = A0k;
        RecyclerView A0K = DbX.A0K(view);
        0qQ.A0B(A0K, 0);
        this.A01 = A0K;
        A0K.setAdapter(A08());
        A09().A04();
        A08().A00();
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        0qQ.A0B(igdsInlineSearchBox, 0);
        this.A02 = igdsInlineSearchBox;
        A07().A02 = new WY1(this, 0);
    }

    public int A04() {
        return this.A09;
    }

    public final TextView A05() {
        TextView textView = this.A00;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F(DevServerEntity.COLUMN_DESCRIPTION);
        throw AnonymousClass00P.createAndThrow();
    }

    public final UserSession A06() {
        return AnonymousClass7TE.A0l(this.A08);
    }

    public final IgdsInlineSearchBox A07() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A02;
        if (igdsInlineSearchBox != null) {
            return igdsInlineSearchBox;
        }
        0qQ.A0F("inlineSearchBox");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C15475UdQ A08() {
        C15475UdQ udQ = this.A03;
        if (udQ != null) {
            return udQ;
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final C14200Trf A09() {
        C14200Trf trf = this.A05;
        if (trf != null) {
            return trf;
        }
        0qQ.A0F("dataSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final SpinnerImageView A0A() {
        SpinnerImageView spinnerImageView = this.A06;
        if (spinnerImageView != null) {
            return spinnerImageView;
        }
        0qQ.A0F("spinner");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A08);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(177371314);
        UZ3.super.onCreate(bundle);
        VMF vmf = new VMF(this);
        VMG vmg = new VMG(this);
        AnonymousClass7g1 r6 = new AnonymousClass7g1();
        C14156Tqs tqs = new C14156Tqs(this, 0);
        this.A04 = new C17637VbT(vmf, vmg, AnonymousClass7TE.A0l(this.A08), this, r6);
        X4Z x4z = this.A07;
        this.A05 = new C14200Trf(C18405Vr7.A00, x4z, tqs, A0B(), r6, 0, false);
        Context requireContext = requireContext();
        C14200Trf A092 = A09();
        A06();
        this.A03 = new C15475UdQ(requireContext, A092, x4z, tqs, A0C(), C19708WeA.A00);
        AnonymousClass0fD.A09(-1579833457, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2011174856);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, A04(), false);
        AnonymousClass0fD.A09(-1101631152, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(28730702);
        super.onDestroy();
        C17637VbT vbT = this.A04;
        if (vbT == null) {
            0qQ.A0F("searchRequestController");
            throw AnonymousClass00P.createAndThrow();
        }
        vbT.A02.onDestroy();
        AnonymousClass0fD.A09(-453522602, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1049095130);
        super.onDestroyView();
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setLayoutManager((C252553pI) null);
            recyclerView.setAdapter((2Rw) null);
        }
        AnonymousClass0fD.A09(-1761251386, A022);
    }
}
