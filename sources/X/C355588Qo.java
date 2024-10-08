package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.8Qo  reason: invalid class name and case insensitive filesystem */
public final class C355588Qo implements C331097Pn {
    public final /* synthetic */ C355568Qm A00;

    public C355588Qo(C355568Qm r1) {
        this.A00 = r1;
    }

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        int findPointerIndex;
        C355568Qm r3 = this.A00;
        r3.A0E.A00.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r3.A07 = motionEvent.getPointerId(0);
            r3.A02 = motionEvent.getX();
            r3.A03 = motionEvent.getY();
            VelocityTracker velocityTracker = r3.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            r3.A0C = VelocityTracker.obtain();
            if (r3.A0H == null) {
                List list = r3.A0K;
                if (!list.isEmpty()) {
                    View A03 = r3.A03(motionEvent);
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        AJN ajn = (AJN) list.get(size);
                        C249703kE r5 = ajn.A0C;
                        if (r5.itemView == A03) {
                            r3.A02 -= ajn.A01;
                            r3.A03 -= ajn.A02;
                            r3.A09(r5, true);
                            if (r3.A0Q.remove(r5.itemView)) {
                                r3.A0F.clearView(r3.A0I, r5);
                            }
                            r3.A08(r5, ajn.A0A);
                            r3.A05(motionEvent, r3.A08, 0);
                        }
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            r3.A07 = -1;
            r3.A08((C249703kE) null, 0);
        } else {
            int i = r3.A07;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                r3.A04(motionEvent, actionMasked, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = r3.A0C;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (r3.A0H == null) {
            return false;
        }
        return true;
    }

    public final void DeF(boolean z) {
        if (z) {
            this.A00.A08((C249703kE) null, 0);
        }
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
        C355568Qm r3 = this.A00;
        r3.A0E.A00.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = r3.A0C;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (r3.A07 != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(r3.A07);
            if (findPointerIndex >= 0) {
                r3.A04(motionEvent, actionMasked, findPointerIndex);
            }
            C249703kE r1 = r3.A0H;
            if (r1 != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = r3.A0C;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == r3.A07) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                r3.A07 = motionEvent.getPointerId(i);
                                r3.A05(motionEvent, r3.A08, actionIndex);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        r3.A05(motionEvent, r3.A08, findPointerIndex);
                        r3.A06(r1);
                        RecyclerView recyclerView2 = r3.A0I;
                        Runnable runnable = r3.A0P;
                        recyclerView2.removeCallbacks(runnable);
                        runnable.run();
                        r3.A0I.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                r3.A08((C249703kE) null, 0);
                r3.A07 = -1;
            }
        }
    }
}
