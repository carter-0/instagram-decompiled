package X;

import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3Lg  reason: invalid class name and case insensitive filesystem */
public final class C240533Lg {
    public static final Map A03 = new IdentityHashMap();
    public int A00 = 1;
    public Object A01;
    public final 1T3 A02;

    public static void A00(C240533Lg r2) {
        boolean z;
        synchronized (r2) {
            z = false;
            if (r2.A00 > 0) {
                z = true;
            }
        }
        if (!z) {
            throw new Y5D();
        }
    }

    public final synchronized Object A01() {
        return this.A01;
    }

    public final void A02() {
        int i;
        Object obj;
        synchronized (this) {
            A00(this);
            int i2 = this.A00;
            boolean z = false;
            if (i2 > 0) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf == null || valueOf.booleanValue()) {
                i = i2 - 1;
                this.A00 = i;
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (i == 0) {
            synchronized (this) {
                obj = this.A01;
                this.A01 = null;
            }
            if (obj != null) {
                1T3 r0 = this.A02;
                if (r0 != null) {
                    r0.ECO(obj);
                }
                Map map = A03;
                synchronized (map) {
                    Integer num = (Integer) map.get(obj);
                    if (num == null) {
                        Object[] objArr = {obj.getClass()};
                        0I2 r1 = 0I1.A00;
                        if (r1.isLoggable(6)) {
                            r1.wtf("SharedReference", String.format((Locale) null, "No entry in sLiveObjects for value of type %s", objArr));
                        }
                    } else {
                        int intValue = num.intValue();
                        if (intValue == 1) {
                            map.remove(obj);
                        } else {
                            map.put(obj, Integer.valueOf(intValue - 1));
                        }
                    }
                }
            }
        }
    }

    public C240533Lg(1T3 r4, Object obj, boolean z) {
        this.A01 = obj;
        this.A02 = r4;
        if (z) {
            Map map = A03;
            synchronized (map) {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
    }
}
