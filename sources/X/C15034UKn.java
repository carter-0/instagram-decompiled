package X;

import com.instagram.api.schemas.LeadGenEntryPoint;

/* renamed from: X.UKn  reason: case insensitive filesystem */
public final class C15034UKn extends AnonymousClass0T0 {
    public final LeadGenEntryPoint A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15034UKn) {
                C15034UKn uKn = (C15034UKn) obj;
                if (!0qQ.A0K(this.A09, uKn.A09) || !0qQ.A0K(this.A02, uKn.A02) || !0qQ.A0K(this.A05, uKn.A05) || !0qQ.A0K(this.A06, uKn.A06) || !0qQ.A0K(this.A01, uKn.A01) || !0qQ.A0K(this.A07, uKn.A07) || !0qQ.A0K(this.A03, uKn.A03) || this.A00 != uKn.A00 || this.A08 != uKn.A08 || !0qQ.A0K(this.A04, uKn.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A09))));
        return AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A00, (((AnonymousClass7TF.A08(this.A01, A082) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31)) + C41845B3m.A00(this.A04);
    }

    public C15034UKn(LeadGenEntryPoint leadGenEntryPoint, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(leadGenEntryPoint, 8);
        this.A09 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = str5;
        this.A07 = str6;
        this.A03 = str7;
        this.A00 = leadGenEntryPoint;
        this.A08 = z;
        this.A04 = str8;
    }
}
