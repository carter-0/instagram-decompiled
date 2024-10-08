package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class PFR implements AnonymousClass7JG {
    public final /* synthetic */ C67496Moq A00;

    public final void Dzl(int i) {
    }

    public final void Dzm(Exception exc) {
    }

    public final void Dzn(boolean z, int i) {
    }

    public final void Dzo(boolean z) {
    }

    public final /* synthetic */ void Dzp() {
    }

    public final /* synthetic */ void Dzq() {
    }

    public PFR(C67496Moq moq) {
        this.A00 = moq;
    }

    public final void EN6(C63822L8d l8d, String str) {
        C333547Zj r6;
        C67496Moq moq = this.A00;
        C67498Mos.A00(moq.A0A, "bulk_reply_send", "message_voice");
        Iterator A0u = AnonymousClass7TF.A0u(moq.A04);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (A1J.getKey() instanceof MsysThreadId) {
                r6 = moq.A0C;
            } else {
                r6 = moq.A0B;
            }
            C71810OrC.A00(r6.EN4((C254933tI) null, (C254743sy) A1J.getKey(), l8d, "from_bulk_reply", (String) null, (String) null, (List) null, ((C66754Mbz) A1J.getValue()).A09), new C73933PmD(moq, 1), C73446Pco.A00, 4);
        }
    }
}
