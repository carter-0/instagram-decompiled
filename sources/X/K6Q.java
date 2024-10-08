package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

public final class K6Q extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "ShareToBarcelonaToggleUpsellFragment";
    public Boolean A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = "share_to_barcelona_toggle_upsell";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static final void A00(C368278sM r4, UserSession userSession, K6Q k6q, String str) {
        AnonymousClass818 r3;
        AnonymousClass819 r2;
        Boolean bool = k6q.A00;
        Boolean A0v = AnonymousClass7TE.A0v();
        if (0qQ.A0K(bool, A0v)) {
            r3 = AnonymousClass818.IG_THREADS_USER_ACTIVATION_JOINED_THREADS;
        } else {
            r3 = AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_THREADS_TOGGLE_ENABLE;
        }
        if (0qQ.A0K(k6q.A00, A0v)) {
            r2 = AnonymousClass819.BOTTOMSHEET_FEED_THREADS_NEW_USER_ACTIVATION;
        } else {
            r2 = AnonymousClass819.BOTTOMSHEET_FEED_THREADS_CONFIRMATION;
        }
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A06(C273654mx.A00(402), str);
        C368288sN.A00(r3, r4, r2, A0O, userSession);
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
        return this.A02;
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

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
        Integer num;
        AnonymousClass37D A0g = DbV.A0g(this, AnonymousClass37D.A00);
        if (A0g != null) {
            num = ((AnonymousClass37F) A0g).A0K;
        } else {
            num = null;
        }
        if (num != AnonymousClass05K.A02) {
            A00(C368278sM.DECLINE, AnonymousClass7TE.A0l(this.A01), this, (String) null);
        }
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MXB mxb;
        C62623Kiu kiu;
        String str;
        int A022 = AnonymousClass0fD.A02(-1037247655);
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass0eM r5 = this.A01;
        C347427wn r0 = (C347427wn) C347397wk.A00(AnonymousClass7TE.A0l(r5)).A02.getValue();
        Boolean bool = null;
        if (r0 != null) {
            mxb = r0.CGy();
            if (mxb != null) {
                kiu = mxb.AXt();
            }
            kiu = null;
        } else {
            mxb = null;
            kiu = null;
        }
        boolean A1W = AnonymousClass7TF.A1W(kiu, C62623Kiu.PRIVATE);
        if (mxb == null || (str = mxb.getUsername()) == null) {
            str = "";
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bool = DbU.A0g(bundle2, "is_new_user_activation_flow");
        }
        this.A00 = bool;
        C367998ru.A01(AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_THREADS_TOGGLE_ENABLE, AnonymousClass819.BOTTOMSHEET_FEED_THREADS_CONFIRMATION, AnonymousClass7TE.A0l(r5));
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new C59142J7y(this, bool, str, 1, A1W), 710618512, true), false, false);
        AnonymousClass0fD.A09(-2123584237, A022);
        return A012;
    }
}
