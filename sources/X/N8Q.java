package X;

import com.facebook.msys.mci.AuthData;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class N8Q extends AnonymousClass0T0 implements C74246Pra {
    public final AuthData A00;
    public final MessagingUser A01;
    public final OFH A02;
    public final MsysThreadId A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8Q) {
                N8Q n8q = (N8Q) obj;
                if (!0qQ.A0K(this.A03, n8q.A03) || !0qQ.A0K(this.A01, n8q.A01) || !0qQ.A0K(this.A00, n8q.A00) || this.A04 != n8q.A04 || !0qQ.A0K(this.A02, n8q.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03)));
        Integer num = this.A04;
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TG.A0B(num, C70091Nx7.A00(num), A07));
    }

    public N8Q(AuthData authData, MessagingUser messagingUser, OFH ofh, MsysThreadId msysThreadId, Integer num) {
        AnonymousClass7TG.A1U(msysThreadId, messagingUser, authData);
        this.A03 = msysThreadId;
        this.A01 = messagingUser;
        this.A00 = authData;
        this.A04 = num;
        this.A02 = ofh;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadCachedMessagesSideEffect(msysThreadId=");
        A1A.append(this.A03);
        A1A.append(", currentUser=");
        A1A.append(this.A01);
        A1A.append(", authData=");
        A1A.append(this.A00);
        A1A.append(", loadType=");
        Integer num = this.A04;
        if (num != null) {
            str = C70091Nx7.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", viewModelGenerators=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
