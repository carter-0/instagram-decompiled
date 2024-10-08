package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class E6T extends AnonymousClass32G implements AnonymousClass4DR, AbsListView.OnScrollListener, G7N, C51960G9g, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FollowAccountsYouKnowFragment";
    public View A00;
    public View A01;
    public View A02;
    public 2da A03;
    public BusinessFlowAnalyticsLogger A04;
    public UserSession A05;
    public C46710Djg A06;
    public String A07;
    public String A08 = "";
    public List A09;
    public Map A0A;
    public Set A0B;
    public View A0C;
    public EEC A0D;
    public TypeaheadHeader A0E;
    public String A0F;
    public boolean A0G;
    public final Set A0H = AnonymousClass7TE.A1F();
    public final AtomicInteger A0I = new AtomicInteger(0);
    public final 1wn A0J = FX1.A00(this, 4);
    public final C228172ku A0K = new C228172ku();

    public final void D2p(User user) {
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void DSJ(View view, User user, boolean z) {
    }

    public final void DdL(User user) {
    }

    public final void registerTextViewLogging(TextView textView) {
    }

    private void A01() {
        int i;
        if (this.A03 != null) {
            AnonymousClass7TH.A0R(this.A00);
            boolean z = this.A0G;
            boolean isEmpty = this.A0H.isEmpty();
            2da r3 = this.A03;
            AnonymousClass3JR A0K2 = DbS.A0K();
            if (z) {
                if (isEmpty) {
                    A0K2.A0K = getString(2131973923);
                    i = 56;
                } else {
                    A0K2.A0K = getString(2131960992);
                    i = 57;
                }
            } else if (isEmpty) {
                A0K2.A0K = getString(2131973923);
                i = 58;
            } else {
                A0K2.A0K = getString(2131960992);
                i = 59;
            }
            A0K2.A0G = new FP0((Object) this, i);
            this.A00 = r3.AA3(new AnonymousClass3Jb(A0K2));
        }
    }

    public static void A02(E6T e6t) {
        String str = e6t.A08;
        if (!str.isEmpty()) {
            e6t.A0E.A04(str);
            e6t.A0E.A02();
        }
    }

    public static void A03(E6T e6t, User user, String str, boolean z) {
        1OC A042 = FGQ.A04(e6t.A05, 0mp.A06("friendships/%s/following/", new Object[]{user.getId()}), (String) null, "nux_follow_from_logged_in_accounts", str);
        A042.A00 = new ECV(e6t, user, z);
        e6t.schedule(A042);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A05;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        C49886FBm A012;
        String id;
        String str;
        0fE.A00(this.A06, -984921008);
        if (user.B6o() == FollowStatus.A05 || user.B6o() == FollowStatus.A07) {
            this.A0H.add(user);
            A012 = FGI.A01(this, 1Q0.A1S);
            A012.A04("actor_id", this.A05.A06);
            id = user.getId();
            str = "following_user_id";
        } else {
            this.A0H.remove(user);
            A012 = FGI.A01(this, 1Q0.A1U);
            A012.A04("actor_id", this.A05.A06);
            id = user.getId();
            str = "unfollowing_user_id";
        }
        A012.A04(str, id);
        A012.A02();
        A01();
    }

    public final void configureActionBar(2da r5) {
        this.A03 = r5;
        A01();
        Context context = getContext();
        if (context != null) {
            this.A03.ENd(new ColorDrawable(AnonymousClass7TF.A03(context, R.attr.igds_color_primary_background)));
        }
        if (this.A0G) {
            2da r3 = this.A03;
            DbX.A1A(new FP0((Object) this, 55), DbX.A0M(), r3);
        }
    }

    public final String getModuleName() {
        if (!TextUtils.isEmpty(this.A0F)) {
            return this.A0F;
        }
        return "follow_accounts_you_know_sac_nux";
    }

    public final boolean onBackPressed() {
        0nA.A0N(this.A02);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("invite_followers_via_suma_followings", this.A07, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void searchTextChanged(String str) {
        if (!this.A08.equals(str)) {
            this.A0B.clear();
            this.A08 = str;
            this.A06.A01.clear();
            A02(this);
            if (!TextUtils.isEmpty(this.A08)) {
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(0);
                }
                C46710Djg djg = this.A06;
                djg.A02 = true;
                djg.A03 = false;
                0fE.A00(djg, 1772264809);
                EEC eec = this.A0D;
                String str2 = this.A08;
                Deque deque = eec.A05;
                synchronized (deque) {
                    if (!eec.A06.containsKey(str2) && !deque.contains(str2)) {
                        deque.add(str2);
                        Handler handler = eec.A03;
                        if (!handler.hasMessages(1)) {
                            handler.sendEmptyMessageDelayed(1, 300);
                        }
                    }
                }
                return;
            }
            C46710Djg djg2 = this.A06;
            djg2.A02 = false;
            djg2.A03 = false;
            0fE.A00(djg2, 1772264809);
        }
    }

    public static void A04(E6T e6t, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (DbV.A0i(e6t.A05, A0k) == FollowStatus.A08) {
                A0k.A0n(FollowStatus.A06);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(139368887);
        E6T.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || getContext() == null) {
            i = 1693339268;
        } else {
            this.A07 = bundle2.getString("ARG_ENTRY_POINT");
            this.A0G = bundle2.getBoolean("ARG_FROM_PRO_ONBOARDING_CHECKLIST");
            if (!TextUtils.isEmpty(bundle2.getString("ARG_MODULE_NAME"))) {
                str = bundle2.getString("ARG_MODULE_NAME");
            } else {
                str = "follow_accounts_you_know_sac_nux";
            }
            this.A0F = str;
            this.A05 = DbX.A0U(this);
            this.A06 = new C46710Djg(getContext(), this, this.A05, this, this, new C46432Det(requireArguments(), this.A05, (FollowListData) null));
            List A17 = DbV.A17(this.A05);
            this.A09 = A17;
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                A03(this, DbT.A0k(it), (String) null, true);
            }
            EEC eec = new EEC(this.A05, this, this.A09);
            this.A0D = eec;
            eec.A01 = this;
            if (this.A0G) {
                this.A04 = C319596qs.A01(C319586qr.EDIT_PROFILE, this.A05, this.A0F, AnonymousClass7TF.A0b());
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Cka(new C22030Xtl("invite_followers_via_suma_followings", this.A07, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
            i = 1509241957;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-837791278);
        this.A0A = AnonymousClass7TE.A1E();
        this.A0B = AnonymousClass7TE.A1F();
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        this.A02 = A0C2;
        ViewGroup A042 = Dba.A04(A0C2);
        layoutInflater.inflate(R.layout.sac_nux_follow_accounts_you_know_fragment, A042, true);
        View A0C3 = DbT.A0C(layoutInflater, A042, R.layout.sac_nux_follow_accounts_search_bar_row);
        this.A0C = A0C3;
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) A0C3.requireViewById(R.id.typeahead_header);
        this.A0E = typeaheadHeader;
        typeaheadHeader.setOnSearchEditTextFocusChangeListener(new FPM(this, 13));
        this.A06.A00 = this.A0C;
        ((AbsListView) this.A02.requireViewById(16908298)).setAdapter(this.A06);
        this.A01 = this.A02.findViewById(R.id.loading_spinner);
        C49938FFr.A00(this.A05, (C49922FEx) null, (EXD) null, (Integer) null, "follow_from_logged_in_accounts", this.A07);
        View view = this.A02;
        AnonymousClass0fD.A09(768793190, A022);
        return view;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1765381440);
        AnonymousClass1Nd.A00(this.A05).A02(this.A0J, C2370836g.class);
        super.onDestroy();
        AnonymousClass0fD.A09(485123731, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-520437212);
        this.A0D.onDestroyView();
        0nA.A0N(this.A02);
        this.A02 = null;
        this.A0E = null;
        this.A0C = null;
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-1868107495, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-445731919);
        E6T.super.onPause();
        0nA.A0N(this.A02);
        AnonymousClass0fD.A09(2115152319, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(87840914);
        super.onResume();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        Dbb.A10(this);
        AnonymousClass0fD.A09(-1778918413, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int A032 = AnonymousClass0fD.A03(1251915912);
        2da r1 = this.A03;
        if (r1 == null) {
            i4 = -1965092284;
        } else {
            if (i >= 1) {
                r1.Eom(2131962535);
                this.A03.C7y().setSingleLine(false);
            } else {
                r1.setTitle("");
            }
            this.A0K.onScroll(absListView, i, i2, i3);
            i4 = -1531563379;
        }
        AnonymousClass0fD.A0A(i4, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(-522083398);
        this.A0K.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-1851961640, A032);
    }

    public final void onUserRowClick(User user) {
        if (getActivity() != null) {
            C46474Dfc A012 = C46548Dgp.A01(this.A05, user.getId(), "follow_list_user_row", getModuleName());
            C46474Dfc.A02(DbU.A0Q(requireActivity(), this.A05), this.A05, C46447Df9.A02(), A012);
            C49886FBm A013 = FGI.A01(this, 1Q0.A1V);
            A013.A04("actor_id", this.A05.A06);
            A013.A04("following_user_id", user.getId());
            A013.A02();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A02(this);
        TypeaheadHeader typeaheadHeader = this.A0E;
        typeaheadHeader.A01 = this;
        typeaheadHeader.A03(requireContext().getString(2131972797));
        this.A0K.A03(this.A0E.A04);
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
        AnonymousClass1Nd.A00(this.A05).A01(this.A0J, C2370836g.class);
    }
}
