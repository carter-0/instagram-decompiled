package X;

/* renamed from: X.9Be  reason: invalid class name and case insensitive filesystem */
public final class C374879Be implements AnonymousClass9Bd {
    public static final C374879Be A00 = new Object();

    public final boolean Ccs(Class cls) {
        return AnonymousClass972.class.isAssignableFrom(cls);
    }

    public final AnonymousClass9C1 CoG(Class cls) {
        IllegalStateException illegalStateException;
        Class<AnonymousClass972> cls2 = AnonymousClass972.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                AnonymousClass972 r2 = (AnonymousClass972) AnonymousClass972.defaultInstanceMap.get(asSubclass);
                if (r2 == null) {
                    try {
                        Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                        r2 = (AnonymousClass972) AnonymousClass972.defaultInstanceMap.get(asSubclass);
                        if (r2 == null) {
                            r2 = (AnonymousClass972) ((AnonymousClass972) AnonymousClass9CA.A01(asSubclass)).A0E(AnonymousClass05K.A0j, (Object) null, (Object) null);
                            if (r2 != null) {
                                AnonymousClass972.defaultInstanceMap.put(asSubclass, r2);
                            } else {
                                illegalStateException = new IllegalStateException();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException(Pxd.A00(139), e);
                    }
                }
                return (AnonymousClass9C1) r2.A0E(AnonymousClass05K.A0C, (Object) null, (Object) null);
            } catch (Exception e2) {
                throw new RuntimeException(002.A0R(Pxd.A00(177), cls.getName()), e2);
            }
        } else {
            throw new IllegalArgumentException(002.A0R(Pxd.A00(73), cls.getName()));
        }
    }
}
