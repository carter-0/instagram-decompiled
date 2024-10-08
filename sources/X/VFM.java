package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

public abstract class VFM {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.ViK] */
    public static C17929ViK parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A06 = A0l;
                } else if ("thread_fbid".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    obj.A05 = A0l2;
                } else if ("is_user_present_in_thread".equals(A17)) {
                    obj.A08 = r5.A0d();
                } else if ("is_in_reels_together".equals(A17)) {
                    obj.A07 = r5.A0d();
                } else if ("capabilities".equals(A17)) {
                    obj.A00 = r5.A0y();
                } else if ("mutation_id".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("real_time_update_id".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("publish_timestamp".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("ig_thread_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
