package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.E6j  reason: case insensitive filesystem */
public final class C47523E6j extends C227812jx implements C229122ms, C229132mt, C227252iu, AnonymousClass4DS, AnonymousClass32K {
    public static final String __redex_internal_original_name = "ExplorePeopleFragment";
    public Bundle A00;
    public E9K A01;
    public C320106rm A02;
    public AnonymousClass3AD A03;
    public C46634DiE A04 = C46634DiE.A0b;
    public Integer A05 = AnonymousClass05K.A01;
    public String A06 = "unknown";
    public String A07;
    public String A08;
    public boolean A09 = true;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public F07 A0F;
    public 2el A0G;
    public C47292DuL A0H;
    public C14190TrU A0I;
    public DdO A0J;
    public C46487Dfq A0K;
    public EEL A0L;
    public AnonymousClass7Q8 A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public boolean A0Q = true;
    public boolean A0R;
    public final AnonymousClass0eM A0S = C227642jf.A02(this);

    public final boolean CT5() {
        return false;
    }

    public final void configureActionBar(2da r6) {
        boolean z = false;
        0qQ.A0B(r6, 0);
        if (requireArguments().containsKey("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE")) {
            r6.setTitle(requireArguments().getString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE"));
        } else {
            r6.Eom(2131960850);
        }
        C51950G8t A002 = C49047EoR.A00(this);
        if (A002 != null) {
            int i = 2131960850;
            if (this.A05 == AnonymousClass05K.A0N) {
                i = 2131953729;
            }
            r6.ErL(new FPE(70, (Object) A002, (Object) this), i);
        } else {
            z = true;
        }
        r6.Eu4(z);
        r6.ErT(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r5.A09 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0013
            X.TrU r1 = r5.A0I
            if (r1 == 0) goto L_0x0013
            X.3Ar r0 = r5.getScrollingViewProxy()
            r0.AAD(r1)
        L_0x0013:
            X.3Ar r2 = r5.getScrollingViewProxy()
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 50
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3jo r1 = (X.C249453jo) r1
            X.3Dv r0 = new X.3Dv
            r0.<init>(r1, r4)
            r2.AAD(r0)
            X.3Ar r1 = r5.getScrollingViewProxy()
            X.Dfq r0 = r5.A0K
            if (r0 != 0) goto L_0x0042
            java.lang.String r1 = "dropFrameListener"
        L_0x003a:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0042:
            r1.AAD(r0)
            super.onViewCreated(r6, r7)
            X.E9K r0 = r5.A01
            if (r0 != 0) goto L_0x004f
            java.lang.String r1 = "explorePeopleAdapter"
            goto L_0x003a
        L_0x004f:
            r5.setAdapter(r0)
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x005b
            boolean r1 = r5.A09
            r0 = 0
            if (r1 == 0) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            X.C46445Df7.A00(r6, r0)
            java.lang.Integer r1 = r5.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0077
            X.3Ar r0 = r5.getScrollingViewProxy()
            X.3As r0 = (X.C238143As) r0
            if (r0 == 0) goto L_0x0070
            r0.APL()
        L_0x0070:
            X.7Q8 r0 = r5.A0M
            if (r0 != 0) goto L_0x0099
            java.lang.String r1 = "followStatusUpdatedEventListener"
            goto L_0x003a
        L_0x0077:
            X.3AD r0 = r5.A03
            java.lang.String r1 = "pullToRefresh"
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 == 0) goto L_0x0070
            X.3Ar r3 = r5.getScrollingViewProxy()
            X.3As r3 = (X.C238143As) r3
            if (r3 == 0) goto L_0x0070
            X.3AD r2 = r5.A03
            if (r2 == 0) goto L_0x003a
            X.Wf4 r2 = (X.C19763Wf4) r2
            r1 = 1
            X.WEb r0 = new X.WEb
            r0.<init>(r5, r1)
            r3.Epc(r0, r2)
            goto L_0x0070
        L_0x0099:
            r0.A00()
            X.3Ar r0 = r5.getScrollingViewProxy()
            X.3As r0 = (X.C238143As) r0
            if (r0 == 0) goto L_0x00b8
            X.2el r3 = r5.A0G
            if (r3 != 0) goto L_0x00ab
            java.lang.String r1 = "viewPointManager"
            goto L_0x003a
        L_0x00ab:
            X.3DZ r2 = X.AnonymousClass3DZ.A00(r5)
            android.view.View r1 = r0.CFN()
            X.2eo[] r0 = new X.AnonymousClass2eo[r4]
            r3.A08(r1, r2, r0)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47523E6j.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void A02() {
        if (!this.A0A && isResumed()) {
            this.A0D = true;
            this.A07 = null;
            A00();
        }
    }

    public final boolean CJz() {
        E9K e9k = this.A01;
        if (e9k != null) {
            return !e9k.isEmpty();
        }
        0qQ.A0F("explorePeopleAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        if (this.A07 == null || !this.A0C) {
            return false;
        }
        return true;
    }

    public final boolean CWV() {
        E9K e9k = this.A01;
        if (e9k != null) {
            return !e9k.isEmpty();
        }
        0qQ.A0F("explorePeopleAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKl() {
        if (this.mView != null) {
            getScrollingViewProxy().EKm(this);
        }
    }

    public final String getModuleName() {
        switch (this.A05.intValue()) {
            case 0:
            case 1:
            case 4:
                return "discover_people";
            case 2:
                return "discover_people_nux";
            case 3:
                return "based_on_your_interests";
            case 5:
                return "explore_businesses";
            default:
                return "explore_people";
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0S);
    }

    public final boolean isLoading() {
        return this.A0A;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        boolean z2 = C70542Rd.A03;
        return null;
    }

    private final void A00() {
        String str;
        String str2;
        1OC A012;
        1P0 ed0;
        Bundle requireArguments = requireArguments();
        C320106rm r0 = this.A02;
        String str3 = "latencyPerfLogger";
        if (r0 != null) {
            r0.A00.A08((String) null);
            C320106rm r1 = this.A02;
            if (r1 != null) {
                r1.A0E("fetch_request_start");
                if (!this.A0B) {
                    Integer num = this.A05;
                    Integer num2 = AnonymousClass05K.A0N;
                    if (num == num2) {
                        0lg A0X = DbT.A0X(this.A0S);
                        0qQ.A0B(A0X, 0);
                        1NY A0M2 = DbU.A0M(A0X);
                        A0M2.A08(num2);
                        A0M2.A0A("interest_nux/based_on_interests/");
                        A012 = DbT.A0R((15p) null, A0M2, C43821CEn.class, C45623CzZ.class, false);
                    } else {
                        UserSession A0l = AnonymousClass7TE.A0l(this.A0S);
                        boolean z = !AnonymousClass000.A00(1615).equals(this.A06);
                        int intValue = this.A05.intValue();
                        if (intValue == 4) {
                            str = "self_profile_dp";
                        } else if (intValue == 2 || intValue == 1) {
                            str = "explore_people";
                        } else {
                            str = getModuleName();
                        }
                        String str4 = this.A07;
                        if (this.A09) {
                            str2 = this.A0O;
                        } else {
                            str2 = null;
                        }
                        A012 = C46396DeJ.A01(A0l, (Integer) null, str, str4, str2, requireArguments.getString(C66579MXk.A00(97)), this.A0N, this.A0P, z, false);
                        C47292DuL duL = this.A0H;
                        if (duL == null) {
                            str3 = "navigationPerfLogger";
                        } else {
                            C320106rm r02 = this.A02;
                            if (r02 != null) {
                                ed0 = new ED0(this, duL, r02);
                                A012.A00 = ed0;
                                schedule(A012);
                                return;
                            }
                        }
                    }
                } else if (this.A08 == null || this.A0O == null) {
                    A012 = C46396DeJ.A02(AnonymousClass7TE.A0l(this.A0S), (String) null, this.A0O, this.A0P, AnonymousClass7TF.A1W(this.A05, AnonymousClass05K.A0C), Dba.A1X(EX9.SERP_USERS_CI_UPSELL, this.A06));
                } else {
                    A012 = C46396DeJ.A02(AnonymousClass7TE.A0l(this.A0S), this.A08, this.A0O, this.A0P, false, false);
                }
                ed0 = new C47699EDi(this, 0);
                A012.A00 = ed0;
                schedule(A012);
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C2366634p r6, C47523E6j e6j, AnonymousClass3UH r8) {
        if (!r8.A07()) {
            List<AnonymousClass3UL> list = r8.A0M;
            if (list != null) {
                for (AnonymousClass3UL r1 : list) {
                    1NK.A00().A0O(DbT.A0X(e6j.A0S), r1.A03.Bh3(), e6j.getModuleName());
                }
                if (AnonymousClass7TE.A1b(list)) {
                    1OC A032 = C320126ro.A03(AnonymousClass7TE.A0l(e6j.A0S), list);
                    A032.A00 = new NMG(r6, e6j);
                    e6j.schedule(A032);
                    return;
                }
            } else {
                return;
            }
        }
        r6.A03();
    }

    public final void ACw() {
        if (isResumed() && !this.A0A && !this.A0B && CKB() && !getScrollingViewProxy().COw()) {
            A00();
        }
    }

    public final void CgO() {
        A00();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.F6j] */
    public final void onCreate(Bundle bundle) {
        EXN exn;
        String str;
        Integer num;
        String string;
        int A022 = AnonymousClass0fD.A02(-141518231);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r5 = this.A0S;
        C47292DuL duL = new C47292DuL(AnonymousClass7TE.A0l(r5));
        this.A0H = duL;
        DbY.A0v(requireContext(), duL, this, r5);
        C320106rm r2 = new C320106rm(AnonymousClass7TE.A0l(r5), "dp_page_1", 31795922);
        this.A02 = r2;
        DbY.A0v(requireContext(), r2, this, r5);
        super.onCreate(bundle);
        if (requireArguments.containsKey("ExplorePeopleFragment.ARGUMENT_TYPE")) {
            String string2 = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_TYPE");
            Integer num2 = AnonymousClass05K.A00;
            if (!0qQ.A0K(string2, "discover_people")) {
                num2 = AnonymousClass05K.A0C;
                if (!0qQ.A0K(string2, C273654mx.A00(354))) {
                    num2 = AnonymousClass05K.A0N;
                    if (!0qQ.A0K(string2, C273654mx.A00(3098))) {
                        num2 = AnonymousClass05K.A0Y;
                        if (!0qQ.A0K(string2, C273654mx.A00(2285))) {
                            num2 = AnonymousClass05K.A0j;
                            if (!0qQ.A0K(string2, "suggested_businesses")) {
                                num2 = AnonymousClass05K.A01;
                            }
                        }
                    }
                }
            }
            this.A05 = num2;
        }
        if (requireArguments.containsKey("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT") && (string = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT")) != null) {
            this.A06 = string;
        }
        if (requireArguments.containsKey("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE")) {
            this.A0N = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE");
        }
        this.A0O = requireArguments.getString(C66579MXk.A00(29));
        this.A0P = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_SURFACE");
        this.A0E = requireArguments.getBoolean("ExplorePeopleFragment.ARGUMENT_SHOULD_SHOW_NEW_HEADER", true);
        this.A00 = requireArguments.getBundle(AnonymousClass000.A00(942));
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0P(this, r5), "friend_center_loaded");
        DbS.A1N(A0e, this.A06);
        DbS.A1K(A0e, getModuleName());
        A0e.Cgf();
        boolean z = true;
        if (!Dba.A1X(EX9.SERP_USERS_CI_UPSELL, this.A06) && (num = this.A05) != AnonymousClass05K.A0C && (num == AnonymousClass05K.A0j || num == AnonymousClass05K.A0N)) {
            z = false;
        }
        this.A0B = z;
        String string3 = requireArguments.getString("request_from_notif_type");
        this.A08 = string3;
        if (string3 != null) {
            this.A0B = true;
        }
        String string4 = requireArguments.getString("is_sectioned");
        C47523E6j e6j = null;
        if (string4 != null && string4.equals("false")) {
            this.A0Q = false;
        }
        if (!this.A0B) {
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            this.A0I = new C14190TrU(AnonymousClass7TE.A0l(r5), this, AnonymousClass05K.A01, 4);
        }
        this.A0R = requireArguments.getBoolean("ExplorePeopleFragment.ARGUMENT_ONLY_ALLOW_CONNECT_CONTACTS_UPSELL");
        if (this.A05 == AnonymousClass05K.A0N) {
            this.A04 = C46634DiE.A0H;
        }
        C48924EmO.A00(AnonymousClass7TE.A0l(r5)).A00();
        this.A0L = new EEL(this, this, AnonymousClass7TE.A0l(r5), new Object(), new C230762qD(this, AnonymousClass7TE.A0l(r5)));
        this.A0J = new EKK(AnonymousClass7TE.A0l(r5), this);
        this.A0G = C71682ef.A01((0lg) null, C71682ef.A00());
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        2el r1 = this.A0G;
        if (r1 == null) {
            str = "viewPointManager";
        } else {
            this.A0F = new F07(this, A0l, r1);
            Context requireContext = requireContext();
            FragmentActivity requireActivity = requireActivity();
            UserSession A0l2 = AnonymousClass7TE.A0l(r5);
            if (!this.A0B) {
                e6j = this;
            }
            DdO ddO = this.A0J;
            if (ddO == null) {
                str = "delegate";
            } else {
                boolean z2 = this.A0R;
                UserSession A0l3 = AnonymousClass7TE.A0l(r5);
                if (this.A05 == AnonymousClass05K.A0C) {
                    exn = EXN.NUX_DISCOVER_PEOPLE_SCREEN;
                } else {
                    exn = EXN.FOLLOW_PEOPLE;
                }
                EUL eul = new EUL(new C51127Foz(2), A0l3, this, exn);
                String str2 = this.A06;
                F07 f07 = this.A0F;
                if (f07 == null) {
                    str = "nametagEntrypointViewpointUtil";
                } else {
                    Integer num3 = this.A05;
                    EUL eul2 = eul;
                    Integer num4 = num3;
                    DdO ddO2 = ddO;
                    C47523E6j e6j2 = e6j;
                    this.A01 = new E9K(requireActivity, requireContext, f07, this, A0l2, this, ddO2, e6j2, eul2, num4, str2, this.A08, z2, this.A0B, this.A0Q);
                    Context requireContext2 = requireContext();
                    UserSession A0l4 = AnonymousClass7TE.A0l(r5);
                    E9K e9k = this.A01;
                    if (e9k == null) {
                        str = "explorePeopleAdapter";
                    } else {
                        this.A0M = new AnonymousClass7Q8(requireContext2, A0l4, e9k);
                        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        C46487Dfq A002 = C46486Dfp.A00(requireActivity(), this, AnonymousClass7TE.A0l(r5), 23599974);
                        this.A0K = A002;
                        registerLifecycleListener(A002);
                        AnonymousClass0fD.A09(-1406281857, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-535024091);
        0qQ.A0B(layoutInflater, 0);
        if (C49047EoR.A00(this) != null) {
            C49938FFr.A01(DbT.A0X(this.A0S), this.A04.A01);
        }
        if (requireActivity() instanceof BaseFragmentActivity) {
            EEL eel = this.A0L;
            if (eel == null) {
                0qQ.A0F("facebookConnectHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            IgFragmentActivity requireActivity = requireActivity();
            0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            IgFragmentActivity igFragmentActivity = requireActivity;
            0qQ.A0B(igFragmentActivity, 0);
            igFragmentActivity.registerOnActivityResultListener(eel.A03);
        }
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview_with_progress, false);
        this.A03 = C3253672c.A01(A0D2, AnonymousClass7TE.A0l(this.A0S), new C51001Fmo(this, 1));
        AnonymousClass0fD.A09(252768860, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1441702728);
        getScrollingViewProxy().AHq();
        AnonymousClass7Q8 r0 = this.A0M;
        if (r0 == null) {
            str = "followStatusUpdatedEventListener";
        } else {
            r0.A01();
            if (requireActivity() instanceof BaseFragmentActivity) {
                EEL eel = this.A0L;
                if (eel == null) {
                    str = "facebookConnectHelper";
                } else {
                    IgFragmentActivity requireActivity = requireActivity();
                    0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
                    IgFragmentActivity igFragmentActivity = requireActivity;
                    0qQ.A0B(igFragmentActivity, 0);
                    igFragmentActivity.unregisterOnActivityResultListener(eel.A03);
                }
            }
            C46487Dfq dfq = this.A0K;
            if (dfq == null) {
                str = "dropFrameListener";
            } else {
                unregisterLifecycleListener(dfq);
                super.onDestroyView();
                AnonymousClass0fD.A09(-1422836738, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1155275134);
        C47523E6j.super.onPause();
        DdO ddO = this.A0J;
        if (ddO == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        ddO.A01.clear();
        AnonymousClass0fD.A09(-1132068991, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbZ.A1D(recyclerView);
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        recyclerView.A0S = true;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1597366944);
        super.onResume();
        if (this.A09) {
            A00();
        }
        AnonymousClass0fD.A09(1223831940, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(699154324);
        C47523E6j.super.onStop();
        F07 f07 = this.A0F;
        if (f07 == null) {
            0qQ.A0F("nametagEntrypointViewpointUtil");
            throw AnonymousClass00P.createAndThrow();
        }
        f07.A05.clear();
        AnonymousClass0fD.A09(1172598150, A022);
    }

    public final C358248ab ALt(C358248ab r1) {
        Dba.A1K(this, r1);
        return r1;
    }
}
