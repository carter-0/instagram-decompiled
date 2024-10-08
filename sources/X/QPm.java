package X;

public final class QPm extends AnonymousClass0T0 implements C13791Th6 {
    public final int A00;
    public final String A01;
    public final boolean A02 = true;

    public QPm(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPm) {
                QPm qPm = (QPm) obj;
                if (!(0qQ.A0K(this.A01, qPm.A01) && this.A02 == qPm.A02 && this.A00 == qPm.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bbi() {
        return this.A01;
    }

    public final int Bbj() {
        return this.A00;
    }

    public final boolean Cam() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0O(this.A01)) + this.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcPermissionRequest(permission=");
        A1A.append(this.A01);
        A1A.append(", isRequiredPermission=");
        A1A.append(this.A02);
        A1A.append(", permissionLabel=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
