package X;

import java.util.List;

/* renamed from: X.JvT  reason: case insensitive filesystem */
public final class C61029JvT extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C61029JvT(String str, String str2, List list, int i, int i2) {
        this.A05 = str;
        this.A04 = str2;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = list;
    }

    public static final C61029JvT A00(String str, String str2, List list, int i, int i2) {
        0qQ.A0B(list, 4);
        return new C61029JvT(str, str2, list, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61029JvT)) {
            return false;
        }
        C61029JvT jvT = (C61029JvT) obj;
        if (!0qQ.A0K(this.A05, jvT.A05) || !0qQ.A0K(this.A04, jvT.A04) || this.A02 != jvT.A02 || this.A01 != jvT.A01 || !0qQ.A0K(this.A03, jvT.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A05) * 31) + C41845B3m.A00(this.A04)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A03.hashCode();
    }

    public C61029JvT(int i, int i2) {
        this((String) null, (String) null, 0sn.A00, i, i2);
    }
}
