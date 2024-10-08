package X;

import android.content.Intent;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.io.IOException;

public abstract class O1N {
    public static void A00(Intent intent) {
        0qQ.A0B(intent, 0);
        String str = null;
        try {
            AnonymousClass5HJ A00 = AnonymousClass5HJ.A00(intent, (String) null, false);
            if (A00 != null) {
                str = A00.A0j;
            }
        } catch (IOException unused) {
        }
        AnonymousClass69F A002 = AnonymousClass69E.A00(str);
        long ExJ = A002.ExJ(AnonymousClass05K.A0C);
        A002.Eac("ADMMessageHandler", ExJ);
        try {
            AnonymousClass5HJ A003 = AnonymousClass5HJ.A00(intent, "ADM", false);
            if (A003 != null) {
                MZZ.A00(A003, ExJ);
            }
        } catch (IOException unused2) {
        }
        1XZ A004 = AnonymousClass3F2.A00();
        PushChannelType pushChannelType = PushChannelType.AMAZON;
        A004.A06(intent, pushChannelType, Long.valueOf(ExJ), AnonymousClass3FH.A00(pushChannelType));
    }
}
