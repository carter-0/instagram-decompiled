package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8fi  reason: invalid class name and case insensitive filesystem */
public final class C361128fi extends C360018dr {
    public final C3034368u A00;
    public final C361118fh A01;
    public final List A02;
    public final Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C361128fi(C3034368u r4, C361118fh r5) {
        super(r5);
        0sn r2 = 0sn.A00;
        0sm A0E = 0Yt.A0E();
        0qQ.A0B(r2, 2);
        0qQ.A0B(A0E, 3);
        this.A00 = r4;
        this.A02 = r2;
        this.A03 = A0E;
        this.A01 = r5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C361128fi) {
                C361128fi r5 = (C361128fi) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C66579MXk.A00(102));
        sb.append(this.A00);
        sb.append(", actions=");
        sb.append(this.A02);
        sb.append(", externalVariables=");
        sb.append(this.A03);
        sb.append(", fetchSummaryData=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
