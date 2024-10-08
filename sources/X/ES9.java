package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class ES9 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AvatarOptionsFragment";
    public C48126EWs A00;
    public C70782OLc A01;
    public String A02;
    public TextView A03;
    public boolean A04;
    public final C267624bv A05 = new C50195FTb(this, 7);
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131953497);
        this.A03 = r2.C7y();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A07;
        2YL A0H = DbS.A0H(r4);
        C318136oS A002 = C318116oQ.A00(A0H);
        C66168MGf mGf = new C66168MGf(A0H, (AnonymousClass4D7) null, 18);
        19B r1 = 19B.A00;
        1Eo.A05(r1, mGf, A002);
        2YL A0H2 = DbS.A0H(r4);
        1Eo.A05(r1, new MG4(A0H2, (AnonymousClass4D7) null, 16), C318116oQ.A00(A0H2));
        07U r42 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r1, new MH5(r42, this, viewLifecycleOwner, (AnonymousClass4D7) null, 46), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r1, new MH5(r42, this, viewLifecycleOwner2, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner2));
        AnonymousClass07Z viewLifecycleOwner3 = getViewLifecycleOwner();
        1Eo.A05(r1, new MH5(r42, this, viewLifecycleOwner3, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner3));
    }

    public static final void A06(ES9 es9) {
        C48126EWs eWs;
        String str = es9.A02;
        if (str != null && (eWs = es9.A00) != null && !es9.A04) {
            0qQ.A0A(eWs);
            ArrayList A1C = AnonymousClass7TE.A1C();
            FGF fgf = new FGF((CharSequence) es9.requireContext().getString(2131953485));
            fgf.A01 = R.style.igds_emphasized_body_1;
            C70782OLc oLc = new C70782OLc(es9.requireActivity(), es9.requireContext(), es9.A05, AnonymousClass7TE.A0l(es9.A06), str);
            es9.A01 = oLc;
            A1C.add(fgf);
            A1C.add(oLc);
            DbV.A1W(A1C, true);
            FGF fgf2 = new FGF((CharSequence) es9.requireContext().getString(2131953481));
            fgf2.A01 = R.style.igds_emphasized_body_1;
            fgf2.A03 = R.dimen.accent_edge_thickness;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            String str2 = "EVERYONE";
            DbV.A1V(str2, es9.requireContext().getString(2131953480), A1C2);
            DbV.A1V("PEOPLE_YOU_FOLLOW", es9.requireContext().getString(2131953483), A1C2);
            DbV.A1V("NO_ONE", es9.requireContext().getString(2131953482), A1C2);
            int ordinal = eWs.ordinal();
            if (ordinal == 2) {
                str2 = "NO_ONE";
            } else if (ordinal == 3 || ordinal != 1) {
                str2 = "PEOPLE_YOU_FOLLOW";
            }
            A1C.add(fgf2);
            DbU.A1F(new FQV(1, es9, A1C2), str2, A1C, A1C2);
            A1C.add(new FGF((CharSequence) es9.requireContext().getString(2131953479)));
            es9.setItems(A1C);
            RecyclerView recyclerView = es9.getRecyclerView();
            String A002 = AnonymousClass000.A00(0);
            0qQ.A0C(recyclerView, A002);
            TextView textView = es9.A03;
            0qQ.A0C(textView, A002);
            03v.A0B(recyclerView, new U7M(textView, 10));
            es9.A04 = true;
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public ES9() {
        C13998To0 to0 = new C13998To0(this, 38);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13998To0(new C13998To0(this, 35), 36));
        this.A07 = DbS.A0I(new C13998To0(A002, 37), to0, new C58691Iw0(44, (Object) null, A002), DbS.A0z(C60191JhA.class));
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1599482342);
        super.onDestroyView();
        this.A03 = null;
        AnonymousClass0fD.A09(914419207, A022);
    }
}
