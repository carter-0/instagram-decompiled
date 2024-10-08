package X;

import java.util.Set;

/* renamed from: X.967  reason: invalid class name */
public final /* synthetic */ class AnonymousClass967 implements C3734795q {
    public static final AnonymousClass967 A00 = new AnonymousClass967();

    public final Object ALH(C3734995s r5) {
        Set A04 = r5.A04(AnonymousClass965.class);
        AnonymousClass96O r2 = AnonymousClass96O.A01;
        if (r2 == null) {
            synchronized (AnonymousClass96O.class) {
                r2 = AnonymousClass96O.A01;
                if (r2 == null) {
                    r2 = new AnonymousClass96O();
                    AnonymousClass96O.A01 = r2;
                }
            }
        }
        return new C3735495z(r2, A04);
    }
}
