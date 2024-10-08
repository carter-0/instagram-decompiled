package com.instagram.notifications.push;

import X.0wb;
import X.AnonymousClass3F2;
import X.O1N;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.instagram.common.notifications.push.intf.PushChannelType;

public class ADMMessageJobHandler extends ADMMessageHandlerJobBase {
    public final void onRegistrationError(Context context, String str) {
        0wb.A03("ADMMessagehandler onRegistrationError", str);
    }

    public final void onRegistered(Context context, String str) {
        AnonymousClass3F2.A00().A05(context, PushChannelType.AMAZON, str, "unknown", 2, false);
    }

    public final void onMessage(Context context, Intent intent) {
        O1N.A00(intent);
    }

    public final void onUnregistered(Context context, String str) {
        AnonymousClass3F2.A00();
    }
}
