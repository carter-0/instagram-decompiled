package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.newsfeed.model.PillsFilterCategory;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Dcv  reason: case insensitive filesystem */
public final class C46352Dcv extends AnonymousClass4DH implements C227252iu, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "NewsfeedYouComposeFragment";
    public Runnable A00;
    public boolean A01;
    public boolean A02;
    public final C284945Oz A03;
    public final C284945Oz A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = A03(this, 2);
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E = A03(this, 11);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final 0sL A0M;
    public final 0sK A0N;
    public final 0sJ A0O;
    public final 0sJ A0P;
    public final 0sJ A0Q;
    public final AnonymousClass0eM A0R;

    public final void EKl() {
    }

    public final void configureActionBar(2da r1) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity;
        0hq supportFragmentManager;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((2bu) this.A0E.getValue()).Dh3();
        C46515DgI A002 = C46421Dei.A00(getSession());
        AnonymousClass0eM r0 = this.A0H;
        String A022 = A02(r0);
        String A012 = A01(r0);
        AnonymousClass7TG.A1N(A022, A012);
        A002.A02.set(A022);
        A002.A03.set(A012);
        DbZ.A1T(AnonymousClass0kN.A01(A002.A00, A002.A01), "notification_feed_session_start", A022, A012);
        if (this.A0J.getValue() == null && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.A0v(new C50129FQm(this, 5), getViewLifecycleOwner(), "KEY_FRAGMENT_RESULT_REFRESH_AFTER_OPT_IN");
        }
    }

    public static final Object A00(AnonymousClass5VN r10, Reel reel, C46352Dcv dcv, List list, AnonymousClass4D7 r14) {
        C17799VgC vgC = (C17799VgC) dcv.A0I.getValue();
        AnonymousClass3BQ r9 = AnonymousClass3BQ.ACTIVITY_FEED;
        C51792G2b g2b = new C51792G2b(dcv, 48);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1IW.A04;
        1IW r5 = new 1IW(1, 1Ey.A02(r14));
        r5.A0I();
        UserSession userSession = vgC.A01;
        AnonymousClass4DH r1 = vgC.A00;
        AnonymousClass32A r7 = new AnonymousClass32A(r1, userSession, DbV.A0f(r1));
        r7.A0C = AnonymousClass7TF.A0b();
        r7.A06 = new C50898Fkd(vgC, r5);
        r7.A05 = new C16165Upq((Activity) r1.requireActivity(), (C230222pE) new C50896Fkb(g2b, 10), (X4W) new C50897Fkc(r10), AnonymousClass05K.A00);
        r7.A05(reel, r9, (AnonymousClass3N3) null, list, list, list);
        Object A0E2 = r5.A0E();
        1Hj r0 = 1Hj.A02;
        if (A0E2 != r0) {
            A0E2 = C60340gF.A00;
        }
        if (A0E2 != r0) {
            return C60340gF.A00;
        }
        return A0E2;
    }

    public static AnonymousClass0eM A03(Object obj, int i) {
        return AnonymousClass1YB.A00(new C51797G2g(obj, i));
    }

    /* renamed from: A05 */
    public final UserSession getSession() {
        return (UserSession) this.A0R.getValue();
    }

    public final String getModuleName() {
        return ((0xG) this.A05.getValue()).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r1 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r5.A00 = new X.C51464FuY(r5, r2, r1);
        r3 = X.1Wj.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r3 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r2 = getRootActivity();
        r1 = A05();
        r0 = "582322155560177";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r8 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 5083(0x13db, float:7.123E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r2 = -1
            r0 = 11
            if (r6 == r0) goto L_0x0090
            r0 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r6 != r0) goto L_0x005d
            if (r7 != r2) goto L_0x004e
            if (r8 == 0) goto L_0x0020
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r2 = r8.getParcelableArrayListExtra(r0)
            if (r2 != 0) goto L_0x0024
        L_0x0020:
            X.0sn r2 = X.0sn.A00
            if (r8 == 0) goto L_0x0030
        L_0x0024:
            r0 = 233(0xe9, float:3.27E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r1 = r8.getParcelableArrayListExtra(r0)
            if (r1 != 0) goto L_0x0032
        L_0x0030:
            X.0sn r1 = X.0sn.A00
        L_0x0032:
            X.FuY r0 = new X.FuY
            r0.<init>(r5, r2, r1)
            r5.A00 = r0
            X.1Wj r3 = X.1Wj.A00
            if (r3 == 0) goto L_0x004a
            android.app.Activity r2 = r5.getRootActivity()
            com.instagram.common.session.UserSession r1 = r5.getSession()
            java.lang.String r0 = "582322155560177"
        L_0x0047:
            r3.A03(r1, r2, r0)
        L_0x004a:
            super.onActivityResult(r6, r7, r8)
            return
        L_0x004e:
            X.1Wj r3 = X.1Wj.A00
            if (r3 == 0) goto L_0x004a
            android.app.Activity r2 = X.DbT.A03(r5)
            com.instagram.common.session.UserSession r1 = r5.getSession()
            java.lang.String r0 = "494058741106429"
            goto L_0x0047
        L_0x005d:
            r0 = 14
            if (r6 == r0) goto L_0x0090
            r0 = 18
            if (r6 != r0) goto L_0x004a
            if (r7 != r2) goto L_0x004a
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            if (r8 == 0) goto L_0x0077
            r0 = 366(0x16e, float:5.13E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r1 = r8.getParcelableExtra(r0)
        L_0x0077:
            java.lang.String r0 = "ReelCreatorFanEngagementShareConstants.ARGUMENTS_KEY_PRODUCT"
            r4.putParcelable(r0, r1)
            com.instagram.common.session.UserSession r3 = r5.getSession()
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            android.app.Activity r1 = X.DbT.A03(r5)
            java.lang.String r0 = "reel_creator_fan_engagement_share"
            X.6W8 r0 = X.AnonymousClass6W8.A02(r1, r4, r3, r2, r0)
            X.DbU.A1K(r5, r0)
            goto L_0x004a
        L_0x0090:
            if (r2 != r7) goto L_0x004a
            android.app.Activity r1 = r5.getRootActivity()
            X.0qQ.A0C(r1, r3)
            X.2ZX r1 = (X.2ZX) r1
            X.1QK r0 = X.1QK.A0E
            java.lang.String r0 = r0.toString()
            r1.ETc(r0)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46352Dcv.onActivityResult(int, int, android.content.Intent):void");
    }

    public C46352Dcv() {
        C51797G2g g2g = new C51797G2g(this, 20);
        C51797G2g g2g2 = new C51797G2g(this, 15);
        0eO r1 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r1, new C51797G2g(g2g2, 16));
        this.A0L = DbS.A0I(new C51797G2g(A002, 17), g2g, new MJ7(20, (Object) null, A002), DbS.A0z(Object.class));
        this.A0F = A03(this, 12);
        this.A06 = C51792G2b.A00(this, 46);
        this.A08 = C51792G2b.A00(this, 49);
        this.A0B = A03(this, 3);
        this.A0G = A03(this, 13);
        this.A0C = A03(this, 4);
        this.A09 = A03(this, 0);
        this.A07 = C51792G2b.A00(this, 47);
        this.A0I = A03(this, 18);
        this.A0R = C227642jf.A02(this);
        this.A0H = A03(this, 14);
        this.A0K = A03(this, 19);
        this.A0D = AnonymousClass0eN.A00(r1, new C46510DgD(this));
        this.A0J = AnonymousClass0eN.A00(r1, new C46549Dgq(this));
        this.A05 = AnonymousClass0eN.A01(new C51792G2b(this, 45));
        C284885Or A003 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A03 = new ParcelableSnapshotMutableState(A003, (Object) null);
        this.A04 = new ParcelableSnapshotMutableState(C289465dd.A00(), (Object) null);
        this.A0O = new JK0(this, 19);
        this.A0N = new JJR(this, 44);
        this.A0P = new JK0(this, 20);
        this.A0Q = new JK0(this, 21);
        this.A0M = new C59345JFx(this, 33);
    }

    public static String A01(AnonymousClass0eM r0) {
        Object obj = ((C46509DgC) r0.getValue()).A03.get();
        0qQ.A07(obj);
        return (String) obj;
    }

    public static String A02(AnonymousClass0eM r0) {
        Object obj = ((C46509DgC) r0.getValue()).A02.get();
        0qQ.A07(obj);
        return (String) obj;
    }

    public static final void A04(C46352Dcv dcv) {
        if (C46353Dcx.A01(dcv).A01().isEmpty() && !dcv.A01) {
            ActivityFeedViewModel A0Z = DbV.A0Z(dcv);
            1NY A0a = AnonymousClass7TG.A0a(A0Z.A08.A03.A00);
            A0a.A0A("news/inbox_seen/");
            1ES.A06(DbU.A0S(A0a, 1XP.class, 1XY.class), 354374109, true);
            UserSession userSession = A0Z.A04;
            if (AnonymousClass7TE.A0q(userSession).getInt("num_unseen_activities", 0) > 0 && !182.A06(0Tu.A05, userSession, 36310667133124836L)) {
                1Au.A01(userSession, 0);
                1ZL.A00(userSession).A01();
            }
            dcv.A01 = true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    public final void A06() {
        if (!isAdded() || getContext() == null) {
            0wb.A01.EFW(__redex_internal_original_name, AnonymousClass05K.A00, "onVisible called on orphan fragment");
            return;
        }
        ActivityFeedViewModel A0Z = DbV.A0Z(this);
        A0Z.A0B.A02(2aD.A09);
        A0Z.A06.A00 = false;
        AnonymousClass1Nd.A00(getSession()).A00(new Object());
    }

    public final void A07(boolean z) {
        String str;
        C294645mn r0;
        if (isResumed()) {
            PillsFilterCategory pillsFilterCategory = (PillsFilterCategory) this.A0D.getValue();
            if (pillsFilterCategory == null || (str = pillsFilterCategory.A01) == null) {
                str = C46353Dcx.A01(this).A00();
            }
            String A0t = DbS.A0t(this.A0J);
            if (A0t != null) {
                r0 = new ENE(A0t);
            } else {
                r0 = new C294635mm(str);
            }
            ((C284945Oz) this.A0K.getValue()).Epw(DbV.A0Z(this).A0E(r0, true, !z));
            this.A01 = false;
            ((2bu) this.A0E.getValue()).Dh3();
            return;
        }
        this.A02 = true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(89590670);
        C46352Dcv.super.onCreate(bundle);
        ((MYU) this.A08.getValue()).A0R(requireContext(), C71342cb.A00(getSession()), this);
        AnonymousClass0fD.A09(190784462, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1872708704);
        ComposeView A0H2 = DbV.A0H(this, new C59345JFx(this, 32), -1162503524);
        AnonymousClass0fD.A09(530520569, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(474966640);
        C46421Dei.A00(getSession()).A00();
        super.onDestroy();
        AnonymousClass0fD.A09(885706580, A022);
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.1qK, java.lang.Object] */
    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-274212580);
        ActivityFeedViewModel A0Z = DbV.A0Z(this);
        C46513DgG dgG = A0Z.A05;
        Object value = A0Z.A0D.getValue();
        0qQ.A0B(value, 0);
        dgG.A01.set(System.currentTimeMillis());
        dgG.A02.set(value);
        AnonymousClass0eM r6 = this.A0H;
        ((C46509DgC) r6.getValue()).A01.set(System.currentTimeMillis());
        C46515DgI A002 = C46421Dei.A00(getSession());
        String A023 = A02(r6);
        String A012 = A01(r6);
        AnonymousClass7TF.A1H(A023, A012);
        A002.A02.set(A023);
        A002.A03.set(A012);
        DbZ.A1T(AnonymousClass0kN.A01(A002.A00, A002.A01), "notification_feed_disappear", A023, A012);
        ((DdO) this.A0F.getValue()).A01.clear();
        ((C252233om) this.A09.getValue()).onPause();
        AnonymousClass1Nd.A00(getSession()).A00(new Object());
        C46353Dcx.A01(this).A00 = System.currentTimeMillis();
        C46352Dcv.super.onPause();
        AnonymousClass0fD.A09(558793427, A022);
    }

    public final void onResume() {
        AnonymousClass3BQ r1;
        int A022 = AnonymousClass0fD.A02(-1200579805);
        super.onResume();
        AnonymousClass0eM r5 = this.A0H;
        C46509DgC dgC = (C46509DgC) r5.getValue();
        long currentTimeMillis = System.currentTimeMillis();
        dgC.A03.set(AnonymousClass7TF.A0b());
        if (currentTimeMillis - dgC.A01.get() > dgC.A00) {
            dgC.A02.set(AnonymousClass7TF.A0b());
            C46515DgI A002 = C46421Dei.A00(getSession());
            String A023 = A02(r5);
            String A012 = A01(r5);
            AnonymousClass7TG.A1N(A023, A012);
            A002.A02.set(A023);
            A002.A03.set(A012);
            DbZ.A1T(AnonymousClass0kN.A01(A002.A00, A002.A01), "notification_feed_session_start", A023, A012);
        }
        C46515DgI A003 = C46421Dei.A00(getSession());
        String A024 = A02(r5);
        String A013 = A01(r5);
        boolean A1U = AnonymousClass7TF.A1U(0, A024, A013);
        A003.A02.set(A024);
        A003.A03.set(A013);
        DbZ.A1T(AnonymousClass0kN.A01(A003.A00, A003.A01), "notification_feed_appear", A024, A013);
        if (this.A02) {
            A07(false);
            this.A02 = false;
        } else {
            C46356DdJ A014 = C46353Dcx.A01(this);
            Map map = A014.A02;
            Collection<Iterable> values = map.values();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Iterable A0a : values) {
                018.A16(00k.A0a(A0a), A1C);
            }
            if (A1C.size() != 0) {
                if (AnonymousClass7TE.A0P(System.currentTimeMillis() - A014.A00) <= 300 || !A014.A04) {
                    A014.A04 = false;
                } else {
                    map.clear();
                    A014.A04 = false;
                    C46516DgJ dgJ = A014.A05;
                    0sn A032 = A014.A03();
                    0sn A015 = A014.A01();
                    0sn A025 = A014.A02();
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(dgJ.A00, dgJ.A01), "instagram_af_filter_events_v2");
                    A0e.AAJ(TraceFieldType.AdhocEventName, "filters_cleared_timer");
                    if (A015 == null) {
                        A015 = 0sn.A00;
                    }
                    A0e.AAe("current_filters", A015);
                    if (A032 == null) {
                        A032 = 0sn.A00;
                    }
                    A0e.AAe("clicked_filters", A032);
                    if (A025 == null) {
                        A025 = 0sn.A00;
                    }
                    A0e.AAe("filters", A025);
                    A0e.Cgf();
                    A07(A1U);
                }
            }
        }
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass3K2 A062 = 1OP.A06(DbT.A03(this));
        if (A062 != null && A062.A0Z() && ((r1 = A062.A0H) == AnonymousClass3BQ.ACTIVITY_FEED || r1 == AnonymousClass3BQ.ACTIVITY_FEED_USER_MENTIONED_IN_AD_NOTIF)) {
            A062.A0W((RectF) null, ((Dd4) this.A0B.getValue()).A00, this, (C51914G7i) null);
        }
        A06();
        AnonymousClass0fD.A09(1910262444, A022);
    }
}
