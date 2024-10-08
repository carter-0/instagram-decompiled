package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Tol  reason: case insensitive filesystem */
public final class C14044Tol implements C232732uM {
    public C331117Pq A00;
    public boolean A01;
    public boolean A02;
    public Runnable A03;
    public Runnable A04;
    public boolean A05;
    public final AnonymousClass4M3 A06;
    public final C14344TuR A07;
    public final C14357Tum A08;

    public final void A02() {
        if (A01(this)) {
            ((AnonymousClass4M1) this.A06).A0Y = true;
            return;
        }
        throw DbT.A0m();
    }

    public final void A07(C242423Ua r3) {
        0qQ.A0B(r3, 0);
        if (A01(this)) {
            AnonymousClass4M1.A09(r3, (AnonymousClass4M1) this.A06, 0, false);
            return;
        }
        throw DbT.A0m();
    }

    public final void A08(C242423Ua r6) {
        0qQ.A0B(r6, 0);
        if (A01(this)) {
            AnonymousClass4M1 r4 = (AnonymousClass4M1) this.A06;
            AnonymousClass4X8 r3 = r4.A0P;
            if (r3 != null) {
                View A022 = r3.A02();
                if (A022.getParent() != null) {
                    ViewParent parent = A022.getParent();
                    0qQ.A0C(parent, C273654mx.A00(851));
                    ((C242423Ua) parent).detachViewFromParent(A022);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (r3.A04()) {
                    r6.attachViewToParent(A022, r3.A01, layoutParams);
                    A022.requestLayout();
                } else {
                    r3.A03();
                    r6.addView(A022, r3.A01, layoutParams);
                }
                ViewGroup viewGroup = (ViewGroup) r6;
                if (AnonymousClass4M1.A0L(r4)) {
                    r4.A0t.A01(viewGroup, r4);
                }
            }
            C290415fH r0 = r4.A0v;
            if (r0 != null) {
                C290415fH.A00(r0);
                return;
            }
            return;
        }
        throw DbT.A0m();
    }

    public final void A09(C242423Ua r16, AnonymousClass3WR r17, C263754Nf r18, String str, String str2, float f, int i, int i2, boolean z, boolean z2) {
        AnonymousClass3WR r5 = r17;
        C263754Nf r7 = r18;
        AnonymousClass7TF.A1D(r5, 1, r7);
        String str3 = str2;
        0qQ.A0B(str3, 9);
        if (A01(this)) {
            A0D("unknown", true);
            this.A01 = !z2;
            this.A03 = new C14341TuO(r16, r5, this, r7, str3, str, f, i, i2, z, z2);
            AnonymousClass3OB r1 = ((AnonymousClass4M1) this.A06).A0M;
            0qQ.A07(r1);
            if (r1 == AnonymousClass3OB.IDLE) {
                Runnable runnable = this.A03;
                if (runnable != null) {
                    runnable.run();
                }
                this.A03 = null;
                return;
            }
            return;
        }
        throw DbT.A0m();
    }

    public final void A0A(String str) {
        if (!A01(this)) {
            throw DbT.A0m();
        } else if (!this.A01) {
            this.A01 = true;
            this.A06.E21(str);
        }
    }

    public final void A0B(String str) {
        if (A01(this)) {
            this.A02 = true;
            this.A03 = null;
            this.A04 = null;
            C14344TuR tuR = this.A07;
            tuR.A00 = null;
            tuR.A01 = null;
            tuR.A04.A03(tuR);
            this.A06.ECP(str);
            return;
        }
        throw DbT.A0m();
    }

    public final void A0C(String str, boolean z) {
        if (!A01(this)) {
            throw DbT.A0m();
        } else if (this.A01) {
            this.A01 = false;
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
                this.A04 = null;
                return;
            }
            AnonymousClass4M3 r2 = this.A06;
            AnonymousClass3OB r1 = ((AnonymousClass4M1) r2).A0M;
            0qQ.A07(r1);
            if (r1 != AnonymousClass3OB.PREPARING || this.A05) {
                r2.E2q(str, z);
            }
        }
    }

    public final void onCues(List list) {
        0qQ.A0B(list, 0);
        this.A00.onCues(list);
    }

    public final void onPrepare(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        this.A00.onPrepare(r2);
    }

    public final void onSeeking(long j) {
    }

