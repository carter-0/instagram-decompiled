package X;

import java.util.List;

/* renamed from: X.RKc  reason: case insensitive filesystem */
public final class C8986RKc extends Exception {
    public final List A00;

    public final String getMessage() {
        return 002.A0R("Failed to get cross app signature for: ", C66581MXm.A0w(", ", this.A00));
    }

    public C8986RKc(List list) {
        this.A00 = list;
    }
}
