package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

/* renamed from: X.Fpq  reason: case insensitive filesystem */
public final class C51180Fpq implements Runnable {
    public final /* synthetic */ C47690ECz A00;

    public C51180Fpq(C47690ECz eCz) {
        this.A00 = eCz;
    }

    public final void run() {
        String A01;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A01;
        boolean z = supportServiceEditUrlFragment.A0C;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        String str = supportServiceEditUrlFragment.A0A;
        if (z) {
            boolean equals = str.equals("sticker");
            boolean equals2 = sMBPartnerType.equals(SMBPartnerType.GIFT_CARD);
            if (equals) {
                if (equals2) {
                    i = 2131976070;
                } else {
                    if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                        i = 2131976046;
                    }
                    A01 = null;
                }
            } else if (equals2) {
                i = 2131976069;
            } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                i = 2131976045;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
                    i = 2131976047;
                }
                A01 = null;
            }
            A01 = context.getString(i);
        } else {
            A01 = C324066yY.A01(context, sMBPartnerType, str);
        }
        Dbb.A16(supportServiceEditUrlFragment, A01);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
