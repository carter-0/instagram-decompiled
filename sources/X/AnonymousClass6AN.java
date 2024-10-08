package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;

/* renamed from: X.6AN  reason: invalid class name */
public abstract class AnonymousClass6AN {
    public static final AnonymousClass6AO A00(1aU r3, UserSession userSession, AnonymousClass68G r5, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 2);
        0qQ.A0B(str2, 4);
        return (AnonymousClass6AO) 1y0.A00(userSession).A01(AnonymousClass6AO.class, new C58200Io4(r3, userSession, r5, str, str2));
    }

    public static final AnonymousClass6AO A02(UserSession userSession, AnonymousClass61K r4, boolean z) {
        0qQ.A0B(userSession, 0);
        return (AnonymousClass6AO) 1y0.A00(userSession).A01(AnonymousClass6AO.class, new GL3(10, r4, userSession, z));
    }

    public static final AnonymousClass6AO A01(1aU r16, UserSession userSession, AnonymousClass68G r18, String str, String str2) {
        long j;
        UserSession userSession2 = userSession;
        User A01 = AnonymousClass0t1.A01.A01(userSession2);
        AnonymousClass6AQ A00 = AnonymousClass6AP.A00(userSession2);
        A00.A01 = 0;
        A00.A00 = 0;
        A00.A0D.accept(0);
        2I1 A002 = 2Hz.A00(userSession2);
        IGFOAMessagingReadyLogger A003 = 2Hi.A00(userSession2);
        1a8 r3 = new 1a8((C269794fh) null);
        AnonymousClass6AT A004 = AnonymousClass6AR.A00(userSession2);
        String str3 = userSession2.A06;
        Long BST = A01.BST();
        if (BST != null) {
            j = BST.longValue();
        } else {
            j = -1;
        }
        return new AnonymousClass6AO(new AnonymousClass6AU(r16, r3, userSession2, r18, A004, A00, A002, A003, str, str3, A01.B8Q(), str2, j), A00);
    }
}
