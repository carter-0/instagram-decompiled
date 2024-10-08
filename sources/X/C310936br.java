package X;

import android.view.View;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Map;

/* renamed from: X.6br  reason: invalid class name and case insensitive filesystem */
public final class C310936br implements C250603lj {
    public float A00;
    public final Map A01;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        View view = (View) this.A01.get(r7.A03);
        if (view instanceof C267934cU) {
            float CFe = r8.CFe(r7);
            float f = this.A00;
            boolean z = false;
            if (f == 0.0f) {
                z = true;
            }
            if ((z || f == 1.0f) && 0.0f < CFe && CFe < 1.0f) {
                ((C267934cU) view).DzB();
            } else if (f < 1.0f && CFe == 1.0f) {
                ((C267934cU) view).Dyz();
            } else if (f > 0.0f && CFe == 0.0f) {
                ((C267934cU) view).Dz8();
            }
            this.A00 = CFe;
        }
    }

    public C310936br() {
        17j r1 = new 17j();
        r1.A04(MapMakerInternalMap.Strength.A01);
        r1.A01();
        this.A01 = r1.A00();
    }
}
