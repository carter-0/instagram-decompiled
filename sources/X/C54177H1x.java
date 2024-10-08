package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.LinkedHashMap;

/* renamed from: X.H1x  reason: case insensitive filesystem */
public final class C54177H1x extends C227812jx implements AnonymousClass4DU, C229132mt, C227252iu, AnonymousClass0j6, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SaveHomeFragment";
    public C231002qi A00;
    public C230882qT A01;
    public C54228H3x A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public C227762js A08;
    public 2el A09;
    public I06 A0A;
    public final C55520Hj2 A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final C228172ku A0E = new C228172ku();

    public final void A03(SavedCollection savedCollection, int i, int i2) {
        long j;
        String str;
        C54665HMw hMw = savedCollection.A07;
        if (hMw == C54665HMw.NEW_COLLECTION) {
            Bundle A0a = AnonymousClass7TE.A0a();
            AnonymousClass0eM r2 = this.A0D;
            DbU.A1D(A0a, AnonymousClass7TE.A0l(r2));
            A0a.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", HMH.ADD_TO_NEW_COLLECTION);
            A0a.putString("prior_module", getModuleName());
            C54228H3x h3x = this.A02;
            if (h3x == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            }
            A0a.putInt("ARGUMENT_NUM_MEDIA_COLLECTIONS", h3x.A01);
            if (this.A04) {
                A0a.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", new SavedCollection());
                str = "saved_feed";
            } else {
                str = "create_collection";
            }
            DbU.A1K(this, DbS.A0b(requireActivity(), A0a, AnonymousClass7TE.A0l(r2), ModalActivity.class, str));
        } else if (hMw == C54665HMw.SAVED_ENTRYPOINT_COLLECTION) {
            C55115HcO.A00().A04(requireActivity(), AnonymousClass7TE.A0l(this.A0D));
        } else {
            C54665HMw hMw2 = C54665HMw.LIKED_COLLECTIONS;
            AnonymousClass0eM r4 = this.A0D;
            if (hMw == hMw2) {
                Dba.A0w((Bundle) null, C55112HcL.A00(AnonymousClass7TE.A0l(r4), (String) null, false, true, false), DbS.A0M(requireActivity(), AnonymousClass7TE.A0l(r4)));
                return;
            }
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            0qQ.A0B(A0l, 1);
            try {
                String str2 = savedCollection.A0F;
                0qQ.A07(str2);
                j = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                j = -1;
            }
            String A002 = C320166rs.A00(i, i2);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, A0l), C273654mx.A00(80));
            A0e.A7p(C273654mx.A00(791), false);
            A0e.A9F("entity_id", Long.valueOf(j));
            A0e.AAJ("entity_name", savedCollection.A0G);
            A0e.AAJ("collection_type", savedCollection.A07.A00);
            C51973G9u.A14(A0e, "position", A002);
            A0e.AAJ("saved_collection_type", savedCollection.A02());
            A0e.AAJ("collection_id", savedCollection.A0F);
            I35.A02(A0e, A0l, savedCollection);
            DbX.A1L(A0e);
            C55115HcO.A00().A02(requireActivity(), this, AnonymousClass7TE.A0l(r4), savedCollection);
            1Wj r3 = 1Wj.A00;
            if (r3 != null) {
                r3.A03(AnonymousClass7TE.A0l(r4), getActivity(), "413864835927042");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r4.Eu4(r0);
        r4.ErT(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r3.A05 != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r1 = X.DbS.A0K();
        r1.A02(X.AnonymousClass05K.A1I);
        r1.A05 = 2131972535;
        X.DbX.A19(X.C56802ICz.A00(r3, 44), r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r4.ARb(0, r3.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1 > 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r3.A06 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            r2 = 0
            X.0qQ.A0B(r4, r2)
            boolean r1 = r3.A05
            r0 = 2131972619(0x7f13520b, float:1.958225E38)
            if (r1 != 0) goto L_0x000e
            r0 = 2131972603(0x7f1351fb, float:1.9582218E38)
        L_0x000e:
            r4.Eom(r0)
            X.0hq r0 = r3.mFragmentManager
            if (r0 == 0) goto L_0x0021
            int r1 = r0.A0M()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0021
            if (r1 > 0) goto L_0x0026
        L_0x0021:
            boolean r1 = r3.A06
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            r4.Eu4(r0)
            r4.ErT(r3)
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0048
            X.3JR r1 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            r1.A02(r0)
            r0 = 2131972535(0x7f1351b7, float:1.958208E38)
            r1.A05 = r0
            r0 = 44
            X.ICz r0 = X.C56802ICz.A00(r3, r0)
            X.DbX.A19(r0, r1, r4)
        L_0x0048:
            boolean r0 = r3.A03
            r4.ARb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54177H1x.configureActionBar(X.2da):void");
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C252553pI r0;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        if (isResumed() && (r0 = getRecyclerView().A0D) != null) {
            bundle.putParcelable("recycler_view_state", r0.A1M());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        C227762js r3 = this.A08;
        if (r3 == null) {
            str = "scrollableNavigationHelper";
        } else {
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            C54228H3x h3x = this.A02;
            if (h3x == null) {
                str = "adapter";
            } else {
                r3.A06(h3x, scrollingViewProxy, AnonymousClass7TG.A02(requireContext()));
                super.onViewCreated(view, bundle);
                EmptyStateView emptyStateView = (EmptyStateView) this.mEmptyView;
                if (emptyStateView != null) {
                    C56802ICz A002 = C56802ICz.A00(this, 45);
                    C320156rr r1 = C320156rr.EMPTY;
                    emptyStateView.A0R(r1, R.drawable.empty_state_save);
                    emptyStateView.A0T(r1, 2131972556);
                    emptyStateView.A0S(r1, 2131972555);
                    C320156rr r0 = C320156rr.ERROR;
                    emptyStateView.A0R(r0, R.drawable.loadmore_icon_refresh_compound);
                    emptyStateView.A0N(A002, r0);
                    emptyStateView.A0H();
                }
                RecyclerView recyclerView = getRecyclerView();
                if (this.A07) {
                    recyclerView.setNestedScrollingEnabled(true);
                    ((C238143As) getScrollingViewProxy()).APL();
                } else {
                    ((C238143As) getScrollingViewProxy()).ErF(new C57747Ifo(this));
                }
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
                C3251871j r32 = new C3251871j(linearLayoutManager, this, C3251771i.A0F, false, true);
                C228172ku r02 = this.A0E;
                r02.A02(r32);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.A0G = r02;
                C231002qi r03 = this.A00;
                if (r03 == null) {
                    str = "quickPromotionDelegate";
                } else {
                    r03.Dh3();
                    2el r04 = this.A09;
                    if (r04 == null) {
                        str = "viewpointManager";
                    } else {
                        Dba.A0z(recyclerView, r04, this);
                        C51969G9p.A15(getViewLifecycleOwner(), C226292g8.A00(19B.A00, C51968G9o.A0p(this).A00), new C74180PqM(this, 29), 17);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (X.C51966G9m.A1W(X.AnonymousClass7TE.A0l(r3), r4.requireArguments().getString("profile_user_id")) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C54177H1x r4) {
        /*
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0049
            X.0eM r3 = r4.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.I31.A01(r0)
            java.lang.String r2 = "profile_user_id"
            if (r0 == 0) goto L_0x0024
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r1 = r0.getString(r2)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 != 0) goto L_0x0040
        L_0x0024:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.I31.A00(r0)
            if (r0 == 0) goto L_0x0049
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r1 = r0.getString(r2)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 != 0) goto L_0x0049
        L_0x0040:
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r0 = r0.getString(r2)
            return r0
        L_0x0049:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54177H1x.A00(X.H1x):java.lang.String");
    }

    public static final void A01(C54177H1x h1x) {
        EmptyStateView emptyStateView;
        C54228H3x h3x = h1x.A02;
        if (h3x == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (h3x.A00 == 0) {
            if (C51968G9o.A0p(h1x).A02.A00 == AnonymousClass05K.A01 && (emptyStateView = (EmptyStateView) h1x.mEmptyView) != null) {
                emptyStateView.A0J();
                emptyStateView.A0H();
            }
            h1x.showEmptyView();
        } else {
            h1x.hideEmptyView();
        }
    }

    public final UserSession A02() {
        return AnonymousClass7TE.A0l(this.A0D);
    }

    public final void EKl() {
        RecyclerView recyclerView;
        if (this.mView != null && (recyclerView = getRecyclerView()) != null) {
            C2808154f.A01(recyclerView, true);
        }
    }

    public final String getModuleName() {
        if (this.A05) {
            return "liked_saved_collections_list";
        }
        if (!this.A07) {
            return "saved_collections_list";
        }
        if (0qQ.A0K(AnonymousClass7TE.A0l(this.A0D).A06, C320236s2.A01(requireArguments(), "profile_user_id"))) {
            return "self_saved_collections_list_saved_profile";
        }
        return "saved_collections_list_saved_profile";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0D);
    }

    public C54177H1x() {
        C58685Ivu ivu = new C58685Ivu(this, 14);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58685Ivu(new C58685Ivu(this, 15), 16));
        this.A0C = DbS.A0I(new C58685Ivu(A002, 17), ivu, new C58691Iw0(13, (Object) null, A002), DbS.A0z(C53043Ghb.class));
        this.A0B = new C55520Hj2(this);
        this.A0D = C227642jf.A02(this);
    }

    public final void ACw() {
        C53043Ghb A0p = C51968G9o.A0p(this);
        if (A0p.A02.A02) {
            C53043Ghb.A00(A0p, (C62320sa) null, false);
        }
    }

    public final 0jB E4x() {
        0jB A0k = C51965G9l.A0k();
        A0k.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AnonymousClass7TE.A0l(this.A0D).A06);
        return A0k;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2048590568);
        super.onCreate(bundle);
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A08 = C227752jr.A00(requireContext(), (Float) null, false);
        this.A07 = requireArguments().getBoolean("is_saved_profile_tab", false);
        this.A05 = requireArguments().getBoolean("is_liked_collections_list", false);
        this.A06 = requireArguments().getBoolean("is_modal", false);
        2el A002 = 2el.A00();
        this.A09 = A002;
        AnonymousClass0eM r1 = this.A0D;
        C55786HnL hnL = new C55786HnL(C51972G9s.A0b(AnonymousClass7TE.A0l(r1)), AnonymousClass7TE.A0l(r1), A002, this);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        boolean z = this.A07;
        C54228H3x h3x = new C54228H3x(requireContext, this, A0l, hnL, this, new C57414IaK(this, 4), requireArguments().getString("profile_user_id"), z, this.A05);
        this.A02 = h3x;
        h3x.A02 = true;
        setAdapter(h3x);
        C54228H3x h3x2 = this.A02;
        if (h3x2 != null) {
            this.A0E.A02(new C53094GiS(this, h3x2));
            1YN A003 = AnonymousClass2bO.A00();
            UserSession A0l2 = AnonymousClass7TE.A0l(r1);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            A1H.put(QPTooltipAnchor.SHOPPING_COLLECTION_ICON, new IWX());
            C230882qT A042 = A003.A04(A0l2, A1H);
            this.A01 = A042;
            registerLifecycleListener(A042);
            1YN A004 = AnonymousClass2bO.A00();
            UserSession A0l3 = AnonymousClass7TE.A0l(r1);
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0s;
            AnonymousClass2bO.A00();
            WZY wzy = new WZY(this, 2);
            C230882qT r0 = this.A01;
            if (r0 == null) {
                0qQ.A0F("quickPromotionTooltipsController");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A00 = A004.A01(this, this, A0l3, 2bV.A06(wzy, r0), quickPromotionSlot);
            AnonymousClass0eM r5 = this.A0C;
            C53043Ghb ghb = (C53043Ghb) r5.getValue();
            C55124HcX.A00(ghb.A01).A07();
            C53043Ghb.A00(ghb, (C62320sa) null, true);
            C54228H3x h3x3 = this.A02;
            if (h3x3 != null) {
                this.A0A = new I06(AnonymousClass7TE.A0l(r1), h3x3, (C53043Ghb) r5.getValue());
                AnonymousClass0fD.A09(1161423839, A022);
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1747736413);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview_with_empty_state, false);
        AnonymousClass0fD.A09(451436601, A022);
        return A0D2;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(1649483003);
        super.onDestroy();
        C230882qT r0 = this.A01;
        if (r0 == null) {
            str = "quickPromotionTooltipsController";
        } else {
            unregisterLifecycleListener(r0);
            I06 i06 = this.A0A;
            if (i06 == null) {
                str = "savedCollectionsUpdateHelper";
            } else {
                1Ng r2 = (1Ng) i06.A07.getValue();
                r2.A02(i06.A03, AnonymousClass3DT.class);
                r2.A02(i06.A01, C57074INo.class);
                r2.A02(i06.A02, C57077INr.class);
                r2.A02(i06.A00, C57078INs.class);
                AnonymousClass0fD.A09(861917640, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewStateRestored(Bundle bundle) {
        C252553pI r1;
        int A022 = AnonymousClass0fD.A02(-2058947536);
        super.onViewStateRestored(bundle);
        if (!(!isResumed() || (r1 = getRecyclerView().A0D) == null || bundle == null)) {
            r1.A1P(bundle.getParcelable("recycler_view_state"));
        }
        AnonymousClass0fD.A09(-1889683084, A022);
    }
}
