package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.common.session.UserSession;

public final class FK0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ C47152DrT A00;
    public final /* synthetic */ BonusPromoDialogType A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C50327FYh A03;

    public FK0(C47152DrT drT, BonusPromoDialogType bonusPromoDialogType, UserSession userSession, C50327FYh fYh) {
        this.A03 = fYh;
        this.A01 = bonusPromoDialogType;
        this.A02 = userSession;
        this.A00 = drT;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Integer num;
        C50327FYh fYh = this.A03;
        BonusPromoDialogType bonusPromoDialogType = this.A01;
        if (bonusPromoDialogType == BonusPromoDialogType.SELF_PROFILE_REELS) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A15;
        }
        fYh.A00(num, (String) null, (String) null, (String) null);
        UserSession userSession = this.A02;
        String str = this.A00.A01;
        0xY AR4 = 1Al.A01(userSession).A03(1An.A0X).AR4();
        AR4.E5c(C273654mx.A00(2102), System.currentTimeMillis());
        AR4.apply();
        AnonymousClass7TE.A1Z(new C66173MGk(bonusPromoDialogType, userSession, str, (AnonymousClass4D7) null, 46), DbY.A0r(AnonymousClass12T.A00, 891600198));
    }
}
