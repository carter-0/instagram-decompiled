package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;

public final class WYU implements C358108aN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ SUPMediaStreamControllerDownloader A02;

    public final void onFailure(String str, boolean z) {
        0qQ.A0B(str, 0);
        C363058j1.A02.A04("sup:MediaStreamControllerDownloader", str, (Throwable) null);
        this.A02.A05.compareAndSet(true, false);
    }

    public WYU(Context context, UserSession userSession, SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader) {
        this.A02 = sUPMediaStreamControllerDownloader;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onSuccess() {
        SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader = this.A02;
        AnonymousClass7TE.A1Z(new C59845JaL(this.A01, this.A00, sUPMediaStreamControllerDownloader, (AnonymousClass4D7) null, 23), sUPMediaStreamControllerDownloader.A07);
    }
}
