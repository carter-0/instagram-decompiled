package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9YR  reason: invalid class name */
public final class AnonymousClass9YR extends C249403jg implements C331097Pn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        float y;
        0qQ.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.A04);
                if (findPointerIndex >= 0 && this.A05 != 1) {
                    int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    this.A00 = x - this.A02;
                    this.A01 = y2 - this.A03;
                    return false;
                }
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.A04 = motionEvent.getPointerId(actionIndex);
                this.A02 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                y = motionEvent.getY(actionIndex);
            }
            return false;
        }
        this.A04 = motionEvent.getPointerId(0);
        this.A02 = (int) (motionEvent.getX() + 0.5f);
        y = motionEvent.getY();
        this.A03 = (int) (y + 0.5f);
        return false;
    }

    public final void DeF(boolean z) {
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C252553pI r1;
        boolean A1X;
        boolean A1Y;
        int A0D = AnonymousClass7TG.A0D(recyclerView, 755970129);
        int i2 = this.A05;
        this.A05 = i;
        if (i2 == 0 && i == 1 && (r1 = recyclerView.A0D) != null && (A1X = r1.A1X()) != (A1Y = r1.A1Y()) && ((A1X && Math.abs(this.A01) > Math.abs(this.A00)) || (A1Y && Math.abs(this.A00) > Math.abs(this.A01)))) {
            recyclerView.A0l();
        }
        AnonymousClass0fD.A0A(2028388739, A0D);
    }
}
