package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.5Ld  reason: invalid class name and case insensitive filesystem */
public abstract class C284145Ld {
    public Unsafe A00;

    public byte A00(Object obj, long j) {
        if (C284115La.A08) {
            return C284115La.A00(obj, j);
        }
        return C284115La.A01(obj, j);
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

    public void A08(Object obj, long j, byte b) {
        if (C284115La.A08) {
            C284115La.A07(obj, j, b);
        } else {
            C284115La.A08(obj, j, b);
        }
    }

    public final void A0B(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0C(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0D(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0E(Object obj, long j, boolean z) {
        if (C284115La.A08) {
            C284115La.A07(obj, j, z ? (byte) 1 : 0);
        } else {
            C284115La.A08(obj, j, z ? (byte) 1 : 0);
        }
    }

    public final void A0F(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0G(Object obj, long j) {
        byte A01;
        if (C284115La.A08) {
            A01 = C284115La.A00(obj, j);
        } else {
            A01 = C284115La.A01(obj, j);
        }
        if (A01 != 0) {
            return true;
        }
        return false;
    }

    public C284145Ld(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A09(Object obj, long j, double d) {
        A0C(obj, j, Double.doubleToLongBits(d));
    }

    public void A0A(Object obj, long j, float f) {
        A0B(obj, j, Float.floatToIntBits(f));
    }
}
