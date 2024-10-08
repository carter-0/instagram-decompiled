package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.50m  reason: invalid class name */
public abstract class AnonymousClass50m {
    public static final ReactionViewModel A00(UserSession userSession, ImageUrl imageUrl, User user, String str, boolean z, boolean z2, boolean z3) {
        ImageUrl imageUrl2 = imageUrl;
        String str2 = str;
        String A0T = 002.A0T(user.getId(), str, ' ');
        String A07 = AnonymousClass50n.A07(user);
        int i = 0;
        boolean z4 = z;
        if (z) {
            i = 2131959228;
        }
        ImageUrl Bh3 = user.Bh3();
        MessagingUser A00 = MessagingUser.A00(user);
        if (!z && !182.A06(0Tu.A05, userSession, 36322624321825068L)) {
            imageUrl2 = null;
        }
        return new ReactionViewModel(Bh3, imageUrl2, A00, A0T, A07, str2, i, z4, z2, z3);
    }

    public static final void A01(UserSession userSession, String str, List list) {
        0qQ.A0B(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            arrayList.add(A00(userSession, (ImageUrl) null, user, (String) null, 0qQ.A0K(user.getId(), str), true, false));
        }
        0qQ.A07(Collections.unmodifiableList(arrayList));
    }
}
