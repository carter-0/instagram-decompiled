package X;

import java.util.Arrays;

/* renamed from: X.MqY  reason: case insensitive filesystem */
public final class C67600MqY implements Comparable {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C67600MqY)) {
            return false;
        }
        C67600MqY mqY = (C67600MqY) obj;
        return mqY.A01 == this.A01 && mqY.A00 == this.A00;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C67600MqY mqY = (C67600MqY) obj;
        0qQ.A0B(mqY, 0);
        return 0qQ.A00(this.A01, mqY.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(Integer.valueOf(this.A01), this.A00));
    }

    public C67600MqY(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
