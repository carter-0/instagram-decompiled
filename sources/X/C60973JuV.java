package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.JuV  reason: case insensitive filesystem */
public final class C60973JuV extends AnonymousClass0T0 {
    public final IGAIAgentType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60973JuV) {
                C60973JuV juV = (C60973JuV) obj;
                if (!0qQ.A0K(this.A06, juV.A06) || !0qQ.A0K(this.A07, juV.A07) || !0qQ.A0K(this.A05, juV.A05) || !0qQ.A0K(this.A08, juV.A08) || !0qQ.A0K(this.A01, juV.A01) || this.A0B != juV.A0B || this.A0A != juV.A0A || !0qQ.A0K(this.A03, juV.A03) || !0qQ.A0K(this.A02, juV.A02) || this.A00 != juV.A00 || !0qQ.A0K(this.A09, juV.A09) || !0qQ.A0K(this.A04, juV.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A06));
        return ((((((((AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A08(this.A01, (AnonymousClass7TF.A08(this.A05, A082) + AnonymousClass7TG.A0E(this.A08)) * 31))) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + C41845B3m.A00(this.A04);
    }

    public C60973JuV(IGAIAgentType iGAIAgentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A01 = str5;
        this.A0B = z;
        this.A0A = z2;
        this.A03 = str6;
        this.A02 = str7;
        this.A00 = iGAIAgentType;
        this.A09 = str8;
        this.A04 = str9;
    }
}
