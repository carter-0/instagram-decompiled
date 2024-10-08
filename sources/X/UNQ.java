package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;

public final class UNQ extends AnonymousClass0T0 implements C46231DRm {
    public final ProfileGridItemTypeEnum A00;
    public final 1Xj A01;
    public final AnonymousClass3HX A02;

    public final UNQ F8A(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNQ) {
                UNQ unq = (UNQ) obj;
                if (!0qQ.A0K(this.A02, unq.A02) || this.A00 != unq.A00 || !0qQ.A0K(this.A01, unq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UNQ(ProfileGridItemTypeEnum profileGridItemTypeEnum, 1Xj r2, AnonymousClass3HX r3) {
        this.A02 = r3;
        this.A00 = profileGridItemTypeEnum;
        this.A01 = r2;
    }
}
