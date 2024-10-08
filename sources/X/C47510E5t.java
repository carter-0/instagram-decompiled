package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.user.model.Product;

/* renamed from: X.E5t  reason: case insensitive filesystem */
public final class C47510E5t extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ProductPickerItemUnavailableFragment";
    public Product A00;
    public final AnonymousClass0eM A01 = C227642jf.A01(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "product_picker_learn_more_bottom_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
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
        int A02 = AnonymousClass0fD.A02(-1983400262);
        C47510E5t.super.onCreate(bundle);
        this.A00 = (Product) requireArguments().getParcelable("product");
        AnonymousClass0fD.A09(-1976283407, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A02 = AnonymousClass0fD.A02(263567133);
        0qQ.A0B(layoutInflater, 0);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.publishing_unavailable_reason_fragment, false);
        TextView A0d = AnonymousClass7TE.A0d(A09, R.id.unavailable_learn_more_reason);
        Product product = this.A00;
        UntaggableReason untaggableReason = null;
        if (product != null) {
            untaggableReason = product.A06;
        }
        if (untaggableReason != null) {
            LinkWithText linkWithText = untaggableReason.A02;
            if (linkWithText != null) {
                String str = untaggableReason.A03;
                if (str != null) {
                    String str2 = linkWithText.A01;
                    if (str2 != null) {
                        0qQ.A0A(A0d);
                        AnonymousClass7AV.A07(new C48052ESv(this, str2, Dbb.A04(this)), A0d, DbU.A0m(this, 2131964884), str);
                        AnonymousClass0fD.A09(-837148429, A02);
                        return A09;
                    }
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = 1465662341;
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = 1447508378;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1614358001;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 658468719;
        }
        AnonymousClass0fD.A09(i, A02);
        throw illegalStateException;
    }
}
