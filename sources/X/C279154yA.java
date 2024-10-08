package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4yA  reason: invalid class name and case insensitive filesystem */
public final class C279154yA implements C253873rY {
    public final int A00;
    public final int A01;
    public final C279134y8 A02;
    public final C279064y1 A03;
    public final 1Xj A04;
    public final AnonymousClass3W1 A05;
    public final GestureDetector A06;
    public final C279164yB A07;
    public final C253913rc A08;

    public C279154yA(Context context, C279134y8 r5, C279064y1 r6, 1Xj r7, AnonymousClass3W1 r8, int i, int i2, boolean z) {
        0qQ.A0B(r5, 2);
        0qQ.A0B(r7, 6);
        0qQ.A0B(r8, 7);
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r7;
        this.A05 = r8;
        C279164yB r2 = new C279164yB(this);
        this.A07 = r2;
        GestureDetector gestureDetector = new GestureDetector(context, r2);
        gestureDetector.setIsLongpressEnabled(!z);
        this.A06 = gestureDetector;
        C253913rc r1 = new C253913rc(context);
        r1.A01.add(r2);
        this.A08 = r1;
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
        this.A08.A01(motionEvent);
        this.A06.onTouchEvent(motionEvent);
        return true;
    }
}
