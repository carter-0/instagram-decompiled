package X;

import java.util.List;

/* renamed from: X.RKa  reason: case insensitive filesystem */
public final class C8984RKa extends Exception {
    public final List A00;

    public final String getMessage() {
        return DbT.A0z(", ", this.A00, TXT.A00);
    }

    public C8984RKa(List list) {
        this.A00 = list;
    }
}
