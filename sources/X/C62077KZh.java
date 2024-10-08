package X;

import java.util.List;

/* renamed from: X.KZh  reason: case insensitive filesystem */
public final class C62077KZh extends C62862Knc {
    public final List A00;
    public final boolean A01;
    public final C62866Kng A02;

    public C62077KZh(C62866Kng kng, List list, boolean z) {
        0qQ.A0B(kng, 2);
        this.A00 = list;
        this.A02 = kng;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62077KZh) {
                C62077KZh kZh = (C62077KZh) obj;
                if (!0qQ.A0K(this.A00, kZh.A00) || !0qQ.A0K(this.A02, kZh.A02) || this.A01 != kZh.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }
}
