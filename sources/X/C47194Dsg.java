package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;

/* renamed from: X.Dsg  reason: case insensitive filesystem */
public final class C47194Dsg extends AnonymousClass0T0 implements G8T {
    public final String A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final IGCreatorIncentiveProgram A06;
    public final DRL A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public C47194Dsg(IGCreatorIncentiveProgram iGCreatorIncentiveProgram, DRL drl, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2) {
        0qQ.A0B(str, 3);
        AnonymousClass7TG.A1R(str2, str3);
        AnonymousClass7TF.A1E(str4, 6, iGCreatorIncentiveProgram);
        0qQ.A0B(str5, 8);
        this.A03 = i;
        this.A04 = i2;
        this.A00 = str;
        this.A08 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A06 = iGCreatorIncentiveProgram;
        this.A09 = str5;
        this.A0A = z;
        this.A0B = z2;
        this.A07 = drl;
        this.A05 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47194Dsg) {
                C47194Dsg dsg = (C47194Dsg) obj;
                if (this.A03 != dsg.A03 || this.A04 != dsg.A04 || !0qQ.A0K(this.A00, dsg.A00) || !0qQ.A0K(this.A08, dsg.A08) || !0qQ.A0K(this.A01, dsg.A01) || !0qQ.A0K(this.A02, dsg.A02) || this.A06 != dsg.A06 || !0qQ.A0K(this.A09, dsg.A09) || this.A0A != dsg.A0A || this.A0B != dsg.A0B || !0qQ.A0K(this.A07, dsg.A07) || this.A05 != dsg.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A00, ((this.A03 * 31) + this.A04) * 31)))))))) + AnonymousClass7TG.A0C(this.A07)) * 31) + this.A05;
    }
}
