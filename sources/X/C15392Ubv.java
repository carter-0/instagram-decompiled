package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ubv  reason: case insensitive filesystem */
public final class C15392Ubv extends AnonymousClass32G implements X9R, AbsListView.OnScrollListener, G7P, AnonymousClass4DS, C51923G7r {
    public static final String __redex_internal_original_name = "ReelFundraiserDonorsListFragment";
    public UserSession A00;
    public Reel A01;
    public C17885Vhc A02;
    public F3J A03;
    public C46434Dew A04;
    public C15454Ud5 A05;
    public boolean A06 = true;
    public C255773uh A07;
    public AnonymousClass32A A08;
    public String A09;
    public final C228172ku A0A = new C228172ku();

    public final void Cun(VW6 vw6) {
    }

    public final void CyQ(C14631Tzd tzd) {
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        Reel reel2 = reel;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        AnonymousClass7TG.A1N(reel, gradientSpinnerAvatarView);
        List A1I = AnonymousClass7TE.A1I(reel);
        AnonymousClass32A r3 = this.A08;
        if (r3 == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A09;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                r3.A0C = str2;
                C16165Upq.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 9);
                r3.A09(reel2, AnonymousClass3BQ.REEL_VIEWER_LIST, gradientSpinnerAvatarView2, A1I, A1I, A1I);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DRv(C14631Tzd tzd, C255773uh r2, User user) {
    }

    public final void DVp(C14631Tzd tzd) {
        0qQ.A0B(tzd, 0);
        User user = tzd.A0L;
        C17885Vhc vhc = this.A02;
        if (vhc == null) {
            vhc = new C17885Vhc(getRootActivity());
            this.A02 = vhc;
        }
        if (user != null) {
            Reel reel = this.A01;
            if (reel != null) {
                vhc.A00(reel, new C19521Wb7(0, tzd, this), user, "reel_fundraiser_donors_list");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void Dc5(User user, boolean z) {
    }

    public final void DhN() {
    }

    public final void Drv(VW6 vw6) {
    }

    public final void Drw(User user) {
        User user2 = user;
        0qQ.A0B(user, 0);
        F3J f3j = this.A03;
        if (f3j == null) {
            UserSession userSession = this.A00;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            } else {
                f3j = new F3J(this, userSession);
                this.A03 = f3j;
            }
        }
        Reel reel = this.A01;
        if (reel != null) {
            f3j.A01(this, user2, "fundraiser_donors_list", false, reel.A0d());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DzU(C14631Tzd tzd) {
        0qQ.A0B(tzd, 0);
        User user = tzd.A0L;
        UserSession userSession = this.A00;
        if (userSession != null) {
            if (user != null) {
                C46474Dfc A012 = C46548Dgp.A01(userSession, user.getId(), "reel_fundraiser_donors_list", "reel_fundraiser_donors_list");
                FragmentActivity requireActivity = requireActivity();
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    C309516Yo r2 = new C309516Yo(requireActivity, userSession2);
                    1a1 A022 = C46447Df9.A02();
                    UserSession userSession3 = this.A00;
                    if (userSession3 != null) {
                        C46474Dfc.A03(r2, userSession3, A022, A012);
                        return;
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C228172ku r1 = this.A0A;
        C46434Dew dew = this.A04;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            r1.A01(dew);
            0S7.A00(this);
            this.A04.setOnScrollListener(this);
            C15454Ud5 ud5 = this.A05;
            if (ud5 == null) {
                str = "adapter";
            } else {
                A0V(ud5);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01() {
        C255773uh r4 = this.A07;
        if (r4 != null) {
            A02(this);
            C46434Dew dew = this.A04;
            if (dew != null) {
                dew.A01 = false;
                UserSession userSession = this.A00;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
                1Xj r0 = r4.A0b;
                if (r0 != null) {
                    String A30 = r0.A30();
                    C255783ui A002 = C289745e8.A00(AnonymousClass3WT.FUNDRAISER, r4.A0b());
                    if (A002 != null) {
                        AnonymousClass8YF r1 = A002.A0y;
                        if (r1 != null) {
                            int[] iArr = C19475WaN.A03;
                            String str = r1.A08;
                            C46434Dew dew2 = this.A04;
                            if (dew2 != null) {
                                String str2 = dew2.A00;
                                1NY A0b = AnonymousClass7TG.A0b(userSession);
                                A0b.A0A("media/story_fundraiser_donations/");
                                A0b.A9m("fundraiser_id", str);
                                JTO.A1W(A0b, A30);
                                A0b.A0Q(CET.class, C45640Czq.class);
                                if (str2 != null) {
                                    A0b.A9m("max_id", str2);
                                }
                                1OC A0M = A0b.A0M();
                                C15619Ufl.A00(A0M, r4, this, 31);
                                schedule(A0M);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0qQ.A0F("paginationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(C15392Ubv ubv) {
        String str;
        C46434Dew dew = ubv.A04;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            dew.A02 = true;
            DbY.A17(ubv, 2dZ.A0t, true);
            C15454Ud5 ud5 = ubv.A05;
            if (ud5 == null) {
                str = "adapter";
            } else if (ud5.A02.isEmpty()) {
                A03(ubv);
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1.CKB() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C15392Ubv r2) {
        /*
            X.Dew r1 = r2.A04
            java.lang.String r0 = "paginationHelper"
            if (r1 != 0) goto L_0x000e
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            boolean r0 = r1.isLoading()
            if (r0 == 0) goto L_0x001b
            boolean r1 = r1.CKB()
            r0 = 1
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            X.C46445Df7.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15392Ubv.A03(X.Ubv):void");
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CJz() {
        C15454Ud5 ud5 = this.A05;
        if (ud5 != null) {
            return !ud5.isEmpty();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dc4() {
        C15454Ud5 ud5 = this.A05;
        if (ud5 == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            0fE.A00(ud5, 2077900766);
        }
    }

    public final String getModuleName() {
        return "reel_fundraiser_donors_list";
    }

    public final void CgO() {
        A01();
    }

    public final void D8u(C14631Tzd tzd, C255773uh r5, User user, boolean z) {
        AnonymousClass7TG.A1O(user, r5);
        1ap r2 = 1as.A04.A02;
        UserSession userSession = this.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        OOA A062 = r2.A06(this, userSession, "reel_dashboard_viewer");
        C13992Tns.A0y(A062, r5, user, z);
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(getContext());
        if (A022 != null) {
            A022.A0J(A062.A00());
        }
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getString(2131971522));
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.G7r, X.0iw, androidx.fragment.app.Fragment, X.Ubv] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-704167449);
        C15392Ubv.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        String string = requireArguments().getString("ReelFundraiserDonorsListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelFundraiserDonorsListFragment.REEL_ITEM_ID");
        UserSession userSession = this.A00;
        String str = "userSession";
        if (userSession != null) {
            Reel A0M = ReelStore.A03(userSession).A0M(string);
            this.A01 = A0M;
            if (A0M != null) {
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    Iterator it = A0M.A0O(userSession2).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C255773uh r1 = (C255773uh) it.next();
                        if (0qQ.A0K(r1.A0j, string2)) {
                            this.A07 = r1;
                            break;
                        }
                    }
                }
            }
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            UserSession userSession3 = this.A00;
            if (userSession3 != null) {
                this.A04 = new C46434Dew(this, userSession3, this);
                Context requireContext = requireContext();
                UserSession userSession4 = this.A00;
                if (userSession4 != null) {
                    C46434Dew dew = this.A04;
                    if (dew == null) {
                        str = "paginationHelper";
                    } else {
                        this.A05 = new C15454Ud5(requireContext, this, userSession4, this, dew);
                        UserSession userSession5 = this.A00;
                        if (userSession5 != null) {
                            this.A08 = new AnonymousClass32A(this, userSession5, new AnonymousClass328(this));
                            this.A09 = AnonymousClass7TF.A0b();
                            A01();
                            AnonymousClass0fD.A09(-1154226737, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(988718052);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0fD.A09(-1993785802, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(327793682);
        super.onResume();
        if (!AnonymousClass06S.A00(DbV.A0I(this)) && this.A07 == null) {
            DbT.A1J(this);
        }
        C13992Tns.A0x(this, C13989Tnp.A0a(this));
        AnonymousClass0fD.A09(-1906332217, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, -530117418);
        this.A0A.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(-1420325876, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, 1034891390);
        this.A0A.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(125084602, A0D);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1384065433);
        C15392Ubv.super.onStart();
        A03(this);
        AnonymousClass0fD.A09(-808472742, A022);
    }
}
