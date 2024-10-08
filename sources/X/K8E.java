package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.direct.emojipong.data.EmojiPongUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class K8E extends MYR implements C273494mf {
    public static final String __redex_internal_original_name = "EmojiPongLeaderboardFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "ig_direct_emoji_pong_easter_egg_leaderboard";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0nA.A0X(view, AnonymousClass2uJ.A00);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (parcelableArrayList = bundle2.getParcelableArrayList("emoji_pong_users")) != null) {
            List<EmojiPongUser> A002 = MAY.A00(parcelableArrayList, 15);
            ArrayList A0r = AnonymousClass7TG.A0r(A002);
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            for (EmojiPongUser emojiPongUser : A002) {
                boolean z = true;
                i2++;
                int i4 = emojiPongUser.A00;
                if (i4 != i) {
                    i = i4;
                    i3 = i2;
                }
                int size = A002.size();
                if (i4 != ((EmojiPongUser) 00k.A0I(A002)).A00 || i4 <= 0) {
                    z = false;
                }
                A0r.add(new C61164JyG(emojiPongUser, i3, size, z));
            }
            A0B(A0r);
        }
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
        return AnonymousClass7TE.A1I(new KFF(this));
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MO8.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
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

    public final boolean isScrolledToTop() {
        if (!isResumed() || !JTP.A1Y(getRecyclerView())) {
            return true;
        }
        return false;
    }
}
