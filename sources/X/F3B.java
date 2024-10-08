package X;

import java.util.List;

public final class F3B {
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.phonenumber.model.CountryCodeGuess");
        F3B f3b = (F3B) obj;
        if (this == obj) {
            return true;
        }
        if (!DbY.A1b(this, obj)) {
            return false;
        }
        return 0qQ.A0K(this.A00, f3b.A00);
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
