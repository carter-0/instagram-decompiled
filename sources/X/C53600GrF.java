package X;

import java.util.List;

/* renamed from: X.GrF  reason: case insensitive filesystem */
public final class C53600GrF extends AnonymousClass0T0 implements JNI {
    public final String A00;
    public final List A01;
    public final List A02;

    public C53600GrF(List list, List list2, String str) {
        0qQ.A0B(str, 3);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53600GrF) {
                C53600GrF grF = (C53600GrF) obj;
                if (!0qQ.A0K(this.A02, grF.A02) || !0qQ.A0K(this.A01, grF.A01) || !0qQ.A0K(this.A00, grF.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)));
    }
}
