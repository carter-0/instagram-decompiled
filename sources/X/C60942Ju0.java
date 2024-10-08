package X;

import java.util.List;

/* renamed from: X.Ju0  reason: case insensitive filesystem */
public final class C60942Ju0 extends AnonymousClass0T0 {
    public final C60924Jti A00;
    public final Long A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60942Ju0) {
                C60942Ju0 ju0 = (C60942Ju0) obj;
                if (!0qQ.A0K(this.A01, ju0.A01) || !0qQ.A0K(this.A02, ju0.A02) || !0qQ.A0K(this.A03, ju0.A03) || this.A04 != ju0.A04 || this.A05 != ju0.A05 || !0qQ.A0K(this.A00, ju0.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TG.A0C(this.A01) * 31)))) + AnonymousClass7TE.A0L(this.A00);
    }

    public C60942Ju0(C60924Jti jti, Long l, List list, List list2, boolean z, boolean z2) {
        AnonymousClass7TG.A1Q(list, list2);
        this.A01 = l;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = jti;
    }
}
