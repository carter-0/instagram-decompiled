package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;

/* renamed from: X.H1h  reason: case insensitive filesystem */
public final class C54163H1h extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "SpinsSelectionBottomSheetFragment";
    public AnonymousClass3Q2 A00;
    public String A01;
    public C62320sa A02;
    public final AnonymousClass0eM A03 = C58712IwL.A00(this, 16);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = DbS.A0I(C58712IwL.A01(this, 17), C58576Iu9.A00, C58690Ivz.A00((Object) null, this, 37), DbS.A0z(C53024GhF.class));
    public final String A06 = "clips_enable_spins";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static final void A00(C381879cj r11, C54163H1h h1h) {
        Object value;
        String str;
        String str2;
        AnonymousClass62O r1;
        AnonymousClass0eM r5 = h1h.A05;
        05G r6 = ((C53024GhF) r5.getValue()).A00;
        do {
            value = r6.getValue();
            GSY gsy = (GSY) value;
            str = gsy.A02;
            str2 = gsy.A03;
            r1 = (AnonymousClass62O) gsy.A00;
            0qQ.A0B(r1, 3);
        } while (!r6.AIY(value, new GSY(r11, str, str2, r1)));
        AnonymousClass3Q2 r62 = h1h.A00;
        String str3 = h1h.A01;
        if (r11 == null || str3 == null || r11.Byr() <= 0.0f || r62 == null) {
            ((C53024GhF) r5.getValue()).A01((String) null);
            return;
        }
        LO3 lo3 = (LO3) h1h.A03.getValue();
        int dimensionPixelSize = DbV.A05(h1h).getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge_plus);
        int dimensionPixelSize2 = DbV.A05(h1h).getDimensionPixelSize(R.dimen.before_and_after_media_card_width);
        lo3.A01(new IQV(h1h), r62, str3, dimensionPixelSize, dimensionPixelSize2, ((long) r11.Byr()) * 1000, true);
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
        return this.A06;
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
        int A022 = AnonymousClass0fD.A02(-1510571375);
        ComposeView A0H = DbV.A0H(this, new JGB(this, 16), 987831620);
        AnonymousClass0fD.A09(-1770381930, A022);
        return A0H;
    }
}
