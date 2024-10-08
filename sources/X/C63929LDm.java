package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LDm  reason: case insensitive filesystem */
public final class C63929LDm {
    public int A00;
    public int A01;
    public final Oy9 A02;
    public final MessageIdentifier A03;
    public final String A04;

    public C63929LDm(UserSession userSession, String str, String str2, String str3, C262224Cq r13, AnonymousClass0Ud r14) {
        0qQ.A0B(str3, 5);
        MessageIdentifier messageIdentifier = new MessageIdentifier(str, str2);
        Oy9 oy9 = (Oy9) userSession.A01(Oy9.class, new C73657PhW(userSession, 32));
        0qQ.A0B(oy9, 5);
        AnonymousClass0Ud r2 = r14;
        AnonymousClass7TE.A1Z(new MH7(oy9, r2, this, messageIdentifier, str3, (AnonymousClass4D7) null, 13), r13);
        this.A02 = oy9;
        this.A03 = messageIdentifier;
        this.A04 = str3;
    }

    public final void A00(C262224Cq r4) {
        this.A00++;
        AnonymousClass7TE.A1Z(new C66162MFz(this, (AnonymousClass4D7) null, 26), r4);
    }
}
