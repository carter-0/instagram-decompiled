package com.instagram.notifications.push;

import X.0wb;
import com.amazon.device.messaging.ADMMessageReceiver;

public class ADMMessageHandler$Receiver extends ADMMessageReceiver {
    public static boolean A00 = true;

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
        } catch (ClassNotFoundException unused) {
            0wb.A03("ADMMessagehandler ADMMessageHandlerJob", "ADMMessageHandlerJobBase is not available. Need to fall back to legacy implementation");
        }
    }

    public ADMMessageHandler$Receiver() {
        super(ADMMessageLegacyHandler.class);
        if (A00) {
            registerJobServiceClass(ADMMessageJobHandler.class, 8941);
        }
    }
}
