package X;

import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public final class I4H {
    public static final I4H A00 = new Object();
    public static final ConcurrentMap A01;

    public static final RtcConnectionEntity A00(String str) {
        0qQ.A0B(str, 0);
        return (RtcConnectionEntity) A01.get(str);
    }

    public final boolean A01(C74562PxB pxB, RtcConnectionEntity rtcConnectionEntity) {
        ConcurrentMap concurrentMap;
        0qQ.A0B(rtcConnectionEntity, 0);
        String A002 = C70907OQz.A00(rtcConnectionEntity);
        RtcConnectionEntity A003 = A00(A002);
        if (A003 == null || (rtcConnectionEntity instanceof RtcConnectionEntity.LiveInviteConnectionEntity)) {
            concurrentMap = A01;
        } else {
            C69315NjG Bz4 = A003.Bz4();
            C69315NjG Bz42 = rtcConnectionEntity.Bz4();
            0qQ.A0B(Bz42, 0);
            List list = (List) C69315NjG.A00.get(Bz4);
            if (list != null && list.contains(Bz42)) {
                concurrentMap = A01;
                rtcConnectionEntity = ABG.A00(Bz42, A003, rtcConnectionEntity.BWc());
            } else if (pxB == null) {
                return false;
            } else {
                pxB.CmF("call_state_transition", Bz4.name());
                return false;
            }
        }
        concurrentMap.put(A002, rtcConnectionEntity);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.I4H, java.lang.Object] */
    static {
        17j r1 = new 17j();
        r1.A03(16);
        r1.A02(16);
        A01 = r1.A00();
    }
}
