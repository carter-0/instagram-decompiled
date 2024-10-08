package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.NKa  reason: case insensitive filesystem */
public final class C68483NKa extends C227812jx implements AnonymousClass4DR, C229132mt, AnonymousClass4DS, C252213ok {
    public static final String __redex_internal_original_name = "RecsFromFriendsSenderFragment";
    public 2da A00;
    public IgEditText A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public IgView A04;
    public IgdsButton A05;
    public ONF A06;
    public C60238Jhv A07;
    public C50915Fku A08;
    public SearchEditText A09;
    public User A0A;
    public Integer A0B;
    public String A0C;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = true;
    public boolean A0H;
    public AnonymousClass3E6 A0I;
    public C3251871j A0J;
    public final HashSet A0K = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A0L = C227642jf.A02(this);

    public final void A02(User user, boolean z) {
        if (z) {
            this.A0F = true;
            SearchEditText searchEditText = this.A09;
            if (searchEditText != null) {
                searchEditText.setText((CharSequence) null);
            }
            this.A0F = false;
            SearchEditText searchEditText2 = this.A09;
            if (searchEditText2 != null) {
                searchEditText2.clearFocus();
            }
            SearchEditText searchEditText3 = this.A09;
            if (searchEditText3 != null) {
                searchEditText3.A04();
            }
        }
        if (user != null) {
            this.A0B = null;
        }
        C60238Jhv jhv = this.A07;
        if (jhv == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        if (user != null) {
            ArrayList arrayList = jhv.A05;
            arrayList.remove(user);
            arrayList.add(0, user);
        }
        if (jhv.A01.isCancelled()) {
            jhv.A01 = new AnonymousClass19G((C262204Co) null);
        }
        jhv.A01.AG7((CancellationException) null);
        jhv.A06.Epw(new C61225JzJ(jhv.A00, jhv.A05, jhv.A02, false));
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131971410);
        DbX.A1A(new C71396Ojv(this, 17), DbX.A0M(), r4);
        this.A00 = r4;
    }

    public final String getModuleName() {
        return "recs_from_friends_sender";
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbV.A1B(JTP.A0C(recyclerView, 0), recyclerView);
        C3251871j r0 = new C3251871j(recyclerView.A0D, this, C3251771i.A0A, false, false);
        this.A0J = r0;
        recyclerView.A15(r0);
        recyclerView.A15(new C67837Mvh(this, 13));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SearchEditText searchEditText = (SearchEditText) AnonymousClass7TF.A0G(view, R.id.action_bar_search_hints_text_layout).requireViewById(R.id.action_bar_search_edit_text);
        this.A09 = searchEditText;
        if (searchEditText != null) {
            C50915Fku fku = this.A08;
            if (fku == null) {
                str = "searchBarController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            fku.A00(searchEditText, true);
            searchEditText.setOnFocusChangeListener(new C71411OkA(this, 4));
        }
        DbY.A0y(DbV.A05(this), AnonymousClass7TG.A0R(view, R.id.send_button_caption), C51971G9r.A0t(this.A0A), 2131973086);
        this.A01 = (IgEditText) view.requireViewById(R.id.sender_message_edit_text);
        this.A04 = (IgView) view.requireViewById(R.id.divider_top);
        this.A05 = DbU.A0b(view, R.id.send_button);
        this.A03 = DbT.A0a(view, R.id.send_button_caption);
        this.A02 = (IgLinearLayout) view.requireViewById(R.id.footer_container);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.listview_progressbar);
        ONF onf = this.A06;
        if (onf == null) {
            str = "recsFromFriendsLogger";
        } else {
            String str2 = this.A0C;
            if (str2 == null) {
                str = "targetUserId";
            } else {
                onf.A01(AnonymousClass7TE.A10(str2), "sender_view", "recs_from_friends_sender");
                if (this.A0G) {
                    A0G2.setVisibility(0);
                    IgdsButton igdsButton = this.A05;
                    if (igdsButton != null) {
                        igdsButton.setEnabled(false);
                    }
                }
                IgdsButton igdsButton2 = this.A05;
                if (igdsButton2 != null) {
                    C71396Ojv.A00(igdsButton2, 18, this);
                }
                07U r4 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, r4, A0G2, this, (AnonymousClass4D7) null, 24), AnonymousClass07a.A00(viewLifecycleOwner));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C68483NKa nKa, List list, boolean z, boolean z2) {
        Integer num;
        nKa.A0E = z;
        nKa.A0D = false;
        E9I e9i = (E9I) nKa.getAdapter();
        0qQ.A0B(list, 0);
        ArrayList arrayList = e9i.A01;
        if (z2) {
            arrayList.addAll(list);
            E9I.A00(e9i);
        } else {
            arrayList.clear();
            arrayList.addAll(list);
            E9I.A00(e9i);
            if (!nKa.A0H && (num = nKa.A0B) != null) {
                nKa.getRecyclerView().A0o(num.intValue());
                nKa.A0B = null;
            }
        }
        nKa.getAdapter().notifyDataSetChangedSmart();
    }

