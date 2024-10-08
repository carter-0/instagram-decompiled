package X;

import com.instagram.common.gallery.Draft;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.List;

public abstract class JX7 {
    public static final ArrayList A00(UserSession userSession) {
        Draft draft;
        AnonymousClass3Q2 A03;
        String str;
        AnonymousClass3Q2 A032;
        int i;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        List<AnonymousClass3Q2> A07 = 28K.A00(userSession2).A07();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (AnonymousClass3Q2 r5 : A07) {
            int ordinal = r5.A1G.ordinal();
            if (ordinal != 1) {
                if (ordinal == 0) {
                    draft = new Draft(Long.valueOf(r5.A0g), r5.A35, r5.A33, r5.A2m, 0, false, false, r5.A0t(), true);
                } else if (!(ordinal != 4 || (A03 = 28K.A00(userSession2).A03(r5.A35)) == null || (str = (String) 00k.A0O(A03.A0M(), 0)) == null || (A032 = 28K.A00(userSession2).A03(str)) == null)) {
                    String str2 = r5.A35;
                    boolean A12 = A032.A12();
                    if (A12) {
                        ClipInfo clipInfo = A032.A1N;
                        i = clipInfo.A05 - clipInfo.A07;
                    } else {
                        i = 0;
                    }
                    draft = new Draft(Long.valueOf(r5.A0g), str2, A032.A33, r5.A2m, i, A12, true, false, true);
                }
            } else if (r5.A1A == C2801950r.FEED_POST || !182.A06(0Tu.A05, userSession2, 36328237845068916L)) {
                String str3 = r5.A35;
                ClipInfo clipInfo2 = r5.A1N;
                int i2 = clipInfo2.A05 - clipInfo2.A07;
                String str4 = r5.A33;
                boolean z = false;
                if (r5.A0E() == ShareType.CLIPS_PANAVIDEO) {
                    z = true;
                }
                draft = new Draft(Long.valueOf(r5.A0g), str3, str4, r5.A2m, i2, true, false, false, !z);
            }
            A1C.add(draft);
        }
        return A1C;
    }
}
