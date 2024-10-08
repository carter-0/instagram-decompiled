package X;

import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.7bo  reason: invalid class name and case insensitive filesystem */
public final class C334747bo extends AnonymousClass0T0 implements C334127ai {
    public final User A00;
    public final C14068TpH A01;
    public final C16677UzD A02;
    public final C74489Pvj A03;
    public final G87 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final JSONObject A09;
    public final boolean A0A;
    public final boolean A0B;

    public C334747bo(User user, C14068TpH tpH, C16677UzD uzD, C74489Pvj pvj, G87 g87, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z, boolean z2) {
        0qQ.A0B(str4, 6);
        this.A01 = tpH;
        this.A02 = uzD;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A00 = user;
        this.A03 = pvj;
        this.A04 = g87;
        this.A0A = z;
        this.A09 = jSONObject;
        this.A0B = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334747bo) {
                C334747bo r5 = (C334747bo) obj;
                if (this.A01 != r5.A01 || this.A02 != r5.A02 || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || this.A0A != r5.A0A || !0qQ.A0K(this.A09, r5.A09) || this.A0B != r5.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str = this.A07;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((((hashCode2 + hashCode) * 31) + this.A08.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int hashCode4 = (((hashCode3 + i) * 31) + this.A09.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0B) {
            i2 = 1231;
        }
        return hashCode4 + i2;
    }
}
