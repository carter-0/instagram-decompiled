package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.Cqg  reason: case insensitive filesystem */
public abstract class C45122Cqg {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.6Ud, java.lang.Object] */
    public static C308406Ud parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("reel_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("media_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("taken_at_seconds".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r14);
                } else {
                    l2 = C41847B3o.A14(r14, l2, A17, "timestamp_seconds");
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("reel_id", r14, "PendingReelSeenState.SeenReelMediaInfo");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r14, "PendingReelSeenState.SeenReelMediaInfo");
            } else if (str3 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r14, "PendingReelSeenState.SeenReelMediaInfo");
            } else if (l == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("taken_at_seconds", r14, "PendingReelSeenState.SeenReelMediaInfo");
            } else if (l2 != null || !(r14 instanceof 0c9)) {
                long longValue = l.longValue();
                long longValue2 = l2.longValue();
                ? obj = new Object();
                obj.A05 = str;
                obj.A02 = str2;
                obj.A06 = str3;
                obj.A01 = longValue;
                obj.A00 = longValue2;
                return obj;
            } else {
                AnonymousClass7TF.A1L("timestamp_seconds", r14, "PendingReelSeenState.SeenReelMediaInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
