package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NK9 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "InThreadFeedbackBottomSheet";
    public C62320sa A00;
    public 0wc A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "creator_ai_in_thread_feedback";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A03;
        this.A01 = AnonymousClass0kN.A02(DbT.A0X(r4));
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("creator_ai_bot_response_id_extra")) == null) {
            str = "";
        }
        this.A02 = str;
        A00(this, "open_ig_creator_ai_feedback");
        C56800ICx.A00(view.findViewById(R.id.creator_ai_wrong_information), 36, new C74192PqY((Object) this, (Object) requireArguments(), "feedback_negative_correction", C273654mx.A00(640), 23));
        View findViewById = view.findViewById(R.id.creator_ai_avoided_topic);
        findViewById.setVisibility(0);
        C56800ICx.A00(findViewById, 36, new C74192PqY((Object) this, (Object) requireArguments(), "feedback_negative_avoided_topic", C273654mx.A00(639), 23));
        if (182.A06(0Tu.A05, DbT.A0X(r4), 36322993689144023L)) {
            View findViewById2 = view.findViewById(R.id.creator_ai_freeform_feedback);
            findViewById2.setVisibility(0);
            C56800ICx.A00(findViewById2, 36, new C74192PqY((Object) this, (Object) requireArguments(), "feedback_negative_give_feedback_to_meta", C273654mx.A00(2211), 23));
        }
    }

    public static final void A00(NK9 nk9, String str) {
        String str2;
        0wc r1 = nk9.A01;
        if (r1 == null) {
            str2 = "logger";
        } else {
            1Ln r3 = new 1Ln(AnonymousClass7TE.A0e(r1, "gen_ai_response_feedback"), 160);
            if (DbT.A1Y(r3)) {
                r3.A0R("feedback_surface", "instagram");
                r3.A0R("feedback_type", "thumbs_down");
                String str3 = nk9.A02;
                if (str3 == null) {
                    str2 = "botResponseId";
                } else {
                    r3.A0R("response_id", str3);
                    r3.A00.A9H("bool_feedback", AnonymousClass7TF.A0w(str, AnonymousClass7TE.A0v()));
                    r3.Cgf();
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str2);
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
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1572043242);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_ai_in_thread_feedback_bottom_sheet_layout, false);
        AnonymousClass0fD.A09(1462935867, A022);
        return A0D;
    }
}
