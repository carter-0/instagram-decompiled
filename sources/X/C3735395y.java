package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.95y  reason: invalid class name and case insensitive filesystem */
public final class C3735395y {
    public final int A00;
    public final int A01;
    public final Class A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3735395y)) {
            return false;
        }
        C3735395y r4 = (C3735395y) obj;
        if (this.A02 == r4.A02 && this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.A02);
        sb.append(", type=");
        if (this.A01 == 1) {
            str = "required";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        if (this.A00 != 0) {
            str2 = "provider";
        } else {
            str2 = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public C3735395y(Class cls, int i, int i2) {
        this.A02 = cls;
        this.A01 = i;
        this.A00 = i2;
    }
}
