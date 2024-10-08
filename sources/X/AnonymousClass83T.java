package X;

import java.util.List;

/* renamed from: X.83T  reason: invalid class name */
public final class AnonymousClass83T extends AnonymousClass0T0 {
    public final float A00;
    public final C357618Yx A01;
    public final C357608Yw A02;
    public final C361278fx A03;
    public final AnonymousClass83K A04;
    public final C357588Yu A05;
    public final List A06;

    public AnonymousClass83T(C357618Yx r2, C357608Yw r3, C361278fx r4, AnonymousClass83K r5, C357588Yu r6, List list, float f) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = f;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass83T) {
                AnonymousClass83T r5 = (AnonymousClass83T) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || Float.compare(this.A00, r5.A00) != 0 || !0qQ.A0K(this.A02, r5.A02) || this.A05 != r5.A05 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C357608Yw r0 = this.A02;
        int i = 0;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        C357588Yu r02 = this.A05;
        int hashCode3 = (hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C357618Yx r03 = this.A01;
        int hashCode4 = (hashCode3 + (r03 == null ? 0 : r03.hashCode())) * 31;
        List list = this.A06;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }
}
