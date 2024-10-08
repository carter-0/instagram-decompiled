package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.ULa  reason: case insensitive filesystem */
public final class C15047ULa extends AnonymousClass0T0 {
    public Object A00;
    public final int A01 = 0;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C15047ULa(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A08 = str7;
        this.A00 = null;
    }

    public final C14928UFp A00() {
        0bb r2 = new 0bb();
        r2.A06("checkout_session_id", this.A02);
        r2.A05("global_bag_id", C51972G9s.A0j(this.A04));
        r2.A06("global_bag_entry_point", this.A03);
        r2.A06("global_bag_prior_module", this.A05);
        r2.A05("merchant_bag_id", C51972G9s.A0i(this.A07));
        r2.A06("merchant_bag_entry_point", this.A06);
        r2.A06("merchant_bag_prior_module", this.A08);
        r2.A07("merchant_bag_ids", (List) this.A00);
        return r2;
    }

    public final boolean equals(Object obj) {
        C15047ULa uLa;
        String str;
        String str2;
        if (this.A01 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15047ULa)) {
                return false;
            }
            uLa = (C15047ULa) obj;
            if (uLa.A01 != 1 || !0qQ.A0K(this.A02, uLa.A02) || !0qQ.A0K(this.A04, uLa.A04) || !0qQ.A0K(this.A03, uLa.A03) || !0qQ.A0K(this.A05, uLa.A05) || !0qQ.A0K(this.A07, uLa.A07) || !0qQ.A0K(this.A06, uLa.A06)) {
                return false;
            }
            str = this.A08;
            str2 = uLa.A08;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C15047ULa)) {
                return false;
            }
            uLa = (C15047ULa) obj;
            if (uLa.A01 != 0 || !0qQ.A0K(this.A05, uLa.A05) || !0qQ.A0K(this.A03, uLa.A03) || !0qQ.A0K(this.A07, uLa.A07) || !0qQ.A0K(this.A02, uLa.A02) || !0qQ.A0K(this.A08, uLa.A08) || !0qQ.A0K(this.A06, uLa.A06)) {
                return false;
            }
            str = this.A04;
            str2 = uLa.A04;
        }
        if (!0qQ.A0K(str, str2) || !0qQ.A0K(this.A00, uLa.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012;
        if (this.A01 != 0) {
            A012 = (((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A08);
        } else {
            int A082 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A05));
            A012 = C41845B3m.A01(this.A04, AnonymousClass7TF.A08(this.A06, (((AnonymousClass7TF.A08(this.A07, A082) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31));
        }
        return (A012 * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C15047ULa(Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A05 = str;
        this.A03 = str2;
        this.A07 = str3;
        this.A02 = str4;
        this.A08 = str5;
        this.A06 = str6;
        this.A04 = str7;
        this.A00 = bundle;
    }
}
