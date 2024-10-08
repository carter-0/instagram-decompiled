package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.E2y  reason: case insensitive filesystem */
public final class C47452E2y extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "GraphQLRestConsistencyFragment";
    public int A00;
    public int A01;
    public AnonymousClass1EO A02;
    public AnonymousClass1EO A03;
    public final C284945Oz A04 = new ParcelableSnapshotMutableState(C289465dd.A00(), (Object) null);
    public final C284945Oz A05 = new ParcelableSnapshotMutableState(C289465dd.A00(), (Object) null);
    public final C284945Oz A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final 1wn A09;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131957936);
    }

    public final String getModuleName() {
        return "graphql_rest_consistency";
    }

    public static final void A00(C47452E2y e2y) {
        C47452E2y e2y2 = e2y;
        AnonymousClass0eM r0 = e2y2.A07;
        1vn A0G = Dba.A0G(r0);
        2IS A042 = C41845B3m.A04();
        e2y2.A03 = A0G.A01((2Kw) null, new FSC(e2y2, 18), new PandoGraphQLRequest(DbU.A0J(A042, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, DbU.A0u(r0)), "IGConsistencyDemoUserQuery", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C7M.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_users__info", AnonymousClass7TE.A1C()));
    }

    public static final void A01(C47452E2y e2y) {
        C46742DkV dkV = (C46742DkV) e2y.A08.getValue();
        String A0u = DbU.A0u(e2y.A07);
        C284945Oz r3 = e2y.A06;
        0qQ.A0B(r3, 1);
        C46323Dbr dbr = new C46323Dbr(A0u);
        ((Dd7) dkV.A01.getValue()).A03(new EQE(new C47685ECu(r3, 4), (AnonymousClass4D6) null, AnonymousClass5CG.A00(dkV.A00)), new C323066wt((AnonymousClass4D6) null, true, false, true), dbr, "graphql/rest consistency fragment", "internal settings", -1, false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C47452E2y() {
        C284885Or A002 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A06 = new ParcelableSnapshotMutableState(A002, (Object) null);
        C58711IwK iwK = new C58711IwK(this, 44);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, new C58711IwK(new C58711IwK(this, 41), 42));
        this.A08 = DbS.A0I(new C58711IwK(A003, 43), iwK, new C58692Iw1(45, (Object) null, A003), DbS.A0z(C46742DkV.class));
        this.A09 = FX1.A00(this, 33);
        this.A07 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1789641208);
        C47452E2y.super.onCreate(bundle);
        A01(this);
        AnonymousClass0eM r2 = this.A07;
        1vn A0G = Dba.A0G(r2);
        2IS A042 = C41845B3m.A04();
        this.A02 = A0G.A01((2Kw) null, new FSC(this, 17), new PandoGraphQLRequest(DbU.A0J(A042, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, DbU.A0u(r2)), "IGConsistencyDemoUserQuery", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C7M.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_users__info", AnonymousClass7TE.A1C()));
        A00(this);
        DbX.A0R(r2).A01(this.A09, 2Cy.class);
        AnonymousClass0fD.A09(-1062579954, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2105031693);
        ComposeView A0H = DbV.A0H(this, new JGB(this, 46), 1572338031);
        AnonymousClass0fD.A09(125986203, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-190282366);
        AnonymousClass1EO r0 = this.A02;
        if (r0 != null) {
            r0.cancel();
        }
        AnonymousClass1EO r02 = this.A03;
        if (r02 != null) {
            r02.cancel();
        }
        DbX.A0R(this.A07).A02(this.A09, 2Cy.class);
        super.onDestroyView();
        AnonymousClass0fD.A09(-2074317674, A022);
    }
}
