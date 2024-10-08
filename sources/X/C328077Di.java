package X;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7Di  reason: invalid class name and case insensitive filesystem */
public abstract class C328077Di extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C328087Dj {
    public Object A00;
    public XAL A01;
    public final AnonymousClass7XA A02;
    public final boolean A03;
    public final GestureDetector A04;
    public final View A05;
    public final C328107Dl A06;
    public final boolean A07;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.XAL A00() {
        /*
            r4 = this;
            X.XAL r0 = r4.A01
            if (r0 != 0) goto L_0x001f
            android.view.View r3 = r4.A05
            r0 = r3
        L_0x0007:
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            r2 = 0
            if (r1 != 0) goto L_0x0026
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0007
        L_0x0014:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0020
            X.WVJ r0 = new X.WVJ
            r0.<init>(r3, r2)
        L_0x001d:
            r4.A01 = r0
        L_0x001f:
            return r0
        L_0x0020:
            X.WVI r0 = new X.WVI
            r0.<init>(r3)
            goto L_0x001d
        L_0x0026:
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3kE r1 = r0.A0Y(r3)
            java.lang.String r0 = "This container can only be used in a RecyclerView.ViewHolder"
            X.17k.A07(r1, r0)
            boolean r0 = r1 instanceof X.C328287Ef
            if (r0 == 0) goto L_0x0014
            r2 = r1
            X.7Ef r2 = (X.C328287Ef) r2
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328077Di.A00():X.XAL");
    }

    public boolean A01() {
        AnonymousClass7FU r0 = (AnonymousClass7FU) this.A00;
        if (r0 != null) {
            return r0.CXM();
        }
        return false;
    }

    public final boolean A02(MotionEvent motionEvent, boolean z) {
        if (((C333107Xr) this.A02).CPk()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.A05.setPressed(false);
                if (z && this.A03) {
                    A00().Exa();
                }
            }
        } else if (z && this.A03) {
            A00().EKR(motionEvent);
        }
        Object obj = this.A00;
        if (obj != null) {
            this.A06.DsN(motionEvent, obj);
        }
        return this.A04.onTouchEvent(motionEvent);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A00 == null || ((C333107Xr) this.A02).CPk() || !A01() || !this.A06.DA7(this.A00)) {
            return false;
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        if (this.A00 != null && !((C333107Xr) this.A02).CPk()) {
            if (this.A03) {
                A00().Exa();
            }
            this.A05.performHapticFeedback(0);
            this.A06.DRg(motionEvent, this.A00, A01());
        }
    }

    public final void onShowPress(MotionEvent motionEvent) {
        this.A05.setPressed(true);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A00 != null) {
            AnonymousClass7XA r1 = this.A02;
            if (((C333107Xr) r1).CPk() || !A01() || !r1.isResumed() || !this.A06.DRb(motionEvent, this.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.A00 == null || ((C333107Xr) this.A02).CPk() || A01() || !this.A06.DRb(motionEvent, this.A00)) {
            return false;
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (this instanceof C328067Dh) {
            0qQ.A0B(view, 0);
            0qQ.A0B(motionEvent, 1);
            AnonymousClass7FU r0 = (AnonymousClass7FU) this.A00;
            z = true;
            if (r0 == null || !r0.ARU()) {
                z = false;
            }
        } else {
            z = true;
        }
        return A02(motionEvent, z);
    }

    public C328077Di(View view, AnonymousClass7XA r5, C328107Dl r6, boolean z, boolean z2) {
        this.A05 = view;
        this.A06 = r6;
        this.A02 = r5;
        this.A04 = new GestureDetector(view.getContext(), this, new Handler(Looper.getMainLooper()));
        this.A07 = z2;
        this.A03 = z;
    }
}
