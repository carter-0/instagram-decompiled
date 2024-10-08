package X;

import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hul  reason: case insensitive filesystem */
public final class C56218Hul {
    public static C54050GyZ parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("challenge_id".equals(A17)) {
                    r2.A04 = AnonymousClass7TF.A0Z(r9);
                } else if (AnonymousClass000.A00(1396).equals(A17)) {
                    r2.A02 = CYJ.parseFromJson(r9);
                } else if ("started_challenge".equals(A17)) {
                    r2.A00 = HTV.parseFromJson(r9);
                } else if ("started_challenge_details".equals(A17)) {
                    r2.A01 = HTU.parseFromJson(r9);
                } else if ("unearned_challenges".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            Challenge parseFromJson = HTV.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r2.A05 = arrayList;
                } else {
                    1XY.A01(r9, r2, A17);
                }
                r9.A0z();
            }
            Long l = r2.A04;
            0qQ.A0A(l);
            long longValue = l.longValue();
            GuidanceTipResponseImpl guidanceTipResponseImpl = r2.A02;
            Challenge challenge = r2.A00;
            0qQ.A0A(challenge);
            ChallengeDetails challengeDetails = r2.A01;
            0qQ.A0A(challengeDetails);
            List list = r2.A05;
            0qQ.A0A(list);
            r2.A03 = new C53279GlR(challenge, challengeDetails, guidanceTipResponseImpl, list, longValue);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
