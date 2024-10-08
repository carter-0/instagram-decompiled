package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N9F extends AnonymousClass0T0 implements C74269Prx {
    public final C74562PxB A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public N9F(C74562PxB pxB, ImageUrl imageUrl, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 3);
        this.A07 = z;
        this.A01 = imageUrl;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A06 = z2;
        this.A00 = pxB;
        this.A08 = z3;
        this.A05 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9F) {
                N9F n9f = (N9F) obj;
                if (this.A07 != n9f.A07 || !0qQ.A0K(this.A01, n9f.A01) || !0qQ.A0K(this.A03, n9f.A03) || !0qQ.A0K(this.A02, n9f.A02) || !0qQ.A0K(this.A04, n9f.A04) || this.A06 != n9f.A06 || !0qQ.A0K(this.A00, n9f.A00) || this.A08 != n9f.A08 || !0qQ.A0K(this.A05, n9f.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A01, C51965G9l.A05(this.A07));
        boolean z = this.A06;
        return AnonymousClass7TF.A09(this.A08, (G9w.A01(AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A08(this.A03, A072) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31)) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A05);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallIncomingModel(isCallIncoming=");
        A1A.append(this.A07);
        A1A.append(", callerAvatarUrl=");
        A1A.append(this.A01);
        A1A.append(", callerName=");
        A1A.append(this.A03);
        A1A.append(", callTarget=");
        A1A.append(this.A02);
        A1A.append(", igThreadId=");
        A1A.append(this.A04);
        A1A.append(", isAudioCall=");
        A1A.append(this.A06);
        C51975G9x.A1G(A1A, ", isRoomRing=");
        A1A.append(", trace=");
        A1A.append(this.A00);
        A1A.append(", isE2EE=");
        A1A.append(this.A08);
        A1A.append(", localCallId=");
        return C51975G9x.A0i(this.A05, A1A);
    }
}
