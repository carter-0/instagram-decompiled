package X;

import java.util.List;

/* renamed from: X.JzJ  reason: case insensitive filesystem */
public final class C61225JzJ extends AnonymousClass0T0 implements C66412MQs {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public C61225JzJ(String str, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = str;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61225JzJ) {
                C61225JzJ jzJ = (C61225JzJ) obj;
                if (!0qQ.A0K(this.A01, jzJ.A01) || this.A02 != jzJ.A02 || !0qQ.A0K(this.A00, jzJ.A00) || this.A03 != jzJ.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        return DbS.A06(this.A03, (AnonymousClass7TF.A09(this.A02, A0K) + AnonymousClass7TG.A0E(this.A00)) * 31);
    }
}
