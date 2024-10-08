package X;

import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CbN {
    public static Map A00(AnonymousClass3Ig r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (r4.Af3() != null) {
            PendingShareToFriendsStoryBadgePreviewState Af3 = r4.Af3();
            if (Af3 != null) {
                str = Af3.A00;
            }
            A1H.put("badge_preview_state", str);
        }
        if (r4.Aum() != null) {
            A1H.put("cursor", r4.Aum());
        }
        List BQT = r4.BQT();
        if (BQT != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BQT);
            Iterator it = BQT.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("media_items", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
