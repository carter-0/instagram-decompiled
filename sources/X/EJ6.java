package X;

import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;

public final class EJ6 extends ExY {
    public final ChannelChallengeShareInfo A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EJ6(ChannelChallengeShareInfo channelChallengeShareInfo, String str) {
        super(2FW.A0R, str);
        0qQ.A0B(channelChallengeShareInfo, 2);
        this.A01 = str;
        this.A00 = channelChallengeShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ6) {
                EJ6 ej6 = (EJ6) obj;
                if (!0qQ.A0K(this.A01, ej6.A01) || !0qQ.A0K(this.A00, ej6.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}
