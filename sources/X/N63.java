package X;

public final class N63 extends AnonymousClass0T0 implements C232262tL {
    public boolean A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N63) {
                N63 n63 = (N63) obj;
                if (!0qQ.A0K(this.A07, n63.A07) || !0qQ.A0K(this.A05, n63.A05) || !0qQ.A0K(this.A04, n63.A04) || !0qQ.A0K(this.A06, n63.A06) || this.A01 != n63.A01 || !0qQ.A0K(this.A03, n63.A03) || this.A08 != n63.A08 || this.A00 != n63.A00 || this.A02 != n63.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A07)));
        int A09 = AnonymousClass7TF.A09(this.A00, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A08(this.A03, (AnonymousClass7TF.A08(this.A06, A082) + this.A01) * 31)));
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "INVITED_SECTION";
        }
        return A09 + C51966G9m.A04(str, intValue);
    }

    public N63(Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        this.A07 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A01 = i;
        this.A03 = str5;
        this.A08 = z;
        this.A00 = z2;
        this.A02 = num;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BroadcastChannelActivityV2RowViewModel(threadTitle=");
        A1A.append(this.A07);
        A1A.append(", subtitle=");
        A1A.append(this.A05);
        A1A.append(", imageUrl=");
        A1A.append(this.A04);
        A1A.append(", threadId=");
        A1A.append(this.A06);
        A1A.append(C273654mx.A00(437));
        A1A.append(this.A01);
        A1A.append(", creatorUsername=");
        A1A.append(this.A03);
        A1A.append(", showVerifiedBadge=");
        A1A.append(this.A08);
        A1A.append(", isUnread=");
        A1A.append(this.A00);
        A1A.append(", style=");
        Integer num = this.A02;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "DEFAULT";
        } else {
            str = "INVITED_SECTION";
        }
        return C51975G9x.A0i(str, A1A);
    }
}
