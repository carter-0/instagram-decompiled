package X;

import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Jyx  reason: case insensitive filesystem */
public final class C61204Jyx extends AnonymousClass0T0 implements MQX {
    public final User A00;
    public final C14068TpH A01;
    public final C16677UzD A02;
    public final C74489Pvj A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final JSONObject A08;

    public C61204Jyx(User user, C14068TpH tpH, C16677UzD uzD, C74489Pvj pvj, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        0qQ.A0B(str4, 6);
        this.A01 = tpH;
        this.A02 = uzD;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = user;
        this.A03 = pvj;
        this.A08 = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61204Jyx) {
                C61204Jyx jyx = (C61204Jyx) obj;
                if (this.A01 != jyx.A01 || this.A02 != jyx.A02 || !0qQ.A0K(this.A05, jyx.A05) || !0qQ.A0K(this.A04, jyx.A04) || !0qQ.A0K(this.A06, jyx.A06) || !0qQ.A0K(this.A07, jyx.A07) || !0qQ.A0K(this.A00, jyx.A00) || !0qQ.A0K(this.A03, jyx.A03) || !0qQ.A0K(this.A08, jyx.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)));
        return AnonymousClass7TE.A0N(this.A08, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A07, (AnonymousClass7TF.A08(this.A04, A082) + AnonymousClass7TG.A0E(this.A06)) * 31))));
    }
}
