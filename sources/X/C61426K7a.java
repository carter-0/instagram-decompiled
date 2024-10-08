package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.K7a  reason: case insensitive filesystem */
public final class C61426K7a extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "AiAudienceSelectionFragment";
    public C66499MUd A00;
    public C62320sa A01 = C66227MJi.A00;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C66301MMk.A01(this, 8));
    public final AnonymousClass0eM A03 = DbS.A0I(C66301MMk.A01(this, 13), C66301MMk.A01(this, 9), MMV.A00((Object) null, this, 8), JTT.A0w());
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(C66301MMk.A01(this, 10));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06 = DbS.A0I(C66301MMk.A01(this, 12), C66301MMk.A01(this, 11), MMV.A00((Object) null, this, 7), JTT.A0v());
    public final String A07 = "update_status_guidance_bottom_Sheet";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static final int A00(List list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C61055Jvt) it.next()).A03 && (i = i + 1) < 0) {
                    0sr.A1S();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        return i + 1;
    }

    public static final void A01(C61426K7a k7a) {
        ((C2355930l) k7a.A02.getValue()).A00(k7a, C62574Ki7.AI_AUDIENCE_CONTROL, 1993, false);
    }

    public static final void A02(C61426K7a k7a) {
        k7a.A01.invoke();
        if (0qQ.A0K(k7a.requireArguments().getString("arg_entry_point"), "AI_CREATION")) {
            LTH A0T = JTO.A0T(k7a.A04);
            AnonymousClass0eM r0 = k7a.A03;
            String A022 = C60316JjJ.A02(r0);
            String A012 = C60316JjJ.A01(r0);
            1Ln A002 = LTH.A00(A0T);
            if (DbT.A1Y(A002)) {
                JTT.A1G(A002, JTU.A0W(A002, "ai_configuration_screen_discoverability_row_clicked", A022), A012);
            }
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
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
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
        return false;
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

    @Deprecated(message = "Use the new compose version of this method instead")
    public final void onActivityResult(int i, int i2, Intent intent) {
        C66499MUd mUd;
        super.onActivityResult(i, i2, intent);
        if (i == 1993 && (mUd = this.A00) != null) {
            mUd.D4E();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-823812594);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 22), 816682528);
        AnonymousClass0fD.A09(-2015805665, A022);
        return A0H;
    }
}
