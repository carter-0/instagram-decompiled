package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import java.util.function.Consumer;

/* renamed from: X.5od  reason: invalid class name and case insensitive filesystem */
public final class C295645od implements Consumer {
    public final /* synthetic */ MsysActiveUserSession A00;
    public final /* synthetic */ 0sP A01;

    public C295645od(MsysActiveUserSession msysActiveUserSession, 0sP r2) {
        this.A00 = msysActiveUserSession;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        0qQ.A0A(mailbox);
        this.A00.A04(C295615oa.class, new C295615oa(mailbox));
        this.A01.invoke(mailbox);
    }
}
