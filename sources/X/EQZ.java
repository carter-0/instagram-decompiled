package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class EQZ extends H4J {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C48145EZn A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Runnable A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQZ(Fragment fragment, 0hq r2, C48145EZn eZn, AnonymousClass0iw r4, UserSession userSession, Runnable runnable) {
        super(r2);
        this.A01 = eZn;
        this.A00 = fragment;
        this.A03 = userSession;
        this.A02 = r4;
        this.A04 = runnable;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-2123529998);
        C49947FGb.A01(this.A01, C48142EZk.SYSTEM_SHARE_SHEET, this.A03);
        C59689JTv.A0D(this.A00.requireContext(), "fetch_contact_invite_message_failed");
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(-725488039, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-944493268);
        C47354Dvo dvo = (C47354Dvo) obj;
        int A033 = AnonymousClass0fD.A03(1036028533);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("android.intent.extra.TEXT", dvo.A00);
        C46395DeI.A0Q(this.A00.getActivity(), A0a, this.A02, this.A03, "share_to_system_sheet", new C51638FxW(dvo, this));
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(714928255, A033);
        AnonymousClass0fD.A0A(-2055827982, A032);
    }
}
