package X;

import java.util.List;

/* renamed from: X.Jz5  reason: case insensitive filesystem */
public final class C61212Jz5 extends AnonymousClass0T0 implements C66546MWa {
    public final C60912JtW A00;
    public final C60903JtN A01;
    public final C60919Jtd A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61212Jz5) {
                C61212Jz5 jz5 = (C61212Jz5) obj;
                if (!0qQ.A0K(this.A03, jz5.A03) || !0qQ.A0K(this.A01, jz5.A01) || !0qQ.A0K(this.A00, jz5.A00) || !0qQ.A0K(this.A02, jz5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C61212Jz5(C60912JtW jtW, C60903JtN jtN, C60919Jtd jtd, List list) {
        this.A03 = list;
        this.A01 = jtN;
        this.A00 = jtW;
        this.A02 = jtd;
    }
}
