package com.instagram.notifications.push;

import X.0wb;
import X.AnonymousClass3F2;
import X.O1N;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.instagram.common.notifications.push.intf.PushChannelType;

public class ADMMessageLegacyHandler extends ADMMessageHandlerBase {
    public ADMMessageLegacyHandler() {
        super(ADMMessageLegacyHandler.class.getName());
    }

    public final void onRegistrationError(String str) {
        0wb.A03("ADMMessagehandler onRegistrationError", str);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.notifications.push.ADMMessageLegacyHandler] */
    public final void onRegistered(String str) {
        AnonymousClass3F2.A00().A05(getApplicationContext(), PushChannelType.AMAZON, str, "unknown", 2, false);
    }

    public final void onMessage(Intent intent) {
        O1N.A00(intent);
    }

    public final void onUnregistered(String str) {
        AnonymousClass3F2.A00();
    }
}
