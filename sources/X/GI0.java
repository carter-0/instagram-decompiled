package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class GI0 {
    public final Map A00 = new ConcurrentHashMap();
    public final Map A01 = new ConcurrentHashMap();
    public final boolean A02;

    public final JRN A00(C267324bN r4, C52078GDy gDy) {
        JRN jrn = (JRN) this.A01.get(gDy);
        JRN jrn2 = null;
        if (jrn instanceof GI2) {
            if ((!r4.CcK() || !C51968G9o.A1V(r4)) && (!r4.CcK() || !r4.A06().A08())) {
                jrn2 = (GI2) jrn;
            }
        } else if (jrn instanceof C54597HKg) {
            if (r4.CcK() && C51968G9o.A1V(r4)) {
                jrn2 = (C54597HKg) jrn;
            }
        } else if (!(jrn instanceof C52661GaZ)) {
            return null;
        } else {
            if (r4.CcK() && r4.A06().A08()) {
                jrn2 = (C52661GaZ) jrn;
            }
        }
        return jrn2;
    }

    public GI0(boolean z) {
        this.A02 = z;
    }
}
