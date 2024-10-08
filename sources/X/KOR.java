package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

public final class KOR extends LSR {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final KO2 A02;
    public final PendingRecipient A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(C66296MMf.A00(this, 26));
    public final AnonymousClass0r6 A05;
    public final 05G A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOR(AnonymousClass0iw r3, UserSession userSession, KO2 ko2, PendingRecipient pendingRecipient) {
        super(ko2);
        0qQ.A0B(userSession, 2);
        this.A02 = ko2;
        this.A01 = userSession;
        this.A03 = pendingRecipient;
        this.A00 = r3;
        02z A10 = DbS.A10(new C53368Gms(13));
        this.A06 = A10;
        this.A05 = A10;
    }
}
