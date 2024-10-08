package X;

import java.util.List;

/* renamed from: X.Dss  reason: case insensitive filesystem */
public final class C47205Dss extends AnonymousClass0T0 implements C51933G8b {
    public final String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47205Dss) {
                C47205Dss dss = (C47205Dss) obj;
                if (!0qQ.A0K(this.A00, dss.A00) || !0qQ.A0K(this.A01, dss.A01) || !0qQ.A0K(this.A02, dss.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C47205Dss(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
