package X;

import java.util.Iterator;
import java.util.List;

public final class WUR implements C3502283u {
    public final int A00;
    public final List A01;

    public final void DHa(float f, float f2) {
        float f3 = 0.0f;
        if (f > 0.0f) {
            float f4 = (float) this.A00;
            if (f2 > f4) {
                f2 = f4;
            }
            f3 = f2;
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            JTO.A0H(it).setTranslationY(f3);
        }
    }

    public WUR(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }
}
