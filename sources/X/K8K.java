package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.Collection;

public final class K8K extends MYR implements C273504mg, C273494mf, X9V, G7P {
    public static final String __redex_internal_original_name = "IgLiveUnifiedHeaderFragment";
    public C313666go A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public static C60257JiE A00(K8K k8k, Object obj) {
        0qQ.A0B(obj, 0);
        return (C60257JiE) k8k.A02.getValue();
    }

    public final void DLc(User user, Integer num) {
        User user2 = user;
        Integer num2 = num;
        AnonymousClass7TG.A1N(user, num);
        C60257JiE jiE = (C60257JiE) this.A02.getValue();
        if (jiE instanceof C62311Kdj) {
            AnonymousClass7TE.A1Z(new MHK((Object) user2, (Object) num2, (Object) jiE, (AnonymousClass4D7) null, 8), C318116oQ.A00(jiE));
        }
    }

    public final void DSL(G7P g7p, User user) {
        0qQ.A0B(user, 0);
        2YL A0H = DbS.A0H(this.A02);
        C66169MGg.A01(user, A0H, C318116oQ.A00(A0H), 7);
    }

    public final void Dc5(User user, boolean z) {
    }

    public final void E0E(1P0 r8, C21478XcN xcN, User user, Integer num) {
        User user2 = user;
        C60257JiE A002 = A00(this, user);
        if (A002 instanceof C62312Kdk) {
            AnonymousClass7TE.A1Z(new JVZ(xcN, A002, user2, (AnonymousClass4D7) null, 14), C318116oQ.A00(A002));
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final String getModuleName() {
        return "live_cobroadcast";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0nA.A0N(view);
        AnonymousClass0eM r4 = this.A02;
        DbV.A1F(getViewLifecycleOwner(), ((C60257JiE) r4.getValue()).A00, new MP8(this, 49), 61);
        DbZ.A1C(this, new C52070GDq(view, this, (AnonymousClass4D7) null, 10), ((C60257JiE) r4.getValue()).A0A);
        ((C60257JiE) r4.getValue()).A00();
    }

    public final void DNI() {
        C60257JiE jiE = (C60257JiE) this.A02.getValue();
        if (jiE instanceof C62310Kdi) {
            C66184MGv.A02(jiE, C318116oQ.A00(jiE), 38);
        }
    }

    public final void Dc4() {
        ((C60257JiE) this.A02.getValue()).A00();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final Collection getDefinitions() {
        KG8 kg8 = new KG8(C66365MOw.A00);
        KFP kfp = new KFP(new MM8(this, 21));
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        C313666go r7 = this.A00;
        if (r7 == null) {
            0qQ.A0F("viewMode");
            throw AnonymousClass00P.createAndThrow();
        }
        return 0sr.A1P(new C232222tE[]{kg8, kfp, new C15796Uif(this, A0l, this, r7, this, new MP8(this, 47))});
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final int getExtraDragSpace() {
        return 0;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MP8(this, 48));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K8K() {
        MM8 mm8 = new MM8(this, 25);
        AnonymousClass0eM A002 = MM8.A00(new MM8(this, 22), 0eO.A02, 23);
        this.A02 = DbS.A0I(new MM8(A002, 24), mm8, C66304MMn.A01(A002, (Object) null, 14), DbS.A0z(C60257JiE.class));
    }

    public final void Ct1(User user) {
        C60257JiE A002 = A00(this, user);
        if (A002 instanceof C62311Kdj) {
            C66169MGg.A01(user, A002, C318116oQ.A00(A002), 3);
        }
    }

    public final void Cu9(User user, String str) {
        AnonymousClass7TG.A1N(user, str);
        C60257JiE jiE = (C60257JiE) this.A02.getValue();
        if (jiE instanceof C62311Kdj) {
            C66184MGv.A02(jiE, C318116oQ.A00(jiE), 39);
        }
    }

    public final void D0X(User user) {
        C60257JiE A002 = A00(this, user);
        if (A002 instanceof C62311Kdj) {
            C66169MGg.A01(user, A002, C318116oQ.A00(A002), 4);
        }
    }

    public final void DGW(String str) {
        C313716gt r2;
        C60257JiE A002 = A00(this, str);
        if ((A002 instanceof C62312Kdk) && (r2 = ((C62312Kdk) A002).A03) != null) {
            r2.A00("header", str, (String) null);
        }
    }

    public final void DdZ(User user) {
        C60257JiE A002 = A00(this, user);
        if (A002 instanceof C62311Kdj) {
            C66169MGg.A01(user, A002, C318116oQ.A00(A002), 5);
        }
    }

    public final void Dw8(String str) {
        A00(this, str).A01(str);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean isScrolledToBottom() {
        return !getRecyclerView().canScrollVertically(1);
    }

    public final boolean isScrolledToTop() {
        return !JTP.A1Y(getRecyclerView());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-746346564);
        K8K.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("live_view_mode");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.enums.IgLiveViewMode");
        this.A00 = (C313666go) serializable;
        setModuleNameV2("live_cobroadcast");
        AnonymousClass0fD.A09(408994440, A022);
    }
}
