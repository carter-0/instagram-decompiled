package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

public abstract class LPJ {
    public int A00;
    public 0eP A01;
    public boolean A02 = true;
    public float A03;

    public final void A0C() {
        int[] iArr = {0, 0};
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.getLocationOnScreen(iArr);
        }
        MotionEvent obtain = MotionEvent.obtain(0, 0, 3, (float) iArr[0], (float) iArr[1], 0);
        RecyclerView A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.dispatchTouchEvent(obtain);
        }
    }

    public final void A0E() {
        C252553pI r0;
        this.A00 = 0;
        RecyclerView A0A = A0A();
        if (A0A != null && (r0 = A0A.A0D) != null) {
            r0.A1O(0);
        }
    }

    public final int A08() {
        if (this instanceof KMT) {
            KMT kmt = (KMT) this;
            if (kmt.A0K) {
                return kmt.A01;
            }
            return DbS.A05(kmt.A0J.A01.A09.getValue()) + kmt.A01;
        } else if (this instanceof KMU) {
            return ((KMU) this).A05;
        } else {
            return -1;
        }
    }

    public final int A09(int i) {
        int max;
        0eP r0 = this.A01;
        if (r0 == null) {
            return i;
        }
        int i2 = this.A00 + i;
        if (i >= 0) {
            max = Math.min(i2, C51969G9p.A0A(r0));
        } else {
            max = Math.max(i2, C51970G9q.A0B(r0));
        }
        return max - this.A00;
    }

    public final RecyclerView A0A() {
        if (this instanceof KMT) {
            return ((KMT) this).A09;
        }
        if (this instanceof KMS) {
            return ((KMS) this).A0A;
        }
        if (this instanceof KMU) {
            return ((KMU) this).A08;
        }
        return ((ClipsStackedTimelineViewController) this).A0O();
    }

    public final C62517Kh8 A0B() {
        if (this instanceof KMT) {
            return ((KMT) this).A0E;
        }
        if (this instanceof ClipsStackedTimelineViewController) {
            return ((ClipsStackedTimelineViewController) this).A0D;
        }
        if (this instanceof KMS) {
            return ((KMS) this).A0G;
        }
        return ((KMU) this).A0C;
    }

    public final void A0G(float f) {
        float f2 = f + this.A03;
        int i = (int) f2;
        this.A03 = f2 - ((float) i);
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.scrollBy(i, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r2 == -1) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(int r11) {
        /*
            r10 = this;
            java.lang.String r6 = "trackType=%s, try to scroll by=%d, recyclerViewItemCount=%d"
            java.lang.String r4 = "AbstractStackedTimelineView"
            r5 = 3
            r1 = 0
            r3 = 0
            androidx.recyclerview.widget.RecyclerView r0 = r10.A0A()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r0 == 0) goto L_0x0010
            r0.scrollBy(r11, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
        L_0x0010:
            r2 = r10
            boolean r0 = r10 instanceof X.KMT     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r0 == 0) goto L_0x006a
            X.KMT r2 = (X.KMT) r2     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.Jfo r0 = r2.A0I     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.861 r0 = r0.A0K     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.2Fj r0 = r0.A0A     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            java.lang.Object r1 = r0.A02()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.8YU r0 = X.AnonymousClass8YU.PLAYING     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r1 != r0) goto L_0x00c7
            boolean r0 = r2.A0K     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r0 != 0) goto L_0x00c7
            X.8RF r9 = r2.A0H     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.8RH r1 = r9.A0E()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            boolean r0 = r1 instanceof X.C355858Rq     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r0 != 0) goto L_0x0037
            boolean r0 = r1 instanceof X.C355768Rh     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r0 == 0) goto L_0x00c7
        L_0x0037:
            X.KMu r8 = r2.A0J     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.LTY r7 = r8.A01     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r1 = X.JTR.A0E(r7)     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r0 = r2.A01     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r1 != r0) goto L_0x00c7
            int r0 = X.JTS.A03(r7)     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r0 = r0 * 2
            int r7 = r0 + 2
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1 r0 = r2.A0D     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r2 = r0.A1a()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r0 = r0.A1b()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            r1 = -1
            if (r2 == r1) goto L_0x00c7
            if (r0 == r1) goto L_0x00c7
            if (r7 < r2) goto L_0x005e
            if (r7 <= r0) goto L_0x00c7
        L_0x005e:
            X.8Rs r0 = new X.8Rs     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            r0.<init>(r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            r9.A0G(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            r8.A0S()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            return
        L_0x006a:
            boolean r0 = r10 instanceof X.KMS     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r0 == 0) goto L_0x00c7
            X.KMS r2 = (X.KMS) r2     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.8RF r9 = r2.A0J     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            X.8RH r1 = r9.A0E()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            boolean r0 = r1 instanceof X.C355868Rr     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            if (r0 == 0) goto L_0x00c7
            X.8Rr r1 = (X.C355868Rr) r1     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r0 = r1.A00     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r0 = r0 * 2
            int r8 = r0 + 2
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 r0 = r2.A0E     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r7 = r0.A1a()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            int r2 = r0.A1b()     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            r1 = -1
            if (r7 == r1) goto L_0x0092
            r0 = 1
            if (r2 != r1) goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            if (r8 < r7) goto L_0x0097
            if (r8 <= r2) goto L_0x00c7
        L_0x0097:
            if (r0 == 0) goto L_0x00c7
            X.8Rs r0 = new X.8Rs     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            r0.<init>(r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            r9.A0G(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00ca, IllegalArgumentException -> 0x00a2 }
            return
        L_0x00a2:
            X.Kh8 r2 = r10.A0B()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A0A()
            if (r0 == 0) goto L_0x00c8
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x00c8
            int r0 = r0.getItemCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00bc:
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = X.JTR.A14(r6, r0, r5)
            X.0kD.A07(r4, r0, r3)
        L_0x00c7:
            return
        L_0x00c8:
            r0 = r3
            goto L_0x00bc
        L_0x00ca:
            X.Kh8 r2 = r10.A0B()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A0A()
            if (r0 == 0) goto L_0x00f0
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x00f0
            int r0 = r0.getItemCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00e4:
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = X.JTR.A14(r6, r0, r5)
            X.0kD.A07(r4, r0, r3)
            return
        L_0x00f0:
            r0 = r3
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPJ.A0I(int):void");
    }

    public final void A0J(int i) {
        C252553pI r0;
        this.A00 = i;
        RecyclerView A0A = A0A();
        if (A0A != null && (r0 = A0A.A0D) != null) {
            r0.A1O(i);
        }
    }

    public final boolean A0M() {
        AnonymousClass8RF r0;
        if (this instanceof KMS) {
            r0 = ((KMS) this).A0J;
        } else if (this instanceof ClipsStackedTimelineViewController) {
            r0 = ((ClipsStackedTimelineViewController) this).A0G;
        } else if (this instanceof KMU) {
            r0 = ((KMU) this).A0G;
        } else {
            r0 = ((KMT) this).A0H;
        }
        return r0.A0E() instanceof AnonymousClass8RU;
    }

    public static void A07(ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, boolean z) {
        clipsStackedTimelineViewController.A0V(ClipsCreationViewModel.A00(clipsCreationViewModel).A00, z);
    }

    public final void A0D() {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.performHapticFeedback(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r2.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r2 = r3.A0A()
            if (r2 == 0) goto L_0x0016
            android.content.Context r1 = r2.getContext()
            r0 = 2130971218(0x7f040a52, float:1.7551168E38)
            int r0 = X.2Yu.A0H(r1, r0)
            if (r0 == 0) goto L_0x0016
            X.DbU.A11(r1, r2, r0)
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPJ.A0F():void");
    }

    public final void A0H(int i) {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.A1F(i, 0);
        }
    }

    public final void A0K(Context context, C60108Jfo jfo, C62320sa r6) {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.A15(new C53096GiU(3, jfo, r6, this));
        }
        AnonymousClass030 r2 = new AnonymousClass030(context, new KMP(this, jfo));
        RecyclerView A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.A13(new C64339LaE(r2, this));
        }
    }

    public final void A0L(boolean z) {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.setNestedScrollingEnabled(z);
        }
    }
}
