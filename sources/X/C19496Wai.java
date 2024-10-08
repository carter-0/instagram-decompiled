package X;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Wai  reason: case insensitive filesystem */
public final class C19496Wai implements C317146mn {
    public final /* synthetic */ C17275VPc A00;
    public final /* synthetic */ boolean A01;

    public final boolean DcE(C255783ui r2, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C19496Wai(C17275VPc vPc, boolean z) {
        this.A01 = z;
        this.A00 = vPc;
    }

    public final void DA9(float f) {
    }

    public final boolean Dpu() {
        return false;
    }

    public final boolean Dpw() {
        return false;
    }

    public final void DvB(boolean z) {
    }

    public final void DP2(float f, float f2) {
    }

    public final boolean Dps(float f, float f2) {
        return false;
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass7TG.A1N(motionEvent, motionEvent2);
        if (this.A01) {
            C17275VPc vPc = this.A00;
            C16487Uvi[] values = C16487Uvi.values();
            ArrayList arrayList = new ArrayList();
            for (C16487Uvi A1R : values) {
                C13989Tnp.A1R(A1R, arrayList, vPc.A00);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AnonymousClass7TE.A1a(((0sJ) next).invoke(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)))) {
                    if (next == null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void Dqb(float f, float f2) {
    }
}
