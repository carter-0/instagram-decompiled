package X;

import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.Map;

/* renamed from: X.63q  reason: invalid class name and case insensitive filesystem */
public final class C3025263q implements AnonymousClass66d {
    public final /* synthetic */ AnonymousClass638 A00;

    public C3025263q(AnonymousClass638 r1) {
        this.A00 = r1;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r8, Map map) {
        Number number;
        int i;
        AnonymousClass1aS r1;
        AnonymousClass638 r12 = this.A00;
        AnonymousClass638 r0 = AnonymousClass638.$redex_init_class;
        AnonymousClass6AQ r5 = r12.A09;
        if (r5 != null && map != null && (number = (Number) map.get("MEMContextConnectionStateChangeUserInfoKey")) != null) {
            map.get("MEMContextConnectionStateChangeSourceUserInfoKey");
            map.get("MEMContextConnectionStateChangeReasonUserInfoKey");
            int intValue = number.intValue();
            if (intValue == 2) {
                map.get("MEMContextConnectionIpAddressesUserInfoKey");
                map.get("MEMContextConnectionWinnerStreamIpAddressUserInfoKey");
                map.get("MEMContextConnectionWinnerStreamPortUserInfoKey");
                map.get("MEMContextConnectionIdUserInfoKey");
                map.get("MEMContextDNSResolutionMethodUserInfoKey");
                r5.A00 = 2;
                r5.A05 = System.currentTimeMillis();
                2I1 r02 = r5.A0G;
                if (r02 != null) {
                    02m r3 = r02.A02;
                    int i2 = r02.A01;
                    int i3 = r02.A00;
                    r3.markerPoint(i2, i3, "act_connection_end");
                    r3.markerPoint(i2, i3, "offline_sync_start");
                }
                IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = r5.A0H;
                if (iGFOAMessagingReadyLogger != null) {
                    iGFOAMessagingReadyLogger.onLogActConnectionEnd();
                    iGFOAMessagingReadyLogger.onLogOfflineSyncStart();
                }
                r5.A0B.accept(Integer.valueOf(r5.A00));
                r5.A08 = false;
                r5.A07 = false;
                r5.A02 = -1;
                r5.A0E.accept(false);
                r5.A09.set(true);
                return;
            }
            int i4 = 1;
            if (intValue == 1) {
                map.get("MEMContextConnectionTokenReasonUserInfoKey");
                2I1 r03 = r5.A0G;
                if (r03 != null) {
                    r03.A02.markerPoint(r03.A01, r03.A00, "act_connection_start");
                }
                IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger2 = r5.A0H;
                if (iGFOAMessagingReadyLogger2 != null) {
                    iGFOAMessagingReadyLogger2.onLogActConnectionStart();
                }
                r5.A00 = 1;
                r1 = r5.A0B;
            } else if (intValue == 0) {
                Number number2 = (Number) map.get("MEMContextConnectionFailureCodeUserInfoKey");
                map.get("MEMContextDisconnectFlagsUserInfoKey");
                map.get("MEMContextDNSResolutionMethodUserInfoKey");
                map.get("MEMContextConnectionIpAddressesUserInfoKey");
                if (number2 != null) {
                    i = number2.intValue();
                } else {
                    i = -1;
                }
                if (i != -1) {
                    2I1 r2 = r5.A0G;
                    if (r2 != null) {
                        r2.A06("connection_failure_code", String.valueOf(i));
                    }
                    IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger3 = r5.A0H;
                    if (iGFOAMessagingReadyLogger3 != null) {
                        iGFOAMessagingReadyLogger3.annotateConnectionFailureCode(i);
                    }
                }
                r5.A00 = 0;
                r5.A08 = false;
                r5.A07 = false;
                r5.A02 = -1;
                r5.A0E.accept(false);
                r5.A06 = System.currentTimeMillis();
                r1 = r5.A0B;
                i4 = r5.A00;
            } else {
                return;
            }
            r1.accept(Integer.valueOf(i4));
        }
    }
}
