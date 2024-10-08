package X;

import com.instagram.api.schemas.UserCallSettings;
import java.util.List;

/* renamed from: X.DrQ  reason: case insensitive filesystem */
public final class C47149DrQ extends AnonymousClass0T0 {
    public final UserCallSettings A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47149DrQ) {
                C47149DrQ drQ = (C47149DrQ) obj;
                if (!0qQ.A0K(this.A01, drQ.A01) || this.A00 != drQ.A00 || !0qQ.A0K(this.A02, drQ.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public C47149DrQ(UserCallSettings userCallSettings, List list, List list2) {
        AnonymousClass7TG.A1U(list, userCallSettings, list2);
        this.A01 = list;
        this.A00 = userCallSettings;
        this.A02 = list2;
    }
}
