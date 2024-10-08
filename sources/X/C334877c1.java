package X;

import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.7c1  reason: invalid class name and case insensitive filesystem */
public final class C334877c1 extends AnonymousClass0T0 implements C334127ai {
    public final User A00;
    public final G87 A01;
    public final String A02;
    public final String A03;
    public final JSONObject A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334877c1) {
                C334877c1 r5 = (C334877c1) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        String str = this.A03;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode();
    }

    public C334877c1(User user, G87 g87, String str, String str2, JSONObject jSONObject) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = user;
        this.A01 = g87;
        this.A04 = jSONObject;
    }
}
