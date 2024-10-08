package X;

import java.io.IOException;

/* renamed from: X.RCi  reason: case insensitive filesystem */
public class C8842RCi extends IOException {
    public C13957TmK A00 = null;

    public static C8842RCi A03() {
        return new C8842RCi(C273654mx.A00(6));
    }

    public final void A06(C13957TmK tmK) {
        this.A00 = tmK;
    }

    public static C8591QxT A00() {
        return new C8591QxT();
    }

    public static C8842RCi A01() {
        return new C8842RCi("Protocol message contained an invalid tag (zero).");
    }

    public static C8842RCi A02() {
        return new C8842RCi("Protocol message had invalid UTF-8.");
    }

    public static C8842RCi A04() {
        return new C8842RCi("Failed to parse the message.");
    }

    public static C8842RCi A05() {
        return new C8842RCi(C273654mx.A00(13));
    }

    public C8842RCi(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public C8842RCi(String str) {
        super(str);
    }
}
