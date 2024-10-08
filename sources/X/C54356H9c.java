package X;

import com.instagram.api.schemas.ChallengeDetails;

/* renamed from: X.H9c  reason: case insensitive filesystem */
public final class C54356H9c extends HPT {
    public final ChallengeDetails A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54356H9c) {
                C54356H9c h9c = (C54356H9c) obj;
                if (!0qQ.A0K(this.A00, h9c.A00) || !0qQ.A0K(this.A01, h9c.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C54356H9c(ChallengeDetails challengeDetails, String str) {
        this.A00 = challengeDetails;
        this.A01 = str;
    }
}
