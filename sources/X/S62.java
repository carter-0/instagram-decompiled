package X;

import com.google.common.collect.ImmutableList;

public final class S62 {
    public final C13883Tj6 A00;
    public final ImmutableList A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S62) {
                S62 s62 = (S62) obj;
                if (!0qQ.A0K(this.A00, s62.A00) || this.A02 != s62.A02 || !0qQ.A0K(this.A01, s62.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public S62(C13883Tj6 tj6, ImmutableList immutableList, boolean z) {
        this.A00 = tj6;
        this.A02 = z;
        this.A01 = immutableList;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A07(this.A00, 38161)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TitleBarInfo(isVisible=");
        A1A.append(true);
        A1A.append(", title=");
        A1A.append(this.A00);
        A1A.append(", isMainScreen=");
        A1A.append(this.A02);
        A1A.append(", rightActions=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
