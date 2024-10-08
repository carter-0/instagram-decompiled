package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Lyr  reason: case insensitive filesystem */
public final class C65737Lyr implements C273494mf, MSU, MSV {
    public final /* synthetic */ JVO A00;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C65737Lyr(JVO jvo) {
        this.A00 = jvo;
    }

    public final void Dfk() {
        JVO.A00(this.A00);
    }

    public final /* bridge */ /* synthetic */ void DgK(Object obj) {
        int[] iArr;
        N49 n49 = (N49) obj;
        0qQ.A0B(n49, 0);
        C320296s9 r0 = this.A00.A03;
        String str = n49.A00;
        String str2 = n49.A01;
        String str3 = r0.A0B;
        if (str3 == null) {
            0qQ.A0F("profileUserId");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7TG.A1O(str, str2);
        FragmentActivity requireActivity = r0.requireActivity();
        0lg A0X = DbT.A0X(r0.A0T);
        String A002 = AnonymousClass000.A00(2808);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("igtv_series_id_arg", str);
        A0a.putString("igtv_series_name_arg", str2);
        A0a.putString("igtv_series_user_id_arg", str3);
        A0a.putString("igtv_base_analytics_module_arg", A002);
        LMB lmb = LMB.A01;
        if (lmb == null) {
            lmb = new LMB();
            LMB.A01 = lmb;
        }
        0qQ.A0A(lmb);
        Class<ModalActivity> cls = ModalActivity.class;
        long currentTimeMillis = System.currentTimeMillis();
        long j = lmb.A00;
        if (j == -1 || currentTimeMillis - j > 450) {
            lmb.A00 = currentTimeMillis;
            AnonymousClass6W8 A0b = DbS.A0b(requireActivity, A0a, A0X, cls, "igtv_series");
            if (AnonymousClass2Rc.A00) {
                iArr = LMB.A03;
            } else {
                iArr = LMB.A02;
            }
            A0b.A0J = iArr;
            A0b.A0I = true;
            A0b.A0G = false;
            A0b.A0C(requireActivity);
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
        return false;
    }

    public final void onBottomSheetClosed() {
        this.A00.A00 = null;
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
}
