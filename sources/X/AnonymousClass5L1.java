package X;

/* renamed from: X.5L1  reason: invalid class name */
public final class AnonymousClass5L1 implements AnonymousClass5L0 {
    public static final AnonymousClass5L1 A00 = new Object();

    public final boolean Ccs(Class cls) {
        return C283985Kk.class.isAssignableFrom(cls);
    }

    public final AnonymousClass5LN CoF(Class cls) {
        IllegalStateException illegalStateException;
        Class<C283985Kk> cls2 = C283985Kk.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                C283985Kk r1 = (C283985Kk) C283985Kk.defaultInstanceMap.get(asSubclass);
                if (r1 == null) {
                    try {
                        Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                        r1 = (C283985Kk) C283985Kk.defaultInstanceMap.get(asSubclass);
                        if (r1 == null) {
                            r1 = (C283985Kk) ((C283985Kk) C284115La.A04(asSubclass)).A03(AnonymousClass05K.A0j);
                            if (r1 != null) {
                                C283985Kk.defaultInstanceMap.put(asSubclass, r1);
                            } else {
                                illegalStateException = new IllegalStateException();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException(Pxd.A00(139), e);
                    }
                }
                return (AnonymousClass5LN) r1.A03(AnonymousClass05K.A0C);
            } catch (Exception e2) {
                throw new RuntimeException(002.A0R(Pxd.A00(177), cls.getName()), e2);
            }
        } else {
            throw new IllegalArgumentException(002.A0R(Pxd.A00(73), cls.getName()));
        }
    }
}
