package X;

import java.util.Arrays;

/* renamed from: X.3H3  reason: invalid class name */
public final class AnonymousClass3H3 {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            AnonymousClass3H3 r5 = (AnonymousClass3H3) obj;
            if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A02), Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectBadgeCount{totalCount=");
        sb.append(this.A02);
        sb.append(", openThreadsCount=");
        sb.append(this.A00);
        sb.append(", securedThreadsCount=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass3H3(int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
