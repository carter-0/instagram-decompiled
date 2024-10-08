package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class E6Z extends AnonymousClass32G implements C51960G9g, AnonymousClass4DS, G77, C51909G7d, AnonymousClass32K {
    public static final String __redex_internal_original_name = "NewsfeedFollowRollupFragment";
    public UserSession A00;
    public IgdsInlineSearchBox A01;
    public E91 A02;
    public C47363Dvx A03;
    public AnonymousClass32A A04;
    public AnonymousClass7Q8 A05;
    public String A06;
    public String A07 = "";
    public final C228172ku A08 = new C228172ku();
    public final AnonymousClass1GX A09 = new C47918EMo(this, 2);

    public final void D2Y(FollowStatus followStatus, User user) {
    }

    public final void D2p(User user) {
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        List singletonList = Collections.singletonList(reel);
        AnonymousClass32A r3 = this.A04;
        r3.A0C = this.A06;
        C50896Fkb.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 7);
        r3.A09(reel, AnonymousClass3BQ.ACTIVITY_FEED, gradientSpinnerAvatarView, singletonList, singletonList, singletonList);
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void DGX() {
    }

    public final void DSJ(View view, User user, boolean z) {
    }

    public final void DdL(User user) {
    }

    public final String getModuleName() {
        return "follower_rollup";
    }

    public final void onSearchCleared(String str) {
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public final C358248ab ALt(C358248ab r2) {
        r2.A0l(this, this.A00);
        return r2;
    }

    public final void DGc() {
        E91 e91 = this.A02;
        e91.A00 = -1;
        E91.A01(e91);
    }

    public final void DpP() {
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            C309516Yo A0M = DbS.A0M(requireActivity(), this.A00);
            FC6.A01();
            DbX.A18(AnonymousClass7TE.A0a(), new E3O(), A0M);
        }
    }

    public final void onSearchTextChanged(String str) {
        List list;
        if (!this.A07.equals(str)) {
            this.A07 = str;
            boolean isEmpty = str.isEmpty();
            E91 e91 = this.A02;
            if (isEmpty) {
                e91.A02 = false;
                C47363Dvx dvx = this.A03;
                if (dvx != null) {
                    0sn r3 = dvx.A02;
                    Integer num = dvx.A01;
                    AnonymousClass3UH r1 = dvx.A00;
                    List list2 = e91.A08;
                    list2.clear();
                    if (r3 == null) {
                        r3 = 0sn.A00;
                    }
                    list2.addAll(r3);
                    E91.A00(r1, e91, DbX.A02(num));
                }
            } else {
                e91.A02 = true;
                HashSet A1F = AnonymousClass7TE.A1F();
                C47363Dvx dvx2 = this.A03;
                if (!(dvx2 == null || (list = dvx2.A02) == null)) {
                    C336427eb.A00((1UV) null, str, list, A1F);
                }
                E91 e912 = this.A02;
                List list3 = e912.A08;
                list3.clear();
                list3.addAll(A1F);
                E91.A00((AnonymousClass3UH) null, e912, -1);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                2dZ A0K = DbT.A0K(activity);
                int size = this.A02.A08.size();
                String string = getString(2131962635);
                if (size > 0) {
                    string = DbY.A0d(DbV.A05(this), size, R.plurals.follow_count);
                }
                A0K.setTitle(string);
            }
        }
    }

    public final void onUserRowClick(User user) {
        C46474Dfc A012 = C46548Dgp.A01(this.A00, user.getId(), "feed_follow_rollup_user_row", "follower_rollup");
        C46474Dfc.A02(DbS.A0M(requireActivity(), this.A00), this.A00, C46447Df9.A02(), A012);
    }

    public final void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131968327);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1687260396);
        E6Z.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        this.A02 = new E91(requireContext(), this, this.A00, this, new ELS(requireActivity(), (AnonymousClass0iw) this, this.A00, this), this, this, new C46432Det(requireArguments(), this.A00, (FollowListData) null));
        AnonymousClass7Q8 r0 = new AnonymousClass7Q8(requireContext(), this.A00, this.A02);
        this.A05 = r0;
        r0.A00();
        A0V(this.A02);
        1NY A0O = DbU.A0O(this.A00);
        A0O.A0A("friendships/recent_followers/");
        A0O.A0R(C47363Dvx.class, F6V.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            A0O.A0G("media_id", bundle2.getString("media_id"));
        }
        1OC A0M = A0O.A0M();
        A0M.A00 = new C47699EDi(this, 45);
        schedule(A0M);
        this.A04 = new AnonymousClass32A(this, this.A00, DbV.A0f(this));
        this.A06 = AnonymousClass7TF.A0b();
        AnonymousClass0fD.A09(-842299536, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(400806243);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_listview_with_progress_and_search);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0C.requireViewById(R.id.search_box);
        this.A01 = igdsInlineSearchBox;
        igdsInlineSearchBox.setVisibility(8);
        AnonymousClass0fD.A09(632063742, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1416541273);
        this.A05.A01();
        super.onDestroy();
        AnonymousClass0fD.A09(-994888451, A022);
    }

    public final void onDestroyView() {
        View currentFocus;
        int A022 = AnonymousClass0fD.A02(860314234);
        C228172ku r2 = this.A08;
        AnonymousClass1GX r1 = this.A09;
        0qQ.A0B(r1, 0);
        r2.A02.remove(r1);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            0nA.A0N(currentFocus);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A01;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        this.A01 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1393992900, A022);
    }

    public final void onResume() {
        AnonymousClass3BQ r1;
        int A022 = AnonymousClass0fD.A02(-1574355309);
        super.onResume();
        AnonymousClass3K2 A062 = 1OP.A06(requireActivity());
        if (A062 != null && A062.A0Z() && ((r1 = A062.A0H) == AnonymousClass3BQ.ACTIVITY_FEED || r1 == AnonymousClass3BQ.ACTIVITY_FEED_USER_MENTIONED_IN_AD_NOTIF || r1 == AnonymousClass3BQ.ACTIVITY_FEED_USER_CONTENT_RESHARED_IN_AD_NOTIF)) {
            A062.A0X(this);
        }
        AnonymousClass0fD.A09(1692850222, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ListView A0X = A0X();
        if (A0X != null) {
            A0X.setImportantForAccessibility(1);
        }
        this.A08.A03(this.A09);
        if (!this.A07.isEmpty()) {
            IgdsInlineSearchBox igdsInlineSearchBox = this.A01;
            igdsInlineSearchBox.getClass();
            igdsInlineSearchBox.A0E.setText(this.A07);
        }
        getScrollingViewProxy().AAD(new C47914EMi(this, 0));
    }
}
