package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9i9  reason: invalid class name and case insensitive filesystem */
public final class C384949i9 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "GalleryStickerPickerFragment";
    public AnonymousClass8MP A00;
    public C66503MUh A01;
    public C64967Ll6 A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "gallery_picker_sheet";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, androidx.fragment.app.Fragment, X.9i9, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        C66503MUh mUh;
        int i;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass8MP r6 = this.A00;
        if (r6 != null && (mUh = this.A01) != null) {
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(this.A03);
            0gy A002 = AnonymousClass07i.A00(this);
            ViewGroup viewGroup = (ViewGroup) view2;
            requireContext().getColor(R.color.clips_overlay_ads_end_background_color);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                i = bundle2.getInt("container_width");
            } else {
                i = 0;
            }
            C64967Ll6 ll6 = new C64967Ll6(requireContext, viewGroup, A002, A0l, r6, mUh, i);
            this.A02 = ll6;
            ll6.E0h();
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

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A03.getValue();
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

    public final boolean isScrolledToTop() {
        C64967Ll6 ll6 = this.A02;
        if (ll6 != null) {
            return ll6.isScrolledToTop();
        }
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
        int A022 = AnonymousClass0fD.A02(1923253330);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_gallery_picker, viewGroup, false);
        AnonymousClass0fD.A09(-2082327159, A022);
        return inflate;
    }
}
