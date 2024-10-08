package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4ns  reason: invalid class name and case insensitive filesystem */
public final class C274204ns implements C253873rY {
    public final int A00;
    public final int A01;
    public final C274184nq A02;
    public final C262804Gb A03;
    public final 1Xj A04;
    public final AnonymousClass3W1 A05;
    public final GestureDetector A06;
    public final C253913rc A07;

    public C274204ns(Context context, C274184nq r5, C262804Gb r6, 1Xj r7, AnonymousClass3W1 r8, int i, int i2, boolean z) {
        0qQ.A0B(r5, 2);
        0qQ.A0B(r7, 6);
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r7;
        this.A05 = r8;
        C274214nt r2 = new C274214nt(this);
        GestureDetector gestureDetector = new GestureDetector(context, r2);
        gestureDetector.setIsLongpressEnabled(!z);
        this.A06 = gestureDetector;
        C253913rc r1 = new C253913rc(context);
        r1.A01.add(r2);
        this.A07 = r1;
    }

    public final boolean DF8(MotionEvent motionEvent) {
        ViewParent parent;
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout = this.A03.A0J;
            if (mediaFrameLayout.getParent() != null) {
                mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && (parent = this.A03.A0J.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.A07.A01(motionEvent);
        this.A06.onTouchEvent(motionEvent);
        return true;
    }
}
