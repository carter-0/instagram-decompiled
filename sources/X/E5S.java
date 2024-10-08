package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class E5S extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf {
    public static final String __redex_internal_original_name = "InviteContactFragment";
    public boolean A00 = true;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "invite_contact_module";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
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
        return this.A00;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E5S() {
        C73660PhZ phZ = new C73660PhZ(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73660PhZ(new C73660PhZ(this, 22), 23));
        this.A02 = DbS.A0I(new C73660PhZ(A002, 24), phZ, new C73666Phf(31, (Object) null, A002), DbS.A0z(C46730DkJ.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C48145EZn eZn;
        int A022 = AnonymousClass0fD.A02(-334828379);
        0qQ.A0B(layoutInflater, 0);
        String string = requireArguments().getString("invite_location");
        if (string == null || (eZn = C48145EZn.valueOf(string)) == null) {
            eZn = C48145EZn.OTHER;
        }
        boolean z = requireArguments().getBoolean("show_app_tray", true);
        boolean z2 = requireArguments().getBoolean("is_photo_enabled", false);
        boolean z3 = requireArguments().getBoolean("is_contact_synced", false);
        AnonymousClass0eM r7 = this.A02;
        ((C46730DkJ) r7.getValue()).A0E(eZn);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(((C46730DkJ) r7.getValue()).A01), "contact_list_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("nav_chain", DbY.A0a());
            A0e.A8M(eZn, "invite_location");
            A0e.A7p("is_contact_synced", Boolean.valueOf(z3));
            A0e.Cgf();
        }
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(((C46730DkJ) r7.getValue()).A01), "external_invite_app_tray_impression");
        if (A0e2.isSampled()) {
            A0e2.AAJ("nav_chain", DbY.A0a());
            A0e2.A8M(eZn, "invite_location");
            A0e2.Cgf();
        }
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new G4V(eZn, this, z, z2, z3), 131540109, true), false, false);
        AnonymousClass0fD.A09(1474821504, A022);
        return A012;
    }
}
