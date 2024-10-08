package X;

import java.lang.reflect.ParameterizedType;

public enum RDW {
    ;
    
    public static final RDW A00 = null;

    /* access modifiers changed from: public */
    static {
        ParameterizedType parameterizedType = (ParameterizedType) new C8698R1n().getClass().getGenericSuperclass();
        parameterizedType.getClass();
        for (RDW rdw : values()) {
            if (rdw.A00(C9745Rg3.class) == parameterizedType.getOwnerType()) {
                A00 = rdw;
                return;
            }
        }
        throw Pxe.A0d();
    }

    public final Class A00(Class cls) {
        if (!(this instanceof R1p) || !cls.isLocalClass()) {
            return cls.getEnclosingClass();
        }
        return null;
    }
}
