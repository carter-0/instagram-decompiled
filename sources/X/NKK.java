package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.List;

public abstract class NKK extends AnonymousClass4DH implements C273494mf, AnonymousClass0j6 {
    public static final String __redex_internal_original_name = "DirectEmojiReactionsListBaseFragment";
    public int A00;
    public int A01;
    public long A02;
    public C70458O7j A03;
    public 2FW A04;
    public C254743sy A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final 0jB E4x() {
        0jB r5 = new 0jB();
        int i = this.A01;
        String str = null;
        if (i != 28) {
            if (i == 29) {
                C254743sy r0 = this.A05;
                if (r0 != null) {
                    str = C66647MaG.A0B(r0);
                }
                r5.A0A(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                r5.A09("is_broadcast_chat", 1);
                r5.A09("audience_type", this.A00);
                return r5;
            } else if (i != 61) {
                return r5;
            }
        }
        C254743sy r02 = this.A05;
        if (r02 != null) {
            str = C66647MaG.A0B(r02);
        }
        r5.A0A(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        r5.A09("is_csc_chat", 1);
        return r5;
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
        int i = this.A01;
        if (i == 28) {
            return "csc_direct_thread";
        }
        if (i == 29) {
            return "broadcast_chat_thread";
        }
        if (i == 32) {
            return "discoverable_chat_thread";
        }
        if (i == 61) {
            return "csc_direct_thread";
        }
        if (i != 62) {
            return "direct_reaction_fragment";
        }
        return "discoverable_chat_thread";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
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

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(395377404);
        NKK.super.onCreate(bundle);
        String string = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID");
        if (string == null) {
            0wb.A03(C68954Nbd.__redex_internal_original_name, "Cannot open DirectEmojiReactionsListFragment with a null message id.");
        } else {
            this.A07 = string;
        }
        this.A06 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT");
        this.A02 = requireArguments().getLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS");
        2FW r1 = 2FW.values()[requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CONTENT_TYPE_ORDINAL")];
        0qQ.A0B(r1, 0);
        this.A04 = r1;
        this.A05 = C67002Mga.A00(requireArguments(), "direct_emoji_unified_thread_key");
        this.A01 = requireArguments().getInt("direct_emoji_thread_subtype");
        this.A00 = requireArguments().getInt("direct_emoji_thread_audience_type");
        this.A09 = requireArguments().getBoolean("direct_emoji_is_count_based_reaction_sheet");
        this.A08 = requireArguments().getParcelableArrayList("direct_emoji_reactions_list");
        AnonymousClass0fD.A09(1446268879, A022);
    }
}
