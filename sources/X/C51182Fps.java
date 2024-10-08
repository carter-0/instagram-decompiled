package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

/* renamed from: X.Fps  reason: case insensitive filesystem */
public final class C51182Fps implements Runnable {
    public final /* synthetic */ C47697EDg A00;

    public C51182Fps(C47697EDg eDg) {
        this.A00 = eDg;
    }

    public final void run() {
        String str;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A01;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
            i = 2131972117;
        } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            i = 2131972008;
        } else if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
            i = 2131972012;
        } else {
            str = null;
            Dbb.A16(supportServiceEditUrlFragment, str);
            SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
        }
        str = context.getString(i);
        Dbb.A16(supportServiceEditUrlFragment, str);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
