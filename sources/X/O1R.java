package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class O1R {
    public static final void A00(AnonymousClass5HJ r4, PushChannelType pushChannelType, UserSession userSession, String str) {
        if (r4 == null) {
            0KC.A0E("logReceivedFromPushIntent", "Notification is null");
            return;
        }
        AnonymousClass0xN A00 = C60510iO.A00(userSession);
        0xI A01 = MYX.A01(r4, str, (List) null);
        A01.A0C("push_channel_type", pushChannelType.name());
        A01.A0C("message_id", C66630MZz.A02(r4));
        A00.EFq(A01);
        MYV myv = MYV.A01;
        C66628MZp A002 = AnonymousClass6BJ.A0R.A00(r4);
        A002.A02 = pushChannelType;
        myv.A08(new AnonymousClass6BJ(A002), "duplicate_dropped");
    }
}
