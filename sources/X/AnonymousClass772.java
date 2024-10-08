package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.772  reason: invalid class name */
public final class AnonymousClass772 implements C3264476u {
    public static final AnonymousClass772 A00 = new Object();

    public final C328667Fr AM8(Context context, UserSession userSession, AnonymousClass7FE r68, AnonymousClass9HC r69, AnonymousClass7LQ r70) {
        String str;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass7FE r5 = r68;
        0qQ.A0B(r5, 2);
        AnonymousClass9HC r4 = r69;
        0qQ.A0B(r4, 3);
        AnonymousClass7LQ r3 = r70;
        0qQ.A0B(r3, 4);
        C254703su r0 = r3.A0e;
        0qQ.A07(r0);
        1Xj r8 = r0.A0s;
        if (r8 != null) {
            DirectMessageIdentifier A0V = r0.A0V();
            ExtendedImageUrl A1n = r8.A1n(context2);
            if (A1n != null) {
                AnonymousClass776 r9 = new AnonymousClass776(A1n, false, Float.valueOf(r8.A0l()), (Integer) null, (Integer) null, (Integer) null, (String) null);
                2FW r12 = r0.A10;
                0qQ.A07(r12);
                String str2 = r0.A1u;
                0qQ.A07(str2);
                AnonymousClass9J6 r1 = new AnonymousClass9J6(OP4.A01(userSession2, OP3.A00(), r12, r8, new C41655Ay7(userSession2, 22)), str2, 5);
                C254883tD r29 = C254883tD.SINGLE;
                User user = r3.A0K;
                if (user != null) {
                    str = user.getUsername();
                } else {
                    str = null;
                }
                return new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, r1, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, AnonymousClass7FG.A00(context2, userSession2, r4, r3, r0.A10), r5, (AnonymousClass74T) null, (AnonymousClass774) null, r9, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r29, (AnonymousClass779) null, A0V, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
