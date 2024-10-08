package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.Arrays;

public final class S2W {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;

    public S2W(C307786Rm r1, C307896Rx r2, C277014uI r3, C277014uI r4) {
        this.A03 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r4;
    }

    public final void A00(Integer num) {
        String str;
        C277014uI r2 = this.A02;
        if (r2 != null) {
            C307786Rm r1 = this.A00;
            switch (num.intValue()) {
                case 0:
                    str = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
                    break;
                case 1:
                    str = "NO_PERMISSION";
                    break;
                case 2:
                    str = "USER_CANCELLED";
                    break;
                default:
                    str = "INTERNAL_ERROR";
                    break;
            }
            C299275ur.A00(this.A01, new AnonymousClass6Tm(Arrays.asList(new Object[]{r1, str})), r2);
        }
    }
}
