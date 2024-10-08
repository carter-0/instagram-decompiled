package X;

import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.E2d  reason: case insensitive filesystem */
public final class C47431E2d extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AppLanguageSettingsFragment";
    public final 0xG A00 = DbS.A0O("language");
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131952963);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ColorFilter A002 = AnonymousClass37O.A00(Dbb.A05(this));
        SearchEditText searchEditText = (SearchEditText) view.findViewById(R.id.search);
        AnonymousClass7TG.A10(A002, searchEditText.getCompoundDrawablesRelative()[0]);
        searchEditText.setClearButtonColorFilter(A002);
        DbS.A1C(searchEditText);
        searchEditText.A0C = new C51004Fmr(this, 4);
        C46812Dlo dlo = new C46812Dlo(new C50936FlP(this));
        dlo.setHasStableIds(true);
        RecyclerView A0F = DbZ.A0F(view, R.id.language_locale_list);
        A0F.setAdapter(dlo);
        DbU.A15(requireContext(), A0F, 1, false);
        A0F.A0S = true;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, r3, dlo, this, (AnonymousClass4D7) null, 26), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A00.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C47431E2d() {
        C46573DhF dhF = new C46573DhF(this, 17);
        AnonymousClass0eM A002 = C46573DhF.A00(new C46573DhF(this, 14), 0eO.A02, 15);
        this.A02 = DbS.A0I(new C46573DhF(A002, 16), dhF, new C20613Wvu(0, A002, (Object) null), DbS.A0z(C46731DkK.class));
        this.A01 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(220689989);
        requireArguments();
        C47431E2d.super.onCreate(bundle);
        AnonymousClass0fD.A09(-91974025, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(46268170);
        View A0D = DbT.A0D(LayoutInflater.from(getContext()), viewGroup, R.layout.language_locale_menu, false);
        AnonymousClass0fD.A09(-195821257, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(992423658);
        C47431E2d.super.onPause();
        0nA.A0N(requireView());
        AnonymousClass0fD.A09(-1918568065, A022);
    }
}
