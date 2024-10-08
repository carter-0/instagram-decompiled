package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.E6m  reason: case insensitive filesystem */
public final class C47526E6m extends C227812jx implements AnonymousClass32I, AnonymousClass4DS, AnonymousClass32K, G6Q {
    public static final String __redex_internal_original_name = "AccountDiscoveryFragment";
    public E9L A00;
    public EEU A01;
    public String A02;
    public F07 A03;
    public 2el A04;
    public C49624Ezh A05;
    public F02 A06;
    public G7U A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final FX1 A09 = FX1.A00(this, 2);
    public final 1wn A0A = FXZ.A00(this, 15);

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r3 = X.DbX.A0N(requireActivity(), r9.A08);
        X.FC6.A01();
        r2 = r9.A02;
        r1 = X.DbV.A0B(r7, 1);
        r1.putString("AccountDiscoveryFragment.title", r7);
        r1.putString("AccountDiscoveryFragment.category", r6);
        X.DbS.A1B(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        if (r4 == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        if (r4.length() == 0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        r1.putString("AccountDiscoveryFragment.forcedUserIds", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        r0 = new X.E6e();
        r0.setArguments(r1);
        X.Dba.A0w((android.os.Bundle) null, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D33(android.util.SparseArray r10, java.lang.Integer r11) {
        /*
            r9 = this;
            r1 = 0
            X.0qQ.A0B(r11, r1)
            X.1pQ r0 = X.C66571pQ.A02
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r11 != r0) goto L_0x00ce
            if (r10 == 0) goto L_0x0084
            java.lang.Object r7 = r10.get(r1)
            java.lang.String r0 = X.DbS.A0p(r7)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 1
            java.lang.Object r6 = r10.get(r8)
            X.0qQ.A0C(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            X.E9L r0 = r9.A00
            r5 = 0
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "accountDiscoveryAdapter"
        L_0x002d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0035:
            X.0qQ.A0B(r6, r1)
            java.util.ArrayList r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = r2.next()
            X.F2I r1 = (X.F2I) r1
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = r1.A00()
            java.util.Iterator r1 = r0.iterator()
        L_0x0060:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r1.next()
            X.3UI r0 = (X.AnonymousClass3UI) r0
            X.3UL r0 = r0.A00()
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = r0.getId()
            r2.add(r0)
            goto L_0x0060
        L_0x007a:
            java.lang.String r0 = "name"
            goto L_0x002d
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0082:
            r4 = r5
            goto L_0x0096
        L_0x0084:
            java.lang.String r0 = "The arguments param in onClickSeeAll() for Account Discovery must not be null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x008b:
            java.lang.String r1 = ","
            X.3El r0 = new X.3El
            r0.<init>(r1)
            java.lang.String r4 = r0.A02(r2)
        L_0x0096:
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            X.0eM r0 = r9.A08
            X.6Yo r3 = X.DbX.A0N(r1, r0)
            X.FC6.A01()
            java.lang.String r2 = r9.A02
            android.os.Bundle r1 = X.DbV.A0B(r7, r8)
            java.lang.String r0 = "AccountDiscoveryFragment.title"
            r1.putString(r0, r7)
            java.lang.String r0 = "AccountDiscoveryFragment.category"
            r1.putString(r0, r6)
            X.DbS.A1B(r1, r2)
            if (r4 == 0) goto L_0x00c3
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "AccountDiscoveryFragment.forcedUserIds"
            r1.putString(r0, r4)
        L_0x00c3:
            X.E6e r0 = new X.E6e
            r0.<init>()
            r0.setArguments(r1)
            X.Dba.A0w(r5, r0, r3)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47526E6m.D33(android.util.SparseArray, java.lang.Integer):void");
    }

    public final void D34() {
    }

    public final void D35() {
    }

    public final void D36() {
    }

    public final void D37(SparseArray sparseArray) {
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbX.A1A(FP8.A00(this, 61), DbV.A0K(), r3);
        r3.Eom(2131960850);
    }

    public final String getModuleName() {
        return "account_discovery";
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        EEU eeu = this.A01;
        if (eeu == null) {
            0qQ.A0F("accountDiscoveryController");
            throw AnonymousClass00P.createAndThrow();
        }
        DbU.A15(eeu.A06.requireContext(), recyclerView, 1, false);
        recyclerView.A0S = true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        E9L e9l = this.A00;
        if (e9l == null) {
            str = "accountDiscoveryAdapter";
        } else {
            setAdapter(e9l);
            2el r3 = this.A04;
            if (r3 == null) {
                str = "viewPointManager";
            } else {
                r3.A08(((C238143As) getScrollingViewProxy()).CFN(), AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void CJ1() {
        1Z9 A002 = C48920EmK.A00();
        0lg A0X = DbT.A0X(this.A08);
        G7U g7u = this.A07;
        if (g7u == null) {
            0qQ.A0F("linkingCallback");
            throw AnonymousClass00P.createAndThrow();
        }
        ELU A012 = A002.A01(this, A0X, g7u);
        Locale locale = Locale.US;
        0qQ.A08(locale);
        A012.A06(DbT.A12(locale, "IG_FB_DISCOVER_ACCOUNTS"), (List) null);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(798477590);
        super.onCreate(bundle);
        this.A02 = DbX.A0o(this);
        AnonymousClass0eM r4 = this.A08;
        EKI eki = new EKI(AnonymousClass7TE.A0l(r4), this);
        C48924EmO.A00(AnonymousClass7TE.A0l(r4)).A00();
        this.A07 = new C51127Foz(0);
        this.A04 = DbY.A0U();
        F2S f2s = new F2S(this, AnonymousClass7TE.A0l(r4), this.A02);
        2el r1 = this.A04;
        String str = "viewPointManager";
        if (r1 != null) {
            this.A05 = new C49624Ezh(r1, f2s);
            this.A06 = new F02(r1, f2s);
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            2el r12 = this.A04;
            if (r12 != null) {
                this.A03 = new F07(this, A0l, r12);
                UserSession A0l2 = AnonymousClass7TE.A0l(r4);
                Context requireContext = requireContext();
                FragmentActivity requireActivity = requireActivity();
                C49624Ezh ezh = this.A05;
                if (ezh == null) {
                    str = "recommendedUserCardsViewpointHelper";
                } else {
                    F02 f02 = this.A06;
                    if (f02 == null) {
                        str = "seeAllViewpointHelper";
                    } else {
                        F07 f07 = this.A03;
                        if (f07 == null) {
                            str = "nametagEntrypointViewpointUtil";
                        } else {
                            UserSession A0l3 = AnonymousClass7TE.A0l(r4);
                            EXN exn = EXN.FOLLOW_PEOPLE;
                            G7U g7u = this.A07;
                            if (g7u == null) {
                                str = "linkingCallback";
                            } else {
                                this.A00 = new E9L(requireActivity, requireContext, f07, this, A0l2, ezh, this, eki, new EUK(A0l3, this, exn, g7u), this, f02);
                                this.A01 = new EEU(this, AnonymousClass7TE.A0l(r4), new C50431Fbe(this));
                                DbX.A0R(r4).A01(this.A09, C319666qz.class);
                                AnonymousClass0fD.A09(-1911706464, A022);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1476840447);
        0qQ.A0B(layoutInflater, 0);
        EEU eeu = this.A01;
        if (eeu == null) {
            0qQ.A0F("accountDiscoveryController");
            throw AnonymousClass00P.createAndThrow();
        }
        View A012 = eeu.A01(layoutInflater, viewGroup);
        DbX.A0R(this.A08).A01(this.A0A, FWG.class);
        AnonymousClass0fD.A09(1540229651, A022);
        return A012;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(863202452);
        super.onDestroy();
        DbX.A0R(this.A08).A02(this.A09, C319666qz.class);
        AnonymousClass0fD.A09(-926187252, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1854385690);
        super.onDestroyView();
        DbX.A0R(this.A08).A02(this.A0A, FWG.class);
        AnonymousClass0fD.A09(728033466, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-791023184);
        super.onResume();
        Context requireContext = requireContext();
        AnonymousClass0eM r8 = this.A08;
        if (C267044ar.A00(requireContext, AnonymousClass7TE.A0l(r8))) {
            1Av A0h = DbX.A0h(r8);
            0xa r10 = A0h.A01;
            String A002 = AnonymousClass000.A00(724);
            int i = r10.getInt(A002, 0);
            long millis = TimeUnit.HOURS.toMillis(24);
            if (i < 6) {
                long currentTimeMillis = System.currentTimeMillis();
                String A003 = AnonymousClass000.A00(688);
                if (currentTimeMillis - DbW.A06(r10, A003) >= millis) {
                    A0h.A1R(true);
                    0xY AR4 = r10.AR4();
                    AR4.E5c(A003, currentTimeMillis);
                    0xY A0e = DbU.A0e(AR4, r10);
                    A0e.E5c("last_time_seen_contact_import_weekly_upsell", currentTimeMillis);
                    A0e.apply();
                    AnonymousClass7TG.A1M(r10, A002, i + 1);
                    UserSession A0l = AnonymousClass7TE.A0l(r8);
                    C47526E6m e6m = this.mParentFragment;
                    if (e6m == null) {
                        e6m = this;
                    }
                    FGL fgl = new FGL(e6m, this, A0l, (C51950G8t) null, (C49498Ewd) null);
                    EX9 ex9 = EX9.CI_INTERSTITIAL_UPSELL;
                    fgl.A05((G7Y) null, ex9, false, true, false);
                    new C311496cm(this, AnonymousClass7TE.A0l(r8)).A01(false, (Integer) null, ex9.toString());
                }
            }
        }
        AnonymousClass0fD.A09(-2091477268, A022);
    }

    public final void onStop() {
        String str;
        int A022 = AnonymousClass0fD.A02(-321734374);
        C47526E6m.super.onStop();
        C49624Ezh ezh = this.A05;
        if (ezh == null) {
            str = "recommendedUserCardsViewpointHelper";
        } else {
            ezh.A04.clear();
            F02 f02 = this.A06;
            if (f02 == null) {
                str = "seeAllViewpointHelper";
            } else {
                f02.A04.clear();
                F07 f07 = this.A03;
                if (f07 == null) {
                    str = "nametagEntrypointViewpointUtil";
                } else {
                    f07.A05.clear();
                    AnonymousClass0fD.A09(-746591627, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C358248ab ALt(C358248ab r1) {
        Dba.A1K(this, r1);
        return r1;
    }
}
