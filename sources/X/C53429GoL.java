package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.GuidanceTipResponseImpl;

/* renamed from: X.GoL  reason: case insensitive filesystem */
public final class C53429GoL extends AnonymousClass0T0 implements JRU {
    public final Achievement A00;
    public final GuidanceTipResponseImpl A01;

    public C53429GoL(Achievement achievement, GuidanceTipResponseImpl guidanceTipResponseImpl) {
        0qQ.A0B(achievement, 1);
        this.A00 = achievement;
        this.A01 = guidanceTipResponseImpl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53429GoL) {
                C53429GoL goL = (C53429GoL) obj;
                if (!0qQ.A0K(this.A00, goL.A00) || !0qQ.A0K(this.A01, goL.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }
}
