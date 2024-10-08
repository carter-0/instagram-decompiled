package X;

import org.json.JSONObject;

/* renamed from: X.N2i  reason: case insensitive filesystem */
public final class C68142N2i extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final JSONObject A02;
    public final JSONObject A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68142N2i) {
                C68142N2i n2i = (C68142N2i) obj;
                if (!0qQ.A0K(this.A03, n2i.A03) || !0qQ.A0K(this.A00, n2i.A00) || !0qQ.A0K(this.A02, n2i.A02) || !0qQ.A0K(this.A01, n2i.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0K(this.A03)) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A01);
    }

    public C68142N2i(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.A03 = jSONObject;
        this.A00 = str;
        this.A02 = jSONObject2;
        this.A01 = str2;
    }
}
