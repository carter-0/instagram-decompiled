package X;

import com.instagram.direct.stella.StellaDirectMessagingService;
import com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl;

public abstract class NEQ extends NER {
    public final AnonymousClass0cT A00;

    public NEQ() {
        String str;
        if (this instanceof TrustedDeviceFoundationServiceImpl) {
            str = "com.meta.trusteddevice.service.fbpermission.TRUSTED_DEVICE_FOUNDATION_SERVICE";
        } else if (this instanceof StellaDirectMessagingService) {
            str = "com.instagram.android.fbpermission.MANAGE_MESSAGING";
        } else {
            str = "com.fbpay.w3c.ipc.fbpermission.GET_CROSS_APP_KEY";
        }
        0cS r0 = new 0cS();
        r0.A05(str);
        this.A00 = r0.A00();
    }
}
