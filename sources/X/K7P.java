package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBanner;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerBottomSheetContent;
import java.util.List;

public final class K7P extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "IncentiveDetailsFragment";
    public C331157Pu A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C20692WxO(this, 42));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "ig_funded_incentive_details";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        SellerIncentiveBannerBottomSheetContent sellerIncentiveBannerBottomSheetContent;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        IgFundedIncentive igFundedIncentive = (IgFundedIncentive) requireArguments.getParcelable("igfunded_incentive");
        SellerIncentiveBanner sellerIncentiveBanner = (SellerIncentiveBanner) requireArguments.getParcelable(C273654mx.A00(3302));
        if (igFundedIncentive != null) {
            AnonymousClass0eM r3 = this.A01;
            ((L9L) r3.getValue()).A00.setText(2131964328);
            ((L9L) r3.getValue()).A03.setText(igFundedIncentive.A06);
            IgTextView igTextView = ((L9L) r3.getValue()).A02;
            List list = igFundedIncentive.A0B;
            if (list != null) {
                igTextView.setText(((IgFundedIncentiveDetail) list.get(0)).getDescription());
                if (igFundedIncentive.A0E) {
                    ((L9L) r3.getValue()).A04.setVisibility(0);
                    ((L9L) r3.getValue()).A04.setText(2131964327);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (sellerIncentiveBanner != null) {
            AnonymousClass0eM r5 = this.A01;
            ((L9L) r5.getValue()).A03.setText(sellerIncentiveBanner.A00);
            List list2 = sellerIncentiveBanner.A01;
            if (list2 != null && (sellerIncentiveBannerBottomSheetContent = (SellerIncentiveBannerBottomSheetContent) 00k.A0O(list2, 0)) != null) {
                String str = sellerIncentiveBannerBottomSheetContent.A00;
                int A05 = DbX.A05(str);
                IgTextView igTextView2 = ((L9L) r5.getValue()).A00;
                if (A05 > 0) {
                    igTextView2.setText(str);
                } else {
                    igTextView2.setVisibility(8);
                }
                String str2 = sellerIncentiveBannerBottomSheetContent.A02;
                if (str2 == null || str2.length() <= 0) {
                    ((L9L) r5.getValue()).A01.setVisibility(8);
                } else {
                    ((L9L) r5.getValue()).A01.setText(str2);
                }
                ((L9L) r5.getValue()).A02.setText(sellerIncentiveBannerBottomSheetContent.A01);
            }
        } else {
            throw AnonymousClass7TE.A0z("No incentive available");
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

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(814790870);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.incentive_details, viewGroup, false);
        AnonymousClass0fD.A09(-787166340, A022);
        return inflate;
    }
}
