package X;

import java.util.Map;

/* renamed from: X.RwS  reason: case insensitive filesystem */
public final class C10688RwS {
    public float A00;
    public final int A01;
    public final C7339Q4p A02;
    public final Map A03 = AnonymousClass7TE.A1E();

    public C10688RwS(C7339Q4p q4p, int i, int i2) {
        0qQ.A0B(q4p, 3);
        this.A02 = q4p;
        this.A01 = i2 < 1 ? 1 : i2;
        float f = ((float) i) / ((float) i2);
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 0.99f) {
            f = 0.99f;
        }
        this.A00 = f;
    }
}
