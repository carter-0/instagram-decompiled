package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.7nc  reason: invalid class name and case insensitive filesystem */
public final class C341847nc implements View.OnTouchListener {
    public View.OnTouchListener A00;
    public final ScaleGestureDetector A01;
    public final C341867ne A02;
    public final GestureDetector A03;
    public final C340547lR A04;
    public final C341857nd A05;

    public C341847nc(C340547lR r7, boolean z) {
        this.A04 = r7;
        C340467lJ r4 = r7.A0O;
        Context applicationContext = r4.getContext().getApplicationContext();
        C341857nd r1 = new C341857nd(r7);
        this.A05 = r1;
        Handler handler = new Handler(Looper.getMainLooper());
        this.A03 = new GestureDetector(applicationContext, r1, handler);
        C341867ne r0 = new C341867ne(r7.A0N, r4);
        this.A02 = r0;
        r0.A00 = true;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(applicationContext, r0, handler);
        this.A01 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        View view = r4.getView();
        if (z && view != null) {
            view.setOnTouchListener(this);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C340547lR r1 = this.A04;
        if (!r1.A0O.CVc() || !r1.A0N.isConnected()) {
            return false;
        }
        View.OnTouchListener onTouchListener = this.A00;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return this.A03.onTouchEvent(motionEvent) || this.A01.onTouchEvent(motionEvent);
    }
}
