package X;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.76R  reason: invalid class name */
public final class AnonymousClass76R extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public XAL A00;
    public final View A01;
    public final boolean A02;
    public final GestureDetector A03;
    public final AnonymousClass76S A04;

    public AnonymousClass76R(GestureDetector.SimpleOnGestureListener simpleOnGestureListener, View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        this.A01 = view;
        this.A02 = z;
        GestureDetector gestureDetector = new GestureDetector(textView.getContext(), this, new Handler(Looper.getMainLooper()));
        this.A03 = gestureDetector;
        AnonymousClass76S r1 = new AnonymousClass76S(simpleOnGestureListener, textView);
        this.A04 = r1;
        gestureDetector.setOnDoubleTapListener(this);
        textView.setMovementMethod(new AnonymousClass76U(gestureDetector, r1));
        textView.setHighlightColor(0);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A04.onDoubleTap(motionEvent);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A02) {
            XAL xal = this.A00;
            if (xal == null) {
                xal = new WVJ(this.A01, (C328287Ef) null);
            }
            this.A00 = xal;
            xal.Exa();
        }
        this.A04.onLongPress(motionEvent);
    }

    public final void onShowPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A04.onShowPress(motionEvent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A04.onSingleTapConfirmed(motionEvent);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A04.onSingleTapUp(motionEvent);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C328287Ef r1;
        0qQ.A0B(motionEvent, 1);
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && this.A02) {
                XAL xal = this.A00;
                if (xal == null) {
                    xal = new WVJ(this.A01, (C328287Ef) null);
                }
                this.A00 = xal;
                xal.Exa();
            }
        } else if (this.A02) {
            XAL xal2 = this.A00;
            if (xal2 == null) {
                View view2 = this.A01;
                View view3 = view2;
                while (!(view3 instanceof RecyclerView)) {
                    ViewParent parent = view3.getParent();
                    0qQ.A0C(parent, "null cannot be cast to non-null type android.view.View");
                    view3 = (View) parent;
                }
                C249703kE A0Y = ((RecyclerView) view3).A0Y(view2);
                if (A0Y != null) {
                    if (A0Y instanceof C328287Ef) {
                        r1 = (C328287Ef) A0Y;
                    } else {
                        r1 = null;
                    }
                    xal2 = new WVJ(view2, r1);
                } else {
                    throw new IllegalStateException("This container can only be used in a RecyclerView.ViewHolder");
                }
            }
            this.A00 = xal2;
            xal2.EKR(motionEvent);
        }
        return this.A03.onTouchEvent(motionEvent);
    }
}
