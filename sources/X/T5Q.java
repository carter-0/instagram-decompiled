package X;

public final class T5Q implements C13748TgK {
    public static final T5Q A00 = new Object();

    public final boolean Ccs(Class cls) {
        return R5n.class.isAssignableFrom(cls);
    }

    public final C10705Rwj CoI(Class cls) {
        IllegalStateException illegalStateException;
        Class<R5n> cls2 = R5n.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                R5n r5n = (R5n) R5n.defaultInstanceMap.get(asSubclass);
                if (r5n == null) {
                    try {
                        Pxg.A1M(asSubclass);
                        r5n = (R5n) R5n.defaultInstanceMap.get(asSubclass);
                        if (r5n == null) {
                            r5n = (R5n) ((R5n) C11430STu.A01(asSubclass)).A03(AnonymousClass05K.A0j);
                            if (r5n != null) {
                                T5R.A03(asSubclass, r5n);
                            } else {
                                illegalStateException = Pxe.A0i();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = Pxe.A0j("Class initialization cannot fail.", e);
                    }
                }
                return (C10705Rwj) r5n.A03(AnonymousClass05K.A0C);
            } catch (Exception e2) {
                throw Pxe.A0u(Pxf.A0e(cls, "Unable to get message info for "), e2);
            }
        } else {
            throw AnonymousClass7TF.A0W("Unsupported message type: ", cls.getName());
        }
    }
}
