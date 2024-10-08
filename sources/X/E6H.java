package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class E6H extends AnonymousClass4DH implements C273504mg, C273494mf {
    public static final String __redex_internal_original_name = "DownloadPrivacyNuxFragment";
    public int A00;
    public C49323Ete A01;
    public ExT A02;
    public C331157Pu A03;
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
        ImageView A0F = DbU.A0F(view, R.id.clips_download_privacy_nux_icon);
        DbU.A13(A0F.getContext(), A0F, R.drawable.ig_illustrations_illo_reels_download_refresh);
        FP5.A01(view.requireViewById(R.id.clips_download_privacy_nux_button), 62, this);
        FP5.A01(view.requireViewById(R.id.clips_download_privacy_nux_link), 63, this);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.clips_download_privacy_nux_description);
        String A0m = DbU.A0m(this, 2131955382);
        String A0m2 = DbU.A0m(this, 2131955383);
        AnonymousClass7AV.A07(new C48052ESv(this, A0m2, Dbb.A04(this)), A0R, A0m2, A0m);
        Context requireContext = requireContext();
        AnonymousClass0eM r4 = this.A04;
        LTW.A04(requireContext, AnonymousClass7TE.A0l(r4), getModuleName(), true);
        ExT exT = this.A02;
        if (exT != null) {
            AnonymousClass3Q2 r2 = exT.A02;
            UserSession userSession = exT.A01;
            AnonymousClass0iw r0 = exT.A00;
            r2.A6E = true;
            C52086GEg.A0g(r0, userSession, true, true);
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

    public final String getModuleName() {
        return DbT.A0w(requireArguments(), "module_name", __redex_internal_original_name);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1823511804);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_download_privacy_nux, viewGroup, false);
        AnonymousClass0fD.A09(1696945585, A022);
        return inflate;
    }
}
