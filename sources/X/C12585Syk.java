package X;

/* renamed from: X.Syk  reason: case insensitive filesystem */
public final class C12585Syk implements C13743TgF {
    public static final C12585Syk A00 = new C12585Syk();

    public static C12585Syk A00() {
        return A00;
    }

    public final C13786Th1 FPE(Class cls) {
        Class<C8563Qx1> cls2 = C8563Qx1.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C13786Th1) C8563Qx1.A03(cls.asSubclass(cls2)).A0N(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw Pxe.A0u("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw AnonymousClass7TE.A0w("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean FPQ(Class cls) {
        return C8563Qx1.class.isAssignableFrom(cls);
    }
}
