package X;

import com.google.gson.annotations.SerializedName;

/* renamed from: X.S6f  reason: case insensitive filesystem */
public final class C11027S6f {
    @SerializedName("auth_factor_type")
    public final String A00;
    @SerializedName("connect_url")
    public final String A01;
    @SerializedName("cred_id")
    public final String A02;
    @SerializedName("hidden_email")
    public final String A03;
    @SerializedName("nonce")
    public final String A04;
    @SerializedName("three_ds_url")
    public final String A05;
    @SerializedName("title")
    public final String A06;
    @SerializedName("auth_amount")
    public final C45888D9m A07;
    @SerializedName("billing_agreement_type")
    public final String A08;
    @SerializedName("email")
    public final String A09;

    public C11027S6f(C45888D9m d9m, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        0qQ.A0B(str6, 6);
        this.A01 = str;
        this.A02 = str2;
        this.A09 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A00 = str6;
        this.A08 = str7;
        this.A04 = str8;
        this.A05 = str9;
        this.A07 = d9m;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11027S6f) {
                C11027S6f s6f = (C11027S6f) obj;
                if (!0qQ.A0K(this.A01, s6f.A01) || !0qQ.A0K(this.A02, s6f.A02) || !0qQ.A0K(this.A09, s6f.A09) || !0qQ.A0K(this.A03, s6f.A03) || !0qQ.A0K(this.A06, s6f.A06) || !0qQ.A0K(this.A00, s6f.A00) || !0qQ.A0K(this.A08, s6f.A08) || !0qQ.A0K(this.A04, s6f.A04) || !0qQ.A0K(this.A05, s6f.A05) || !0qQ.A0K(this.A07, s6f.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.A00, ((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A07);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AuthFactor(connectUrl=");
        A1A.append(this.A01);
        A1A.append(", credId=");
        A1A.append(this.A02);
        A1A.append(", email=");
        A1A.append(this.A09);
        A1A.append(", hiddenEmail=");
        A1A.append(this.A03);
        A1A.append(", title=");
        A1A.append(this.A06);
        A1A.append(", authFactorType=");
        A1A.append(this.A00);
        A1A.append(", billingAgreementType=");
        A1A.append(this.A08);
        A1A.append(", nonce=");
        A1A.append(this.A04);
        A1A.append(", three_ds_url=");
        A1A.append(this.A05);
        A1A.append(", authAmount=");
        return AnonymousClass7TG.A0n(this.A07, A1A);
    }
}
