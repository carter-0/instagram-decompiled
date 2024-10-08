package X;

import java.util.concurrent.atomic.AtomicBoolean;

public final class RA8 extends 0ng {
    public final /* synthetic */ C11223SFx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA8(C11223SFx sFx) {
        super(1773997430, 3, false, false);
        this.A00 = sFx;
    }

    public final void run() {
        C11223SFx sFx = this.A00;
        AtomicBoolean atomicBoolean = sFx.A0A;
        if (!atomicBoolean.get()) {
            sFx.A0B.set(false);
            02m r4 = sFx.A04;
            int i = sFx.A00;
            r4.markerAnnotate(936452326, i, "is_http_success", false);
            r4.markerAnnotate(936452326, i, "is_http_time_out", true);
            atomicBoolean.set(true);
        }
        C11223SFx.A00(sFx).removeObserver(sFx.A02, "MEMContextSendPingResultV2Notification", (AnonymousClass2Lq) null);
        AtomicBoolean atomicBoolean2 = sFx.A06;
        if (!atomicBoolean2.get()) {
            sFx.A07.set(false);
            02m r42 = sFx.A04;
            int i2 = sFx.A00;
            r42.markerAnnotate(936452326, i2, "is_act_success", false);
            r42.markerAnnotate(936452326, i2, "is_act_time_out", true);
            atomicBoolean2.set(true);
        }
        C11223SFx.A00(sFx).removeObserver(sFx.A03, "MqttChannelHealthCheckCompleted", (AnonymousClass2Lq) null);
        AtomicBoolean atomicBoolean3 = sFx.A0C;
        if (!atomicBoolean3.get()) {
            sFx.A0D.set(false);
            02m r43 = sFx.A04;
            int i3 = sFx.A00;
            r43.markerAnnotate(936452326, i3, "is_mqtt_success", false);
            r43.markerAnnotate(936452326, i3, "is_mqtt_time_out", true);
            atomicBoolean3.set(true);
        }
        C11223SFx.A00(sFx).removeObserver(sFx.A01, "DGWSendPingCompletedNotification", (AnonymousClass2Lq) null);
        AtomicBoolean atomicBoolean4 = sFx.A08;
        if (!atomicBoolean4.get()) {
            sFx.A09.set(false);
            02m r44 = sFx.A04;
            int i4 = sFx.A00;
            r44.markerAnnotate(936452326, i4, "is_dgw_success", false);
            r44.markerAnnotate(936452326, i4, "is_dgw_time_out", true);
            atomicBoolean4.set(true);
        }
        sFx.A04.markerEnd(936452326, sFx.A00, 2);
    }
}
