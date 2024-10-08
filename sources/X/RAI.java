package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.msys.mci.GlobalNotificationCenter;
import com.facebook.msys.mci.NotificationCenterInternal;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

public final class RAI extends 0ng {
    public final /* synthetic */ 0no A00;
    public final /* synthetic */ 2Io A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAI(0no r4, 2Io r5) {
        super(1773997430, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
    }

    public final void run() {
        NotificationCenterInternal notificationCenterInternal;
        2Io r5 = this.A01;
        UserSession userSession = r5.A04;
        if (userSession.A07.intValue() != 2 && userSession.A07.intValue() != 3 && !userSession.A07()) {
            boolean z = r5.A07;
            boolean z2 = r5.A05.get();
            long now = AwakeTimeSinceBootClock.INSTANCE.now();
            if (z2 ? now - r5.A01 > 12000 : r5.A08 && now - r5.A00 <= r5.A03 * 1000) {
                C11223SFx sFx = new C11223SFx(userSession);
                int incrementAndGet = r5.A06.incrementAndGet();
                int i = r5.A02;
                02m r9 = sFx.A04;
                int i2 = sFx.A00;
                r9.markerStart(936452326, i2);
                if (r9.isMarkerOn(936452326, i2)) {
                    if (incrementAndGet == 1) {
                        r9.markerAnnotate(936452326, i2, "is_first_time_check", true);
                    }
                    Iterator A0s = AnonymousClass7TF.A0s(C250563lf.A0J(sFx.A05));
                    while (A0s.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                        r9.markerAnnotate(936452326, i2, DbT.A13(A1J), DbS.A0s(A1J));
                    }
                    r9.markerAnnotate(936452326, i2, "current_check_count", incrementAndGet);
                    r9.markerAnnotate(936452326, i2, "instance_key", i2);
                    r9.markerAnnotate(936452326, i2, "moinitor_id", i);
                    r9.markerAnnotate(936452326, i2, "is_account_switch", z);
                    r9.markerAnnotate(936452326, i2, TraceFieldType.IsForeground, z2);
                    if (!sFx.A0A.get()) {
                        1Pq A0S = Pxf.A0S();
                        A0S.A02("https://www.instagram.com/status.php");
                        A0S.A01(AnonymousClass05K.A0N);
                        1QS A002 = A0S.A00();
                        T6M t6m = new T6M(sFx);
                        AnonymousClass1QT A0E = JTQ.A0E();
                        A0E.A03 = 1Fe.A03;
                        AnonymousClass1CO.A00().A02(t6m, A002, A0E.A00());
                    }
                    if (!sFx.A06.get()) {
                        C11223SFx.A00(sFx).addObserver(sFx.A02, "MEMContextSendPingResultV2Notification", 5, (AnonymousClass2Lq) null);
                        synchronized (GlobalNotificationCenter.class) {
                            notificationCenterInternal = GlobalNotificationCenter.sInstance;
                            if (notificationCenterInternal == null) {
                                notificationCenterInternal = new NotificationCenterInternal();
                                GlobalNotificationCenter.sInstance = notificationCenterInternal;
                            }
                        }
                        notificationCenterInternal.postStrictNotification("GMEMContextSendPingNotification", 1, (AnonymousClass2Lq) null);
                    }
                    if (!sFx.A0C.get()) {
                        C11223SFx.A00(sFx).addObserver(sFx.A03, "MqttChannelHealthCheckCompleted", 3, (AnonymousClass2Lq) null);
                        C11223SFx.A00(sFx).postStrictNotification("MqttSendChannelHealthCheck", 3, (AnonymousClass2Lq) null);
                    }
                    if (!sFx.A08.get()) {
                        C11223SFx.A00(sFx).addObserver(sFx.A01, "DGWSendPingCompletedNotification", 1, (AnonymousClass2Lq) null);
                        C11223SFx.A00(sFx).postStrictNotification("DGWSendPingNotification", 1, (AnonymousClass2Lq) null);
                    }
                    0no A003 = 0no.A00();
                    0qQ.A07(A003);
                    A003.A01(new RA8(sFx), 6000);
                }
            }
            this.A00.A01(this, 120000);
        }
    }
}
