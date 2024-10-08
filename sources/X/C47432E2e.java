package X;

import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.E2e  reason: case insensitive filesystem */
public final class C47432E2e extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ContentLanguageSettingsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final 0xG A02 = DbS.A0O("content_language");

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131956613);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2YL A0H = DbS.A0H(this.A01);
        C318136oS A002 = C318116oQ.A00(A0H);
        C66168MGf mGf = new C66168MGf(A0H, (AnonymousClass4D7) null, 21);
        19B r2 = 19B.A00;
        1Eo.A05(r2, mGf, A002);
        C46811Dln dln = new C46811Dln(new C49400Ev2(this));
        dln.setHasStableIds(true);
        ColorFilter A003 = AnonymousClass37O.A00(Dbb.A05(this));
        SearchEditText searchEditText = (SearchEditText) view.findViewById(R.id.search);
        AnonymousClass7TG.A10(A003, searchEditText.getCompoundDrawablesRelative()[0]);
        searchEditText.setClearButtonColorFilter(A003);
        DbS.A1C(searchEditText);
        searchEditText.A0C = new C51004Fmr(this, 5);
        RecyclerView A0F = DbZ.A0F(view, R.id.language_locale_list);
        A0F.setAdapter(dln);
        DbU.A15(requireContext(), A0F, 1, false);
        A0F.A0S = true;
        View A0G = AnonymousClass7TF.A0G(view, R.id.content_language_error_message);
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r2, new C66177MGo(dln, viewLifecycleOwner, this, r9, A0G, (AnonymousClass4D7) null, 3), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A02.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C47432E2e() {
        C46573DhF dhF = new C46573DhF(this, 21);
        AnonymousClass0eM A002 = C46573DhF.A00(new C46573DhF(this, 18), 0eO.A02, 19);
        this.A01 = DbS.A0I(new C46573DhF(A002, 20), dhF, new C20613Wvu(1, A002, (Object) null), DbS.A0z(C60092JfY.class));
        this.A00 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1370411230);
        requireArguments();
        C47432E2e.super.onCreate(bundle);
        AnonymousClass0fD.A09(1567612148, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(431336243);
        View A0D = DbT.A0D(LayoutInflater.from(getContext()), viewGroup, R.layout.language_locale_menu, false);
        AnonymousClass0fD.A09(1739195892, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1674091534);
        C47432E2e.super.onPause();
        0nA.A0N(requireView());
        AnonymousClass0fD.A09(-857516506, A022);
    }
}
