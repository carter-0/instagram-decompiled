package X;

public final class QPn extends AnonymousClass0T0 implements C13791Th6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final int A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPn) {
                QPn qPn = (QPn) obj;
                if (!(0qQ.A0K(this.A03, qPn.A03) && this.A05 == qPn.A05 && this.A04 == qPn.A04 && this.A02 == qPn.A02 && this.A01 == qPn.A01 && this.A00 == qPn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bbi() {
        return this.A03;
    }

    public final int Bbj() {
        return this.A04;
    }

    public final boolean Cam() {
        return this.A05;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A09(this.A05, AnonymousClass7TE.A0O(this.A03)) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public QPn(String str, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = str;
        this.A05 = z;
        this.A04 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcPermissionRequestWithOverlay(permission=");
        A1A.append(this.A03);
        A1A.append(", isRequiredPermission=");
        A1A.append(this.A05);
        A1A.append(", permissionLabel=");
        A1A.append(this.A04);
        A1A.append(", title=");
        A1A.append(this.A02);
        A1A.append(", message=");
        A1A.append(this.A01);
        A1A.append(", link=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
