package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E5y  reason: case insensitive filesystem */
public final class C47515E5y extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ReuseForFeedPostsBottomSheetNux";
    public UserSession A00;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.new_remix_introduction_headline);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        Resources resources = A0S.getResources();
        Boolean A0v = AnonymousClass7TE.A0v();
        FGX A01 = FGX.A01(A0S, A0v);
        igdsHeadline.setHeadline(2131972381);
        A01.A05((CharSequence) null, resources.getString(2131972379), R.drawable.instagram_new_post_pano_outline_24);
        A01.A05((CharSequence) null, resources.getString(2131972380), R.drawable.instagram_remix_pano_outline_24);
        FGX.A03(A01, igdsHeadline, (CharSequence) null, resources.getString(2131972386), R.drawable.instagram_settings_pano_outline_24);
        UserSession userSession = this.A00;
        if (userSession != null) {
            1Av A002 = 1Au.A00(userSession);
            DbS.A1a(A002, A0v, A002.A4o, 1Av.A8a, 332);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                C52345GOp.A06(userSession2);
                return;
            }
        }
        DbS.A14();
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

    public final String getModuleName() {
        return "metadata_reuse_for_feed_posts_bottom_sheet_nux";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
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

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2066180132);
        C47515E5y.super.onCreate(bundle);
        this.A00 = DbX.A0V(this);
        AnonymousClass0fD.A09(851540006, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1453493507);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_new_remix_introduction_bottomsheet, false);
        AnonymousClass0fD.A09(-1282325007, A02);
        return A0D;
    }
}
