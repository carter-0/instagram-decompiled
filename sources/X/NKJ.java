package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class NKJ extends AnonymousClass4DH implements C273494mf, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MetaAiVoiceSettingsFragment";
    public C56838IEj A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;
    public final String A03 = __redex_internal_original_name;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass9B9.A00();
        DbW.A1B(r2, 2131960493);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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

    public final String getModuleName() {
        return this.A03;
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

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        C56838IEj iEj = this.A00;
        if (iEj == null || iEj.A03.BI6() == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NKJ() {
        C73899Pla pla = new C73899Pla(this, 3);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73899Pla(new C73899Pla(this, 0), 1));
        this.A02 = DbS.A0I(new C73899Pla(A002, 2), pla, new C73665Phe(41, A002, (Object) null), DbS.A0z(C60136JgH.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-393596650);
        2YL A0H = DbS.A0H(this.A02);
        AnonymousClass7TE.A1Z(new C73568Pfp(A0H, (AnonymousClass4D7) null, 21), C318116oQ.A00(A0H));
        ComposeView A0H2 = DbV.A0H(this, new JG2(8, requireContext().getApplicationContext(), this), 1500950228);
        AnonymousClass0fD.A09(-744944549, A022);
        return A0H2;
    }
}
