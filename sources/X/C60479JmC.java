package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JmC  reason: case insensitive filesystem */
public final class C60479JmC extends C64337LaC {
    public float A00;
    public float A01;
    public final /* synthetic */ KUN A02;

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A1U = AnonymousClass7TF.A1U(0, recyclerView, motionEvent);
        if (motionEvent.getAction() == 0) {
            JTP.A15(recyclerView, A1U);
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 2) {
            if (AnonymousClass7TE.A00(motionEvent.getRawY(), this.A01) > AnonymousClass7TE.A00(motionEvent.getRawX(), this.A00)) {
                JTP.A15(recyclerView, false);
                return false;
            }
        }
        return false;
    }

    public C60479JmC(KUN kun) {
        this.A02 = kun;
    }
}
