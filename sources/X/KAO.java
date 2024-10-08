package X;

import android.content.Context;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.common.session.UserSession;

public final class KAO extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C339297jN A02;
    public final /* synthetic */ AnonymousClass4UE A03;
    public final /* synthetic */ 2bv A04;

    public KAO(Context context, UserSession userSession, C339297jN r3, AnonymousClass4UE r4, 2bv r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(-1120556372, AnonymousClass0fD.A03(13175455));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-2114810355);
        K1W k1w = (K1W) obj;
        int A0D = AnonymousClass7TG.A0D(k1w, 1097366495);
        if (k1w.A03 && k1w.A00 == IGLiveBadgeSettings.UNSET) {
            1YN A002 = AnonymousClass2bO.A00();
            2bv r6 = this.A04;
            AnonymousClass4UE r2 = this.A03;
            Context context = this.A00;
            AnonymousClass4DH r3 = this.A02.A0B;
            A002.A06(context, r3, r2, r6);
            UserSession userSession = this.A01;
            IGLiveBadgeSettings iGLiveBadgeSettings = IGLiveBadgeSettings.ON;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("users/set_live_settings/");
            DbX.A1M(A0a, "live_badge_setting", iGLiveBadgeSettings.A00);
            r3.schedule(A0a.A0M());
        }
        AnonymousClass0fD.A0A(-164951685, A0D);
        AnonymousClass0fD.A0A(235735173, A032);
    }
}
