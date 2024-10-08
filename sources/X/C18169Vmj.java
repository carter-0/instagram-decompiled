package X;

import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import java.io.IOException;

/* renamed from: X.Vmj  reason: case insensitive filesystem */
public final class C18169Vmj {
    public static PromoteAudiencePotentialReach parseFromJson(16F r8) {
        AudiencePotentialReachRating audiencePotentialReachRating;
        0qQ.A0B(r8, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("potential_reach".equals(A17)) {
                    r0.A00 = r8.A1D();
                } else if ("overall_rating".equals(A17)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    AudiencePotentialReachRating[] values = AudiencePotentialReachRating.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            audiencePotentialReachRating = AudiencePotentialReachRating.A06;
                            break;
                        }
                        audiencePotentialReachRating = values[i];
                        if (0qQ.A0K(audiencePotentialReachRating.A01, A1Q)) {
                            break;
                        }
                        i++;
                    }
                    r0.A03 = audiencePotentialReachRating;
                } else if ("user_reach_lower_bound".equals(A17)) {
                    r0.A01 = r8.A1D();
                } else if ("user_reach_upper_bound".equals(A17)) {
                    r0.A02 = r8.A1D();
                } else {
                    1XY.A01(r8, r0, A17);
                }
                r8.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
