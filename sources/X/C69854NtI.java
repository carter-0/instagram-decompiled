package X;

import com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.NtI  reason: case insensitive filesystem */
public abstract class C69854NtI {
    public static final String A00(TransportPayload transportPayload) {
        int i = transportPayload.transportPayloadCase_;
        if (i == 2) {
            DeleteMessagePayload deleteMessagePayload = (DeleteMessagePayload) transportPayload.transportPayload_;
            if ((deleteMessagePayload.bitField0_ & 1) != 0) {
                return deleteMessagePayload.messageOtid_;
            }
            return null;
        } else if (i != 3) {
            return null;
        } else {
            SupplementMessagePayload A0M = transportPayload.A0M();
            if ((A0M.bitField0_ & 1) != 0) {
                return A0M.targetMessageOtid_;
            }
            return null;
        }
    }
}
