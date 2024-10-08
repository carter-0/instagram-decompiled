package X;

/* renamed from: X.6Tz  reason: invalid class name and case insensitive filesystem */
public final class C308366Tz {
    public int A00;
    public final int A01;
    public final C308336Tw A02;

    public static Object A00(C308366Tz r4, int i) {
        int i2 = r4.A00;
        boolean z = true;
        boolean z2 = false;
        if (i2 != -1) {
            z2 = true;
        }
        if (z2) {
            if (i >= i2) {
                z = false;
            }
            C308316Tu.A00(z, "invalid instr stack argument");
            return r4.A02.A05[r4.A01 + i];
        }
        throw new IllegalStateException("InstrStackArgs is not initialized");
    }

    public static void A01(C308366Tz r4, Object obj) {
        int i = r4.A00;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        if (z) {
            C308336Tw r0 = r4.A02;
            r0.A0L(i);
            C308336Tw.A0E(r0, obj);
            r4.A00 = -1;
            return;
        }
        throw new IllegalStateException("InstrStackArgs is not initialized");
    }

    public static boolean A02(double d) {
        double floor;
        if (d < 0.0d) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        if (floor == d) {
            return true;
        }
        return false;
    }

    public C308366Tz(C308336Tw r3, int i) {
        int i2;
        this.A02 = r3;
        this.A00 = i;
        if (i > 0) {
            i2 = (r3.A01 - 1) - (i - 1);
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
