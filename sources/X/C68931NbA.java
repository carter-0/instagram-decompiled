package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.NbA  reason: case insensitive filesystem */
public final class C68931NbA extends C69666Npo {
    public final UserSession A00;
    public final Capabilities A01;
    public final C66594MYg A02;
    public final MsysThreadId A03;
    public final AnonymousClass0eM A04 = C73907Pli.A00(this, 16);

    public C68931NbA(UserSession userSession, Capabilities capabilities, C66594MYg mYg, MsysThreadId msysThreadId) {
        AnonymousClass7TG.A1Q(msysThreadId, mYg);
        this.A00 = userSession;
        this.A03 = msysThreadId;
        this.A02 = mYg;
        this.A01 = capabilities;
    }
}
