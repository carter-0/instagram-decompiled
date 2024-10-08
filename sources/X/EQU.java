package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class EQU extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C48145EZn A01;
    public final /* synthetic */ UserSession A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQU(Activity activity, 0hq r2, C48145EZn eZn, UserSession userSession) {
        super(r2);
        this.A02 = userSession;
        this.A01 = eZn;
        this.A00 = activity;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1440349183);
        C49947FGb.A01(this.A01, C48142EZk.COPY_LINK, this.A02);
        C59689JTv.A0D(this.A00, "fetch_contact_invite_link_failed");
        AnonymousClass0fD.A0A(141163810, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-122674289);
        C47354Dvo dvo = (C47354Dvo) obj;
        int A032 = AnonymousClass0fD.A03(909745667);
        UserSession userSession = this.A02;
        C48145EZn eZn = this.A01;
        C48142EZk eZk = C48142EZk.COPY_LINK;
        String str = dvo.A00;
        Activity activity = this.A00;
        C49947FGb.A02(eZn, eZk, userSession, str, C267044ar.A01(activity, userSession));
        0nC.A00(activity, dvo.A00);
        C49118Eph.A00(activity, (View) null, (String) null, true);
        AnonymousClass0fD.A0A(-169206129, A032);
        AnonymousClass0fD.A0A(-2012316895, A03);
    }
}
