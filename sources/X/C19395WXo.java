package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.WXo  reason: case insensitive filesystem */
public final class C19395WXo implements AnonymousClass6ZA {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;

    public final /* synthetic */ void CtS() {
    }

    public final /* synthetic */ void Din(View view, int i) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C19395WXo(C255773uh r1, C250973mM r2, AnonymousClass6Z5 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void D9e() {
        String str;
        AnonymousClass6Z5 r8 = this.A02;
        C273384mU r7 = r8.A17;
        r7.EHd();
        C255773uh r5 = this.A00;
        C250973mM r4 = this.A01;
        UserSession userSession = r8.A09;
        String str2 = null;
        if (userSession != null) {
            1Av A002 = 1Au.A00(userSession);
            if (!AnonymousClass7TG.A1a(A002, A002.A5j, 1Av.A8a, 374)) {
                UserSession userSession2 = r8.A09;
                if (userSession2 != null) {
                    AnonymousClass4DU r2 = r8.A15;
                    String str3 = r5.A0j;
                    User user = r5.A0i;
                    if (user != null) {
                        str2 = user.getId();
                    }
                    if (r4.A0H.A0i()) {
                        str = "story_highlight_action_sheet";
                    } else {
                        str = "location_story_action_sheet";
                    }
                    C22031Xty.A0B(r2, userSession2, str3, str2, str);
                    r8.A19.A00(r5, r4, C315016jD.SHARE_BUTTON_LOCATION_NUX, r7.Aui());
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
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

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
