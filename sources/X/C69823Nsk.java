package X;

import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.Nsk  reason: case insensitive filesystem */
public abstract class C69823Nsk {
    public static final PushChannelType A00(String str) {
        for (PushChannelType pushChannelType : PushChannelType.values()) {
            if (0qQ.A0K(pushChannelType.name(), str)) {
                return pushChannelType;
            }
        }
        return null;
    }
}
