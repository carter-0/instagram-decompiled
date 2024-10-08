package X;

import android.view.MotionEvent;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Wdz  reason: case insensitive filesystem */
public final class C19697Wdz implements C317956o7 {
    public final List A00;

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        List<C317956o7> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C317956o7 DL9 : list) {
                if (DL9.DL9(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean DsV(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        List<C317956o7> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C317956o7 DsV : list) {
                if (DsV.DsV(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void EHq(float f, float f2) {
        for (C317956o7 EHq : this.A00) {
            EHq.EHq(f, f2);
        }
    }

    public final void destroy() {
        for (C317956o7 destroy : this.A00) {
            destroy.destroy();
        }
    }

    public C19697Wdz(List list) {
        this.A00 = list;
    }
}
