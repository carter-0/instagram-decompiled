package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.K7i  reason: case insensitive filesystem */
public final class C61433K7i extends AnonymousClass4DH implements C273494mf, C273414mX {
    public static final String __redex_internal_original_name = "OpenCarouselCreationPromptBottomSheetFragment";
    public IgEditText A00;
    public C331157Pu A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C51688Fyo(this));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "open_carousel_creation_prompt_bottom_sheet";

    public final /* synthetic */ void Cyc() {
    }

    public final /* synthetic */ void Cyf() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
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
        int A022 = AnonymousClass0fD.A02(-1477550640);
        0qQ.A0B(layoutInflater, 0);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.open_carousel_creation_prompt_bottom_sheet, false);
        IgEditText igEditText = (IgEditText) A09.requireViewById(R.id.open_carousel_creation_prompt_input);
        this.A00 = igEditText;
        if (igEditText != null) {
            igEditText.addTextChangedListener(new FKk(this, 25));
            AnonymousClass0eM r2 = this.A02;
            String A0t = DbS.A0t(r2);
            if (A0t != null && !00l.A0W(A0t)) {
                IgEditText igEditText2 = this.A00;
                if (igEditText2 != null) {
                    igEditText2.setText(DbS.A0t(r2));
                }
            }
            AnonymousClass0fD.A09(-1991478276, A022);
            return A09;
        }
        0qQ.A0F("editText");
        throw AnonymousClass00P.createAndThrow();
    }
}
