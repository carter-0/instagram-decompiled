package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.E2j  reason: case insensitive filesystem */
public final class C47437E2j extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SuggestedBlocksFragment";
    public RecyclerView A00;
    public AnonymousClass2t9 A01;
    public IgdsBottomButtonLayout A02;
    public SpinnerImageView A03;
    public C49918FEs A04;
    public FAI A05;
    public final View.OnClickListener A06 = FP4.A00(this, 46);
    public final C47696EDf A07 = new C47696EDf(this, 48);
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final View.OnClickListener A09 = FP4.A00(this, 45);
    public final F34 A0A = new F34(this);
    public final G8B A0B = new C51051Fnh(this, 5);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131974669);
    }

    public final String getModuleName() {
        return "suggested_blocks_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (SpinnerImageView) view.requireViewById(R.id.suggested_blocks_loading_spinner);
        RecyclerView A0I = DbT.A0I(view, R.id.suggested_blocks_list_recyclerview);
        this.A00 = A0I;
        if (A0I != null) {
            DbU.A15(requireContext(), A0I, 1, false);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A01);
        }
        IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.suggested_blocks_block_all_button_view);
        this.A02 = A0c;
        if (A0c != null) {
            A0c.setPrimaryActionOnClickListener(this.A09);
        }
        AnonymousClass7TH.A0R(this.A02);
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView != null) {
            DbS.A1T(spinnerImageView);
        }
        SpinnerImageView spinnerImageView2 = this.A03;
        if (spinnerImageView2 != null) {
            AnonymousClass0fU.A00((View.OnClickListener) null, spinnerImageView2);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1889706709);
        C47437E2j.super.onCreate(bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r5 = this.A08;
        C49665F0x f0x = new C49665F0x(requireContext, this, EZZ.SUGGESTED_BLOCKS, this, AnonymousClass7TE.A0l(r5), this.A0B, "suggested_blocks_list_user_row", "suggested_blocks_accounts_list", "suggested_blocks_accounts_list");
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new Object());
        this.A01 = DbU.A0U(A0S, new EGE(requireContext(), this, f0x));
        C49918FEs fEs = new C49918FEs(requireContext(), this, AnonymousClass7TE.A0l(r5), this.A0A);
        this.A04 = fEs;
        fEs.A02();
        AnonymousClass0fD.A09(16716229, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1141484674);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.suggested_blocks_fragment, false);
        AnonymousClass0fD.A09(-1157226582, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(639509479);
        C47437E2j.super.onPause();
        C49918FEs fEs = this.A04;
        if (fEs != null) {
            fEs.A09.A00 = null;
        }
        AnonymousClass0fD.A09(-1864911703, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1028821955);
        super.onResume();
        C49918FEs fEs = this.A04;
        if (fEs != null) {
            FAI fai = fEs.A09;
            C49416EvI evI = fEs.A08;
            0qQ.A0B(evI, 0);
            fai.A00 = evI;
            F34 f34 = fEs.A0A;
            f34.A00(fEs.A00);
            if (fEs.A00 == 1) {
                f34.A01(C49918FEs.A00(fEs, DbU.A0K(fai.A01)));
            }
        }
        AnonymousClass0fD.A09(-1544359390, A022);
    }
}
