package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;

/* renamed from: X.6hT  reason: invalid class name and case insensitive filesystem */
public final class C313986hT implements AnonymousClass6Z1 {
    public C270194gL A00;
    public C305736Ji A01;
    public boolean A02;
    public boolean A03;
    public long A04;
    public long A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final C313556gd A07;
    public final Runnable A08 = new C313996hU(this);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (X.0qQ.A0K(r5.A01, r8) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7Q(X.C255773uh r6, X.C250973mM r7, X.C316026kz r8, X.C309426Yf r9) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r8, r4)
            r3 = 1
            X.0qQ.A0B(r6, r3)
            X.4gL r2 = r6.A0c
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0044
            X.4gL r1 = r5.A00
            r0 = 0
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r1.A0X
            r1.getClass()
        L_0x0018:
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = r2.A0X
            r0.getClass()
        L_0x001f:
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 == 0) goto L_0x0044
            X.6Ji r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x0044
        L_0x002d:
            X.3mL r1 = r6.A0e
            X.3mL r0 = X.C250963mL.BROADCAST_ARCHIVE
            if (r1 != r0) goto L_0x0041
            if (r2 == 0) goto L_0x0041
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0041
            r5.A02 = r3
            X.6Ji r8 = (X.C305736Ji) r8
            r5.A01 = r8
            r5.A00 = r2
        L_0x0041:
            return
        L_0x0042:
            r1 = r0
            goto L_0x0018
        L_0x0044:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x002d
            r5.A02 = r4
            r5.A03 = r4
            r1 = 0
            r5.A01 = r1
            r5.A00 = r1
            android.os.Handler r0 = r5.A06
            r0.removeCallbacksAndMessages(r1)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313986hT.D7Q(X.3uh, X.3mM, X.6kz, X.6Yf):void");
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

    public final boolean Dpr() {
        return false;
    }

    public final boolean Dqd() {
        return false;
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final void DyN(C255773uh r4, C316036l0 r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        if (!this.A02) {
            return;
        }
        if (!0qQ.A0K(r4.A0c, this.A00)) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!r5.equals(this.A01)) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!this.A03) {
            this.A03 = true;
        }
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final int BrB() {
        C305736Ji r0;
        if (!this.A02 || (r0 = this.A01) == null) {
            return 0;
        }
        Object value = r0.A0E.getValue();
        0qQ.A07(value);
        return (int) (((float) ((View) value).getWidth()) * 0.5f);
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void DiL(int i) {
        if (this.A02 && this.A03) {
            C305736Ji r4 = this.A01;
            if (r4 != null) {
                Object value = r4.A0C.getValue();
                0qQ.A07(value);
                ((TextView) value).setText(1G0.A02((long) i));
                Object value2 = r4.A0C.getValue();
                0qQ.A07(value2);
                C294975nL.A04((C295005nO) null, new View[]{(View) value2}, false);
            }
            Handler handler = this.A06;
            Runnable runnable = this.A08;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 2000);
        }
    }

    public final void DiM(int i, int i2) {
        C305736Ji r4;
        if (this.A02 && this.A03 && (r4 = this.A01) != null) {
            r4.A02((long) i, (long) i2);
        }
    }

    public final void DiO(int i, int i2) {
        if (this.A02 && this.A03) {
            C305736Ji r4 = this.A01;
            if (r4 != null) {
                r4.A02((long) i, (long) i2);
            }
            C305736Ji r2 = this.A01;
            if (r2 != null) {
                ((View) r2.A0F.getValue()).performHapticFeedback(0);
                Object value = r2.A0E.getValue();
                0qQ.A07(value);
                ProgressAnchorContainer.A00((ProgressAnchorContainer) value, false);
            }
        }
    }

    public final void DiP() {
        C305736Ji r0;
        if (this.A02 && this.A03 && (r0 = this.A01) != null) {
            Object value = r0.A0E.getValue();
            0qQ.A07(value);
            ProgressAnchorContainer.A00((ProgressAnchorContainer) value, true);
        }
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final void DxU() {
        if (this.A02 && this.A03) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A04 >= 1000) {
                long AXh = this.A07.AXh();
                if (this.A05 != AXh) {
                    this.A05 = AXh;
                }
                this.A04 = elapsedRealtime;
                C305736Ji r0 = this.A01;
                if (r0 != null) {
                    Object value = r0.A0C.getValue();
                    0qQ.A07(value);
                    ((TextView) value).setText(1G0.A02(AXh));
                }
            }
            C305736Ji r02 = this.A01;
            if (r02 != null) {
                Object value2 = r02.A07.getValue();
                0qQ.A07(value2);
                View view = (View) value2;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    public final void onDestroyView() {
        if (this.A02) {
            this.A02 = false;
            this.A03 = false;
            this.A01 = null;
            this.A00 = null;
            this.A06.removeCallbacksAndMessages((Object) null);
        }
    }

    public C313986hT(C313556gd r3) {
        this.A07 = r3;
    }
}
