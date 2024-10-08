package X;

import sun.misc.Unsafe;

public final class R28 extends AnonymousClass9CD {
    public final byte A00(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public final double A01(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public final float A02(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public final void A08(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public final void A09(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public final void A0A(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public final void A0E(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public final boolean A0H() {
        if (!super.A0H()) {
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
            AnonymousClass9CA.A06(th);
            return false;
        }
    }

    public final boolean A0I(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public final boolean A0G() {
        if (!super.A0G()) {
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
            AnonymousClass9CA.A06(th);
            return false;
        }
    }

    public R28(Unsafe unsafe) {
        super(unsafe);
    }
}
