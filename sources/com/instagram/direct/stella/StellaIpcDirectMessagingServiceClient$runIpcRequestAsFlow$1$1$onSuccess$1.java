package com.instagram.direct.stella;

import X.05G;
import X.0bY;
import X.0cS;
import X.AnonymousClass0fD;
import android.content.Intent;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

public final class StellaIpcDirectMessagingServiceClient$runIpcRequestAsFlow$1$1$onSuccess$1 extends ISendDirectMessageCallback.Stub {
    public final /* synthetic */ StellaIpcDirectMessagingServiceClient A00;
    public final /* synthetic */ 05G A01;

    public StellaIpcDirectMessagingServiceClient$runIpcRequestAsFlow$1$1$onSuccess$1(StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient, 05G r4) {
        this.A00 = stellaIpcDirectMessagingServiceClient;
        this.A01 = r4;
        AnonymousClass0fD.A0A(-386107069, AnonymousClass0fD.A03(-1134883998));
    }

    public final void DRm(String str, boolean z) {
        int A03 = AnonymousClass0fD.A03(783225169);
        0cS r0 = new 0cS();
        r0.A05(StellaIpcDirectMessagingServiceClient.FB_PERMISSION);
        r0.A00().A02(this.A00.context, (Intent) null, (0bY) null);
        if (str != null) {
            this.A01.Epw(str);
        }
        AnonymousClass0fD.A0A(352786153, A03);
    }
}
