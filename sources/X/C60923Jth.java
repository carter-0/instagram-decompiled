package X;

import java.util.List;

/* renamed from: X.Jth  reason: case insensitive filesystem */
public final class C60923Jth extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60923Jth) {
                C60923Jth jth = (C60923Jth) obj;
                if (!0qQ.A0K(this.A00, jth.A00) || !0qQ.A0K(this.A03, jth.A03) || !0qQ.A0K(this.A01, jth.A01) || this.A02 != jth.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TG.A0E(this.A00) * 31)));
    }

    public C60923Jth(String str, List list, List list2, boolean z) {
        AnonymousClass7TG.A1Q(list, list2);
        this.A00 = str;
        this.A03 = list;
        this.A01 = list2;
        this.A02 = z;
    }
}
