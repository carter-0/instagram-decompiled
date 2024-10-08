package X;

import java.util.List;

/* renamed from: X.BFy  reason: case insensitive filesystem */
public final class C42070BFy extends AnonymousClass0T0 implements DRN {
    public final List A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42070BFy) {
                C42070BFy bFy = (C42070BFy) obj;
                if (!0qQ.A0K(this.A00, bFy.A00) || !0qQ.A0K(this.A01, bFy.A01) || !0qQ.A0K(this.A03, bFy.A03) || !0qQ.A0K(this.A02, bFy.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C42070BFy(Boolean bool, Integer num, String str, List list) {
        this.A00 = list;
        this.A01 = bool;
        this.A03 = str;
        this.A02 = num;
    }
}
