package X;

import androidx.compose.foundation.lazy.layout.DefaultLazyKey;

/* renamed from: X.69H  reason: invalid class name */
public abstract class AnonymousClass69H {
    public C305606Is A00() {
        return ((C304996Ga) this).A01;
    }

    public final Object A01(int i) {
        AnonymousClass6It AX1 = A00().AX1(i);
        return ((AnonymousClass6Iv) AX1.A02).CAi().invoke(Integer.valueOf(i - AX1.A01));
    }

    public final Object A02(int i) {
        Object invoke;
        AnonymousClass6It AX1 = A00().AX1(i);
        int i2 = i - AX1.A01;
        0sP BK5 = ((AnonymousClass6Iv) AX1.A02).BK5();
        if (BK5 == null || (invoke = BK5.invoke(Integer.valueOf(i2))) == null) {
            return new DefaultLazyKey(i);
        }
        return invoke;
    }
}
