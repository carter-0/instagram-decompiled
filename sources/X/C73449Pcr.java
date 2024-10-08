package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import java.util.function.Consumer;

/* renamed from: X.Pcr  reason: case insensitive filesystem */
public final class C73449Pcr implements Consumer {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C72939PPx A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0rm A03;

    public C73449Pcr(UserSession userSession, C72939PPx pPx, C62320sa r3, 0rm r4) {
        this.A01 = pPx;
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        if (!this.A01.A0O.get()) {
            C66794Mcg mcg = new C66794Mcg(mailbox);
            AnonymousClass6AO A002 = AnonymousClass6AN.A00(1aU.A09(mcg), this.A00, ((1aD) this.A03.A00).A04, (String) null, "MsysMultiInstancesBackgroundUserSessionOperationPayload");
            1a8 r4 = new 1a8((C269794fh) null);
            r4.A02(A002.A00(), new PU9(16, r4, this.A02));
        }
    }
}
