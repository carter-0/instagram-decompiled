package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.OVz  reason: case insensitive filesystem */
public final class C71002OVz {
    public static final C71002OVz A03 = new C71002OVz("", AnonymousClass7TE.A1C());
    public final String A00;
    public final String A01 = AnonymousClass7TF.A0b();
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C71002OVz oVz = (C71002OVz) obj;
            if (!2PP.A00(oVz.A00, this.A00) || !2PP.A00(oVz.A02, this.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00});
    }

    public C71002OVz(String str, List list) {
        this.A00 = str;
        this.A02 = list;
    }
}
