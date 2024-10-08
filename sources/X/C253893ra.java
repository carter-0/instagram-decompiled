package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3ra  reason: invalid class name and case insensitive filesystem */
public final class C253893ra implements C253873rY {
    public final int A00;
    public final 1Xj A01;
    public final C253883rZ A02;
    public final AnonymousClass3W1 A03;
    public final MediaFrameLayout A04;
    public final Context A05;
    public final GestureDetector A06;
    public final C253903rb A07;
    public final C253913rc A08;

    public C253893ra(Context context, 1Xj r5, C253883rZ r6, AnonymousClass3W1 r7, MediaFrameLayout mediaFrameLayout, int i) {
        0qQ.A0B(r7, 4);
        this.A05 = context;
        this.A02 = r6;
        this.A01 = r5;
        this.A03 = r7;
        this.A04 = mediaFrameLayout;
        this.A00 = i;
        C253903rb r2 = new C253903rb(this);
        this.A07 = r2;
        GestureDetector gestureDetector = new GestureDetector(context, r2);
        gestureDetector.setIsLongpressEnabled(false);
        this.A06 = gestureDetector;
        C253913rc r1 = new C253913rc(context);
        r1.A01.add(r2);
        this.A08 = r1;
    }

    public final boolean DF8(MotionEvent motionEvent) {
        ViewParent parent;
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout = this.A04;
            if (mediaFrameLayout.getParent() != null) {
                mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && (parent = this.A04.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.A08.A01(motionEvent);
        this.A06.onTouchEvent(motionEvent);
        return true;
    }
}
