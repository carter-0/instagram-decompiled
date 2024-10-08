package X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.8dL  reason: invalid class name and case insensitive filesystem */
public final class C359698dL extends C359708dM {
    public long A00 = 0;
    public long A01 = 0;
    public 0lg A02;
    public String A03;
    public String A04 = "";
    public HashMap A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C359698dL) {
                C359698dL r5 = (C359698dL) obj;
                if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03) || !this.A04.equals(r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A04});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IgBloksDataProps");
        sb.append(" ");
        sb.append("session");
        sb.append("=");
        sb.append(this.A02.toString());
        sb.append("IgBloksDataProps");
        sb.append(" ");
        sb.append("appId");
        sb.append("=");
        sb.append(this.A03);
        sb.append(" ");
        sb.append("cacheKey");
        sb.append("=");
        sb.append(this.A04);
        sb.append(" ");
        sb.append("secondsUnderWhichToOnlyServeCache");
        sb.append("=");
        sb.append(this.A01);
        sb.append(" ");
        sb.append("secondsCacheIsValidFor");
        sb.append("=");
        sb.append(this.A00);
        HashMap hashMap = this.A05;
        if (hashMap != null) {
            sb.append(" ");
            sb.append("params");
            sb.append("=");
            sb.append(hashMap.toString());
        }
        return sb.toString();
    }
}
