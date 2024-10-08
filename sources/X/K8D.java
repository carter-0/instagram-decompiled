package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

public abstract class K8D extends MYR implements C273494mf {
    public static final String __redex_internal_original_name = "IgLiveBaseAvatarGridRecyclerFragment";
    public final AnonymousClass0eM A00 = MMN.A00(this, 14);
    public final AnonymousClass0eM A01 = MMN.A00(this, 15);
    public final AnonymousClass0eM A02 = MMN.A00(this, 16);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 39), AnonymousClass07a.A00(viewLifecycleOwner));
        C3021461u r1 = (C3021461u) this.A01.getValue();
        if (r1 != null) {
            r1.setPrimaryActionOnClickListener(LY5.A00(this, 39));
        }
    }

    public final C46787DlH A0C() {
        AnonymousClass0eM r0;
        if (this instanceof C62252Kcm) {
            r0 = ((C62252Kcm) this).A03;
        } else if (this instanceof C62250Kck) {
            r0 = ((C62250Kck) this).A03;
        } else if (this instanceof C62251Kcl) {
            r0 = ((C62251Kcl) this).A03;
        } else {
            r0 = ((C62249Kcj) this).A01;
        }
        return (C46787DlH) r0.getValue();
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

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new EFy(this));
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MP8(this, 42));
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
