package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E5T extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf {
    public static final String __redex_internal_original_name = "TrendTransparencySheetFragment";
    public 0wc A00;
    public final String A01 = "trend_transparency_sheet";
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.disclaimer_headline);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        Resources resources = A0S.getResources();
        FGX A012 = FGX.A01(A0S, AnonymousClass7TE.A0v());
        igdsHeadline.setHeadline(2131975529);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_reels_refresh);
        A012.A05((CharSequence) null, resources.getString(2131975522), R.drawable.instagram_arrow_up_right_pano_outline_24);
        FGX.A03(A012, igdsHeadline, (CharSequence) null, resources.getString(2131975523), R.drawable.instagram_shield_star_pano_outline_24);
        View findViewById = view.findViewById(R.id.igds_headline_bullet_list_container);
        0qQ.A0A(findViewById);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), 0, 0);
            findViewById.setLayoutParams(marginLayoutParams);
            0wc r1 = this.A00;
            if (r1 == null) {
                0qQ.A0F("typedLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_clips_trends_transparency_sheet_impression");
            DbS.A1K(A0e, this.A01);
            A0e.Cgf();
            return;
        }
        throw AnonymousClass7TE.A11(C273654mx.A00(3));
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
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
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
        int A022 = AnonymousClass0fD.A02(-1832064488);
        E5T.super.onCreate(bundle);
        this.A00 = DbX.A0P(this, this.A02);
        requireArguments().getSerializable("trend_report_entrypoint");
        AnonymousClass0fD.A09(128237109, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1496791303);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_trends_transparency_fragment, false);
        AnonymousClass0fD.A09(-1066601153, A022);
        return A0D;
    }
}
