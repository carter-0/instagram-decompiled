package X;

import java.io.Serializable;

/* renamed from: X.Q3y  reason: case insensitive filesystem */
public final class C7322Q3y implements Serializable {
    public final long A00;
    public final T9F A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7322Q3y) {
                C7322Q3y q3y = (C7322Q3y) obj;
                if (!0qQ.A0K(this.A02, q3y.A02) || this.A00 != q3y.A00 || !0qQ.A0K(this.A01, q3y.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51972G9s.A07(this.A00, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0C(this.A01);
    }

    public C7322Q3y(T9F t9f, String str, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A01 = t9f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ComponentQueryDiskCacheRecord(payload=");
        A1A.append(this.A02);
        A1A.append(", responseTimestampMs=");
        A1A.append(this.A00);
        A1A.append(", resources=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
