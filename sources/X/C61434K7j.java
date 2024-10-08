package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.List;

/* renamed from: X.K7j  reason: case insensitive filesystem */
public final class C61434K7j extends AnonymousClass4DH implements C273494mf, MVI, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectDailyPromptsPhotoSelectionFragment";
    public Medium A00;
    public NJL A01;
    public LPF A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final /* synthetic */ void D0u() {
    }

    public final boolean DHW(View view, GalleryItem galleryItem) {
        return false;
    }

    public final /* synthetic */ void DIn(boolean z) {
    }

    public final boolean Dkq(Medium medium, String str) {
        if (0qQ.A0K(this.A00, medium)) {
            medium = null;
        }
        this.A00 = medium;
        2dZ.A0t.A04(this).ARb(0, AnonymousClass7TF.A1V(this.A00));
        return true;
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.setTitle("");
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0C = 2131973021;
        DbX.A19(new C71397Ojw(this, 64), A0K, r5);
        r5.ARb(0, AnonymousClass7TF.A1V(this.A00));
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View view3 = view2;
        this.A02 = new LPF(view3, (AnonymousClass07i) null, AnonymousClass8XO.PHOTO_ONLY, AnonymousClass7TE.A0l(this.A03), (2Cn) null, this, new C63957LFd(1, (String) null, (String) null, (String) null, (String) null, "", (List) null, 1.0f, 0, true, false, false, false, false, false, true, false), (Boolean) null, 4, 0, true, false, false);
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

    public final boolean isScrolledToTop() {
        LPF lpf = this.A02;
        if (lpf != null) {
            return lpf.A05();
        }
        0qQ.A0F("mediaPickerPhotosController");
        throw AnonymousClass00P.createAndThrow();
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
        int A022 = AnonymousClass0fD.A02(492099182);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_photo_selection_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1630485638, A022);
        return inflate;
    }
}
