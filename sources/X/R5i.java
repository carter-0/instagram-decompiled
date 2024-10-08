package X;

import com.google.protobuf.UnsafeUtil;
import sun.misc.Unsafe;

public final class R5i extends SK5 {
    public final byte A01(long j) {
        return this.A00.getByte(j);
    }

    public final byte A02(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public final double A03(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public final float A04(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public final void A0B(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public final void A0C(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public final void A0D(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public final void A0H(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public final void A0I(byte[] bArr, long j, long j2, long j3) {
        long j4 = j;
        this.A00.copyMemory((Object) null, j4, bArr, UnsafeUtil.A01, j3);
    }

    public final boolean A0K() {
        if (!super.A0K()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", new Class[]{cls2});
            cls.getMethod("putByte", new Class[]{cls2, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{cls2});
            cls.getMethod("putInt", new Class[]{cls2, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{cls2});
            cls.getMethod("putLong", new Class[]{cls2, cls2});
            cls.getMethod("copyMemory", new Class[]{cls2, cls2, cls2});
            Class<Object> cls3 = Object.class;
            cls.getMethod("copyMemory", new Class[]{cls3, cls2, cls3, cls2, cls2});
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A07(th);
            return false;
        }
    }

    public final boolean A0L(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public final boolean A0J() {
        if (!super.A0J()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            Class<Object> cls2 = Object.class;
            Class cls3 = Long.TYPE;
            cls.getMethod("getByte", new Class[]{cls2, cls3});
            cls.getMethod("putByte", new Class[]{cls2, cls3, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{cls2, cls3});
            cls.getMethod("putBoolean", new Class[]{cls2, cls3, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{cls2, cls3});
            cls.getMethod("putFloat", new Class[]{cls2, cls3, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{cls2, cls3});
            cls.getMethod("putDouble", new Class[]{cls2, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A07(th);
            return false;
        }
    }

    public R5i(Unsafe unsafe) {
        super(unsafe);
    }
}
