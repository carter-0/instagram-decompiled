package X;

import java.util.LinkedHashMap;

/* renamed from: X.83F  reason: invalid class name */
public final class AnonymousClass83F extends AnonymousClass0T0 {
    public final LinkedHashMap A00;
    public final LinkedHashMap A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 35));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 36));

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass83F) {
                AnonymousClass83F r5 = (AnonymousClass83F) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleepData(segmentBleepData=");
        sb.append(this.A00);
        sb.append(", voiceOverBleepData=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass83F(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.A00 = linkedHashMap;
        this.A01 = linkedHashMap2;
    }
}
