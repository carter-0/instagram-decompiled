package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.security.InvalidParameterException;
import java.util.Set;
import kotlin.Deprecated;

public final class NJW extends AnonymousClass4DH implements AnonymousClass4DR, C227252iu, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectPendingInboxFragment";
    public ViewStub A00;
    public RecyclerView A01;
    public C71153OeR A02;
    public C238143As A03;
    public EmptyStateView A04;
    public boolean A05;
    public boolean A06;
    public UserSession A07;
    public IgFrameLayout A08;
    public PendingThreadsMessageSettingsView A09;
    public OH4 A0A;
    public boolean A0B;
    public final OMH A0C = new OMH(this);
    public final C229132mt A0D = new C72693PFx(this, 10);
    public final C70498O8x A0E = new C70498O8x(this);

    public final void configureActionBar(2da r22) {
        int i;
        2da r4 = r22;
        0qQ.A0B(r4, 0);
        if (A06().A0M) {
            r4.Eom(2131959935);
            r4.Eu5(new C71402Ok1((Object) this, 46), true);
        } else if (!A06().A0H) {
            if (A06().A0P) {
                r4.Eom(2131959967);
                r4.Eu5(new C71402Ok1((Object) this, 47), true);
            } else {
                C71153OeR A062 = A06();
                if (!A062.A0O || !C272094k5.A02(A062.A0h)) {
                    i = 2131959784;
                    if (A06().A0N) {
                        i = 2131959941;
                    }
                } else {
                    i = 2131959960;
                }
                r4.Eom(i);
                r4.Eu4(true);
            }
            if (A06().A0S) {
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A02(AnonymousClass05K.A0A);
                DbX.A19(new C71402Ok1((Object) this, 51), A0K, r4);
            }
        } else {
            r4.setTitle(DbV.A0v(DbV.A05(this), Integer.valueOf(A06().A0b().size()), R.plurals.multi_select_count, A06().A0b().size()));
            AnonymousClass3JR A0K2 = DbS.A0K();
            A0K2.A02(AnonymousClass05K.A09);
            DbX.A19(new C71402Ok1((Object) this, 49), A0K2, r4);
            r4.Eu4(true);
        }
        r4.ErT(this);
        r4.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, new C71402Ok1((Object) this, 48), AnonymousClass05K.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    public final String getModuleName() {
        return "pending_inbox";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        PendingThreadsMessageSettingsView pendingThreadsMessageSettingsView;
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbU.A0D(view, R.id.thread_list_stub);
        OH4 oh4 = this.A0A;
        if (oh4 == null) {
            str = "buttonsController";
        } else {
            oh4.A00 = DbU.A0C(view, R.id.permissions_choice_buttons_container);
            C71153OeR A062 = A06();
            C68952Nbb nbb = A062.A04;
            C2366634p r7 = nbb.A06;
            if (r7 != null) {
                r7.A04();
            }
            A062.A0d();
            UserSession userSession = A062.A0h;
            C69647NpV A002 = C69991NvV.A00(userSession);
            if (C272094k5.A0C(userSession, true)) {
                C70889OQh.A01(AnonymousClass4iZ.A00, A002.A00.A02);
            }
            C68497NKq nKq = A062.A06;
            if (nKq != null) {
                A062.A03.A03(A062.A0i.Brn(), "INITIAL_LOAD", (Set) nKq.A04.getValue());
            }
            if (!C71153OeR.A0U(A062) || !A062.A0I) {
                A062.A0m(false, false);
            } else {
                nbb.A08.A00();
                C2366634p r0 = nbb.A00;
                if (r0 != null) {
                    r0.A04();
                }
            }
            if (A062.A0O) {
                OO9 oo9 = A062.A0p;
                oo9.A05(A062.A02.A01);
                oo9.A03(A062.A02, (C2611948q) null, A062.A0N);
                oo9.A00();
            }
            A062.A0j();
            if (r7 != null) {
                r7.A05();
            }
            if (C272094k5.A08(userSession)) {
                1a8 r3 = A062.A0g;
                2ED r02 = A062.A0j;
                PU7.A00(r02.A07.A0P((C269794fh) r02.A0H.getValue()), r3, A062, 27);
            }
            Context requireContext = requireContext();
            C72687PFr A0Y = A06().A0Y();
            0qQ.A07(A0Y);
            PIG pig = new PIG(requireContext, A0Y);
            UserSession A052 = getSession();
            Integer num = AnonymousClass05K.A01;
            C229132mt r4 = this.A0D;
            boolean z = !this.A06;
            C14230TsD A003 = C14293TtR.A00(A052, r4, pig, Boolean.valueOf(z), num, 5, z);
            ViewStub viewStub = this.A00;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.inbox_refreshable_thread_list_recyclerview_legacy);
            }
            C238143As r1 = null;
            ViewStub viewStub2 = this.A00;
            if (viewStub2 != null) {
                View inflate = viewStub2.inflate();
                0qQ.A07(inflate);
                RecyclerView A0I = DbT.A0I(inflate, R.id.inbox_refreshable_thread_list_recyclerview);
                this.A01 = A0I;
                if (A0I != null) {
                    C238133Ar A004 = C238103Ao.A00(A0I);
                    0qQ.A0C(A004, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<@[FlexibleNullability] @[RawType] com.instagram.migration.scrollingviewproxy.ScrollingViewAdapterProxy<@[FlexibleNullability] kotlin.Any?>?>");
                    r1 = (C238143As) A004;
                    r1.ErF(new PWU(this));
                    DbY.A15(this, A0I);
                    r1.AAD(A003);
                    r1.ENw(pig);
                }
            }
            this.A03 = r1;
            UserSession A053 = getSession();
            if (!2Ek.A01(DbT.A0j(A053)) || !182.A06(0Tu.A05, A053, 36317161123353392L)) {
                pendingThreadsMessageSettingsView = null;
            } else {
                View inflate2 = JTR.A0X(view, R.id.message_requests_settings_footer).inflate();
                0qQ.A0C(inflate2, "null cannot be cast to non-null type com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView");
                pendingThreadsMessageSettingsView = (PendingThreadsMessageSettingsView) inflate2;
                pendingThreadsMessageSettingsView.setTitleText(AnonymousClass7TF.A0d(DbV.A05(this), 2131959937));
                TextView textView = pendingThreadsMessageSettingsView.A00;
                if (textView == null) {
                    str = "titleTextView";
                } else {
                    Context context = pendingThreadsMessageSettingsView.getContext();
                    textView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap), AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap), 0);
                    pendingThreadsMessageSettingsView.setLinkToSettingsText(AnonymousClass7TF.A0d(DbV.A05(this), 2131959938));
                    pendingThreadsMessageSettingsView.setLinkToSettingsVisibility(0);
                    pendingThreadsMessageSettingsView.setLinkToSettingsClickListener(new C71402Ok1((Object) this, 50));
                    pendingThreadsMessageSettingsView.setDividerVisibility(8);
                }
            }
            this.A09 = pendingThreadsMessageSettingsView;
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C67256Mkq mkq, NJW njw) {
        String str;
        C68441NIe nIe = new C68441NIe();
        Bundle A082 = DbY.A08(njw);
        A082.putString("IgSessionManager.SESSION_TOKEN_KEY", njw.getSession().A06);
        A082.putSerializable("thread_folder_name", mkq);
        nIe.setArguments(A082);
        nIe.A03 = njw.A06();
        if (mkq == C67256Mkq.PENDING_STORY_REPLIES) {
            nIe.A04 = njw.A0D;
        }
        int ordinal = mkq.ordinal();
        if (ordinal == 3) {
            str = "spam_folder";
        } else if (ordinal == 8) {
            str = "story_replies_folder";
        } else if (ordinal == 9) {
            str = "hidden_words_folder";
        } else {
            throw new InvalidParameterException();
        }
        0s1 A0C2 = DbW.A0C(njw);
        A0C2.A0I(str);
        A0C2.A07(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
        A0C2.A0D(nIe, str, R.id.thread_list_container);
        A0C2.A00();
    }

    /* renamed from: A05 */
    public final UserSession getSession() {
        UserSession userSession = this.A07;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C71153OeR A06() {
        C71153OeR oeR = this.A02;
        if (oeR != null) {
            return oeR;
        }
        0qQ.A0F("directPendingInboxController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKl() {
        C238143As r0 = this.A03;
        if (r0 != null) {
            r0.EKm(this);
        }
    }

    public static final void A01(NJW njw) {
        njw.getChildFragmentManager().A0c();
        C71153OeR A062 = njw.A06();
        boolean z = njw.A05;
        A062.A0M = false;
        A062.A0p.A01(A062.A0a);
        C72687PFr A0Y = A062.A0Y();
        PU7.A00(A0Y.A0E, A0Y.A02, A0Y, 29);
        A062.A0l(false);
        A062.A0r.A01();
        if (z) {
            A062.A15.remove(C69375NkF.A0E);
            A062.A0m(false, false);
            C71153OeR.A0J(A062);
        }
        njw.A06().A0j();
        A03(njw);
        njw.A05 = false;
    }

    public static final void A02(NJW njw) {
        njw.getChildFragmentManager().A0c();
        C71153OeR A062 = njw.A06();
        A062.A0o.A04("open_pending", (String) null);
        A062.A0P = false;
        A062.A0i();
        A062.A0l(false);
        C72686PFq pFq = A062.A08;
        if (pFq != null) {
            pFq.A00 = null;
        }
        C71153OeR.A0F(A062);
        A062.A0r.A01();
        A062.A15.clear();
        C71153OeR.A0D(C69375NkF.A08, A062);
        njw.A06().A0j();
        A03(njw);
    }

    public static final void A03(NJW njw) {
        int i;
        RecyclerView recyclerView;
        C71153OeR A062 = njw.A06();
        if ((!A062.A0O || !C272094k5.A02(A062.A0h)) && !njw.A06().A0M) {
            IgFrameLayout igFrameLayout = njw.A08;
            i = 1;
            if (igFrameLayout != null) {
                igFrameLayout.setImportantForAccessibility(1);
            }
            IgFrameLayout igFrameLayout2 = njw.A08;
            if (igFrameLayout2 != null) {
                igFrameLayout2.setFocusable(true);
            }
            IgFrameLayout igFrameLayout3 = njw.A08;
            if (igFrameLayout3 != null) {
                igFrameLayout3.sendAccessibilityEvent(8);
            }
            recyclerView = njw.A01;
            if (recyclerView == null) {
                return;
            }
        } else {
            IgFrameLayout igFrameLayout4 = njw.A08;
            if (igFrameLayout4 != null) {
                igFrameLayout4.setImportantForAccessibility(2);
            }
            recyclerView = njw.A01;
            if (recyclerView != null) {
                i = 4;
            } else {
                return;
            }
        }
        recyclerView.setImportantForAccessibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 2342160170336916270L) == false) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.NJW r13) {
        /*
            X.OeR r1 = r13.A06()
            boolean r0 = X.C71153OeR.A0T(r1)
            if (r0 == 0) goto L_0x015a
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x015a
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x002f
            com.instagram.common.session.UserSession r3 = r1.A0h
            r0 = 0
            X.0qQ.A0B(r3, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r3)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x002f
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342160170336916270(0x208106440000132e, double:4.0631787535450665E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x015a
        L_0x002f:
            r1 = 1
        L_0x0030:
            r9 = 8
            java.lang.String r0 = "buttonsController"
            X.OH4 r8 = r13.A0A
            if (r1 == 0) goto L_0x0140
            if (r8 == 0) goto L_0x015d
            X.OeR r0 = r13.A06()
            java.util.HashSet r12 = r0.A0b()
            r7 = 0
            X.OZD r6 = r8.A03
            r0 = 2131437591(0x7f0b2817, float:1.8497085E38)
            X.OZD.A01(r6, r0)
            r0 = 2131437592(0x7f0b2818, float:1.8497087E38)
            X.OZD.A01(r6, r0)
            r0 = 2131437593(0x7f0b2819, float:1.849709E38)
            X.OZD.A01(r6, r0)
            r0 = 52
            X.Ok1 r5 = new X.Ok1
            r5.<init>((java.lang.Object) r8, (int) r0)
            r0 = 53
            X.Ok1 r4 = new X.Ok1
            r4.<init>((java.lang.Object) r8, (int) r0)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x00ad
            android.content.res.Resources r1 = r8.A02
            r0 = 2131959996(0x7f1320bc, float:1.9556648E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r1, r0)
            int r1 = r8.A01
            r0 = 2131437592(0x7f0b2818, float:1.8497087E38)
            X.OZD.A00(r4, r6, r2, r0, r1)
        L_0x007c:
            android.view.ViewGroup r0 = r8.A00
            if (r0 == 0) goto L_0x0083
            r0.setVisibility(r7)
        L_0x0083:
            android.view.ViewGroup r0 = r8.A00
            if (r0 == 0) goto L_0x008a
            r0.removeAllViews()
        L_0x008a:
            android.view.ViewGroup r1 = r6.A00
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x009e
            android.view.ViewParent r0 = r1.getParent()
            X.C66580MXl.A1R(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r1)
        L_0x009e:
            android.view.ViewGroup r0 = r8.A00
            if (r0 == 0) goto L_0x00a5
            r0.addView(r1)
        L_0x00a5:
            com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView r0 = r13.A09
            if (r0 == 0) goto L_0x00ac
        L_0x00a9:
            r0.setVisibility(r9)
        L_0x00ac:
            return
        L_0x00ad:
            int r0 = r12.size()
            r11 = 1
            if (r0 != r11) goto L_0x0105
            android.content.res.Resources r2 = r8.A02
            r0 = 2131959994(0x7f1320ba, float:1.9556644E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r2, r0)
            int r10 = r8.A01
            r0 = 2131437592(0x7f0b2818, float:1.8497087E38)
            X.OZD.A00(r4, r6, r1, r0, r10)
            r0 = 2131959992(0x7f1320b8, float:1.955664E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A02(r0, r5)
            java.util.Iterator r0 = r12.iterator()
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r0)
            X.PwB r1 = (X.C74516PwB) r1
            X.3sy r3 = r1.CBV()
            boolean r0 = r1.CUG()
            if (r0 != 0) goto L_0x00f6
            r0 = 2131959993(0x7f1320b9, float:1.9556642E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r2, r0)
        L_0x00ea:
            X.Ok8 r1 = new X.Ok8
            r1.<init>((int) r11, (java.lang.Object) r8, (java.lang.Object) r3)
            r0 = 2131437591(0x7f0b2817, float:1.8497085E38)
            X.OZD.A00(r1, r6, r2, r0, r10)
            goto L_0x007c
        L_0x00f6:
            boolean r0 = r1.CUK()
            if (r0 != 0) goto L_0x007c
            r0 = 2131959998(0x7f1320be, float:1.9556652E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r2, r0)
            r11 = 2
            goto L_0x00ea
        L_0x0105:
            android.content.res.Resources r10 = r8.A02
            r2 = 2131820671(0x7f11007f, float:1.9274064E38)
            int r1 = r12.size()
            int r0 = r12.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = X.DbV.A0v(r10, r0, r2, r1)
            X.0qQ.A07(r3)
            r2 = 2131820672(0x7f110080, float:1.9274066E38)
            int r1 = r12.size()
            int r0 = r12.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.DbV.A0v(r10, r0, r2, r1)
            X.0qQ.A07(r2)
            int r1 = r8.A01
            r0 = 2131437592(0x7f0b2818, float:1.8497087E38)
            X.OZD.A00(r4, r6, r2, r0, r1)
            r6.A02(r3, r5)
            goto L_0x007c
        L_0x0140:
            if (r8 == 0) goto L_0x015d
            android.view.ViewGroup r0 = r8.A00
            if (r0 == 0) goto L_0x0149
            r0.setVisibility(r9)
        L_0x0149:
            X.OeR r0 = r13.A06()
            boolean r0 = r0.A0M
            r1 = r0 ^ 1
            com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView r0 = r13.A09
            if (r0 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00a9
            r9 = 0
            goto L_0x00a9
        L_0x015a:
            r1 = 0
            goto L_0x0030
        L_0x015d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJW.A04(X.NJW):void");
    }

    @Deprecated(message = "Overrides deprecated method in Fragment")
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            C71153OeR A062 = A06();
            if (i2 == 2) {
                C49761F5n.A01(A062.A0b, A062.A0h, AnonymousClass05K.A0C);
            }
        } else if (i == 512340) {
            C71153OeR A063 = A06();
            if (i2 == 512341) {
                A063.A0d.markerStart(190449529);
                UserSession userSession = A063.A0h;
                C70381O4i.A00(A063.A0b, userSession, AnonymousClass05K.A01, A063.A0O, false);
            }
        } else if (i == 512342) {
            C71153OeR A064 = A06();
            if (i2 == 512341) {
                AnonymousClass1pc.A00().CnT(A064.A0b.requireContext(), DbS.A0O("direct_message"), A064.A0h, C54660HMr.COMPOSER_DELETE);
            }
        }
    }

    public final boolean onBackPressed() {
        C67565Mpz mpz = A06().A0n;
        C67573Mq7.A00(mpz, new C73669Phi("back_out", mpz, 49));
        if (A06().A0M) {
            A01(this);
            return true;
        }
        C71153OeR A062 = A06();
        if (A062.A0O && C272094k5.A02(A062.A0h) && !this.A0B) {
            getChildFragmentManager().A0c();
            C71153OeR A063 = A06();
            A063.A0o.A04("open_pending", (String) null);
            A063.A0O = false;
            A063.A0i();
            A063.A0l(false);
            A063.A0Z().A00 = null;
            C71153OeR.A0F(A063);
            A063.A0r.A01();
        } else if (A06().A0P) {
            A02(this);
            return true;
        } else if (A06().A0N) {
            getChildFragmentManager().A0c();
            C71153OeR A064 = A06();
            A064.A0o.A04("open_pending", (String) null);
            A064.A0p.A00();
            A064.A0N = false;
            A064.A0O = true;
            C68497NKq nKq = A064.A06;
            if (nKq != null) {
                A064.A02 = C70889OQh.A01(AnonymousClass43H.A00, (C2611948q) nKq.A06.getValue());
            }
            A064.A0i();
            A064.A0l(false);
            A064.A0X().A00 = null;
            C71153OeR.A0F(A064);
            A064.A0r.A01();
            A064.A15.clear();
        } else {
            C71153OeR A065 = A06();
            if (A065.A0T) {
                A065.A0T = false;
                UserSession userSession = A065.A0h;
                IntentFilter intentFilter = AnonymousClass439.A0I;
                C261854Be.A00(userSession).A03();
            }
            C69004Ncg ncg = A065.A0o;
            ncg.A02 = false;
            C67573Mq7.A00(ncg, new C73669Phi("back_out", ncg, 49));
            if (A065.A0A.longValue() != 0) {
                1Av A002 = 1Au.A00(A065.A0h);
                long longValue = A065.A0A.longValue();
                0xY A0p = AnonymousClass7TE.A0p(A002);
                A0p.E5c("last_pending_inbox_filtering_cache_update_timestamp", longValue);
                A0p.apply();
            }
            if (A065.A0R) {
                Intent A092 = DbS.A09();
                A092.putExtra("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_RESULT_REFRESH_INBOX", true);
                A065.A0b.requireActivity().setResult(-1, A092);
            }
            if (!C71153OeR.A0U(A065)) {
                return false;
            }
            Intent A093 = DbS.A09();
            A093.putExtra("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_INITIAL_LOAD_COMPLETE_KEY", A065.A0I);
            A065.A0b.requireActivity().setResult(-1, A093);
            return false;
        }
        A06().A0j();
        A03(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        boolean z;
        int A022 = AnonymousClass0fD.A02(145412452);
        NJW.super.onCreate(bundle);
        this.A07 = DbX.A0V(this);
        this.A02 = new C71153OeR(this, this, getSession(), this.A0C);
        C71153OeR A062 = A06();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            A062.A0I = bundle2.getBoolean("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_INITIAL_LOAD_COMPLETE_KEY", false);
        }
        C2366634p r3 = A062.A04.A02;
        r3.A04();
        C69004Ncg ncg = A062.A0o;
        if (ncg.A02) {
            ncg.A02 = false;
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        C69004Ncg.A02(ncg, num);
        ncg.A04("open_pending", (String) null);
        r3.A05();
        if (182.A04(0Tu.A05, A062.A0h, 36879419587166475L).equals(AnonymousClass000.A00(3533))) {
            PU7.A00(1aU.A07(new C72122Owh(A062, 11), C318146oT.A00), A062.A0f, A062, 28);
        }
        this.A06 = C272094k5.A02(getSession());
        this.A0A = new OH4(requireActivity(), getSession(), this.A0E);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_LAUNCH_HIDDEN_FOLDER_KEY");
        } else {
            z = false;
        }
        this.A0B = z;
        AnonymousClass0fD.A09(-1143807705, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1537339085);
        0qQ.A0B(layoutInflater, 0);
        C2366634p r0 = A06().A04.A03;
        r0.A04();
        r0.A05();
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_permissions_inbox, viewGroup, false);
        this.A04 = (EmptyStateView) inflate.requireViewById(R.id.direct_empty_view);
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate.requireViewById(R.id.thread_list_container);
        this.A08 = igFrameLayout;
        if (igFrameLayout != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                str = activity.getString(2131959784);
            } else {
                str = null;
            }
            igFrameLayout.setContentDescription(str);
        }
        AnonymousClass0fD.A09(468492356, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-2031747403);
        super.onDestroy();
        C71153OeR A062 = A06();
        C70381O4i.A00 = false;
        A062.A0f.A01();
        A062.A0h.A03(OTI.class);
        A062.A15.clear();
        A062.A0g.A01();
        AnonymousClass0fD.A09(836526998, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(41198590);
        super.onDestroyView();
        this.A01 = null;
        this.A08 = null;
        this.A09 = null;
        this.A04 = null;
        this.A00 = null;
        A06().A0e();
        AnonymousClass0fD.A09(1216245927, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-593338328);
        NJW.super.onPause();
        if (requireActivity().getParent() != null) {
            Activity parent = requireActivity().getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) parent).Enj(0);
        }
        A06().A0f();
        AnonymousClass0fD.A09(-882513134, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1739990216);
        super.onResume();
        2dZ.A0t.A03(getActivity()).A0X(this);
        if (requireActivity().getParent() != null) {
            Activity parent = requireActivity().getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) parent).Enj(8);
        }
        A06().A0g();
        A03(this);
        if (this.A0B) {
            A06().A0h();
        }
        AnonymousClass0fD.A09(-787456258, A022);
    }
}
