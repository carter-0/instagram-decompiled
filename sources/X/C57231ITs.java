package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.ITs  reason: case insensitive filesystem */
public final class C57231ITs implements C253873rY {
    public final int A00;
    public final JSu A01;
    public final C254173s3 A02;
    public final 1Xj A03;
    public final AnonymousClass3W1 A04;
    public final GestureDetector A05;
    public final HFo A06;
    public final C253913rc A07;

    public C57231ITs(Context context, JSu jSu, C254173s3 r6, 1Xj r7, AnonymousClass3W1 r8, int i) {
        0qQ.A0B(jSu, 2);
        AnonymousClass7TG.A1S(r7, r8);
        this.A01 = jSu;
        this.A02 = r6;
        this.A00 = i;
        this.A03 = r7;
        this.A04 = r8;
        HFo hFo = new HFo(this);
        this.A06 = hFo;
        GestureDetector gestureDetector = new GestureDetector(context, hFo);
        gestureDetector.setIsLongpressEnabled(false);
        this.A05 = gestureDetector;
        C253913rc r1 = new C253913rc(context);
        r1.A01.add(hFo);
        this.A07 = r1;
    }

    public final boolean DF8(MotionEvent motionEvent) {
        ViewParent parent;
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout = this.A02.A09;
            if (mediaFrameLayout.getParent() != null) {
                mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && (parent = this.A02.A09.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.A07.A01(motionEvent);
        this.A05.onTouchEvent(motionEvent);
        return true;
    }
}
