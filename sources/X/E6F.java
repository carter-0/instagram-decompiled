package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class E6F extends AnonymousClass4DH implements C273504mg, C273494mf {
    public static final String __redex_internal_original_name = "OptimizedNuxFragment";
    public final UserSession A00;
    public final Integer A01;
    public final C62320sa A02;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String str4 = null;
        if (this.A01 != AnonymousClass05K.A00) {
            TextView A0G = DbU.A0G(view, R.id.clips_nux_sheet_text2);
            Context context = getContext();
            if (context != null) {
                str4 = context.getString(2131955739);
            }
            A0G.setText(str4);
            int A03 = Dbb.A03(view, R.id.clips_nux_sheet_icon3);
            DbT.A1F(view, R.id.clips_nux_sheet_text3, A03);
            DbT.A1F(view, R.id.clips_nux_sheet_icon4, A03);
            DbT.A1F(view, R.id.clips_nux_sheet_text4, A03);
            AnonymousClass7TF.A0G(view, R.id.clips_nux_sheet_scroll_view).getLayoutParams().height = DbS.A02(requireContext(), 200);
        } else {
            TextView A0G2 = DbU.A0G(view, R.id.clips_nux_sheet_text1);
            Context context2 = A0G2.getContext();
            if (context2 != null) {
                str = context2.getString(2131955737);
            } else {
                str = null;
            }
            A0G2.setText(str);
            A0G2.setTextAppearance(R.style.igds_body_1);
            TextView A0G3 = DbU.A0G(view, R.id.clips_nux_sheet_text2);
            Context context3 = A0G3.getContext();
            if (context3 != null) {
                str2 = context3.getString(2131955740);
            } else {
                str2 = null;
            }
            A0G3.setText(str2);
            A0G3.setTextAppearance(R.style.igds_body_1);
            TextView A0G4 = DbU.A0G(view, R.id.clips_nux_sheet_text3);
            Context context4 = A0G4.getContext();
            if (context4 != null) {
                str3 = context4.getString(2131955742);
            } else {
                str3 = null;
            }
            A0G4.setText(str3);
            A0G4.setTextAppearance(R.style.igds_body_1);
            TextView A0G5 = DbU.A0G(view, R.id.clips_nux_sheet_text4);
            Context context5 = A0G5.getContext();
            if (context5 != null) {
                str4 = context5.getString(2131955744);
            }
            A0G5.setText(str4);
            A0G5.setTextAppearance(R.style.igds_body_1);
            DbU.A0F(view, R.id.clips_nux_sheet_icon3).setImageResource(R.drawable.instagram_remix_pano_outline_24);
        }
        FP5.A01(AnonymousClass7TF.A0G(view, R.id.clips_nux_sheet_share_button), 64, this);
        FP5.A01(AnonymousClass7TF.A0G(view, R.id.clips_nux_sheet_cancel_button), 65, this);
        View A0G6 = AnonymousClass7TF.A0G(view, R.id.clips_nux_sheet_learn_more);
        2eS.A01(A0G6);
        FP5.A01(A0G6, 66, this);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return "ig_camera_clips_optimized_nux";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return this.A00;
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

    public final boolean isScrolledToBottom() {
        return false;
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetClosed() {
        27p.A01(this.A00);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E6F(UserSession userSession, Integer num, C62320sa r3) {
        this.A00 = userSession;
        this.A01 = num;
        this.A02 = r3;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1098352154);
        0qQ.A0B(layoutInflater, 0);
        E6F.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_optimized_nux, viewGroup, false);
        AnonymousClass0fD.A09(1607947593, A022);
        return inflate;
    }
}
