package X;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class E7U extends MYR implements AnonymousClass4DR, AnonymousClass4DS, C252213ok {
    public static final String __redex_internal_original_name = "PartialContactImportSelectionFragment";
    public int A00;
    public IgLinearLayout A01;
    public C311496cm A02;
    public C46768Dkv A03;
    public C51950G8t A04;
    public C50915Fku A05;
    public ProgressButton A06;
    public SearchEditText A07;
    public SpinnerImageView A08;
    public String A09;
    public Map A0A = 0Yt.A0E();
    public AnonymousClass3E6 A0B;
    public final ArrayList A0C = AnonymousClass7TE.A1C();
    public final HashSet A0D = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A0E = C227642jf.A02(this);

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131969150);
        if (182.A06(0Tu.A06, DbT.A0X(this.A0E), 2342165337182775374L)) {
            r5.ErE(FP5.A00(this, 47), 2131973916);
        }
    }

    public final String getModuleName() {
        return "partial_ci_selection";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String A10;
        String str2;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ArrayList arrayList = this.A0C;
        arrayList.add(new FY0(new C49319Eta(this)));
        AnonymousClass0eM r3 = this.A0E;
        LinkedHashMap A022 = FFE.A02(requireContext(), new FGL(this, this, AnonymousClass7TE.A0l(r3), (C51950G8t) null, (C49498Ewd) null).A02, false, false);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0s = AnonymousClass7TF.A0s(A022);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (!(((F0B) A1J.getValue()).A04.isEmpty() || (str2 = ((F0B) A1J.getValue()).A00) == null || str2.length() == 0)) {
                Dbb.A1V(A1J, A1H);
            }
        }
        this.A0A = A1H;
        Character ch = null;
        for (F0B f0b : 00k.A0g(A1H.values(), new C51566FwC((0sL) MPE.A00, 0))) {
            String str3 = f0b.A00;
            if (!(str3 == null || str3.length() == 0)) {
                List list = f0b.A04;
                ArrayList A15 = DbV.A15(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A15.add(PhoneNumberUtils.formatNumber(AnonymousClass7TE.A18(it), AnonymousClass1Q2.A02().getCountry()));
                }
                List list2 = f0b.A03;
                if (list2.size() > 0) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append(A15);
                    A1A.append(10);
                    A10 = AnonymousClass7TF.A0i(list2, A1A);
                } else {
                    A10 = DbT.A10(A15);
                }
                C47240DtR dtR = new C47240DtR(new C49457Evy(f0b, this), str3, 00p.A0g(00p.A0g(A10, "[", "", false), "]", "", false));
                char upperCase = (char) Character.toUpperCase(str3.codePointAt(0));
                if (ch == null || upperCase != ch.charValue()) {
                    arrayList.add(new C47230DtH(upperCase));
                    ch = Character.valueOf(upperCase);
                }
                arrayList.add(dtR);
            }
        }
        getRecyclerView().setItemAnimator((AnonymousClass3AS) null);
        C46864Dmg.A00(getRecyclerView(), this, 2);
        this.A01 = (IgLinearLayout) view2.requireViewById(R.id.footer_container);
        this.A08 = DbX.A0k(view2);
        A0B(arrayList);
        ProgressButton progressButton = (ProgressButton) view2.requireViewById(R.id.sync_contacts_button);
        this.A06 = progressButton;
        if (progressButton != null) {
            progressButton.setEnabled(false);
        }
        ProgressButton progressButton2 = this.A06;
        if (progressButton2 != null) {
            progressButton2.setText((CharSequence) DbV.A05(this).getString(2131969151));
        }
        boolean A062 = 182.A06(0Tu.A06, DbT.A0X(r3), 2342165337182775374L);
        String str4 = this.A09;
        if (A062) {
            str = "skip_on_top";
        } else {
            str = "skip_on_botttom";
        }
        String A0T = 002.A0T(str4, str, '_');
        ProgressButton progressButton3 = this.A06;
        if (progressButton3 != null) {
            AnonymousClass0fU.A00(new C50101FOr(A0T, (Object) this, 1), progressButton3);
        }
        View A0G = AnonymousClass7TF.A0G(view2, R.id.skip_button);
        if (A062) {
            A0G.setVisibility(8);
        } else {
            AnonymousClass0fU.A00(new C50101FOr(A0T, (Object) this, 2), A0G);
        }
        SearchEditText searchEditText = (SearchEditText) AnonymousClass7TF.A0G(view2, R.id.partial_ci_search_bar).requireViewById(R.id.action_bar_search_edit_text);
        this.A07 = searchEditText;
        String str5 = "searchEditText";
        if (searchEditText != null) {
            FPM.A00(searchEditText, 2, this);
            C50915Fku fku = this.A05;
            if (fku == null) {
                str5 = "searchBarController";
            } else {
                SearchEditText searchEditText2 = this.A07;
                if (searchEditText2 != null) {
                    fku.A00(searchEditText2, true);
                    return;
                }
            }
        }
        0qQ.A0F(str5);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(E7U e7u) {
        if (e7u.A00 >= 3) {
            ProgressButton progressButton = e7u.A06;
            if (progressButton != null) {
                progressButton.setText((CharSequence) AnonymousClass7TF.A0e(DbV.A05(e7u), Integer.valueOf(e7u.A00), 2131969152));
            }
            ProgressButton progressButton2 = e7u.A06;
            if (progressButton2 != null) {
                progressButton2.setEnabled(true);
                return;
            }
            return;
        }
        ProgressButton progressButton3 = e7u.A06;
        if (progressButton3 != null) {
            progressButton3.setEnabled(false);
        }
        ProgressButton progressButton4 = e7u.A06;
        if (progressButton4 != null) {
            progressButton4.setText((CharSequence) DbV.A05(e7u).getString(2131969151));
        }
    }

    public final void DMr(int i, boolean z) {
        if (i == 0) {
            AnonymousClass7TF.A16(this.A01);
            SearchEditText searchEditText = this.A07;
            if (searchEditText == null) {
                0qQ.A0F("searchEditText");
                throw AnonymousClass00P.createAndThrow();
            } else {
                searchEditText.clearFocus();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232232tF[]{new Object(), new Object(), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3A.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final boolean onBackPressed() {
        SearchEditText searchEditText = this.A07;
        if (searchEditText != null) {
            if (!searchEditText.hasFocus()) {
                SearchEditText searchEditText2 = this.A07;
                if (searchEditText2 != null) {
                    Editable text = searchEditText2.getText();
                    if (!(text == null || text.length() == 0)) {
                        SearchEditText searchEditText3 = this.A07;
                        if (searchEditText3 != null) {
                            searchEditText3.setText((CharSequence) null);
                        }
                    }
                }
            }
            return true;
        }
        0qQ.A0F("searchEditText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(835451291);
        E7U.super.onCreate(bundle);
        this.A09 = requireArguments().getString("partial_ci_variant", (String) null);
        this.A04 = C49047EoR.A00(this);
        this.A05 = new C50915Fku(new C50913Fks(this, 0), 2131972797);
        this.A02 = new C311496cm(this, AnonymousClass7TE.A0l(this.A0E));
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, true);
        this.A0B = A012;
        A012.A9Y(this);
        this.A03 = DbW.A0F(this).A00(C46768Dkv.class);
        AnonymousClass0fD.A09(404327244, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2092148689);
        this.A06 = null;
        this.A01 = null;
        this.A08 = null;
        AnonymousClass3E6 r0 = this.A0B;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.EEH(this);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1934523567, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1159256494);
        E7U.super.onStart();
        AnonymousClass3E6 r1 = this.A0B;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.DmJ(requireActivity());
        AnonymousClass0fD.A09(1820578926, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-659976449);
        E7U.super.onStop();
        AnonymousClass3E6 r0 = this.A0B;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(217628435, A022);
    }
}
