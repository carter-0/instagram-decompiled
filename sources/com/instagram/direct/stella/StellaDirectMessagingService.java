package com.instagram.direct.stella;

import X.0QJ;
import X.0cS;
import X.1wn;
import X.AnonymousClass0cT;
import X.C71932OtG;
import X.NEQ;
import X.NEX;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

public final class StellaDirectMessagingService extends NEQ {
    public ISendDirectMessageCallback A00;
    public final AnonymousClass0cT A01;
    public final 1wn A02 = C71932OtG.A00(this, 34);
    public final StellaDirectMessagingService$binder$1 A03 = new StellaDirectMessagingService$binder$1(this);

    public StellaDirectMessagingService() {
        0cS r1 = new 0cS();
        r1.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        this.A01 = r1.A00();
        this.A00 = new 0QJ(this.A00, new NEX());
    }
}
