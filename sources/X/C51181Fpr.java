package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

/* renamed from: X.Fpr  reason: case insensitive filesystem */
public final class C51181Fpr implements Runnable {
    public final /* synthetic */ C47697EDg A00;

    public C51181Fpr(C47697EDg eDg) {
        this.A00 = eDg;
    }

    public final void run() {
        String str;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A01;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        boolean equals = supportServiceEditUrlFragment.A0A.equals("sticker");
        boolean equals2 = sMBPartnerType.equals(SMBPartnerType.GIFT_CARD);
        if (equals) {
            if (equals2) {
                i = 2131972119;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                    i = 2131972010;
                }
                str = null;
                Dbb.A16(supportServiceEditUrlFragment, str);
                SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
            }
        } else if (equals2) {
            i = 2131972118;
        } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            i = 2131972009;
        } else {
            if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
                i = 2131972013;
            }
            str = null;
            Dbb.A16(supportServiceEditUrlFragment, str);
            SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
        }
        str = context.getString(i);
        Dbb.A16(supportServiceEditUrlFragment, str);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
