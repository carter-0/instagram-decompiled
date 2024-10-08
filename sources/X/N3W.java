package X;

public final class N3W extends AnonymousClass0T0 {
    public final C61073JwB A00;
    public final C69273NiZ A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3W) {
                N3W n3w = (N3W) obj;
                if (!(this.A03 == n3w.A03 && this.A04 == n3w.A04 && this.A05 == n3w.A05 && 0qQ.A0K(this.A02, n3w.A02) && this.A06 == n3w.A06 && 0qQ.A0K(this.A00, n3w.A00) && this.A01 == n3w.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A03));
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A05, A09) + AnonymousClass7TG.A0C(this.A02)) * 31)));
    }

    public N3W(C61073JwB jwB, C69273NiZ niZ, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        C51972G9s.A1E(jwB, niZ);
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = num;
        this.A06 = z4;
        this.A00 = jwB;
        this.A01 = niZ;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewStateExtras(gdriveBackedUp=");
        A1A.append(this.A03);
        A1A.append(", isPinAvailable=");
        A1A.append(this.A04);
        A1A.append(", shouldOverrideCutoverTimestamp=");
        A1A.append(this.A05);
        A1A.append(", currentOverrideCutoverTimestamp=");
        A1A.append(this.A02);
        A1A.append(", shouldShowPrimaryDeviceInternal=");
        A1A.append(this.A06);
        A1A.append(", encryptedBackupsPrimaryDevice=");
        A1A.append(this.A00);
        A1A.append(", autoBackupState=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
