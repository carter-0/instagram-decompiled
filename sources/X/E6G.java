package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;

public final class E6G extends AnonymousClass4DH implements C273504mg, C273494mf {
    public static final String __redex_internal_original_name = "AudioFiltersPrivacyNuxFragment";
    public int A00;
    public C49322Etd A01;
    public C331157Pu A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImageView A0F = DbU.A0F(view, R.id.clips_audio_filters_privacy_nux_icon);
        DbU.A13(A0F.getContext(), A0F, R.drawable.ig_illustrations_qp_reels_refresh);
        FP5.A01(view.requireViewById(R.id.clips_audio_filters_privacy_nux_button), 61, this);
        AnonymousClass0eM r4 = this.A04;
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r4, 0), 36320382349681024L)) {
            View requireViewById = view.requireViewById(R.id.clips_audio_filters_privacy_nux_learn_more);
            AnonymousClass0fU.A00(new FPE(32, (Object) requireViewById, (Object) this), requireViewById);
            requireViewById.setVisibility(0);
        }
        C49887FBn A012 = C49797F7i.A01(AnonymousClass7TE.A0l(r4), this.A00);
        if (A012 != null) {
            A012.A00();
        }
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
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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
        int A022 = AnonymousClass0fD.A02(-1373812332);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audio_filters_privacy_nux, viewGroup, false);
        AnonymousClass0fD.A09(-1183547070, A022);
        return inflate;
    }
}
