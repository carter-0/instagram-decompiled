package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.QuF  reason: case insensitive filesystem */
public abstract class C8424QuF extends Sy2 {
    public static final Map zzb = new ConcurrentHashMap();
    public SRM zzc = SRM.A04;
    public int zzd = -1;

    public final Object A02(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C12573Sxy(C8423QuE.zzb, new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new C8423QuE();
        } else {
            if (i2 == 4) {
                return new C8420QuB(C8423QuE.zzb);
            }
            if (i2 == 5) {
                return C8423QuE.zzb;
            }
            return null;
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return SH3.A02.A00(cls).FPy(this, obj);
    }

    public final int hashCode() {
        if ((this.zzd & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            return SH3.A02.A00(getClass()).FOw(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int FOw = SH3.A02.A00(getClass()).FOw(this);
        this.zza = FOw;
        return FOw;
    }

    public static Object A01(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw Pxe.A0u("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw Pxe.A0u("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = SMW.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("# ");
        A1A.append(obj);
        SMW.A00(this, A1A, 0);
        return A1A.toString();
    }
}
