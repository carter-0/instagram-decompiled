package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.EQf  reason: case insensitive filesystem */
public final class C47996EQf extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C48145EZn A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ EWV A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47996EQf(Activity activity, 0hq r2, C48145EZn eZn, AnonymousClass0iw r4, UserSession userSession, EWV ewv, Runnable runnable, String str, String str2) {
        super(r2);
        this.A07 = str;
        this.A06 = str2;
        this.A04 = ewv;
        this.A00 = activity;
        this.A02 = r4;
        this.A03 = userSession;
        this.A01 = eZn;
        this.A05 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-543666987);
        C47354Dvo dvo = (C47354Dvo) obj;
        int A033 = AnonymousClass0fD.A03(-1938784287);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("android.intent.extra.TEXT", dvo.A00);
        String str = this.A07;
        String str2 = this.A06;
        EWV ewv = this.A04;
        boolean z = ewv.A06;
        Activity activity = this.A00;
        C51638FxW fxW = new C51638FxW(dvo, this);
        AnonymousClass0iw r10 = this.A02;
        UserSession userSession = this.A03;
        C46395DeI.A0N(activity, (Uri) null, A0a, r10, userSession, str, str2, fxW, false, z);
        C48142EZk eZk = ewv.A00;
        if (eZk != null) {
            C49947FGb.A02(this.A01, eZk, userSession, dvo.A00, C267044ar.A01(activity, userSession));
        }
        this.A05.run();
        AnonymousClass0fD.A0A(-623428760, A033);
        AnonymousClass0fD.A0A(818867548, A032);
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(1720305903);
        C48142EZk eZk = this.A04.A00;
        if (eZk != null) {
            C49947FGb.A01(this.A01, eZk, this.A03);
        }
        C59689JTv.A0D(this.A00, "fetch_contact_invite_message_failed");
        this.A05.run();
        AnonymousClass0fD.A0A(-1272057678, A032);
    }
}
