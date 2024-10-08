package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.65O  reason: invalid class name */
public final class AnonymousClass65O implements 1xN {
    public final AnonymousClass65N A00;
    public final UserSession A01;
    public final AnonymousClass65P A02;

    public final void Dne(Set set) {
        List list;
        0qQ.A0B(set, 0);
        if (set.contains("not_presented_client_notifications")) {
            AnonymousClass65N r7 = this.A00;
            UserSession userSession = this.A01;
            Long A0n = 00y.A0n(10, userSession.A06);
            List<String> A0R = 00l.A0R(182.A04(0Tu.A05, userSession, 36882911395316181L), new String[]{","}, 0);
            try {
                ArrayList arrayList = new ArrayList(0Yv.A1E(A0R, 10));
                for (String parseInt : A0R) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
                }
                Object[] array = arrayList.toArray(new Integer[0]);
                0qQ.A0B(array, 0);
                list = Arrays.asList(array);
                0qQ.A07(list);
            } catch (NumberFormatException unused) {
                list = 0sn.A00;
            }
            AnonymousClass65P r3 = this.A02;
            AnonymousClass68L ASa = r7.mMailboxApiHandleMetaProvider.ASa(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
            mailboxFutureImpl.Eiu(r3);
            if (!ASa.EJd(new C22237Xxs(r7, mailboxFutureImpl, A0n, list))) {
                mailboxFutureImpl.cancel(false);
            }
        }
    }

    public AnonymousClass65O(AnonymousClass65N r2, AnonymousClass67N r3, UserSession userSession) {
        AnonymousClass65P r0 = new AnonymousClass65P(r2, r3, userSession);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = r0;
    }
}
