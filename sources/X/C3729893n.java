package X;

import java.util.List;

/* renamed from: X.93n  reason: invalid class name and case insensitive filesystem */
public final class C3729893n extends 0Yg implements C62320sa {
    public static final C3729893n A00 = new C3729893n();

    public C3729893n() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Float f;
        float f2;
        AnonymousClass0eM r0 = C3729193f.A07;
        try {
            int i = 0;
            for (C3730393s r02 : (List) C3730093p.A00.getValue()) {
                i += Integer.parseInt(r02.A01);
            }
            f = Float.valueOf(((float) i) / 1000000.0f);
        } catch (Throwable th) {
            f = new 0eQ(th);
        }
        if (f instanceof 0eQ) {
            f = null;
        }
        Number number = f;
        if (number != null) {
            f2 = number.floatValue();
        } else {
            f2 = -1.0f;
        }
        return Float.valueOf(f2);
    }
}
