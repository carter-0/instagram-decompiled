package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class S7k {
    public Unsafe A00;

    public byte A00(Object obj, long j) {
        boolean z = this instanceof R74;
        boolean z2 = C11430STu.A07;
        int i = C11430STu.A01.A00.getInt(obj, -4 & j);
        if (z) {
            if (z2) {
                return Pxj.A00(i, j ^ -1);
            }
            return Pxj.A00(i, j);
        } else if (z2) {
            return Pxj.A00(i, j ^ -1);
        } else {
            return Pxj.A00(i, j);
        }
    }

    public double A01(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A02(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A03(Class cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A04(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A05(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final Object A06(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A07(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public final void A0A(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0B(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0C(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0D(Object obj, long j, boolean z) {
        boolean z2 = this instanceof R74;
        boolean z3 = C11430STu.A07;
        byte b = z ? (byte) 1 : 0;
        long j2 = -4 & j;
        S7k s7k = C11430STu.A01;
        int i = s7k.A00.getInt(obj, j2);
        int i2 = (int) j;
        if (z2) {
            if (z3) {
                s7k.A0A(obj, j2, Pxh.A05(i2 ^ -1, i, b));
            } else {
                s7k.A0A(obj, j2, Pxh.A05(i2, i, b));
            }
        } else if (z3) {
            s7k.A0A(obj, j2, Pxh.A05(i2 ^ -1, i, b));
        } else {
            s7k.A0A(obj, j2, Pxh.A05(i2, i, b));
        }
    }

    public final void A0E(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0F() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class<Class> cls2 = Class.class;
            cls.getMethod("arrayBaseOffset", new Class[]{cls2});
            cls.getMethod("arrayIndexScale", new Class[]{cls2});
            Class<Object> cls3 = Object.class;
            Class cls4 = Long.TYPE;
            cls.getMethod("getInt", new Class[]{cls3, cls4});
            cls.getMethod("putInt", new Class[]{cls3, cls4, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{cls3, cls4});
            cls.getMethod("putLong", new Class[]{cls3, cls4, cls4});
            cls.getMethod("getObject", new Class[]{cls3, cls4});
            cls.getMethod("putObject", new Class[]{cls3, cls4, cls3});
            return true;
        } catch (Throwable th) {
            C11430STu.A05(th);
            return false;
        }
    }

    public boolean A0G() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (C11430STu.A02() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C11430STu.A05(th);
            return false;
        }
    }

    public boolean A0H(Object obj, long j) {
        byte A002;
        byte A003;
        boolean z = this instanceof R74;
        boolean z2 = C11430STu.A07;
        int i = C11430STu.A01.A00.getInt(obj, -4 & j);
        if (z) {
            if (z2) {
                A003 = Pxj.A00(i, j ^ -1);
            } else {
                A003 = Pxj.A00(i, j);
            }
            return AnonymousClass7TF.A1P(A003);
        }
        if (z2) {
            A002 = Pxj.A00(i, j ^ -1);
        } else {
            A002 = Pxj.A00(i, j);
        }
        return AnonymousClass7TF.A1P(A002);
    }

    public S7k(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A08(Object obj, long j, double d) {
        A0B(obj, j, Double.doubleToLongBits(d));
    }

    public void A09(Object obj, long j, float f) {
        A0A(obj, j, Float.floatToIntBits(f));
    }
}
