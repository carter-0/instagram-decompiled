package X;

import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6YR  reason: invalid class name */
public final class AnonymousClass6YR implements C317146mn {
    public final Set A00 = new LinkedHashSet();

    public final void DA9(float f) {
        A00(new C377019Kf(f, 1));
    }

    public final void DP2(float f, float f2) {
        A00(new C377029Kg(1, f, f2));
    }

    public final boolean DcE(C255783ui r2, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean Dps(float f, float f2) {
        return A01(new C377029Kg(2, f, f2));
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent, 0);
        0qQ.A0B(motionEvent2, 1);
        return A01(new C58743Iwq(motionEvent, motionEvent2, f, f2));
    }

    public final void Dqb(float f, float f2) {
        A00(new C377029Kg(3, f, f2));
    }

    public final void DvB(boolean z) {
        A00(new C377059Kj(z, 1));
    }

    private final void A00(0sP r3) {
        for (Object invoke : this.A00) {
            r3.invoke(invoke);
        }
    }

    private final boolean A01(0sP r4) {
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Boolean) r4.invoke(next)).booleanValue()) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean Dpu() {
        return A01(J4M.A00);
    }

    public final boolean Dpw() {
        return A01(J4N.A00);
    }
}
