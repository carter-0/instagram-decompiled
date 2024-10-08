package X;

import java.util.List;

/* renamed from: X.8uP  reason: invalid class name and case insensitive filesystem */
public final class C369348uP extends AnonymousClass0T0 {
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C369348uP) {
                C369348uP r5 = (C369348uP) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.A03;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public C369348uP(Boolean bool, Boolean bool2, String str, List list) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A03 = list;
        this.A02 = str;
    }
}
