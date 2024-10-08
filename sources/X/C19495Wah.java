package X;

import android.content.Intent;
import android.view.View;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Wah  reason: case insensitive filesystem */
public final class C19495Wah implements AnonymousClass6Z1 {
    public View A00;

    public final void D7Q(C255773uh r4, C250973mM r5, C316026kz r6, C309426Yf r7) {
        View view;
        0qQ.A0B(r6, 0);
        RoundedCornerFrameLayout BQU = r6.BQU();
        if (BQU != null) {
            view = BQU.findViewById(R.id.zero_video_placeholder);
        } else {
            view = null;
        }
        this.A00 = view;
        if (view != null) {
            view.clearAnimation();
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void DWT(String str) {
        View view = this.A00;
        if (view != null) {
            view.animate().setDuration(400).setStartDelay(300).alpha(0.0f).withEndAction(new C20109Wl7(view));
        }
    }

    public final void Dfe() {
        View view = this.A00;
        if (view != null) {
            view.animate().setStartDelay(0).setDuration(400).alpha(1.0f).withStartAction(new C20110Wl8(view));
        }
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }
}