    public final void onStopVideo(String str, boolean z) {
        0qQ.A0B(str, 0);
        this.A00.onStopVideo(str, z);
    }

    public final void onSurfaceTextureDestroyed() {
    }

    public final void onSurfaceTextureUpdated(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        this.A00.DxV(r2);
    }

    public final void onVideoDownloading(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        this.A00.onVideoDownloading(r2);
    }

    public final void onVideoPlayerError(C263754Nf r2, String str) {
        0qQ.A0B(r2, 0);
        this.A00.onVideoPlayerError(r2, str);
    }

    public final void onVideoPrepared(C263754Nf r3, boolean z) {
        0qQ.A0B(r3, 0);
        C14343TuQ tuQ = new C14343TuQ(this, r3);
        this.A04 = tuQ;
        if (!this.A01) {
            tuQ.run();
            this.A04 = null;
        }
        this.A00.Dxx(r3);
    }

    public final void onVideoStartedPlaying(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        this.A00.onVideoStartedPlaying(r2);
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r2) {
        0qQ.A0B(r2, 0);
    }

    public final void onVideoViewPrepared(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        this.A00.onVideoViewPrepared(r2);
    }

    public static int A00(C14044Tol tol) {
        C263814Nl r0 = ((AnonymousClass4M1) tol.A06).A0O;
        if (r0 == null) {
            return -1;
        }
        return r0.A01;
    }

    public static boolean A01(C14044Tol tol) {
        11Z.A06("This operation must be run on UI thread.");
        return !tol.A02;
    }

    public final boolean A0F() {
        AnonymousClass3OB r2 = ((AnonymousClass4M1) this.A06).A0M;
        0qQ.A07(r2);
        if (r2 == AnonymousClass3OB.PLAYING) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        return AnonymousClass4M1.A1M.contains(((AnonymousClass4M1) this.A06).A0M);
    }

    public final void onCompletion() {
        this.A00.onCompletion();
    }

    public final void onDrawnToSurface() {
    }

    public final void onLoop(int i) {
        this.A00.onLoop(i);
    }

    public final void onProgressStateChanged(boolean z) {
        this.A00.onProgressStateChanged(z);
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A00.onProgressUpdate(i, i2, z);
    }

    public final void onStopped(C263754Nf r2, int i) {
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
            this.A03 = null;
        }
    }

    public C14044Tol(Context context, UserSession userSession, C252323ov r6, C331117Pq r7, String str) {
        C51974G9v.A1L(context, userSession, r7);
        0qQ.A0B(str, 5);
        this.A00 = r7;
        C14357Tum tum = new C14357Tum(this);
        this.A08 = tum;
        11Z.A06("This operation must be run on UI thread.");
        this.A06 = AnonymousClass4M0.A00(context, userSession, r6, this, str);
        this.A07 = new C14344TuR(context, userSession, tum, this);
        this.A05 = 182.A06(0Tu.A05, userSession, 36320141830529078L);
    }

    public final void A03(float f, int i) {
        if (A01(this)) {
            this.A06.Eqr(f, i);
            return;
        }
        throw DbT.A0m();
    }

    public final void A04(int i) {
        boolean z = !A0E();
        C14344TuR tuR = this.A07;
        if (z) {
            tuR.A02(i);
        } else {
            tuR.A01(i);
        }
    }

    public final void A05(int i, boolean z) {
        if (A01(this)) {
            this.A06.EKy(i, z);
            return;
        }
        throw DbT.A0m();
    }

    public final void A06(AnonymousClass4M7 r2) {
        if (A01(this)) {
            this.A06.EjF(r2);
            return;
        }
        throw DbT.A0m();
    }

    public final void A0D(String str, boolean z) {
        if (A01(this)) {
            AnonymousClass4M3 r2 = this.A06;
            AnonymousClass3OB r1 = ((AnonymousClass4M1) r2).A0M;
            0qQ.A07(r1);
            if (r1 != AnonymousClass3OB.IDLE && r1 != AnonymousClass3OB.STOPPING) {
                r2.EyP(str, z);
                return;
            }
            return;
        }
        throw DbT.A0m();
    }

    public final boolean A0E() {
        if (A01(this)) {
            C14344TuR tuR = this.A07;
            return C255613uQ.A00(tuR.A05, (Integer) null, tuR.A02, false);
        }
        throw DbT.A0m();
    }
}
