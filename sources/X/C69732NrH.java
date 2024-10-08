package X;

import com.facebook.rsys.call.gen.CallModel;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.meta.foa.session.FoaUserSession;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.NrH  reason: case insensitive filesystem */
public abstract class C69732NrH {
    public static final C74562PxB A00(CallModel callModel, FoaUserSession foaUserSession) {
        String str;
        RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity;
        Long l = null;
        UserSession A00 = C56316HwT.A00(foaUserSession);
        if (A00 == null || callModel == null || (str = callModel.sharedCallId) == null) {
            return null;
        }
        ConcurrentMap concurrentMap = I4H.A01;
        RtcConnectionEntity A002 = I4H.A00(002.A0T(A00.A06, str, '_'));
        if (A002 instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) A002;
        } else {
            rtcCallConnectionEntity = null;
        }
        OEO A003 = O26.A00(A00);
        if (rtcCallConnectionEntity != null) {
            l = rtcCallConnectionEntity.A09;
        }
        return A003.A01.BWh(l);
    }
}
