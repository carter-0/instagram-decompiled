package X;

import java.util.List;

/* renamed from: X.Jv1  reason: case insensitive filesystem */
public final class C61004Jv1 extends AnonymousClass0T0 {
    public static final C61004Jv1 A04;
    public final JV7 A00;
    public final C62763Km1 A01;
    public final List A02;
    public final List A03;

    static {
        C61798KMm kMm = C61798KMm.A00;
        0sn r1 = 0sn.A00;
        A04 = new C61004Jv1((JV7) null, kMm, r1, r1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61004Jv1) {
                C61004Jv1 jv1 = (C61004Jv1) obj;
                if (!0qQ.A0K(this.A01, jv1.A01) || !0qQ.A0K(this.A02, jv1.A02) || !0qQ.A0K(this.A00, jv1.A00) || !0qQ.A0K(this.A03, jv1.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        return AnonymousClass7TE.A0N(this.A03, (AnonymousClass7TF.A07(this.A02, A0K) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public C61004Jv1(JV7 jv7, C62763Km1 km1, List list, List list2) {
        AnonymousClass7TG.A1O(km1, list);
        this.A01 = km1;
        this.A02 = list;
        this.A00 = jv7;
        this.A03 = list2;
    }
}
