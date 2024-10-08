package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

public abstract class K7Y extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "CrosspostingUpsellBottomSheetFragment";
    public int A00;
    public int A01;
    public AnonymousClass818 A02;
    public AnonymousClass819 A03;
    public UserSession A04;
    public MUE A05;
    public LBI A06;
    public String A07;
    public String A08;
    public boolean A09;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final AnonymousClass819 A0B() {
        AnonymousClass819 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("variant");
        throw AnonymousClass00P.createAndThrow();
    }

    /* renamed from: A0C */
    public final UserSession getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final LBI A0D() {
        LBI lbi = this.A06;
        if (lbi != null) {
            return lbi;
        }
        0qQ.A0F("contentOverride");
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

    public final boolean isScrolledToTop() {
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static String A00(Context context, K7Y k7y) {
        return AnonymousClass5w9.A00(k7y.getSession()).A05(context, k7y.getSession());
    }

    public static void A01(Resources resources, TextView textView, Object[] objArr, int i) {
        textView.setText(0bC.A00(resources, objArr, i));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public void onCreate(Bundle bundle) {
        String string;
        int i;
        boolean z;
        int A022 = AnonymousClass0fD.A02(-365145206);
        K7Y.super.onCreate(bundle);
        this.A04 = 09i.A0A.A06(requireArguments());
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("args_entrypoint")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-173023513, A022);
            throw A0y;
        }
        AnonymousClass818 valueOf = AnonymousClass818.valueOf(string);
        0qQ.A0B(valueOf, 0);
        this.A02 = valueOf;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            i = bundle3.getInt("args_num_of_views");
        } else {
            i = -1;
        }
        this.A00 = i;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            z = bundle4.getBoolean("args_is_after_fbc");
        } else {
            z = false;
        }
        this.A09 = z;
        AnonymousClass0fD.A09(1830939840, A022);
    }
}
