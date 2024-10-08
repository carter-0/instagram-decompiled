package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.88O  reason: invalid class name */
public final class AnonymousClass88O implements AnonymousClass88P {
    public float A00;
    public float A01 = 1.0f;
    public float A02;
    public float A03;
    public final List A04 = new ArrayList();

    private final void A00() {
        for (AnonymousClass88P Dti : this.A04) {
            Dti.Dti(this.A01, this.A00, this.A02, this.A03);
        }
    }

    public final void A01(AnonymousClass88P r3) {
        List list = this.A04;
        if (!list.contains(r3)) {
            list.add(r3);
            A00();
        }
    }

    public final void Dti(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = f3;
        this.A03 = f4;
        A00();
    }
}
