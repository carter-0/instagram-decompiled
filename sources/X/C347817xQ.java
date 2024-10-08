package X;

import java.util.Map;

/* renamed from: X.7xQ  reason: invalid class name and case insensitive filesystem */
public final class C347817xQ {
    public final C347297wa A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C347817xQ) {
                C347817xQ r5 = (C347817xQ) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
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
        sb.append("XpostContentCompatConfigModel(sourceAppName=");
        sb.append(this.A00);
        sb.append(", featureConfigMap=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C347817xQ(C347297wa r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }
}