    public final void ACw() {
        String str;
        if (!this.A0D) {
            String str2 = null;
            if (this.A0H) {
                C50915Fku fku = this.A08;
                if (fku == null) {
                    str = "searchBarController";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                str2 = fku.A01;
            }
            C60238Jhv jhv = this.A07;
            if (jhv == null) {
                str = "viewModel";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            jhv.A00(str2);
            this.A0D = true;
        }
    }

    public final void DMr(int i, boolean z) {
        int i2;
        SearchEditText searchEditText = this.A09;
        if (searchEditText != null && !searchEditText.hasFocus()) {
            IgTextView igTextView = this.A03;
            if (igTextView != null) {
                i2 = igTextView.getHeight();
            } else {
                i2 = 0;
            }
            int A022 = AnonymousClass7TG.A02(requireContext());
            int i3 = 0;
            if (i > 0) {
                i3 = (i + A022) - i2;
            }
            IgLinearLayout igLinearLayout = this.A02;
            if (igLinearLayout != null) {
                igLinearLayout.setPadding(0, 0, 0, i3);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public final boolean onBackPressed() {
        if (this.A0H) {
            A02((User) null, true);
            return true;
        }
        Dbb.A0z(this);
        return true;
    }

    public static final String A00(HashSet hashSet) {
        String A10 = DbT.A10(hashSet);
        String A0g = 00p.A0g(A10, ",", "::", false);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (int i = 0; i < A0g.length(); i++) {
            char charAt = A0g.charAt(i);
            if (!(charAt == '[' || charAt == ']')) {
                A1A.append(charAt);
            }
        }
        return DbT.A10(A1A);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1153503134);
        super.onCreate(bundle);
        this.A0C = C320236s2.A01(requireArguments(), "target_user_id");
        AnonymousClass0eM r2 = this.A0L;
        17i A0u = JTR.A0u(r2);
        String str = this.A0C;
        if (str != null) {
            this.A0A = A0u.A02(str);
            this.A06 = new ONF(this, AnonymousClass7TE.A0l(r2));
            setAdapter(new E9I(requireContext(), this, new PRL(this, 8), new PRY(this), "recs_from_friends_sender", false, false, false));
            UserSession A0l = AnonymousClass7TE.A0l(r2);
            String str2 = this.A0C;
            if (str2 != null) {
                this.A07 = new C60238Jhv(A0l, str2);
                this.A08 = new C50915Fku(new C50913Fks(this, 2), 2131972797);
                AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
                this.A0I = A012;
                A012.A9Y(this);
                AnonymousClass0fD.A09(1463521485, A022);
                return;
            }
        }
        0qQ.A0F("targetUserId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(564188239);
        0qQ.A0B(layoutInflater, 0);
        C68483NKa.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.recs_from_friends_sender_fragment, false);
        AnonymousClass0fD.A09(-1852252536, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-819624072);
        super.onDestroyView();
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
        this.A03 = null;
        this.A02 = null;
        this.A09 = null;
        AnonymousClass3E6 r0 = this.A0I;
        if (r0 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            r0.EEH(this);
            RecyclerView recyclerView = getRecyclerView();
            C3251871j r02 = this.A0J;
            if (r02 == null) {
                str = "autoLoadMoreHelper";
            } else {
                recyclerView.A16(r02);
                AnonymousClass0fD.A09(1660122385, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(217052100);
        C68483NKa.super.onStart();
        AnonymousClass3E6 r0 = this.A0I;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A17(this, r0);
        AnonymousClass0fD.A09(460901083, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-742708641);
        C68483NKa.super.onStop();
        AnonymousClass3E6 r0 = this.A0I;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(670189573, A022);
    }
}
