package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.Serializable;

/* renamed from: X.E2s  reason: case insensitive filesystem */
public final class C47446E2s extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiAgentPickerFragment";
    public C47175Drq A00;
    public final AnonymousClass0eM A01 = Dbl.A00(this, 45);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = DbW.A0p(this, 0);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (requireArguments().getBoolean("ai_agent_picker_is_modal", false)) {
            Dbc.A0k(r4);
        }
        AnonymousClass9B8.A00(DbW.A0S(this.A02, 0));
        DbW.A1C(r4, "");
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(1275);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View findViewById = view2.findViewById(R.id.ai_agent_picker_title);
        View findViewById2 = view2.findViewById(R.id.ai_agent_picker_subtitle);
        View findViewById3 = view2.findViewById(R.id.ai_agent_picker_bottom_button_layout);
        RecyclerView A0F = DbZ.A0F(view2, R.id.ai_agent_category_picker);
        DbV.A1A(requireContext(), A0F);
        AnonymousClass2t9 A0U = DbU.A0U(DbV.A0S(this), new C47780EGr(new C74193PqZ(this, 0)));
        A0F.setItemAnimator((AnonymousClass3AS) null);
        A0F.setAdapter(A0U);
        RecyclerView A0F2 = DbZ.A0F(view2, R.id.ai_agent_picker_grid);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
        A0F2.setLayoutManager(gridLayoutManager);
        A0F2.A0S = true;
        A0F2.setItemAnimator((AnonymousClass3AS) null);
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new C61656KGg(this, new MP9(this, 48)));
        AnonymousClass2t9 A0U2 = DbU.A0U(A0S, new EH3(this, new MP9(this, 49)));
        A0F2.setAdapter(A0U2);
        07U r10 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MGT(viewLifecycleOwner, findViewById2, this, findViewById, gridLayoutManager, r10, A0U2, findViewById3, A0U, (AnonymousClass4D7) null, 3), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass9BB r3 = ((C46793DlS) this.A03.getValue()).A02;
        if (r3.A00() == AnonymousClass05K.A0N) {
            0xY AR4 = ((AnonymousClass9BC) r3.A02.getValue()).A00.AR4();
            AR4.E5T("picker_viewed_after_eligible", true);
            AR4.apply();
        }
    }

    public static final C69503Nml A00(C47446E2s e2s) {
        Serializable serializable;
        Bundle bundle = e2s.mArguments;
        if (bundle != null) {
            serializable = bundle.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        } else {
            serializable = null;
        }
        if (serializable instanceof C69503Nml) {
            return (C69503Nml) serializable;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C47446E2s() {
        Dbl dbl = new Dbl(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new Dbl(new Dbl(this, 46), 47));
        this.A03 = DbS.A0I(new Dbl(A002, 48), dbl, new C73664Phd(19, A002, (Object) null), DbS.A0z(C46793DlS.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 928483 && intent != null && intent.getBooleanExtra(AnonymousClass000.A00(2237), false)) {
            DbX.A1I(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-257570632);
        C47446E2s.super.onCreate(bundle);
        this.mLifecycleRegistry.A09((C46793DlS) this.A03.getValue());
        AnonymousClass0fD.A09(1901571182, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(545812301);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_picker, false);
        AnonymousClass0fD.A09(-470690901, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1894971729);
        super.onDestroy();
        C67089Mi7.A00(AnonymousClass7TE.A0l(this.A02), AnonymousClass7TE.A0u()).A03();
        AnonymousClass0fD.A09(-1360944790, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1508288443);
        super.onResume();
        C67210Mk6 mk6 = C67089Mi7.A00(AnonymousClass7TE.A0l(this.A02), AnonymousClass7TE.A0u()).A03;
        if (mk6 != null) {
            mk6.A08();
        }
        AnonymousClass0fD.A09(1976167221, A022);
    }
}
