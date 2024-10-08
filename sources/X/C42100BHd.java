package X;

import java.util.List;

/* renamed from: X.BHd  reason: case insensitive filesystem */
public final class C42100BHd extends AnonymousClass0T0 implements DSC {
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final C42100BHd FC5(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42100BHd) {
                C42100BHd bHd = (C42100BHd) obj;
                if (!0qQ.A0K(this.A00, bHd.A00) || !0qQ.A0K(this.A02, bHd.A02) || !0qQ.A0K(this.A03, bHd.A03) || !0qQ.A0K(this.A04, bHd.A04) || !0qQ.A0K(this.A01, bHd.A01) || !0qQ.A0K(this.A07, bHd.A07) || !0qQ.A0K(this.A05, bHd.A05) || !0qQ.A0K(this.A06, bHd.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public C42100BHd(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, List list) {
        this.A00 = bool;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = bool2;
        this.A07 = list;
        this.A05 = str4;
        this.A06 = str5;
    }

    public final DSC E9G(1E9 r1) {
        return this;
    }
}
