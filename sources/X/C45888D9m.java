package X;

import com.google.gson.annotations.SerializedName;

/* renamed from: X.D9m  reason: case insensitive filesystem */
public final class C45888D9m {
    @SerializedName("amount")
    public final String A00;
    @SerializedName("currency")
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45888D9m) {
                C45888D9m d9m = (C45888D9m) obj;
                if (!0qQ.A0K(this.A01, d9m.A01) || !0qQ.A0K(this.A00, d9m.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("AuthAmount(currency=", this.A01, AnonymousClass000.A00(1996), this.A00, ')');
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00);
    }

    public C45888D9m(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public C45888D9m() {
        this((String) null, (String) null);
    }
}
