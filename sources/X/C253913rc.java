package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3rc  reason: invalid class name and case insensitive filesystem */
public class C253913rc implements ScaleGestureDetector.OnScaleGestureListener {
    public final ScaleGestureDetector A00;
    public final Set A01 = new HashSet();

    public C253913rc(Context context) {
        0qQ.A0B(context, 1);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A00 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    public boolean A01(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A00.onTouchEvent(motionEvent);
    }

    public float A00() {
        return this.A00.getScaleFactor();
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Iterator it = this.A01.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (((C234382xm) it.next()).Dgn(this) || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        Iterator it = this.A01.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (((C234382xm) it.next()).Dgo(this) || z) {
                    z = true;
                }
            }
        }
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        for (C234382xm Dgt : this.A01) {
            Dgt.Dgt(this);
        }
    }
}
