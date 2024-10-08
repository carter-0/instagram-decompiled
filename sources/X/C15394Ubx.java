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

/* renamed from: X.Ubx  reason: case insensitive filesystem */
public final class C15394Ubx extends AnonymousClass32G implements X9R, AbsListView.OnScrollListener, G7P, AnonymousClass4DS, C51923G7r {
    public static final String __redex_internal_original_name = "ReelQuizRespondersListFragment";
    public UserSession A00;
    public Reel A01;
    public C255773uh A02;
    public C17885Vhc A03;
    public F3J A04;
    public C46434Dew A05;
    public C15456Ud7 A06;
    public boolean A07 = true;
    public int A08;
    public AnonymousClass32A A09;
    public C19471WaJ A0A;
    public String A0B;
    public final C228172ku A0C = new C228172ku();

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
        AnonymousClass32A r3 = this.A09;
        if (r3 == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A0B;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                r3.A0C = str2;
                C16165Upq.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 10);
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
        C17885Vhc vhc = this.A03;
        if (vhc == null) {
            vhc = new C17885Vhc(getRootActivity());
            this.A03 = vhc;
        }
        0qQ.A0A(vhc);
        if (user != null) {
            Reel reel = this.A01;
            if (reel != null) {
                vhc.A00(reel, new C19521Wb7(1, tzd, this), user, "reel_quiz_responders_list");
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
        0qQ.A0A(f3j);
        Reel reel = this.A01;
        if (reel != null) {
            f3j.A01(this, user2, "quiz_responders_list", false, reel.A0d());
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
                C46474Dfc A012 = C46548Dgp.A01(userSession, user.getId(), "reel_quiz_responders_list", "reel_quiz_responders_list");
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

    public final void configureActionBar(2da r5) {
        String string;
        0qQ.A0B(r5, 0);
        C19471WaJ waJ = this.A0A;
        if (waJ == null || this.A08 == -1) {
            string = requireContext().getString(2131971600);
        } else {
            0qQ.A0A(waJ);
            List list = waJ.A02.A0C;
            if (list != null) {
                Object obj = list.get(this.A08);
                0qQ.A0A(obj);
                C21026XAf xAf = (C21026XAf) obj;
                0qQ.A0B(xAf, 0);
                string = xAf.getText();
                if (string == null || string.length() > 1000) {
                    string = "";
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        DbW.A1C(r5, string);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C228172ku r1 = this.A0C;
        C46434Dew dew = this.A05;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            r1.A01(dew);
            0S7.A00(this);
            this.A04.setOnScrollListener(this);
            C15456Ud7 ud7 = this.A06;
            if (ud7 == null) {
                str = "adapter";
            } else {
                A0V(ud7);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01() {
        if (this.A02 != null) {
            A02(this);
            C46434Dew dew = this.A05;
            if (dew != null) {
                dew.A01 = false;
                UserSession userSession = this.A00;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
                C255773uh r0 = this.A02;
                if (r0 != null) {
                    1Xj r02 = r0.A0b;
                    if (r02 != null) {
                        String A30 = r02.A30();
                        C19471WaJ waJ = this.A0A;
                        if (waJ != null) {
                            String str = waJ.A02.A08;
                            if (str == null) {
                                str = "";
                            }
                            int i = this.A08;
                            C46434Dew dew2 = this.A05;
                            if (dew2 != null) {
                                String str2 = dew2.A00;
                                1NY A0b = AnonymousClass7TG.A0b(userSession);
                                DbU.A1P(A0b, "media/%s/%s/story_quiz_participants/", new Object[]{A30, str});
                                A0b.A0G("max_id", str2);
                                A0b.A0R(CFY.class, D2H.class);
                                if (i != -1) {
                                    A0b.A9m("answer", Integer.toString(i));
                                }
                                1OC A0M = A0b.A0M();
                                C15622Ufo.A00(A0M, this, 26);
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

    public static final void A02(C15394Ubx ubx) {
        String str;
        C46434Dew dew = ubx.A05;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            dew.A02 = true;
            DbY.A17(ubx, 2dZ.A0t, true);
            C15456Ud7 ud7 = ubx.A06;
            if (ud7 == null) {
                str = "adapter";
            } else if (ud7.A03.isEmpty()) {
                A03(ubx);
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
    public static final void A03(X.C15394Ubx r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C15394Ubx.A03(X.Ubx):void");
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
        C15456Ud7 ud7 = this.A06;
        if (ud7 != null) {
            return !ud7.isEmpty();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dc4() {
        C15456Ud7 ud7 = this.A06;
        if (ud7 == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            0fE.A00(ud7, -337831832);
        }
    }

    public final String getModuleName() {
        return "reel_quiz_responders_list";
    }

    public final void CgO() {
        A01();
    }

    public final void D8u(C14631Tzd tzd, C255773uh r5, User user, boolean z) {
        AnonymousClass37D A0i;
        AnonymousClass7TG.A1O(user, r5);
        1ap r2 = 1as.A04.A02;
        UserSession userSession = this.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        OOA A062 = r2.A06(this, userSession, "reel_dashboard_viewer");
        C13992Tns.A0y(A062, r5, user, z);
        A062.A01(C66579MXk.A00(398));
        FragmentActivity activity = getActivity();
        if (activity != null && (A0i = DbT.A0i(activity)) != null) {
            A0i.A0J(A062.A00());
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.G7r, X.0iw, androidx.fragment.app.Fragment, X.Ubx] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2015552469);
        C15394Ubx.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        String string = requireArguments().getString("ReelQuizRespondersListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelQuizRespondersListFragment.REEL_ITEM_ID");
        this.A08 = requireArguments().getInt("ReelQuizRespondersListFragment.QUIZ_OPTION_INDEX", -1);
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
            C255773uh r0 = this.A02;
            if (r0 != null) {
                this.A0A = C265894Ws.A01(r0);
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
                            this.A06 = new C15456Ud7(requireContext, this, userSession4, this, dew);
                            UserSession userSession5 = this.A00;
                            if (userSession5 != null) {
                                this.A09 = new AnonymousClass32A(this, userSession5, new AnonymousClass328(this));
                                this.A0B = AnonymousClass7TF.A0b();
                                A01();
                                AnonymousClass0fD.A09(524363634, A022);
                                return;
                            }
                        }
                    }
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-2132927404, A022);
                throw A0y;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(620161709);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0fD.A09(523992116, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(434041442);
        super.onResume();
        if (!AnonymousClass06S.A00(DbV.A0I(this)) && this.A02 == null) {
            DbT.A1J(this);
        }
        C13992Tns.A0x(this, C13989Tnp.A0a(this));
        AnonymousClass0fD.A09(252587955, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, 617834430);
        this.A0C.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(601870043, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, 1485744927);
        this.A0C.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-1037614783, A0D);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1836176491);
        C15394Ubx.super.onStart();
        A03(this);
        AnonymousClass0fD.A09(2004232307, A022);
    }
}
