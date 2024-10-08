package X;

import java.util.Map;

public final class Sy1 implements C13742TgE {
    public static final Sy1 A00 = new Object();

    public final C13474Tb1 FPD(Class cls) {
        IllegalStateException illegalStateException;
        Class<C8424QuF> cls2 = C8424QuF.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                Map map = C8424QuF.zzb;
                C8424QuF quF = (C8424QuF) map.get(asSubclass);
                if (quF == null) {
                    try {
                        Pxg.A1M(asSubclass);
                        quF = (C8424QuF) map.get(asSubclass);
                        if (quF == null) {
                            SUX.A04(asSubclass);
                            quF = C8423QuE.zzb;
                            if (quF != null) {
                                map.put(asSubclass, quF);
                            } else {
                                illegalStateException = Pxe.A0i();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = Pxe.A0j("Class initialization cannot fail.", e);
                    }
                }
                return (C13474Tb1) quF.A02(3);
            } catch (Exception e2) {
                throw Pxe.A0u("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
            }
        } else {
            throw AnonymousClass7TE.A0w("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean FPQ(Class cls) {
        return C8424QuF.class.isAssignableFrom(cls);
    }
}
