package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ASk  reason: case insensitive filesystem */
public final class C40119ASk implements 2Kw {
    public final /* synthetic */ C361588gT A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    public C40119ASk(C361588gT r1, String str, String str2, 0sP r4) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = r4;
    }

    public final void invoke(Throwable th) {
        C361588gT r7 = this.A00;
        UserSession userSession = r7.A01;
        String str = this.A02;
        String str2 = this.A01;
        String message = th.getMessage();
        0eP A1L = AnonymousClass7TE.A1L("album_type", str2);
        if (message == null) {
            message = "";
        }
        AnonymousClass9PQ.A08(r7, userSession, "error_logging", str, 0Yt.A06(AnonymousClass7TH.A0h("is_network", "network", A1L, AnonymousClass7TE.A1L("error_message", message), AnonymousClass7TE.A1L("error_type", "pagination_request"))));
        0sP r0 = this.A03;
        if (r0 != null) {
            r0.invoke(th);
        }
    }
}
