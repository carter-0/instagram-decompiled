package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N64 extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public N64(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        C51973G9u.A0r(1, str, str2, str3);
        this.A08 = str;
        this.A02 = imageUrl;
        this.A01 = imageUrl2;
        this.A07 = str2;
        this.A04 = str3;
        this.A0A = z;
        this.A09 = z2;
        this.A03 = num;
        this.A00 = i;
        this.A05 = str4;
        this.A06 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N64) {
                N64 n64 = (N64) obj;
                if (!0qQ.A0K(this.A08, n64.A08) || !0qQ.A0K(this.A02, n64.A02) || !0qQ.A0K(this.A01, n64.A01) || !0qQ.A0K(this.A07, n64.A07) || !0qQ.A0K(this.A04, n64.A04) || this.A0A != n64.A0A || this.A09 != n64.A09 || !0qQ.A0K(this.A03, n64.A03) || this.A00 != n64.A00 || !0qQ.A0K(this.A05, n64.A05) || !0qQ.A0K(this.A06, n64.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A07, (((AnonymousClass7TE.A0O(this.A08) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31)))) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ChannelDiscoveryInvitesRowViewModel(threadTitle=");
        A1A.append(this.A08);
        A1A.append(", imageUrl=");
        A1A.append(this.A02);
        A1A.append(", backgroundImageUrl=");
        A1A.append(this.A01);
        A1A.append(", threadId=");
        A1A.append(this.A07);
        A1A.append(", creatorUsername=");
        A1A.append(this.A04);
        A1A.append(", showVerifiedBadge=");
        A1A.append(this.A0A);
        A1A.append(", showUnreadBadge=");
        A1A.append(this.A09);
        A1A.append(", threadSubtype=");
        A1A.append(this.A03);
        A1A.append(", position=");
        A1A.append(this.A00);
        A1A.append(", inviteLink=");
        A1A.append(this.A05);
        A1A.append(", scInviteId=");
        return C51975G9x.A0i(this.A06, A1A);
    }
}
