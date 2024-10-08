package X;

import java.util.Arrays;

public final class S6U {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public String A04 = "";
    public String A05 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            S6U s6u = (S6U) obj;
            if (!(this.A03 == s6u.A03 && this.A00 == s6u.A00 && this.A02 == s6u.A02 && this.A01 == s6u.A01 && this.A05.equals(s6u.A05) && this.A04.equals(s6u.A04))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A03), Long.valueOf(this.A00), Long.valueOf(this.A02), Long.valueOf(this.A01), this.A05, this.A04});
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("startReadTimeUs:");
        A1A.append(this.A03);
        A1A.append("\nendReadTimeUs:");
        A1A.append(this.A00);
        A1A.append("\nframeBeforeStartReadTimeUs:");
        A1A.append(this.A02);
        A1A.append("\nframeAfterEndReadTimeUs:");
        A1A.append(this.A01);
        A1A.append("\ntrackInfoMap:");
        A1A.append(this.A05);
        A1A.append("\nexceptions:");
        return AnonymousClass7TF.A0l(this.A04, A1A);
    }
}
