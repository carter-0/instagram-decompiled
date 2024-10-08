package X;

import java.util.UUID;

/* renamed from: X.9cy  reason: invalid class name and case insensitive filesystem */
public final class C382029cy extends AnonymousClass0T0 implements MQW {
    public final String A00;
    public final UUID A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C382029cy) {
                C382029cy r5 = (C382029cy) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A02 != r5.A02 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0O(this.A00)));
    }

    public C382029cy(String str, UUID uuid, boolean z) {
        AnonymousClass7TG.A1P(str, uuid);
        this.A00 = str;
        this.A02 = z;
        this.A01 = uuid;
    }
}
