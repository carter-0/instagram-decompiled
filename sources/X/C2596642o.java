package X;

import android.os.Handler;
import android.os.Message;
import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$DIRECT_REAL_TIME;
import com.instagram.realtimeclient.EventRouter;
import com.instagram.realtimeclient.MainRealtimeEventHandler$Delegate;
import com.instagram.realtimeclient.RealtimeOperation;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.42o  reason: invalid class name and case insensitive filesystem */
public final class C2596642o implements MainRealtimeEventHandler$Delegate {
    public final C2596742q A00;

    public final String getProtocol() {
        return RealtimeProtocol.DIRECT_V2;
    }

    public final int getSkywalkerMessageType() {
        return 1;
    }

    public final void handleRealtimeOperation(RealtimeOperation realtimeOperation) {
        String str;
        DLog.d(DLogTag$DIRECT_REAL_TIME.INSTANCE, "op=%s", new Object[]{realtimeOperation.op});
        if (realtimeOperation.op.ordinal() == 0) {
            String str2 = realtimeOperation.path;
            if (str2.startsWith(RealtimeProtocol.THREADS_PREFIX) && str2.contains(RealtimeProtocol.ACTIVITY_INDICATOR_COMPONENT)) {
                Class<C2596642o> cls = C2596642o.class;
                0KC.A02(cls, "indicate_activity: in addOrReplaceDirectActivityIndicator");
                Map match = EventRouter.match(RealtimeProtocol.ADD_DIRECT_V2_INDICATE_ACTIVITY_TEMPLATE, realtimeOperation.path);
                if (match != null && (str = (String) match.get(RealtimeProtocol.THREAD_ID)) != null) {
                    try {
                        N4G parseFromJson = C70069Nwl.parseFromJson(16P.A00(realtimeOperation.value));
                        C2596742q r9 = this.A00;
                        C299305uu r7 = new C299305uu(str, (String) null);
                        C299305uu r6 = new C299305uu(parseFromJson.A01, (String) null);
                        C2596742q.A00(r9, r7, r6, parseFromJson.A00);
                        C2596942s r5 = r9.A02;
                        C70574OBw oBw = (C70574OBw) r5.A00(r6);
                        if (oBw != null) {
                            r9.A00.removeMessages(1, oBw);
                            C299305uu r3 = oBw.A00;
                            String str3 = r3.A01;
                            String str4 = r7.A01;
                            if (str4 == null || !str4.equals(str3)) {
                                C299305uu r2 = oBw.A01;
                                String str5 = r2.A01;
                                if (str5 != null) {
                                    r5.A02.remove(str5);
                                }
                                C2596742q.A00(r9, r3, r2, 0);
                            }
                        }
                        C70574OBw oBw2 = new C70574OBw(r6, r7);
                        r5.A01(r6, oBw2);
                        Handler handler = r9.A00;
                        Message obtainMessage = handler.obtainMessage(1, oBw2);
                        0qQ.A07(obtainMessage);
                        handler.sendMessageDelayed(obtainMessage, 10000);
                    } catch (IOException e) {
                        0KC.A05(cls, "invalid activityStatus format from realtime value:", e);
                    }
                }
            }
        }
    }

    public C2596642o(UserSession userSession) {
        this.A00 = MYQ.A00(userSession);
    }
}
