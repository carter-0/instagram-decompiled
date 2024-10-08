package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.9CD  reason: invalid class name */
public abstract class AnonymousClass9CD {
    public Unsafe A00;

    public byte A00(Object obj, long j) {
        boolean z = AnonymousClass9CA.A07;
        int A04 = AnonymousClass9CA.A01.A04(obj, -4 & j);
        if (z) {
            j ^= -1;
        }
        return (byte) ((A04 >>> ((int) ((j & 3) << 3))) & 255);
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
        boolean z = AnonymousClass9CA.A07;
        long j2 = -4 & j;
        int A04 = AnonymousClass9CA.A01.A04(obj, j2);
        int i = (int) j;
        if (z) {
            i ^= -1;
        }
        int i2 = (i & 3) << 3;
        AnonymousClass9CA.A04(obj, j2, ((255 & b) << i2) | (A04 & ((255 << i2) ^ -1)));
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
        boolean z2 = AnonymousClass9CA.A07;
        byte b = z ? (byte) 1 : 0;
        long j2 = -4 & j;
        int A04 = AnonymousClass9CA.A01.A04(obj, j2);
        int i = (int) j;
        if (z2) {
            i ^= -1;
        }
        int i2 = (i & 3) << 3;
        AnonymousClass9CA.A04(obj, j2, ((255 & b) << i2) | (A04 & ((255 << i2) ^ -1)));
    }

    public final void A0F(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0G() {
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
            AnonymousClass9CA.A06(th);
            return false;
        }
    }

    public boolean A0H() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (AnonymousClass9CA.A02() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            AnonymousClass9CA.A06(th);
            return false;
        }
    }

    public boolean A0I(Object obj, long j) {
        boolean z = AnonymousClass9CA.A07;
        int A04 = AnonymousClass9CA.A01.A04(obj, -4 & j);
        if (z) {
            j ^= -1;
        }
        if (((byte) ((A04 >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass9CD(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A09(Object obj, long j, double d) {
        A0C(obj, j, Double.doubleToLongBits(d));
    }

    public void A0A(Object obj, long j, float f) {
        A0B(obj, j, Float.floatToIntBits(f));
    }
}
