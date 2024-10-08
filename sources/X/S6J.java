package X;

import java.util.List;

public final class S6J {
    public final QXR A00;
    public final C11007S5b A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6J) {
                S6J s6j = (S6J) obj;
                if (!0qQ.A0K(this.A03, s6j.A03) || !0qQ.A0K(this.A00, s6j.A00) || !0qQ.A0K(this.A02, s6j.A02) || !0qQ.A0K(this.A01, s6j.A01)) {
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

    public S6J(QXR qxr, C11007S5b s5b, String str, List list) {
        this.A03 = list;
        this.A00 = qxr;
        this.A02 = str;
        this.A01 = s5b;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FBPayPhoneNumbersComponent(phoneNumbers=");
        A1A.append(this.A03);
        A1A.append(", phoneFormFieldConfig=");
        A1A.append(this.A00);
        A1A.append(", addedPhoneNumberId=");
        A1A.append(this.A02);
        A1A.append(", updatedPhoneNumberIdParams=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
