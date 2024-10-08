package X;

import kotlin.Deprecated;

@Deprecated(message = "Please use GenericXmaContentViewModel#NavigationFields instead.")
public final class CHQ extends C44046CTp {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CHQ) {
                CHQ chq = (CHQ) obj;
                if (!0qQ.A0K(this.A01, chq.A01) || this.A00 != chq.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }

    public CHQ(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
