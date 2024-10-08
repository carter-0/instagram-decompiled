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

/* renamed from: X.Ubw  reason: case insensitive filesystem */
public final class C15393Ubw extends AnonymousClass32G implements X9R, AbsListView.OnScrollListener, G7P, AnonymousClass4DS, C51923G7r {
    public static final String __redex_internal_original_name = "ReelSliderVotersListFragment";
    public UserSession A00;
    public Reel A01;
    public C255773uh A02;
    public C17885Vhc A03;
    public F3J A04;
    public C46434Dew A05;
    public C15457Ud8 A06;
    public boolean A07 = true;
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
                C16165Upq.A00(requireActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 11);
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
        if (user != null) {
            C17885Vhc vhc = this.A03;
            if (vhc == null) {
                vhc = new C17885Vhc(getRootActivity());
                this.A03 = vhc;
            }
            Reel reel = this.A01;
            if (reel != null) {
                vhc.A00(reel, new C19521Wb7(2, tzd, this), user, "reel_slider_voters_list");
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
        F3J f3j = this.A04;
        if (f3j == null) {
            UserSession userSession = this.A00;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            } else {
                f3j = new F3J(this, userSession);
                this.A04 = f3j;
            }
        }
        Reel reel = this.A01;
        if (reel != null) {
            f3j.A01(this, user2, "slider_voters_list", false, reel.A0d());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DzU(C14631Tzd tzd) {
        0qQ.A0B(tzd, 0);
        User user = tzd.A0L;
        if (user != null) {
            UserSession userSession = this.A00;
            if (userSession != null) {
                C46474Dfc A012 = C46548Dgp.A01(userSession, user.getId(), "reel_slider_voters_list", "reel_slider_voters_list");
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
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C228172ku r1 = this.A0A;
        C46434Dew dew = this.A05;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            r1.A01(dew);
            0S7.A00(this);
            this.A04.setOnScrollListener(this);
            C15457Ud8 ud8 = this.A06;
            if (ud8 == null) {
                str = "adapter";
            } else {
                A0V(ud8);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01() {
        List Bkd;
        1Xj r0;
        if (this.A02 != null) {
            A02(this);
            C46434Dew dew = this.A05;
            String str = "paginationHelper";
            String str2 = null;
            if (dew != null) {
                dew.A01 = false;
                C255773uh r1 = this.A02;
                if (r1 == null || (Bkd = r1.Bkd(AnonymousClass3WT.SLIDER)) == null) {
                    throw AnonymousClass7TE.A0y();
                }
                C19472WaK A0G = ((C255783ui) Bkd.get(0)).A0G();
                UserSession userSession = this.A00;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    C255773uh r02 = this.A02;
                    if (!(r02 == null || (r0 = r02.A0b) == null)) {
                        str2 = r0.getId();
                    }
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    if (A0G != null) {
                        String str4 = A0G.A00.A08;
                        if (str4 == null) {
                            str4 = str3;
                        }
                        str3 = str4;
                    }
                    C46434Dew dew2 = this.A05;
                    if (dew2 != null) {
                        String str5 = dew2.A00;
                        1NY A0b = AnonymousClass7TG.A0b(userSession);
                        StringBuilder sb = new StringBuilder();
                        sb.append("media/");
                        sb.append(str2);
                        sb.append('/');
                        sb.append(str3);
                        A0b.A0A(AnonymousClass7TF.A0l("/story_slider_voters/", sb));
                        A0b.A9m("max_id", str5);
                        1OC A0S = DbU.A0S(A0b, CFZ.class, D2I.class);
                        C15622Ufo.A00(A0S, this, 28);
                        schedule(A0S);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(C15393Ubw ubw) {
        String str;
        C46434Dew dew = ubw.A05;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            dew.A02 = true;
            DbY.A18(ubw, true);
            C15457Ud8 ud8 = ubw.A06;
            if (ud8 == null) {
                str = "adapter";
            } else if (ud8.A03.isEmpty()) {
                A03(ubw);
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
    public static final void A03(X.C15393Ubw r2) {
        /*
            X.Dew r1 = r2.A05
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
        throw new UnsupportedOperationException("Method not decompiled: X.C15393Ubw.A03(X.Ubw):void");
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
        C15457Ud8 ud8 = this.A06;
        if (ud8 != null) {
            return !ud8.isEmpty();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dc4() {
        C15457Ud8 ud8 = this.A06;
        if (ud8 == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            0fE.A00(ud8, -542473350);
        }
    }

    public final String getModuleName() {
        return "reel_slider_voters_list";
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
        A062.A01(C66579MXk.A00(399));
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(requireContext());
        if (A022 != null) {
            A022.A0J(A062.A00());
        }
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getString(2131971645));
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.G7r, X.0iw, androidx.fragment.app.Fragment, X.Ubw] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1436335440);
        C15393Ubw.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        String string = requireArguments().getString("ReelSliderVotersListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelSliderVotersListFragment.REEL_ITEM_ID");
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
                            this.A02 = r1;
                            break;
                        }
                    }
                }
            }
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            UserSession userSession3 = this.A00;
            if (userSession3 != null) {
                this.A05 = new C46434Dew(this, userSession3, this);
                Context requireContext = requireContext();
                UserSession userSession4 = this.A00;
                if (userSession4 != null) {
                    C46434Dew dew = this.A05;
                    if (dew == null) {
                        str = "paginationHelper";
                    } else {
                        this.A06 = new C15457Ud8(requireContext, this, userSession4, this, dew);
                        UserSession userSession5 = this.A00;
                        if (userSession5 != null) {
                            this.A08 = new AnonymousClass32A(this, userSession5, new AnonymousClass328(this));
                            this.A09 = AnonymousClass7TF.A0b();
                            A01();
                            AnonymousClass0fD.A09(-628114669, A022);
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
        int A022 = AnonymousClass0fD.A02(1067271789);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0fD.A09(-1730772301, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1629672085);
        super.onResume();
        if (!AnonymousClass06S.A00(DbV.A0I(this)) && this.A02 == null) {
            DbT.A1J(this);
        }
        C13992Tns.A0x(this, C13989Tnp.A0a(this));
        AnonymousClass0fD.A09(215666976, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, -1088583778);
        this.A0A.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(539182330, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, 1911596511);
        this.A0A.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-1864352988, A0D);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1165145818);
        C15393Ubw.super.onStart();
        A03(this);
        AnonymousClass0fD.A09(-1070616665, A022);
    }
}
