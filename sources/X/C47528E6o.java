package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.E6o  reason: case insensitive filesystem */
public final class C47528E6o extends C227812jx implements AnonymousClass71G, AnonymousClass4DS, C337267fz {
    public static final String __redex_internal_original_name = "DiscoverPeopleSearchFragment";
    public C358448av A00;
    public C50915Fku A01;
    public C14221Ts1 A02;
    public E9N A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass32A A07;
    public String A08;
    public boolean A09 = true;
    public final C51916G7k A0A = new C50913Fks(this, 1);
    public final List A0B = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        String str3;
        0qQ.A0B(str, 0);
        AnonymousClass0eM r1 = this.A0C;
        Location A002 = FFZ.A00(AnonymousClass7TE.A0l(r1));
        boolean z = this.A05;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        String moduleName = getModuleName();
        if (!z) {
            return C18242Vo9.A00(A002, A0l, str, moduleName);
        }
        0qQ.A0C(A0l, AnonymousClass000.A00(333));
        String str4 = null;
        1NY A0b = AnonymousClass7TG.A0b(A0l);
        A0b.A0A("fbsearch/non_profiled_serp/");
        A0b.A9m("query", str);
        A0b.A0C("count", 30);
        A0b.A9m("timezone_offset", String.valueOf(1G0.A00()));
        A0b.A9m("search_surface", moduleName);
        if (A002 != null) {
            str3 = Double.valueOf(A002.getLatitude()).toString();
        } else {
            str3 = null;
        }
        A0b.A0G("lat", str3);
        if (A002 != null) {
            str4 = Double.valueOf(A002.getLongitude()).toString();
        }
        A0b.A0G("lng", str4);
        return DbT.A0R((15p) null, A0b, C69154Nfd.class, OR7.class, false);
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        Reel reel2 = reel;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        AnonymousClass7TG.A1N(reel, gradientSpinnerAvatarView);
        List A1I = AnonymousClass7TE.A1I(reel);
        AnonymousClass32A r3 = this.A07;
        if (r3 == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A08;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                r3.A0C = str2;
                C50896Fkb.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 2);
                r3.A09(reel2, AnonymousClass3BQ.DISCOVER_PEOPLE_SEARCH, gradientSpinnerAvatarView2, A1I, A1I, A1I);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DGM(User user, int i) {
        0qQ.A0B(user, 0);
        if (!this.A05) {
            DbS.A1D(this);
            if (user.A0N() == AnonymousClass05K.A01) {
                if (user.B6o() == FollowStatus.A05) {
                    E9N e9n = this.A03;
                    if (e9n != null) {
                        if (!e9n.A0B) {
                            A01(this, user);
                            return;
                        }
                    }
                    0qQ.A0F("userListAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (user.B6o() == FollowStatus.A06) {
                    E9N e9n2 = this.A03;
                    if (e9n2 != null) {
                        if (user.equals(e9n2.A07)) {
                            E9N e9n3 = this.A03;
                            if (e9n3 != null) {
                                e9n3.A0B = false;
                                e9n3.A07 = null;
                                A00(this);
                                List list = this.A0B;
                                list.remove(user);
                                list.add(0, user);
                                E9N e9n4 = this.A03;
                                if (e9n4 != null) {
                                    e9n4.A05(list);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    0qQ.A0F("userListAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public final void DRX(User user) {
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final void DwV(User user, int i) {
        0qQ.A0B(user, 0);
        DwW(requireView(), user, i);
    }

    public final void DwW(View view, User user, int i) {
        0qQ.A0B(user, 0);
        AnonymousClass0eM r4 = this.A0C;
        C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r4), user.getId(), "search_in_dp_user_row", getModuleName());
        C309516Yo A0P = DbZ.A0P(this, r4);
        A0P.A0F = true;
        C46474Dfc.A03(A0P, AnonymousClass7TE.A0l(r4), C46447Df9.A02(), A012);
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131960853);
        r3.Eu5(FP8.A00(this, 64), true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        E9N e9n = this.A03;
        if (e9n == null) {
            str = "userListAdapter";
        } else {
            setAdapter(e9n);
            getScrollingViewProxy().AAD(new C47918EMo(view, 1));
            ViewGroup A0I = DbX.A0I(view, R.id.action_bar_search_hints_text_layout);
            0nA.A0Z(A0I, 12);
            0nA.A0b(A0I, 12);
            View childAt = A0I.getChildAt(0);
            0qQ.A0C(childAt, AnonymousClass000.A00(1640));
            SearchEditText searchEditText = (SearchEditText) childAt;
            ColorFilter A0A2 = Dbb.A0A(requireContext(), this);
            Drawable drawable = searchEditText.getCompoundDrawablesRelative()[0];
            if (drawable != null) {
                drawable.mutate();
                drawable.setAlpha(51);
                drawable.setColorFilter(A0A2);
            }
            C50915Fku fku = this.A01;
            if (fku == null) {
                str = "searchBarController";
            } else {
                fku.A00(searchEditText, true);
                if (this.A05 && this.A09) {
                    1NY A0M = DbZ.A0M(DbT.A0X(this.A0C));
                    A0M.A0A("discover/non_profiled/");
                    C47697EDg.A01(this, DbU.A0S(A0M, CDG.class, C45598CzA.class), 48);
                    this.A09 = false;
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C47528E6o e6o) {
        E9N e9n = e6o.A03;
        if (e9n == null) {
            0qQ.A0F("userListAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        C47632EAs eAs = e9n.A0Q;
        eAs.A00 = e6o;
        eAs.A01 = true;
    }

    public static final void A01(C47528E6o e6o, User user) {
        1OC A022 = FGQ.A02(AnonymousClass7TE.A0l(e6o.A0C), 0mp.A06("friendships/%s/following/", new Object[]{user.getId()}), "search_in_dp");
        EDV.A00(A022, user, e6o, 12);
        e6o.schedule(A022);
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DeM(C268654dm r4, String str) {
        C14221Ts1 ts1;
        if (this.A06 && (ts1 = this.A02) != null && !ts1.A04()) {
            E9N e9n = this.A03;
            if (e9n == null) {
                0qQ.A0F("userListAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            e9n.A0C = false;
            e9n.A04 = new C50988Fmb(this, (User) null, (List) null);
            e9n.A0A = true;
            e9n.A03();
            DbS.A1D(this);
        }
    }

    public final void Dem(String str) {
        String str2;
        if (this.A06) {
            C50915Fku fku = this.A01;
            if (fku == null) {
                str2 = "searchBarController";
            } else if (fku.A01.length() > 0) {
                E9N e9n = this.A03;
                str2 = "userListAdapter";
                if (e9n != null) {
                    if (!e9n.A0C) {
                        e9n.A0C = true;
                        e9n.A03();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r4, String str) {
        C14221Ts1 ts1;
        C69154Nfd nfd = (C69154Nfd) r4;
        0qQ.A0B(nfd, 1);
        if (this.A06 && (ts1 = this.A02) != null && !ts1.A04()) {
            E9N e9n = this.A03;
            String str2 = "userListAdapter";
            if (e9n != null) {
                e9n.A0C = false;
                C50915Fku fku = this.A01;
                if (fku == null) {
                    str2 = "searchBarController";
                } else if (fku.A01.length() > 0) {
                    0sn r0 = nfd.A01;
                    if (r0 == null) {
                        r0 = 0sn.A00;
                    }
                    e9n.A05(r0);
                    getScrollingViewProxy().EKn(false);
                    return;
                } else {
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final String getModuleName() {
        E9N e9n = this.A03;
        if (e9n == null || !e9n.A0B) {
            return "search_in_dp";
        }
        return "search_in_dp_following_list";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final AnonymousClass4D6 Bpf() {
        return 1ES.A01();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.2ms] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003d, code lost:
        if (X.182.A06(r5, X.DbT.A0X(r2), 36318685836614007L) != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        if (r6.A05 != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = -1694575997(0xffffffff9afed283, float:-1.0539204E-22)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r6 = r28
            r0 = r29
            super.onCreate(r0)
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            X.0eM r2 = r6.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.8av r0 = X.C358428at.A00(r6, r0, r3)
            r6.A00 = r0
            X.0lg r0 = X.DbT.A0X(r2)
            X.0Tu r5 = X.0Tu.A06
            r3 = 36318685836679544(0x8107a700011978, double:3.0314213945011236E-306)
            boolean r0 = X.182.A06(r5, r0, r3)
            if (r0 != 0) goto L_0x003f
            X.0lg r0 = X.DbT.A0X(r2)
            r3 = 36318685836614007(0x8107a700001977, double:3.031421394459678E-306)
            boolean r3 = X.182.A06(r5, r0, r3)
            r0 = 0
            if (r3 == 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            r6.A05 = r0
            X.0lg r5 = X.DbT.A0X(r2)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36314601322777313(0x8103f000010ae1, double:3.0288383314623354E-306)
            boolean r0 = X.182.A06(r0, r5, r3)
            if (r0 != 0) goto L_0x0058
            boolean r3 = r6.A05
            r0 = 0
            if (r3 == 0) goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            r6.A06 = r0
            if (r0 == 0) goto L_0x0071
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            r5 = 0
            X.7g1 r8 = new X.7g1
            r8.<init>()
            r10 = 0
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r7 = r5
            X.Ts1 r0 = X.C14225Ts5.A01(r4, r5, r6, r7, r8, r9, r10)
            r6.A02 = r0
        L_0x0071:
            X.G7k r4 = r6.A0A
            r3 = 2131960852(0x7f132414, float:1.9558384E38)
            X.Fku r0 = new X.Fku
            r0.<init>(r4, r3)
            r6.A01 = r0
            android.content.Context r5 = r6.requireContext()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            r7 = 0
            r0 = 2
            X.0qQ.A0B(r9, r0)
            X.Fmj r11 = new X.Fmj
            r11.<init>()
            r19 = 0
            r25 = 1
            X.E9N r4 = new X.E9N
            r8 = r6
            r10 = r7
            r12 = r7
            r13 = r6
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r19
            r26 = r19
            r27 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r6.A03 = r4
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            X.328 r2 = X.DbV.A0f(r6)
            X.32A r0 = new X.32A
            r0.<init>(r6, r3, r2)
            r6.A07 = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r6.A08 = r0
            r0 = -402160181(0xffffffffe80785cb, float:-2.55995E24)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47528E6o.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(816900989);
        0qQ.A0B(layoutInflater, 0);
        C47528E6o.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_recyclerview_with_progress_and_search, false);
        AnonymousClass0fD.A09(-852546869, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1479382056);
        E9N e9n = this.A03;
        if (e9n == null) {
            0qQ.A0F("userListAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7Q8 r0 = e9n.A06;
        if (r0 != null) {
            r0.A01();
        }
        super.onDestroy();
        AnonymousClass0fD.A09(-953815234, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbZ.A1D(recyclerView);
        recyclerView.A0S = true;
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
