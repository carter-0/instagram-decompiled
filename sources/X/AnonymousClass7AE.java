package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7AE  reason: invalid class name */
public final class AnonymousClass7AE extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final MessageIdentifier A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AE) {
                AnonymousClass7AE r5 = (AnonymousClass7AE) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode + i;
    }

    public AnonymousClass7AE(MessageIdentifier messageIdentifier, int i, boolean z) {
        this.A01 = messageIdentifier;
        this.A00 = i;
        this.A02 = z;
    }
}
