package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ohp  reason: case insensitive filesystem */
public final class C71293Ohp implements View.OnClickListener {
    public final /* synthetic */ C66762Mc7 A00;

    public C71293Ohp(C66762Mc7 mc7) {
        this.A00 = mc7;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1646391779);
        C66762Mc7 mc7 = this.A00;
        C3725791l r9 = mc7.A07;
        String str2 = mc7.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = mc7.A0C;
            if (str3 != null) {
                String A002 = C69931NuX.A00(C66762Mc7.A00(mc7));
                String str4 = mc7.A0B;
                str = "adMediaId";
                if (str4 != null) {
                    C3725791l.A00(r9, "direct_in_thread_ctd_banner_dismiss_click", str2, str3, DbY.A0p("media_id", str4, AnonymousClass7TE.A1L("cta_type", A002)));
                    UserSession userSession = mc7.A0G;
                    String str5 = mc7.A0C;
                    if (str5 != null) {
                        String str6 = mc7.A0B;
                        if (str6 != null) {
                            0qQ.A0B(userSession, 0);
                            1NY A0a = AnonymousClass7TG.A0a(userSession);
                            A0a.A0A("direct_v2/dismiss_in_thread_ctd_banner/");
                            A0a.A9m("other_participant_id", str5);
                            DbX.A1M(A0a, "ig_media_id", str6);
                            1ES.A03(A0a.A0M());
                            C66762Mc7.A01(mc7);
                            AnonymousClass0fD.A0C(-1520726467, A05);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F("participantId");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
