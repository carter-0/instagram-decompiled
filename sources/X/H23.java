package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;
import java.util.Set;

public final class H23 extends C273374mT implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "SelectAccountsFragment";
    public final AnonymousClass0eM A00 = C58702IwB.A00(this, 25);
    public final AnonymousClass0eM A01 = C58702IwB.A00(this, 26);
    public final AnonymousClass0eM A02 = DbS.A0I(C58702IwB.A01(this, 27), C58702IwB.A01(this, 28), new C58689Ivy(26, this, (Object) null), DbS.A0z(C54182H2c.class));
    public final String A03 = "creators_genai_select_accounts";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 20), AnonymousClass07a.A00(viewLifecycleOwner));
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

    public final boolean onBackPressed() {
        AnonymousClass0eM r3 = this.A02;
        H2P h2p = ((C54182H2c) r3.getValue()).A02;
        if (!C51966G9m.A1a(((Map) h2p.A08.getValue()).keySet(), h2p.A09.getValue())) {
            return false;
        }
        H2P h2p2 = ((C54182H2c) r3.getValue()).A02;
        Set keySet = ((Map) h2p2.A08.getValue()).keySet();
        AnonymousClass7TE.A1Z(new C58104ImQ(keySet, h2p2, (AnonymousClass4D7) null, 15), h2p2.A03());
        C331157Pu r1 = (C331157Pu) this.A00.getValue();
        if (r1 != null) {
            r1.A0P(true);
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1656252625);
        H23.super.onCreate(bundle);
        H2P h2p = ((C54182H2c) this.A02.getValue()).A02;
        h2p.A0B.Epw(C54617HLa.LOADING);
        C58102ImO.A02(h2p, h2p.A03(), 32);
        AnonymousClass0fD.A09(-60234473, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2054472286);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 38), -1005334295);
        AnonymousClass0fD.A09(-276181454, A022);
        return A0H;
    }
}
