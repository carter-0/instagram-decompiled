package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.76v  reason: invalid class name and case insensitive filesystem */
public final class C3264576v implements C3264476u {
    public static final C3264576v A00 = new Object();

    public final C328667Fr AM8(Context context, UserSession userSession, AnonymousClass7FE r67, AnonymousClass9HC r68, AnonymousClass7LQ r69) {
        ArrayList arrayList;
        String str;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass7FE r8 = r67;
        0qQ.A0B(r8, 2);
        AnonymousClass9HC r4 = r68;
        0qQ.A0B(r4, 3);
        AnonymousClass7LQ r3 = r69;
        0qQ.A0B(r3, 4);
        C254703su r1 = r3.A0e;
        0qQ.A07(r1);
        User user = r3.A0K;
        Object obj = r1.A1T;
        if (obj != null) {
            User user2 = (User) obj;
            List<C72695PFz> A0s = r1.A0s();
            if (A0s != null) {
                arrayList = new ArrayList(0Yv.A1E(A0s, 10));
                for (C72695PFz A002 : A0s) {
                    arrayList.add(A002.A00());
                }
            } else {
                arrayList = null;
            }
            DirectMessageIdentifier A0V = r1.A0V();
            AnonymousClass774 r10 = new AnonymousClass774((Drawable) null, (Drawable) null, user2.getUsername(), user2.getFullName(), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 0sr.A1N(user2.Bh3()));
            String A06 = 0mp.A06("instagram://user?username=%s", new Object[]{user2.getUsername()});
            String str2 = r1.A1u;
            0qQ.A07(str2);
            AnonymousClass9J6 r15 = new AnonymousClass9J6(A06, str2, 5);
            C254883tD r28 = C254883tD.GRID_VIEW_3X2;
            if (user != null) {
                str = user.getUsername();
            } else {
                str = null;
            }
            return new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, r15, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, AnonymousClass7FG.A00(context2, userSession2, r4, r3, r1.A10), r8, (AnonymousClass74T) null, r10, (AnonymousClass777) null, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r28, (AnonymousClass779) null, A0V, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, arrayList, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
