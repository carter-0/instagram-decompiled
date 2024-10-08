package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.common.session.UserSession;

public final class FHZ implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C47152DrT A00;
    public final /* synthetic */ BonusPromoDialogType A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C50327FYh A03;

    public FHZ(C47152DrT drT, BonusPromoDialogType bonusPromoDialogType, UserSession userSession, C50327FYh fYh) {
        this.A03 = fYh;
        this.A01 = bonusPromoDialogType;
        this.A02 = userSession;
        this.A00 = drT;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Integer num;
        C50327FYh fYh = this.A03;
        BonusPromoDialogType bonusPromoDialogType = this.A01;
        if (bonusPromoDialogType == BonusPromoDialogType.SELF_PROFILE_REELS) {
            num = AnonymousClass05K.A0u;
        } else {
            num = AnonymousClass05K.A1I;
        }
        fYh.A00(num, (String) null, (String) null, (String) null);
        UserSession userSession = this.A02;
        String str = this.A00.A01;
        AnonymousClass7TE.A1Z(new C66173MGk(bonusPromoDialogType, userSession, str, (AnonymousClass4D7) null, 47), DbY.A0r(AnonymousClass12T.A00, 891600198));
    }
}
