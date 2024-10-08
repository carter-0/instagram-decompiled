package X;

/* renamed from: X.4PU  reason: invalid class name */
public final class AnonymousClass4PU implements AnonymousClass0SS, AnonymousClass0SV {
    public static final AnonymousClass4PU A02 = new AnonymousClass4PU();
    public final ThreadLocal A00 = new AnonymousClass4PY();
    public volatile long A01 = 1;

    public final boolean AFQ(0SG r7, int i, int i2) {
        long j;
        long BOR = r7.BOR(79, 131073, 1);
        Number number = (Number) this.A00.get();
        if (number != null) {
            j = number.longValue();
        } else {
            j = 79;
        }
        if (BOR != j) {
            return true;
        }
        return false;
    }

    public final void AV5(0hE r6, 0SG r7, int i, int i2) {
        long j;
        Number number = (Number) this.A00.get();
        if (number != null) {
            j = number.longValue();
        } else {
            j = 79;
        }
        if (j == 79) {
            if (r7 != null) {
                j = r7.BOR(79, 131073, 1);
                if (j == 79) {
                    return;
                }
            } else {
                return;
            }
        }
        0hE.A00(r6, Long.valueOf(j), 131073);
    }

    public final Integer C9K() {
        return AnonymousClass05K.A0C;
    }

    public final boolean EsE(int i, int i2) {
        if (this.A01 != 79) {
            return true;
        }
        return false;
    }

    public final boolean EsF(0SG r7, int i, int i2) {
        long j;
        Number number = (Number) this.A00.get();
        if (number != null) {
            j = number.longValue();
        } else {
            j = 79;
        }
        if (j == 79 && (r7 == null || r7.BOR(79, 131073, 1) == 79)) {
            return false;
        }
        return true;
    }

    public final void AV4(0hE r4, int i, int i2) {
        0hE.A00(r4, Long.valueOf(this.A01), 131073);
    }
}
