package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;

/* renamed from: X.UbM  reason: case insensitive filesystem */
public final class C15369UbM extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "KeywordExpirationTimeDatePickerBottomSheetFragment";
    public long A00 = System.currentTimeMillis();
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C58719IwS(C51968G9o.A0u(), this, AnonymousClass000.A00(575), 47));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final String A03 = "creator_ai_link_keyword_expiration_time_date_picker";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AnonymousClass7TE.A0R(this.A01.getValue());
        IgTimePicker igTimePicker = (IgTimePicker) AnonymousClass7TE.A0b(view, R.id.keyword_link_time_picker_view);
        Calendar instance = Calendar.getInstance();
        int i = instance.get(2);
        int i2 = instance.get(5);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(Calendar.getInstance().get(1), i, i2);
        igTimePicker.A01 = instance2;
        igTimePicker.setDatePeriod(365);
        C13988Tno.A1U(instance, this.A00);
        igTimePicker.A04(new C19400WXt(this));
        igTimePicker.A03(instance.get(1), instance.get(2), instance.get(5), instance.get(11), instance.get(12));
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
        return this.A03;
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
        int A022 = AnonymousClass0fD.A02(123906125);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.link_keyword_expiration_time_date_picker, false);
        AnonymousClass0fD.A09(1698089589, A022);
        return A0D;
    }
}
