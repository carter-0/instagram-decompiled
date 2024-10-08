package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class E3O extends AnonymousClass4DH implements C227272iw, C322776wO, G6Q, C51859G4r {
    public static final String __redex_internal_original_name = "DiscoverPeopleFragment";
    public boolean A00;
    public boolean A01;
    public G7U A02;
    public boolean A03 = true;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final 1wn A05 = FXZ.A00(this, 16);
    public final 1wn A06 = FXZ.A00(this, 17);
    public final boolean A07 = true;

    public final boolean COC() {
        return false;
    }

    public final void DBx() {
    }

    public final void DBy() {
        this.A03 = false;
        1Z9 A002 = C48920EmK.A00();
        0lg A0X = DbT.A0X(this.A04);
        G7U g7u = this.A02;
        if (g7u == null) {
            0qQ.A0F("linkingCallback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A002.A01(this, A0X, g7u).A06(DbT.A12(Locale.ROOT, "IG_FB_DISCOVER_ACCOUNTS"), (List) null);
        }
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbX.A1A(FP8.A00(this, 63), DbV.A0K(), r4);
        String string = requireArguments().getString("ExplorePeopleFragment.ARGUMENT_TYPE");
        String string2 = requireArguments().getString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE");
        if (!"suggested_businesses".equals(string) || string2 == null || string2.length() == 0) {
            r4.Eom(2131960850);
        } else {
            r4.setTitle(string2);
        }
    }

    public final String getModuleName() {
        return "discover_people";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean isContainerFragment() {
        return this.A07;
    }

    public final void CJ1() {
        1Z9 A002 = C48920EmK.A00();
        0lg A0X = DbT.A0X(this.A04);
        G7U g7u = this.A02;
        if (g7u == null) {
            0qQ.A0F("linkingCallback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A002.A01(this, A0X, g7u).A06(DbT.A12(Locale.ROOT, "IG_FB_DISCOVER_ACCOUNTS"), (List) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004d, code lost:
        if (X.Dba.A1X(X.EX9.QP, r2) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -522974507(0xffffffffe0d40ad5, float:-1.2223407E20)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.E3O.super.onCreate(r5)
            r1 = 1
            X.Foz r0 = new X.Foz
            r0.<init>(r1)
            r4.A02 = r0
            android.os.Bundle r1 = r4.requireArguments()
            r0 = 35
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r4.A00 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_ENTRY_POINT"
            java.lang.String r2 = r1.getString(r0)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_TYPE"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "suggested_businesses"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004f
            X.EX9 r0 = X.EX9.SERP_USERS_CI_UPSELL
            boolean r0 = X.Dba.A1X(r0, r2)
            if (r0 != 0) goto L_0x004f
            X.EX9 r0 = X.EX9.QP
            boolean r1 = X.Dba.A1X(r0, r2)
            r0 = 0
            if (r1 == 0) goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            r4.A01 = r0
            X.0s1 r2 = X.DbW.A0C(r4)
            r1 = 2131430678(0x7f0b0d16, float:1.8483064E38)
            android.os.Bundle r0 = r4.requireArguments()
            X.E6j r0 = X.C48890Elq.A00(r0)
            r2.A09(r0, r1)
            r2.A00()
            r0 = 318876957(0x1301ad1d, float:1.636744E-27)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3O.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-569786789);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_discover_people, viewGroup, false);
        AnonymousClass0fD.A09(-1598141473, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1678797001);
        E3O.super.onPause();
        if (this.A03) {
            Dbc.A0q(this, 0);
        }
        AnonymousClass0fD.A09(-1907500723, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(513274251);
        super.onResume();
        this.A03 = true;
        Dbc.A0q(this, 8);
        if (!this.A01) {
            Context requireContext = requireContext();
            AnonymousClass0eM r7 = this.A04;
            if (C267044ar.A00(requireContext, AnonymousClass7TE.A0l(r7))) {
                1Av A0h = DbX.A0h(r7);
                0xa r10 = A0h.A01;
                String A002 = AnonymousClass000.A00(724);
                int i = r10.getInt(A002, 0);
                long millis = TimeUnit.HOURS.toMillis(24);
                if (i < 6) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String A003 = AnonymousClass000.A00(688);
                    if (currentTimeMillis - DbW.A06(r10, A003) >= millis || this.A00) {
                        this.A00 = false;
                        A0h.A1R(true);
                        0xY AR4 = r10.AR4();
                        AR4.E5c(A003, currentTimeMillis);
                        0xY A0e = DbU.A0e(AR4, r10);
                        A0e.E5c("last_time_seen_contact_import_weekly_upsell", currentTimeMillis);
                        A0e.apply();
                        AnonymousClass7TG.A1M(r10, A002, i + 1);
                        UserSession A0l = AnonymousClass7TE.A0l(r7);
                        E3O e3o = this.mParentFragment;
                        if (e3o == null) {
                            e3o = this;
                        }
                        FGL fgl = new FGL(e3o, this, A0l, (C51950G8t) null, (C49498Ewd) null);
                        EX9 ex9 = EX9.CI_INTERSTITIAL_UPSELL;
                        fgl.A05((G7Y) null, ex9, false, true, false);
                        new C311496cm(this, AnonymousClass7TE.A0l(r7)).A01(false, (Integer) null, ex9.toString());
                    }
                }
            }
        }
        AnonymousClass0fD.A09(1115096063, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-958773003);
        E3O.super.onStart();
        1Ng A0R = DbX.A0R(this.A04);
        A0R.A01(this.A05, FW8.class);
        A0R.A01(this.A06, FWG.class);
        AnonymousClass0fD.A09(607649755, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-939759594);
        E3O.super.onStop();
        1Ng A0R = DbX.A0R(this.A04);
        A0R.A02(this.A05, FW8.class);
        A0R.A02(this.A06, FWG.class);
        AnonymousClass0fD.A09(-1953177401, A022);
    }
}
