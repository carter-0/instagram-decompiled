package X;

public final class N65 extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final int A01;
    public final C69374NkE A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N65) {
                N65 n65 = (N65) obj;
                if (!0qQ.A0K(this.A08, n65.A08) || !0qQ.A0K(this.A0A, n65.A0A) || !0qQ.A0K(this.A05, n65.A05) || !0qQ.A0K(this.A07, n65.A07) || !0qQ.A0K(this.A04, n65.A04) || !0qQ.A0K(this.A06, n65.A06) || this.A00 != n65.A00 || this.A09 != n65.A09 || !0qQ.A0K(this.A03, n65.A03) || this.A02 != n65.A02 || this.A01 != n65.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TE.A0O(this.A08))));
        boolean z = this.A09;
        return AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A08(this.A04, A082) + AnonymousClass7TG.A0E(this.A06)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31) + this.A01;
    }

    public N65(C69374NkE nkE, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        C51972G9s.A1B(str, str4);
        this.A08 = str;
        this.A0A = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A04 = str5;
        this.A06 = str6;
        this.A00 = i;
        this.A09 = z;
        this.A03 = num;
        this.A02 = nkE;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ChannelDiscoverySuggestionsRowViewModel(threadTitle=");
        A1A.append(this.A08);
        A1A.append(", subtitle=");
        A1A.append(this.A0A);
        A1A.append(", imageUrl=");
        A1A.append(this.A05);
        A1A.append(", threadId=");
        A1A.append(this.A07);
        A1A.append(", creatorUsername=");
        A1A.append(this.A04);
        A1A.append(", socialContextUsername=");
        A1A.append(this.A06);
        A1A.append(", memberCount=");
        A1A.append(this.A00);
        A1A.append(", showVerifiedBadge=");
        A1A.append(this.A09);
        A1A.append(", threadSubtype=");
        A1A.append(this.A03);
        A1A.append(", searchSurface=");
        A1A.append(this.A02);
        A1A.append(", position=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
