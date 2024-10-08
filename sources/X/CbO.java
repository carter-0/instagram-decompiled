package X;

import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CbO {
    public static AnonymousClass3If parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("badge_preview_state".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    pendingShareToFriendsStoryBadgePreviewState = (PendingShareToFriendsStoryBadgePreviewState) PendingShareToFriendsStoryBadgePreviewState.A01.get(str);
                    if (pendingShareToFriendsStoryBadgePreviewState == null) {
                        pendingShareToFriendsStoryBadgePreviewState = PendingShareToFriendsStoryBadgePreviewState.UNRECOGNIZED;
                    }
                } else if ("cursor".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("media_items".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1D(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            return new AnonymousClass3If(pendingShareToFriendsStoryBadgePreviewState, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
