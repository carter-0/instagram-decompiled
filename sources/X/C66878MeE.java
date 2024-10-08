package X;

import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.MeE  reason: case insensitive filesystem */
public abstract class C66878MeE {
    public static final PushChannelType A00(Integer num) {
        int A03 = C51967G9n.A03(num, 0);
        if (A03 == 0) {
            return PushChannelType.IRIS;
        }
        if (A03 == 1) {
            return PushChannelType.MEM;
        }
        throw AnonymousClass7TE.A1K();
    }
}
