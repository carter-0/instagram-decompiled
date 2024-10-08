package X;

import java.util.List;

/* renamed from: X.DrO  reason: case insensitive filesystem */
public final class C47147DrO extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C47147DrO(String str, List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = str;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47147DrO) {
                C47147DrO drO = (C47147DrO) obj;
                if (!0qQ.A0K(this.A01, drO.A01) || !0qQ.A0K(this.A00, drO.A00) || this.A02 != drO.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A00)) * 31);
    }
}
