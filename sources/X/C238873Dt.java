package X;

import java.util.Arrays;

/* renamed from: X.3Dt  reason: invalid class name and case insensitive filesystem */
public final class C238873Dt {
    public Integer A00;
    public Object A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C238873Dt)) {
            return false;
        }
        C238873Dt r4 = (C238873Dt) obj;
        if (!2Ob.A00(r4.A00, this.A00) || !2Ob.A00(r4.A01, this.A01) || !2Ob.A00(r4.A03, this.A03) || !2Ob.A00(r4.A02, this.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01, this.A03});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AutomatedLoggingTrackingNode");
        sb.append("[trackingNodeType=");
        sb.append(this.A01);
        sb.append("]");
        Integer num = this.A00;
        if (num != null) {
            sb.append("[index=");
            sb.append(num);
            sb.append("]");
        }
        String str = this.A02;
        if (str != null) {
            sb.append("[productId=");
            sb.append(str);
            sb.append("]");
        }
        String str2 = this.A03;
        if (str2 != null) {
            sb.append(002.A0g("[thumbnailId=", str2, "]"));
        }
        return sb.toString();
    }

    public C238873Dt(Integer num, Object obj, String str, String str2) {
        this.A01 = obj;
        this.A00 = num;
        this.A03 = str;
        this.A02 = str2;
    }

    public C238873Dt(Object obj) {
        this.A01 = obj;
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
    }
}
