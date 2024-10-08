package X;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public enum RDL {
    ;
    
    public static final RDL A00 = null;

    /* access modifiers changed from: public */
    static {
        C8699R1q r1q = new C8699R1q(0);
        C8699R1q r1q2 = new C8699R1q(1);
        A01 = r1q2;
        C8699R1q r1q3 = new C8699R1q(2);
        A02 = r1q3;
        C8699R1q r1q4 = new C8699R1q(3);
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new R1X().A00().toString().contains("java.util.Map.java.util.Map")) {
                A00 = r1q3;
            } else {
                A00 = r1q4;
            }
        } else if (new R1Y().A00() instanceof Class) {
            A00 = r1q2;
        } else {
            A00 = r1q;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return new X.TLK(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return r0.A01(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Type A01(java.lang.reflect.Type r2) {
        /*
            r1 = this;
            r0 = r1
            X.R1q r0 = (X.C8699R1q) r0
            int r0 = r0.A00
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x0012;
                case 2: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            X.RDL r0 = A02
        L_0x000a:
            java.lang.reflect.Type r0 = r0.A01(r2)
            return r0
        L_0x000f:
            X.RDL r0 = A01
            goto L_0x000a
        L_0x0012:
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0022
            java.lang.Class r2 = (java.lang.Class) r2
            r0 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            java.lang.Class r0 = r0.getClass()
            return r0
        L_0x0022:
            X.TLK r0 = new X.TLK
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RDL.A01(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public final Type A02(Type type) {
        RDL rdl;
        switch (((C8699R1q) this).A00) {
            case 0:
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                if (cls.isArray()) {
                    return new TLK(cls.getComponentType());
                }
                return type;
            case 1:
                type.getClass();
                return type;
            case 2:
                rdl = A01;
                break;
            default:
                rdl = A02;
                break;
        }
        return rdl.A02(type);
    }

    public String A00(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
