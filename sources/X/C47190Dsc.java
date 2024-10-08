package X;

import java.util.List;

/* renamed from: X.Dsc  reason: case insensitive filesystem */
public final class C47190Dsc extends AnonymousClass0T0 implements MW6 {
    public final Boolean A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47190Dsc) {
                C47190Dsc dsc = (C47190Dsc) obj;
                if (!0qQ.A0K(this.A01, dsc.A01) || !0qQ.A0K(this.A02, dsc.A02) || !0qQ.A0K(this.A03, dsc.A03) || !0qQ.A0K(this.A00, dsc.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01))) + AnonymousClass7TG.A0C(this.A00);
    }

    public C47190Dsc(Boolean bool, List list, List list2, List list3) {
        AnonymousClass7TG.A1U(list, list2, list3);
        this.A01 = list;
        this.A02 = list2;
        this.A03 = list3;
        this.A00 = bool;
    }
}
