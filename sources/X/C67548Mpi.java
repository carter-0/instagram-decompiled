package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Mpi  reason: case insensitive filesystem */
public final class C67548Mpi implements View.OnTouchListener {
    public final GestureDetector A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public C67548Mpi(C319726r6 r4, AnonymousClass50C r5) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        this.A00 = new GestureDetector(r5.A0B.getContext(), new C67675MsB(2, r4, r5));
    }
}
