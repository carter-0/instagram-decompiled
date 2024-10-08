package X;

import java.util.List;

/* renamed from: X.83Z  reason: invalid class name */
public final class AnonymousClass83Z extends AnonymousClass0T0 {
    public final C357618Yx A00;
    public final C357608Yw A01;
    public final C361278fx A02;
    public final C357588Yu A03;
    public final AnonymousClass831 A04;
    public final List A05;

    public AnonymousClass83Z(C357618Yx r2, C357608Yw r3, C361278fx r4, C357588Yu r5, AnonymousClass831 r6, List list) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r6, 2);
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass83Z) {
                AnonymousClass83Z r5 = (AnonymousClass83Z) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || this.A03 != r5.A03 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A04.hashCode()) * 31;
        C357608Yw r0 = this.A01;
        int i = 0;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        C357588Yu r02 = this.A03;
        int hashCode3 = (hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C357618Yx r03 = this.A00;
        int hashCode4 = (hashCode3 + (r03 == null ? 0 : r03.hashCode())) * 31;
        List list = this.A05;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }
}
