package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fvq  reason: case insensitive filesystem */
public final class C51544Fvq implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C47152DrT A02;
    public final /* synthetic */ BonusPromoDialogType A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C50327FYh A05;

    public C51544Fvq(Context context, FragmentActivity fragmentActivity, C47152DrT drT, BonusPromoDialogType bonusPromoDialogType, UserSession userSession, C50327FYh fYh) {
        this.A00 = context;
        this.A02 = drT;
        this.A05 = fYh;
        this.A03 = bonusPromoDialogType;
        this.A04 = userSession;
        this.A01 = fragmentActivity;
    }

    public final void run() {
        Context context = this.A00;
        C358248ab A0Y = DbS.A0Y(context);
        DbU.A16(context, A0Y, R.drawable.ig_illustrations_illo_bonuses_refresh);
        A0Y.A09(2131963710);
        A0Y.A08(2131963707);
        C47152DrT drT = this.A02;
        int i = 2131963706;
        if (drT.A00 == BonusPromoDialogAudienceType.FIRST_TIME_ONBOARDER) {
            i = 2131963709;
        }
        C50327FYh fYh = this.A05;
        BonusPromoDialogType bonusPromoDialogType = this.A03;
        UserSession userSession = this.A04;
        A0Y.A0I(new FIh(10, this.A01, drT, bonusPromoDialogType, fYh, userSession), i);
        A0Y.A0H(new C50024FJj(17, (Object) bonusPromoDialogType, (Object) userSession, (Object) drT, (Object) fYh), 2131963708);
        A0Y.A0g(new FK0(drT, bonusPromoDialogType, userSession, fYh));
        A0Y.A0B(new FHZ(drT, bonusPromoDialogType, userSession, fYh));
        DbT.A1V(A0Y);
    }
}
