package X;

import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.76S  reason: invalid class name */
public final class AnonymousClass76S extends C283285Gy implements AnonymousClass76T {
    public Spannable A00;
    public ClickableSpan A01;
    public final GestureDetector.SimpleOnGestureListener A02;
    public final TextView A03;

    public final boolean onContextClick(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            return simpleOnGestureListener.onContextClick(motionEvent);
        }
        return super.onContextClick(motionEvent);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        ClickableSpan clickableSpan = this.A01;
        if (clickableSpan == null) {
            GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
            if (simpleOnGestureListener != null) {
                return simpleOnGestureListener.onDoubleTap(motionEvent);
            }
            return super.onDoubleTap(motionEvent);
        }
        if (clickableSpan instanceof C255753uf) {
            ((C255753uf) clickableSpan).D9t(this.A03);
        } else {
            GestureDetector.SimpleOnGestureListener simpleOnGestureListener2 = this.A02;
            if (simpleOnGestureListener2 != null) {
                simpleOnGestureListener2.onDoubleTap(motionEvent);
            }
        }
        this.A01 = null;
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            return simpleOnGestureListener.onDoubleTapEvent(motionEvent);
        }
        return super.onDoubleTapEvent(motionEvent);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        0qQ.A0B(motionEvent, 0);
        Spannable spannable = this.A00;
        if (!(spannable == null || (clickableSpan = this.A01) == null)) {
            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(this.A01));
        }
        return super.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener == null || motionEvent == null) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        return simpleOnGestureListener.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        super.onLongPress(motionEvent);
        Spannable spannable = this.A00;
        if (spannable != null) {
            Selection.removeSelection(spannable);
        }
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onLongPress(motionEvent);
        }
        this.A01 = null;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener;
        0qQ.A0B(motionEvent2, 1);
        if (motionEvent == null || (simpleOnGestureListener = this.A02) == null) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        return simpleOnGestureListener.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public final void onShowPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onShowPress(motionEvent);
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        ClickableSpan clickableSpan = this.A01;
        if (clickableSpan == null) {
            GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
            if (simpleOnGestureListener != null) {
                return simpleOnGestureListener.onSingleTapConfirmed(motionEvent);
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
        clickableSpan.onClick(this.A03);
        this.A01 = null;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            return simpleOnGestureListener.onSingleTapUp(motionEvent);
        }
        return super.onSingleTapUp(motionEvent);
    }

    public AnonymousClass76S(GestureDetector.SimpleOnGestureListener simpleOnGestureListener, TextView textView) {
        this.A03 = textView;
        this.A02 = simpleOnGestureListener;
    }
}
