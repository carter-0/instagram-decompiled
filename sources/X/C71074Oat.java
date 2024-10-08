package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

/* renamed from: X.Oat  reason: case insensitive filesystem */
public final class C71074Oat {
    public static final C71074Oat A00 = new Object();

    public static final Long A00(byte[] bArr) {
        try {
            SupplementMessagePayload A0S = C66580MXl.A0S(C71037Oa0.A00(bArr));
            if (!AnonymousClass7TF.A1P(A0S.bitField0_ & 4)) {
                return null;
            }
            SupplementMessageContent supplementMessageContent = A0S.content_;
            if (supplementMessageContent == null) {
                supplementMessageContent = SupplementMessageContent.DEFAULT_INSTANCE;
            }
            0qQ.A07(supplementMessageContent);
            if (supplementMessageContent.A0M().intValue() != 5 || !AnonymousClass7TF.A1P(A0S.bitField0_ & 16)) {
                return null;
            }
            return C51972G9s.A0i(A0S.targetWaThreadId_);
        } catch (C69531NnD e) {
            0KC.A0F("ArmadilloExpressIncomingPayloadDispatcher", "Not able to create transport payload for incoming message", e);
            return null;
        }
    }

    public static final boolean A01(UserSession userSession, String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4) {
        AnonymousClass7TF.A1F(userSession, 0, str);
        0fh.A01("ArmadilloExpressIncomingPayloadDispatcher.handleIncomingPayload", 92391767);
        try {
            C73418PcF pcF = new C73418PcF(userSession, str, str2, bArr, i, i2, i3, i4, j, j2, j3, j4);
            if (182.A06(0Tu.A05, userSession, 36328791894670938L)) {
                MYY.A01("handleIncomingPayload").execute(pcF);
            } else {
                pcF.run();
            }
            return true;
        } finally {
            0fh.A00(-460471470);
        }
    }

    public final boolean A02(UserSession userSession, TransportEvent.Event event, String str, long j, long j2) {
        C242373Tu r4;
        1GK nqw;
        TransportEvent.Event.DeviceChange deviceChange;
        TransportEvent.Event.DeviceChange deviceChange2;
        String str2 = str;
        UserSession userSession2 = userSession;
        TransportEvent.Event event2 = event;
        int A08 = C51970G9q.A08(0, userSession2, event2);
        O0G.A00(userSession2).A00(str2, C66582MXn.A10(2), 7020, 0);
        if (str == null) {
            str2 = DbV.A0s();
        }
        long j3 = j2;
        long j4 = j;
        if (C66581MXm.A1V(event2.eventCase_)) {
            List A1P = 0sr.A1P(new C69513Nmv[]{C69513Nmv.ADDED, C69513Nmv.REPLACED});
            if (event2.eventCase_ == 1) {
                deviceChange = (TransportEvent.Event.DeviceChange) event2.event_;
            } else {
                deviceChange = TransportEvent.Event.DeviceChange.DEFAULT_INSTANCE;
            }
            if (!A1P.contains(deviceChange.A0L())) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("[broadcastIncomingPayload] Unsupported device admin message type, deviceChangeType: ");
                if (event2.eventCase_ == 1) {
                    deviceChange2 = (TransportEvent.Event.DeviceChange) event2.event_;
                } else {
                    deviceChange2 = TransportEvent.Event.DeviceChange.DEFAULT_INSTANCE;
                }
                0KC.A0C("ArmadilloExpressIncomingPayloadDispatcher", AnonymousClass7TF.A0i(deviceChange2.A0L(), A1A));
                C70143Nxx.A00(userSession2, str2, 5, 15, 0, -2, 0, j4, j4, j3);
                return false;
            }
        }
        AnonymousClass3U9 B34 = 2L2.A00(userSession2).B34(j4);
        if (B34 != null) {
            r4 = B34.AiM();
        } else {
            r4 = null;
        }
        if (!C331057Pi.A02(r4) && !C308556Us.A0N(userSession2, B34)) {
            return false;
        }
        0qQ.A0B(str2, A08);
        C72201OyQ oyQ = ((C70577OBz) userSession2.A01(C70577OBz.class, C73913Plo.A00(userSession2, 5))).A00;
        OO2 oo2 = oyQ.A07;
        oo2.A02(str2, "transport_event", true);
        OTY oty = oyQ.A05;
        2Dr r10 = oty.A01;
        if (!r10.A0H.A0F) {
            r10.CnE("RenderOperation");
            oty.A02.A00(str2, (List) null, 413, 0);
        }
        AnonymousClass3U9 B342 = r10.B34(j4);
        if (B342 == null) {
            C70416O5t o5t = new C70416O5t();
            oty.A00.A00(ThreadFetchReason.AE_MISSING_THREAD_AT_TRANSPORT_SYNC_OP_RENDERER, str2, new C73960Pme(o5t, event2, oty, str2, j4, j3), 15, j4, j4);
            nqw = o5t.A00;
        } else {
            List A002 = OTY.A00(event2, B342, oty, str2, j4, j3);
            nqw = new NQW();
            nqw.A0A(A002);
        }
        C71033OZu oZu = oo2.A01;
        oZu.A02(str2, "render_start");
        nqw.A03(new C72217Oyl(oyQ, str2, 1)).A03(new C72217Oyl(oyQ, str2, 0));
        oZu.A02(str2, "dispatch_end");
        if (event2.eventCase_ == 1) {
            C69513Nmv A0L = ((TransportEvent.Event.DeviceChange) event2.event_).A0L();
            0qQ.A07(A0L);
            int ordinal = A0L.ordinal();
            if (ordinal == 1) {
                0Aj A09 = JTU.A09(userSession2);
                DbS.A1L(A09, "in_thread");
                A09.AAJ("security_alert_action", "persist_new_login");
                C66582MXn.A1A(A09, "admin_message_id", str2);
                return true;
            } else if (ordinal == 3) {
                0Aj A092 = JTU.A09(userSession2);
                DbS.A1L(A092, "in_thread");
                A092.AAJ("security_alert_action", "persist_key_changed");
                C66582MXn.A1A(A092, "admin_message_id", str2);
            }
        }
        return true;
    }
}
