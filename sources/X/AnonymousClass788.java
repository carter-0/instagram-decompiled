package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.788  reason: invalid class name */
public final class AnonymousClass788 implements AnonymousClass789 {
    public final /* synthetic */ C329907Kr A00;
    public final /* synthetic */ AnonymousClass7L0 A01;
    public final /* synthetic */ 2Er A02;

    public AnonymousClass788(C329907Kr r1, AnonymousClass7L0 r2, 2Er r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DLh(boolean z) {
        Long l;
        2Er r6 = this.A02;
        if (0qQ.A0K(r6.BZL(), true)) {
            C329907Kr r5 = this.A00;
            if (r5.A00 == null) {
                UserSession userSession = r5.A06;
                Context context = r5.A03;
                AnonymousClass7L0 r8 = this.A01;
                View view = r5.A04;
                C314466iJ r3 = r5.A07;
                if (r6.Aud() && 0qQ.A0K(r6.BZL(), true) && C271174i4.A01(userSession)) {
                    0xG r9 = F9V.A00;
                    String str = userSession.A06;
                    String BZP = r6.BZP();
                    0qQ.A0B(r9, 1);
                    0wc A012 = AnonymousClass0kN.A01(r9, userSession);
                    0Aj A002 = A012.A00(A012.A00, "ig_creator_connections_events");
                    A002.AAJ("event", "impression");
                    A002.AAJ("target", "direct_thread_nux");
                    A002.A8M(EZb.DIRECT_THREAD, "screen");
                    A002.A8M(C271174i4.A00(userSession), "project");
                    A002.Cgf();
                    0wc A013 = AnonymousClass0kN.A01(r9, userSession);
                    0Aj A003 = A013.A00(A013.A00, "instagram_open_to_collab_surface_direct_thread_nux_impression");
                    if (A003.isSampled()) {
                        A003.A9F("actor_userid", 00y.A0n(10, str));
                        if (BZP != null) {
                            l = 00y.A0n(10, BZP);
                        } else {
                            l = null;
                        }
                        A003.A9F("target_userid", l);
                        A003.Cgf();
                    }
                    ViewStub viewStub = (ViewStub) view.findViewById(R.id.direct_collab_status_banner_viewstub);
                    if (viewStub != null) {
                        View inflate = viewStub.inflate();
                        inflate.setBackgroundColor(r8.A02);
                        ((TextView) inflate.findViewById(R.id.banner_header)).setText(context.getString(2131969042));
                        ((TextView) inflate.findViewById(R.id.banner_body)).setText(context.getString(2131969041));
                        AnonymousClass0fU.A00(new C50076FNr(inflate, userSession, r3, r6), inflate.findViewById(R.id.banner_close));
                        r3.DUt();
                        r5.A00 = AnonymousClass05K.A0B;
                    }
                }
            }
        }
    }
}
