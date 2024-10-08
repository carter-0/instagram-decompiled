package X;

/* renamed from: X.4oa  reason: invalid class name and case insensitive filesystem */
public final class C274564oa extends AnonymousClass0T0 implements C274574ob {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274564oa) {
                C274564oa r5 = (C274564oa) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
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
        Boolean bool3 = this.A02;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return hashCode3 + i;
    }

    public C274564oa(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
    }
}
