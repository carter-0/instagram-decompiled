package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.LaD  reason: case insensitive filesystem */
public final class C64338LaD implements C331097Pn {
    public final /* synthetic */ LAJ A00;

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getPointerCount() != 1) {
            return false;
        }
        this.A00.A06.A01();
        return false;
    }

    public final void DeF(boolean z) {
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public C64338LaD(LAJ laj) {
        this.A00 = laj;
    }
}
