package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H1e  reason: case insensitive filesystem */
public final class C54160H1e extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ClipsSpinsAddSpinTextBottomSheetFragment";
    public C331157Pu A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(1175);
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbZ.A1C(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 44), ((C54181H2b) this.A02.getValue()).A06);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
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

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C54160H1e() {
        C58712IwL A012 = C58712IwL.A01(this, 31);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58712IwL.A01(C58712IwL.A01(this, 34), 35));
        this.A02 = DbS.A0I(C58712IwL.A01(A002, 36), A012, C58690Ivz.A00((Object) null, A002, 43), DbS.A0z(C54181H2b.class));
        this.A03 = C58712IwL.A00(this, 32);
        this.A01 = AnonymousClass1YB.A00(C58579IuC.A00);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.H1e, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-597767599);
        C54160H1e.super.onCreate(bundle);
        AnonymousClass11O.A03(DbW.A0E(this), new C61860pz(C58103ImP.A01(this, (AnonymousClass4D7) null, 43), ((C54181H2b) this.A02.getValue()).A04));
        AnonymousClass0fD.A09(-1365894994, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1653291596);
        ComposeView A0H = DbV.A0H(this, new J7Q(this, requireArguments().getString("stripped_media_id"), 4, AnonymousClass7TF.A1W(DbX.A0l(AnonymousClass0t1.A01, this.A04).A0N(), AnonymousClass05K.A0C)), 102906694);
        AnonymousClass0fD.A09(-423958003, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1997258749);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(2015921414, A022);
    }
}
