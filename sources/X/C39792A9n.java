package X;

import java.util.Arrays;

/* renamed from: X.A9n  reason: case insensitive filesystem */
public final class C39792A9n {
    public final int A00;
    public final C375189Cp A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39792A9n)) {
            return false;
        }
        C39792A9n a9n = (C39792A9n) obj;
        if (this.A01 != a9n.A01 || this.A00 != a9n.A00 || !this.A03.equals(a9n.A03) || !this.A02.equals(a9n.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), this.A03, this.A02});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.A01, Integer.valueOf(this.A00), this.A03, this.A02});
    }

    public C39792A9n(C375189Cp r1, String str, String str2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
    }
}
