package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ubu  reason: case insensitive filesystem */
public abstract class C15391Ubu extends AnonymousClass32G implements X9R, AbsListView.OnScrollListener, G7P, AnonymousClass4DS, C51923G7r {
    public static final String __redex_internal_original_name = "ReelUserListFragment";
    public C331047Ph A00;
    public UserSession A01;
    public Reel A02;
    public C255773uh A03;
    public C17885Vhc A04;
    public F3J A05;
    public C46434Dew A06;
    public boolean A07 = true;
    public AnonymousClass32A A08;
    public String A09;
    public final C228172ku A0A = new C228172ku();

    public final void Cun(VW6 vw6) {
    }

    public final void CyQ(C14631Tzd tzd) {
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        List singletonList = Collections.singletonList(reel);
        AnonymousClass32A r3 = this.A08;
        r3.A0C = this.A09;
        C16165Upq.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 12);
        r3.A09(reel, AnonymousClass3BQ.REEL_VIEWER_LIST, gradientSpinnerAvatarView, singletonList, singletonList, singletonList);
    }

    public final void DRv(C14631Tzd tzd, C255773uh r2, User user) {
    }

    public final void Dc5(User user, boolean z) {
    }

    public final void Drv(VW6 vw6) {
    }

    public final void Drw(User user) {
        String str;
        F3J f3j = this.A05;
        if (f3j == null) {
            f3j = new F3J(this, this.A01);
            this.A05 = f3j;
        }
        if (this instanceof C16470UvQ) {
            str = "quick_reactions_list";
        } else {
            str = "poll_voters_list";
        }
        Reel reel = this.A02;
        reel.getClass();
        f3j.A01(this, user, str, false, reel.A0d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1.CKB() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C15391Ubu r2) {
        /*
            X.Dew r1 = r2.A06
            boolean r0 = r1.isLoading()
            if (r0 == 0) goto L_0x000f
            boolean r1 = r1.CKB()
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            X.C46445Df7.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15391Ubu.A01(X.Ubu):void");
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A01;
    }

    public final void A0c() {
        if (this instanceof C16470UvQ) {
            C16470UvQ uvQ = (C16470UvQ) this;
            if (uvQ.A03 != null) {
                uvQ.A0d();
                uvQ.A06.A01 = false;
                UserSession userSession = uvQ.A01;
                1Xj r0 = uvQ.A03.A0b;
                r0.getClass();
                String id = r0.getId();
                String str = uvQ.A00;
                String str2 = uvQ.A06.A00;
                1NY A0O = DbU.A0O(userSession);
                A0O.A0K("media/%s/list_reel_media_reactor/", new Object[]{id});
                A0O.A0R(UY3.class, C18233Vo0.class);
                if (str != null) {
                    A0O.A9m(AnonymousClass000.A00(753), str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    A0O.A9m("max_id", str2);
                }
                1OC A0M = A0O.A0M();
                C15622Ufo.A00(A0M, uvQ, 30);
                uvQ.schedule(A0M);
                return;
            }
            return;
        }
        C16469UvP uvP = (C16469UvP) this;
        if (uvP.A03 != null) {
            uvP.A0d();
            uvP.A06.A01 = false;
            UserSession userSession2 = uvP.A01;
            1Xj r02 = uvP.A03.A0b;
            r02.getClass();
            String id2 = r02.getId();
            C272024jy A002 = C297825sP.A00(uvP.A03);
            A002.getClass();
            1OC A042 = 1NP.A04(userSession2, id2, AnonymousClass9OX.A00(A002), uvP.A06.A00, uvP.A00);
            C15622Ufo.A00(A042, uvP, 29);
            uvP.schedule(A042);
        }
    }

    public final void A0d() {
        this.A06.A02 = true;
        Dbb.A17(this, true);
        if (A0e()) {
            A01(this);
        }
    }

    public final boolean A0e() {
        List list;
        if (this instanceof C16470UvQ) {
            list = ((C15455Ud6) this.A00).A02;
        } else {
            list = ((C15458Ud9) this.A00).A04;
        }
        return list.isEmpty();
    }

    public final boolean CJz() {
        return !this.A00.isEmpty();
    }

    public final void D8u(C14631Tzd tzd, C255773uh r5, User user, boolean z) {
        String str;
        1ap r2 = 1as.A04.A02;
        UserSession userSession = this.A01;
        if (this instanceof C16470UvQ) {
            str = C66579MXk.A00(1064);
        } else {
            str = "reel_dashboard_viewer";
        }
        OOA A062 = r2.A06(this, userSession, str);
        C13992Tns.A0y(A062, r5, user, z);
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(getContext());
        A022.getClass();
        A022.A0I(A062.A00());
    }

    public final void DVp(C14631Tzd tzd) {
        User user = tzd.A0L;
        user.getClass();
        C17885Vhc vhc = this.A04;
        if (vhc == null) {
            vhc = new C17885Vhc(getRootActivity());
            this.A04 = vhc;
        }
        Reel reel = this.A02;
        reel.getClass();
        vhc.A00(reel, new C19521Wb7(3, this, tzd), user, getModuleName());
    }

    public final void Dc4() {
        0fE.A00(this.A00, -2079118201);
    }

    public final void DzU(C14631Tzd tzd) {
        String str;
        User user = tzd.A0L;
        user.getClass();
        UserSession userSession = this.A01;
        String id = user.getId();
        if (this instanceof C16470UvQ) {
            str = "reel_aggregated_quick_reactions_list";
        } else {
            str = "reel_poll_voters_list";
        }
        C46474Dfc A012 = C46548Dgp.A01(userSession, id, str, getModuleName());
        C46474Dfc.A02(new C309516Yo(requireActivity(), this.A01), this.A01, C46447Df9.A02(), A012);
    }

    public final void configureActionBar(2da r3) {
        Context requireContext;
        int i;
        if (this instanceof C16470UvQ) {
            getContext().getClass();
            requireContext = getContext();
            i = 2131971598;
        } else {
            requireContext = requireContext();
            i = 2131971581;
        }
        DbW.A1C(r3, requireContext.getString(i));
    }

    public final void A0W(Bundle bundle) {
        super.A0W(bundle);
        A0c();
    }

    public final void CgO() {
        A0c();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.G7r, X.0iw, androidx.fragment.app.Fragment, X.Ubu] */
    public void onCreate(Bundle bundle) {
        C331047Ph ud9;
        int A022 = AnonymousClass0fD.A02(-1214012997);
        C15391Ubu.super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        String string = requireArguments().getString("ReelUserListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelUserListFragment.REEL_ITEM_ID");
        Reel A0M = ReelStore.A03(this.A01).A0M(string);
        this.A02 = A0M;
        if (A0M != null) {
            Iterator it = A0M.A0O(this.A01).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C255773uh r1 = (C255773uh) it.next();
                if (r1.A0j.equals(string2)) {
                    this.A03 = r1;
                    break;
                }
            }
        }
        this.A06 = new C46434Dew(this, this.A01, this);
        if (this instanceof C16470UvQ) {
            getContext().getClass();
            ud9 = new C15455Ud6(getContext(), this, this.A01, this, this.A06);
        } else {
            ud9 = new C15458Ud9(requireContext(), this, this.A01, this, this.A06);
        }
        this.A00 = ud9;
        this.A08 = new AnonymousClass32A(this, this.A01, new AnonymousClass328(this));
        this.A09 = AnonymousClass7TF.A0b();
        AnonymousClass0fD.A09(340247950, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1812562060);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_listview_with_progress);
        AnonymousClass0fD.A09(-1387615917, A022);
        return A0C;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-975003195);
        super.onResume();
        if (!AnonymousClass06S.A00(DbV.A0I(this)) && this.A03 == null) {
            DbT.A1J(this);
        }
        AnonymousClass3K2 A0a = C13989Tnp.A0a(this);
        if (A0a != null && A0a.A0Z() && A0a.A0H == AnonymousClass3BQ.REEL_VIEWER_LIST) {
            A0a.A0X(this);
        }
        AnonymousClass0fD.A09(-454150987, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(1191363420);
        this.A0A.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(1868924716, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(-1096431186);
        this.A0A.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-765893075, A032);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1763527925);
        C15391Ubu.super.onStart();
        A01(this);
        AnonymousClass0fD.A09(1279270517, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A.A01(this.A06);
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
        A0V(this.A00);
    }
}
