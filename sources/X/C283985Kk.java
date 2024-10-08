package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5Kk  reason: invalid class name and case insensitive filesystem */
public abstract class C283985Kk extends C283995Kl {
    public static Map defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C284015Ko unknownFields = C284015Ko.A05;

    public static final boolean A01(C283985Kk r2) {
        byte byteValue = ((Number) r2.A03(AnonymousClass05K.A00)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean CVR = C284075Kw.A02.A00(r2.getClass()).CVR(r2);
        r2.A03(AnonymousClass05K.A01);
        return CVR;
    }

    public final Object A03(Integer num) {
        if (this instanceof C283975Kj) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass5LM(C283975Kj.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AnonymousClass5L6.A00});
                case 3:
                    return new C283975Kj();
                case 4:
                    return new C7187Pya();
                default:
                    return C283975Kj.DEFAULT_INSTANCE;
            }
        } else {
            boolean z = this instanceof AnonymousClass5LJ;
            int intValue = num.intValue();
            if (z) {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return new AnonymousClass5LM(AnonymousClass5LJ.DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C284215Lk.class});
                    case 3:
                        return new AnonymousClass5LJ();
                    case 4:
                        return new PyZ();
                    default:
                        return AnonymousClass5LJ.DEFAULT_INSTANCE;
                }
            } else {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        String A00 = Pxd.A00(296);
                        return new AnonymousClass5LM(C284215Lk.DEFAULT_INSTANCE, A00, new Object[]{"strings_"});
                    case 3:
                        return new C284215Lk();
                    case 4:
                        return new C7406QBq();
                    default:
                        return C284215Lk.DEFAULT_INSTANCE;
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ C283985Kk Avr() {
        return (C283985Kk) A03(AnonymousClass05K.A0j);
    }

    public final int BsY() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int Bsa = C284075Kw.A02.A00(getClass()).Bsa(this);
        this.memoizedSerializedSize = Bsa;
        return Bsa;
    }

    public final void FOB(C7189Pyc pyc) {
        AnonymousClass5L3 A00 = C284075Kw.A02.A00(getClass());
        C7194Pyh pyh = pyc.A00;
        if (pyh == null) {
            pyh = new C7194Pyh(pyc);
        }
        A00.FOE(pyh, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!A03(AnonymousClass05K.A0j).getClass().isInstance(obj)) {
            return false;
        }
        return C284075Kw.A02.A00(getClass()).ASr(this, obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int CL6 = C284075Kw.A02.A00(getClass()).CL6(this);
        this.memoizedHashCode = CL6;
        return CL6;
    }

    public static Object A00(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(Pxd.A00(141), e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException(Pxd.A00(180), cause);
        }
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C11049S7u.A00(this, sb, 0);
        return sb.toString();
    }
}
