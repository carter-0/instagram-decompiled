package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6cf  reason: invalid class name and case insensitive filesystem */
public final class C311426cf implements AnonymousClass6Z1 {
    public AnonymousClass6ST A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C273434mZ A03;
    public final C273384mU A04;

    public C311426cf(Fragment fragment, UserSession userSession, C273434mZ r4, C273384mU r5) {
        0qQ.A0B(userSession, 2);
        this.A04 = r5;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = r4;
    }

    public final /* synthetic */ void D7Q(C255773uh r1, C250973mM r2, C316026kz r3, C309426Yf r4) {
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

    public final /* synthetic */ void DWT(String str) {
    }

    public final /* synthetic */ void Dfe() {
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

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final void onDestroyView() {
        FragmentActivity activity;
        AnonymousClass6ST r1 = this.A00;
        if (!(r1 == null || (activity = this.A01.getActivity()) == null || activity.isDestroyed())) {
            r1.dismiss();
        }
        this.A00 = null;
    }
}
