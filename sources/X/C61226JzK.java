package X;

import java.util.List;

/* renamed from: X.JzK  reason: case insensitive filesystem */
public final class C61226JzK extends AnonymousClass0T0 implements C66412MQs {
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61226JzK) {
                C61226JzK jzK = (C61226JzK) obj;
                if (!0qQ.A0K(this.A02, jzK.A02) || this.A03 != jzK.A03 || !0qQ.A0K(this.A01, jzK.A01) || !0qQ.A0K(this.A00, jzK.A00) || this.A04 != jzK.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A02);
        return DbS.A06(this.A04, AnonymousClass7TF.A08(this.A00, (AnonymousClass7TF.A09(this.A03, A0K) + AnonymousClass7TG.A0E(this.A01)) * 31));
    }

    public C61226JzK(String str, String str2, List list, boolean z, boolean z2) {
        this.A02 = list;
        this.A03 = z;
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z2;
    }
}
