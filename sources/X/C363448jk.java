package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.8jk  reason: invalid class name and case insensitive filesystem */
public final class C363448jk {
    public long A00;
    public String A01 = "";
    public HashMap A02;
    public List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C363448jk) {
                C363448jk r8 = (C363448jk) obj;
                if (!0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A02, r8.A02) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxService(status=");
        sb.append(this.A01);
        sb.append(", identityMapping=");
        sb.append(this.A03);
        sb.append(", customData=");
        sb.append(this.A02);
        sb.append(", lastUpdateTimeMs=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C363448jk() {
        0sn r4 = 0sn.A00;
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        0qQ.A0B("", 1);
        0qQ.A0B(hashMap, 3);
        this.A03 = r4;
        this.A02 = hashMap;
        this.A00 = currentTimeMillis;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((this.A01.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
