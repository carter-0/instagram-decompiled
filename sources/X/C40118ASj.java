package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ASj  reason: case insensitive filesystem */
public final class C40118ASj implements 2Kw {
    public final /* synthetic */ C361588gT A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ 0sP A02;

    public C40118ASj(C361588gT r1, String str, 0sP r3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
    }

    public final void invoke(Throwable th) {
        C361588gT r6 = this.A00;
        UserSession userSession = r6.A01;
        String str = this.A01;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        AnonymousClass9PQ.A08(r6, userSession, "error_logging", str, 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("error_message", message), AnonymousClass7TE.A1L("error_type", "recents_query"), AnonymousClass7TE.A1L("is_network", "network")}));
        0sP r0 = this.A02;
        if (r0 != null) {
            r0.invoke(th);
        }
    }
}
