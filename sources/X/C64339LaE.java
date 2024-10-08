package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;

/* renamed from: X.LaE  reason: case insensitive filesystem */
public final class C64339LaE implements C331097Pn {
    public final /* synthetic */ AnonymousClass030 A00;
    public final /* synthetic */ LPJ A01;

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        AnonymousClass8RF r0;
        0qQ.A0B(motionEvent, 1);
        LPJ lpj = this.A01;
        if (lpj instanceof KMS) {
            r0 = ((KMS) lpj).A0J;
        } else if (lpj instanceof ClipsStackedTimelineViewController) {
            r0 = ((ClipsStackedTimelineViewController) lpj).A0G;
        } else if (lpj instanceof KMU) {
            r0 = ((KMU) lpj).A0G;
        } else {
            r0 = ((KMT) lpj).A0H;
        }
        if (!(r0.A0E() instanceof AnonymousClass8RX) && !lpj.A0M() && lpj.A02 && motionEvent.getPointerCount() == 1) {
            this.A00.A00.onTouchEvent(motionEvent);
        }
        return !lpj.A02;
    }

    public final void DeF(boolean z) {
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public C64339LaE(AnonymousClass030 r1, LPJ lpj) {
        this.A01 = lpj;
        this.A00 = r1;
    }
}
