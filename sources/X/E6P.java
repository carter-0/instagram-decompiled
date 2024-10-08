package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class E6P extends AnonymousClass32G implements AnonymousClass4DS, X4C, AnonymousClass32K {
    public static final String __redex_internal_original_name = "SimilarAccountsFragment";
    public DdO A00;
    public C293005js A01;
    public C320106rm A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public E90 A08;
    public AnonymousClass7Q8 A09;
    public HashMap A0A;
    public final Set A0B = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final C358248ab ALt(C358248ab r2) {
        0qQ.A0B(r2, 0);
        r2.A0l(this, DbT.A0X(this.A0C));
        return r2;
    }

    public final void configureActionBar(2da r3) {
        Context A062 = DbT.A06(this, r3, 0);
        this.A0C.getValue();
        DbW.A1C(r3, AnonymousClass7TE.A16(A062, 2131974682));
    }

    public final String getModuleName() {
        return "see_all_suggested_user_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        0S7.A00(this);
        View emptyView = this.A04.getEmptyView();
        0qQ.A0C(emptyView, C66579MXk.A00(24));
        EmptyStateView emptyStateView = (EmptyStateView) emptyView;
        C320156rr r2 = C320156rr.EMPTY;
        emptyStateView.A0R(r2, R.drawable.recommended_user_empty_icon);
        C320156rr r1 = C320156rr.ERROR;
        emptyStateView.A0R(r1, R.drawable.loadmore_icon_refresh_compound);
        emptyStateView.A0N(FP4.A00(this, 36), r1);
        emptyStateView.A0T(r2, 2131973895);
        emptyStateView.A0T(r1, 2131973896);
        super.onViewCreated(view, bundle);
        A0V(A0c());
        A02(this);
        AnonymousClass7Q8 r0 = this.A09;
        if (r0 == null) {
            0qQ.A0F("followStatusUpdatedListener");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A00();
        }
    }

    public static final void A02(E6P e6p) {
        if (e6p.mView != null) {
            0S7.A00(e6p);
            View emptyView = e6p.A04.getEmptyView();
            0qQ.A0C(emptyView, C66579MXk.A00(24));
            EmptyStateView emptyStateView = (EmptyStateView) emptyView;
            if (e6p.A07) {
                emptyStateView.A0L();
            } else if (e6p.A05) {
                emptyStateView.A0J();
            } else {
                emptyStateView.A0I();
            }
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0C);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.X99] */
    public final E90 A0c() {
        E90 e90 = this.A08;
        if (e90 != null) {
            return e90;
        }
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r2 = this.A0C;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        C14029ToV toV = new C14029ToV();
        DdO ddO = this.A00;
        if (ddO == null) {
            ddO = new ELS(requireActivity(), AnonymousClass7TE.A0l(r2), this);
            this.A00 = ddO;
        }
        0qQ.A0C(ddO, "null cannot be cast to non-null type com.instagram.follow.chaining.DefaultRecommendedUserDelegate");
        E90 e902 = new E90(requireActivity, requireContext, this, A0l, toV, new Object(), this, this, ddO, new EEF(this, this, this, AnonymousClass7TE.A0l(r2), (EXN) null, new C51127Foz(6)), AnonymousClass7TE.A16(requireContext(), 2131968486));
        this.A08 = e902;
        return e902;
    }

    public static final String A01(AnonymousClass3UM r3, E6P e6p) {
        String id = r3.getId();
        HashMap hashMap = e6p.A0A;
        if (hashMap == null || !hashMap.containsKey(id)) {
            return r3.getAlgorithm();
        }
        return DbS.A0r(id, hashMap);
    }

    public final void A0d() {
        String str;
        if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS")) {
            0lg A0X = DbT.A0X(this.A0C);
            String str2 = this.A04;
            if (str2 == null) {
                str = "targetId";
            } else {
                ArrayList<String> stringArrayList = requireArguments().getStringArrayList("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS");
                0qQ.A0B(A0X, 0);
                1NY A0b = AnonymousClass7TG.A0b(A0X);
                A0b.A0A("discover/fetch_suggestion_details/");
                A0b.A0O((15p) null, DvT.class, F89.class, false);
                if (str2.length() > 0) {
                    A0b.A9m("target_id", str2);
                }
                if (stringArrayList != null && DbT.A1b(stringArrayList)) {
                    A0b.A9m("chained_ids", C239023El.A00(',').A02(stringArrayList));
                }
                1OC A0T = DbT.A0T(A0b, "include_social_context", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                A0T.A00 = new ECP(this);
                schedule(A0T);
                C320106rm r0 = this.A02;
                str = "latencyPerfLogger";
                if (r0 != null) {
                    r0.A00.A08((String) null);
                    C320106rm r1 = this.A02;
                    if (r1 != null) {
                        r1.A0E("fetch_request_start");
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Integer num;
        int A022 = AnonymousClass0fD.A02(-477240240);
        E6P.super.onCreate(bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r5 = this.A0C;
        this.A09 = new AnonymousClass7Q8(requireContext, AnonymousClass7TE.A0l(r5), A0c());
        Bundle requireArguments = requireArguments();
        String A002 = AnonymousClass000.A00(2495);
        if (requireArguments.containsKey(A002)) {
            str = requireArguments().getString(A002);
            DbS.A1Y(str);
        } else {
            str = "";
        }
        this.A04 = str;
        HashMap hashMap = null;
        if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_ID_TO_ALGORITHM_MAP")) {
            Serializable serializable = requireArguments().getSerializable("SimilarAccountsFragment.ARGUMENT_ID_TO_ALGORITHM_MAP");
            0qQ.A0C(serializable, C66579MXk.A00(37));
            hashMap = (HashMap) serializable;
        }
        this.A0A = hashMap;
        if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_ENTRY_POINT")) {
            requireArguments().getString("SimilarAccountsFragment.ARGUMENT_ENTRY_POINT");
        }
        Bundle requireArguments2 = requireArguments();
        String A003 = AnonymousClass000.A00(2496);
        if (!requireArguments2.containsKey(A003) || !requireArguments().getBoolean(A003)) {
            num = AnonymousClass05K.A0u;
        } else {
            num = AnonymousClass05K.A0j;
        }
        this.A03 = num;
        this.A01 = new C293005js(this, AnonymousClass7TE.A0l(r5));
        C320106rm r1 = new C320106rm(AnonymousClass7TE.A0l(r5), "dp_non_self_chaining_see_all", 31796213);
        this.A02 = r1;
        DbY.A0v(requireContext(), r1, this, r5);
        AnonymousClass0fD.A09(992708384, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(179977418);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_empty_state, viewGroup, false);
        AnonymousClass0fD.A09(1837501411, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-50616090);
        AnonymousClass7Q8 r0 = this.A09;
        if (r0 == null) {
            0qQ.A0F("followStatusUpdatedListener");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A01();
        super.onDestroyView();
        AnonymousClass0fD.A09(-1346058057, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1189632879);
        this.A0B.clear();
        E6P.super.onPause();
        AnonymousClass0fD.A09(2000322239, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(719279800);
        super.onResume();
        if (this.A06) {
            if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS")) {
                A0d();
            } else {
                this.A07 = true;
                A02(this);
                UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
                String str = this.A04;
                if (str == null) {
                    0qQ.A0F("targetId");
                    throw AnonymousClass00P.createAndThrow();
                }
                1OC A002 = C46374Ddr.A00(A0l, AnonymousClass05K.A0C, str, (String) null, false);
                C47696EDf.A01(A002, this, 47);
                schedule(A002);
            }
        }
        AnonymousClass0fD.A09(-921223273, A022);
    }
}
