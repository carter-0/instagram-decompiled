package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7DV  reason: invalid class name */
public final class AnonymousClass7DV implements AnonymousClass7DW {
    public final AnonymousClass7XX A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ void DRg(MotionEvent motionEvent, Object obj, boolean z) {
        AnonymousClass7FU r5 = (AnonymousClass7FU) obj;
        AnonymousClass7XX r3 = this.A00;
        long micros = TimeUnit.MILLISECONDS.toMicros(r5.BSP());
        r3.Eum(new PointF(motionEvent.getRawX(), motionEvent.getRawY()), r5, r5.BOV(), micros, z, this.A01);
    }

    public AnonymousClass7DV(AnonymousClass7XX r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
