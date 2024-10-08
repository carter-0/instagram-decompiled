package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.FcJ  reason: case insensitive filesystem */
public final class C50471FcJ implements G76 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C46914DnU A03;
    public final /* synthetic */ FEU A04;

    public C50471FcJ(Context context, AnonymousClass0iw r2, UserSession userSession, C46914DnU dnU, FEU feu) {
        this.A03 = dnU;
        this.A02 = userSession;
        this.A04 = feu;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onActionClicked() {
        AnonymousClass7TH.A0R(this.A03.A00);
        UserSession userSession = this.A02;
        F5s.A01(C50165FRx.A00, new DFU(1, this.A00, this.A01, userSession), userSession, 0sn.A00, true);
        FEU feu = this.A04;
        0Aj A002 = FEU.A00(feu);
        Dbb.A18(C48138EZg.BANNER, A002);
        FEU.A01(A002, feu);
    }

    public final void onBannerDismissed() {
        AnonymousClass7TH.A0R(this.A03.A00);
        0xY AR4 = DbY.A0X(this.A02, C49966FGz.A00).AR4();
        AR4.E5T("auto_follow_back_follow_prompt_dismissed", true);
        AR4.apply();
        FEU feu = this.A04;
        0Aj A002 = FEU.A00(feu);
        Dbb.A19(C48138EZg.BANNER, A002);
        FEU.A01(A002, feu);
    }
}
