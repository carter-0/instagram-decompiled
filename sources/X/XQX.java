package X;

import java.io.IOException;

public class XQX extends IOException {
    public final int A00;
    public final boolean A01;

    public XQX(String str, Throwable th, int i, boolean z) {
        super(str, th);
        this.A01 = z;
        this.A00 = i;
    }

    public final String getMessage() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.getMessage());
        A1A.append("{contentIsMalformed=");
        A1A.append(this.A01);
        A1A.append(", dataType=");
        return C21056XCh.A0A(A1A, this.A00);
    }
}
