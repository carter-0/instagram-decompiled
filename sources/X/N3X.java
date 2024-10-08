package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class N3X extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public N3X(String str, String str2, int i, int i2, long j, long j2, boolean z, boolean z2) {
        0qQ.A0B(str, 2);
        this.A01 = i;
        this.A05 = str;
        this.A03 = j;
        this.A04 = str2;
        this.A00 = i2;
        this.A02 = j2;
        this.A07 = z;
        this.A06 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3X) {
                N3X n3x = (N3X) obj;
                if (!(this.A01 == n3x.A01 && 0qQ.A0K(this.A05, n3x.A05) && this.A03 == n3x.A03 && 0qQ.A0K(this.A04, n3x.A04) && this.A00 == n3x.A00 && this.A02 == n3x.A02 && this.A07 == n3x.A07 && this.A06 == n3x.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, this.A01 * 31);
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A01(this.A02, (((AnonymousClass7TF.A01(this.A03, A08) + AnonymousClass7TG.A0E(this.A04)) * 31) + this.A00) * 31)));
    }

    public final String toString() {
        C66726MbX A002 = C66725MbW.A00(this);
        A002.A02(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A01);
        A002.A01(this.A05, "userId");
        A002.A03("participantUserId", this.A03);
        A002.A01(this.A04, "deviceName");
        A002.A02("deviceChangeType", this.A00);
        A002.A03("deviceChangeTimestampMs", this.A02);
        A002.A04("shouldDisplayDeviceChangeAdminMessage", this.A07);
        A002.A04("isInteropParticipant", this.A06);
        return DbT.A10(A002);
    }
}
