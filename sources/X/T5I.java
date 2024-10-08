package X;

import com.google.protobuf.UnsafeUtil;

public final class T5I implements C13747TgJ {
    public static final T5I A00 = new Object();

    public final boolean Ccs(Class cls) {
        return R5b.class.isAssignableFrom(cls);
    }

    public final C10704Rwi CoH(Class cls) {
        IllegalStateException illegalStateException;
        Class<R5b> cls2 = R5b.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                R5b r5b = (R5b) R5b.defaultInstanceMap.get(asSubclass);
                if (r5b == null) {
                    try {
                        Pxg.A1M(asSubclass);
                        r5b = (R5b) R5b.defaultInstanceMap.get(asSubclass);
                        if (r5b == null) {
                            r5b = (R5b) ((R5b) UnsafeUtil.A02(asSubclass)).A0K(AnonymousClass05K.A0j, (Object) null, (Object) null);
                            if (r5b != null) {
                                R5b.defaultInstanceMap.put(asSubclass, r5b);
                            } else {
                                illegalStateException = Pxe.A0i();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = Pxe.A0j("Class initialization cannot fail.", e);
                    }
                }
                return (C10704Rwi) r5b.A0K(AnonymousClass05K.A0C, (Object) null, (Object) null);
            } catch (Exception e2) {
                throw Pxe.A0u(Pxf.A0e(cls, "Unable to get message info for "), e2);
            }
        } else {
            throw AnonymousClass7TF.A0W("Unsupported message type: ", cls.getName());
        }
    }
}
