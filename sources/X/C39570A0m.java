package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.A0m  reason: case insensitive filesystem */
public abstract class C39570A0m {
    public static final C347017w8 A00(Context context, UserSession userSession, User user, int i, boolean z) {
        C347017w8 A03;
        String str;
        int i2;
        User user2 = user;
        String username = user.getUsername();
        boolean A01 = C346897vw.A01(userSession);
        int i3 = -1;
        Locale locale = Locale.ROOT;
        int i4 = i;
        if (!A01) {
            String upperCase = username.toUpperCase(locale);
            0qQ.A07(upperCase);
            A03 = AnonymousClass91M.A03(context, userSession, new C387369m6((QP8) null, user2, 002.A0D(upperCase, '@'), (float) AnonymousClass7TE.A0I(context.getResources()), i4));
            if (z) {
                str = "mention_sticker_subtle";
            } else {
                str = "mention_sticker_hero";
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A03.A08);
            0qQ.A07(copyOf);
            Iterator it = copyOf.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Drawable A0Z = AnonymousClass7TE.A0Z(it);
                if ((A0Z instanceof C369508us) && 0qQ.A0K(((C369508us) A0Z).A01, str)) {
                    break;
                }
                i5 = i2 + 1;
            }
        } else {
            String lowerCase = username.toLowerCase(locale);
            0qQ.A07(lowerCase);
            A03 = AnonymousClass91M.A04(context, userSession, new C387369m6((QP8) null, user2, 002.A0D(lowerCase, '@'), (float) AnonymousClass7TE.A0I(context.getResources()), i4));
            if (z) {
                ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A03.A08);
                0qQ.A07(copyOf2);
                Iterator it2 = copyOf2.iterator();
                i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Drawable A0Z2 = AnonymousClass7TE.A0Z(it2);
                    if ((A0Z2 instanceof C369508us) && 0qQ.A0K(((C369508us) A0Z2).A01, "mention_sticker_redesign_subtle")) {
                        break;
                    }
                    i2++;
                }
            }
            return A03;
        }
        i3 = i2;
        A03.A0B(i3);
        return A03;
    }
}
