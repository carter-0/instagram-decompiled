package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;

/* renamed from: X.6E1  reason: invalid class name */
public final class AnonymousClass6E1 {
    public static final void A00(0sP r4, UserSession userSession) {
        1a8 r3 = new 1a8((C269794fh) null);
        C70746OJs oJs = ((C70463O7o) 1y0.A00(userSession).A01(C70463O7o.class, new C73920Pm0(userSession, 37))).A00;
        0qQ.A0B(oJs, 0);
        r3.A02(oJs.A00(O4U.A00).A0H(), new PSO(r3, r4));
    }

    public final void A01(Mailbox mailbox, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(mailbox, 1);
        Long BST = 0eE.A00(userSession).A00().BST();
        if (BST != null) {
            userSession.A04(AnonymousClass6E0.class, new AnonymousClass6E0(mailbox, BST.longValue()));
        } else if (z) {
            0wb.A01.Ew0("android_null_eimu", "Messaging user fbid is null while initiating rsys crypto context");
            0wj.A01.AEf("android_null_eimu", 817900784).report();
        } else {
            A00(new C74186PqS(25, (Object) userSession, (Object) mailbox), userSession);
        }
    }
}
