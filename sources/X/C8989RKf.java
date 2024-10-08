package X;

import java.util.Map;

/* renamed from: X.RKf  reason: case insensitive filesystem */
public final class C8989RKf extends Exception {
    public final int A00;
    public final long A01;
    public final Exception A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8989RKf(Exception exc, String str, Map map, int i, long j, boolean z) {
        super(str, exc);
        0qQ.A0B(str, 1);
        0qQ.A0B(map, 8);
        this.A03 = str;
        this.A01 = j;
        this.A05 = z;
        this.A02 = exc;
        this.A00 = i;
        this.A04 = map;
    }

    public final String getMessage() {
        String str;
        String str2;
        String str3 = this.A03;
        if (this.A05) {
            str = " (Cancellation), ";
        } else {
            str = ", ";
        }
        Exception exc = this.A02;
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = "None";
        }
        return 002.A11("Failure Reason: ", str3, str, "InnerException: ", str2);
    }
}
