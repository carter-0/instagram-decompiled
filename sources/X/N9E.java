package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N9E extends AnonymousClass0T0 implements C74269Prx {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9E) {
                N9E n9e = (N9E) obj;
                if (!0qQ.A0K(this.A02, n9e.A02) || !0qQ.A0K(this.A03, n9e.A03) || !0qQ.A0K(this.A01, n9e.A01) || this.A04 != n9e.A04 || this.A07 != n9e.A07 || !0qQ.A0K(this.A00, n9e.A00) || this.A05 != n9e.A05 || this.A06 != n9e.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02))))))));
    }

    public N9E(ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(imageUrl, 6);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
        this.A07 = z2;
        this.A00 = imageUrl;
        this.A05 = z3;
        this.A06 = z4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallParticipant(userId=");
        A1A.append(this.A02);
        A1A.append(", username=");
        A1A.append(this.A03);
        A1A.append(", displayName=");
        A1A.append(this.A01);
        A1A.append(", isAudioOn=");
        A1A.append(this.A04);
        A1A.append(", isVideoOn=");
        A1A.append(this.A07);
        A1A.append(", avatarUrl=");
        A1A.append(this.A00);
        A1A.append(", isDominantSpeaker=");
        A1A.append(this.A05);
        A1A.append(", isSharingScreen=");
        return G9t.A1C(A1A, this.A06);
    }
}
