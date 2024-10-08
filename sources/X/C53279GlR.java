package X;

import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import java.util.List;

/* renamed from: X.GlR  reason: case insensitive filesystem */
public final class C53279GlR extends AnonymousClass0T0 {
    public final Challenge A00;
    public final ChallengeDetails A01;
    public final GuidanceTipResponseImpl A02;
    public final long A03;
    public final List A04;

    public C53279GlR(Challenge challenge, ChallengeDetails challengeDetails, GuidanceTipResponseImpl guidanceTipResponseImpl, List list, long j) {
        C51973G9u.A0r(3, challenge, challengeDetails, list);
        this.A03 = j;
        this.A02 = guidanceTipResponseImpl;
        this.A00 = challenge;
        this.A01 = challengeDetails;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53279GlR) {
                C53279GlR glR = (C53279GlR) obj;
                if (this.A03 != glR.A03 || !0qQ.A0K(this.A02, glR.A02) || !0qQ.A0K(this.A00, glR.A00) || !0qQ.A0K(this.A01, glR.A01) || !0qQ.A0K(this.A04, glR.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, (C51975G9x.A03(this.A03) + AnonymousClass7TG.A0C(this.A02)) * 31)));
    }
}
