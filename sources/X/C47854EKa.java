package X;

import java.util.List;

/* renamed from: X.EKa  reason: case insensitive filesystem */
public final class C47854EKa extends C48175EaH {
    public final C266444Yx A00;
    public final C266444Yx A01;
    public final List A02;
    public final boolean A03;

    public C47854EKa(C266444Yx r2, C266444Yx r3, List list, boolean z) {
        0qQ.A0B(list, 4);
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = z;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47854EKa) {
                C47854EKa eKa = (C47854EKa) obj;
                if (!0qQ.A0K(this.A01, eKa.A01) || !0qQ.A0K(this.A00, eKa.A00) || this.A03 != eKa.A03 || !0qQ.A0K(this.A02, eKa.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01))));
    }
}
