package X;

import java.util.List;

public final class S6I {
    public final QXR A00;
    public final C11007S5b A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6I) {
                S6I s6i = (S6I) obj;
                if (!0qQ.A0K(this.A03, s6i.A03) || !0qQ.A0K(this.A00, s6i.A00) || !0qQ.A0K(this.A02, s6i.A02) || !0qQ.A0K(this.A01, s6i.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A03)) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public S6I(QXR qxr, C11007S5b s5b, String str, List list) {
        this.A03 = list;
        this.A00 = qxr;
        this.A02 = str;
        this.A01 = s5b;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FBPayEmailsComponent(emails=");
        A1A.append(this.A03);
        A1A.append(", emailFormFieldConfig=");
        A1A.append(this.A00);
        A1A.append(", addedEmailId=");
        A1A.append(this.A02);
        A1A.append(", updatedEmailIdParams=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
