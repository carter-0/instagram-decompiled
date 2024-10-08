package X;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.MqZ  reason: case insensitive filesystem */
public final class C67601MqZ {
    public final int A00;
    public final int A01;
    public final C67071Mhm A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C67601MqZ)) {
            return false;
        }
        C67601MqZ mqZ = (C67601MqZ) obj;
        return mqZ.A01 == this.A01 && mqZ.A00 == this.A00 && mqZ.A02 == this.A02 && 2PP.A00(mqZ.A03, this.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02, this.A03});
    }

    public final String toString() {
        String format = String.format(Locale.ENGLISH, "start: %d, end: %d, formatter: %s, formatDelimiterRanges %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02, this.A03}, 4));
        0qQ.A07(format);
        return format;
    }

    public C67601MqZ(C67071Mhm mhm, List list, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = mhm;
        this.A03 = list;
    }
}
