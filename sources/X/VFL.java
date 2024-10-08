package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

public abstract class VFL {
    public static C17928ViJ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C17928ViJ viJ = new C17928ViJ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    viJ.A07 = A0l;
                } else if ("capabilities".equals(A17)) {
                    viJ.A01 = r5.A0y();
                } else if ("is_in_reels_together".equals(A17)) {
                    viJ.A08 = r5.A0d();
                } else if ("surface_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    viJ.A06 = A0l2;
                } else if ("surface_type".equals(A17)) {
                    viJ.A00 = r5.A1D();
                } else if ("clip_id".equals(A17)) {
                    viJ.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("mutation_id".equals(A17)) {
                    viJ.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("real_time_update_id".equals(A17)) {
                    viJ.A05 = AnonymousClass7TG.A0l(r5);
                } else if ("publish_timestamp".equals(A17)) {
                    viJ.A04 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return viJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
