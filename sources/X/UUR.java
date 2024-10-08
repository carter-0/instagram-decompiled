package X;

public final class UUR extends V4W {
    public final synchronized V1V A03() {
        V1V A00;
        synchronized (this) {
            A00 = A00(this.A00);
        }
        return A00;
    }

    public final synchronized V1V A04() {
        V1V A00;
        synchronized (this) {
            A00 = A00(this.A01);
        }
        return A00;
    }

    public static final V1V A00(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 5 || intValue == 4) {
            return V1V.NORMAL;
        }
        if (intValue == 3) {
            return V1V.MODERATE;
        }
        if (intValue == 2) {
            return V1V.SEVERE;
        }
        if (intValue == 1) {
            return V1V.CRITICAL;
        }
        if (intValue == 0) {
            return V1V.UNKNOWN;
        }
        return null;
    }
}
