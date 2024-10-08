package X;

import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6j1  reason: invalid class name and case insensitive filesystem */
public final class C314896j1 implements AnonymousClass6Z1, C314016hW {
    public C255773uh A00;
    public final C313426gQ A01;
    public final UserSession A02;
    public final AnonymousClass3BQ A03;

    public C314896j1(UserSession userSession, AnonymousClass3BQ r3, C313426gQ r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        this.A01 = r4;
        this.A02 = userSession;
        this.A03 = r3;
    }

    public final boolean Cn1(C255773uh r7, C250973mM r8, C309426Yf r9, float f) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r9, 2);
        if (!C297785sK.A0M(this.A02, r7, r8, this.A03, r9)) {
            C313426gQ r1 = this.A01;
            if (r9.A0H != 0) {
                float f2 = r9.A0A;
                int currentPositionMs = r1.getCurrentPositionMs();
                int i = ((C313416gP) r1).A03;
                Float valueOf = Float.valueOf(((float) ((currentPositionMs % i) + (r9.A0E * i))) / f2);
                if (valueOf != null) {
                    r9.A02(valueOf.floatValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void D7Q(C255773uh r2, C250973mM r3, C316026kz r4, C309426Yf r5) {
        int i;
        C257943yD Btx;
        Integer BOf;
        0qQ.A0B(r2, 1);
        0qQ.A0B(r5, 2);
        1Xj r0 = r2.A0b;
        if (r0 == null || (Btx = r0.A0C.Btx()) == null || (BOf = Btx.BOf()) == null) {
            i = 0;
        } else {
            i = BOf.intValue();
        }
        r5.A0H = i;
        if (i > 0 && 0qQ.A0K(this.A00, r2)) {
            r5.A0E = ((C313416gP) this.A01).A08;
        }
        if (!0qQ.A0K(this.A00, r2)) {
            this.A00 = r2;
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

    public final /* synthetic */ void DWT(String str) {
    }

    public final void DaV(C255773uh r1, C250973mM r2, C309426Yf r3, float f) {
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
