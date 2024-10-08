package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.Owm  reason: case insensitive filesystem */
public final class C72127Owm implements AnonymousClass67Q {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C72127Owm(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void Eyr(AnonymousClass67Z r7) {
        if (this.A00 != 0) {
            0qQ.A0B(r7, 0);
            C71129OdS.A04((UserSession) this.A01, ThreadFetchReason.DJANGO_SIDE_EFFECT, new C72666PEw(r7, 1), this.A02, false);
            return;
        }
        MailboxFeature mailboxFeature = (MailboxFeature) this.A01;
        String str = this.A02;
        MYb mYb = MYb.A0M;
        C71722Opg A002 = C71722Opg.A00(r7, 58);
        AnonymousClass68L ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0J = C66581MXm.A0J(ASa, A002);
        C66582MXn.A1E(ASa, new C71652OoX(mailboxFeature, A0J, str, 6), A0J);
    }
}
