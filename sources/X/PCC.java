package X;

import android.content.Context;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class PCC implements C74335PtB {
    public final ArrayList AWi(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, C74552Pwl pwl2, Map map, Set set, Set set2) {
        MessagingUser messagingUser2;
        ImageUrl imageUrl;
        int i;
        User user;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C74552Pwl pwl3 = pwl;
        if (pwl3.getCount() > 0) {
            int count = pwl3.getCount() - 1;
            if (pwl3.BSR(count) == 1) {
                long BsH = pwl3.BsH(count);
                Map map2 = map;
                User user2 = (User) map2.get(pwl3.BsK(count));
                String valueOf = String.valueOf(omf.A00.mResultSet.getLong(0, 0));
                if (user2 != null) {
                    messagingUser2 = MessagingUser.A00(user2);
                } else {
                    messagingUser2 = new MessagingUser((IGAIAgentType) null, Long.valueOf(BsH), String.valueOf(BsH), 0, true);
                }
                0qQ.A0A(messagingUser2);
                if (user2 != null) {
                    imageUrl = user2.Bh3();
                } else {
                    imageUrl = null;
                }
                Collection values = map2.values();
                if (values.size() == 1 && (user = (User) 00k.A0A(values)) != null && (user.A03.AaX() == IGAIAgentType.A05 || user.A03.AaX() == IGAIAgentType.A06 || user.A1X())) {
                    i = 8;
                } else {
                    i = 0;
                }
                OTT.A00(AnonymousClass05K.A00, "typing_indicator", new C330807Oi(imageUrl, messagingUser2, (Integer) null, valueOf, 1, i, false), (Object) null, A1C);
            }
        }
        return A1C;
    }
}
