package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeClientManager$Observer;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nhv  reason: case insensitive filesystem */
public final class C69241Nhv extends 2Hq implements IGFOAMessagingThreadViewNavigationLogger, C330797Oh {
    public 1wn A00;
    public 1a8 A01;
    public 1a8 A02;
    public UserSession A03;
    public RealtimeClientManager$Observer A04;
    public 2Hm A05;
    public final 0rq A06;
    public final ONY A07;
    public final OO8 A08;
    public final 2Hw A09;
    public final Map A0A;
    public final 14i A0B;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.ONY] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.OO8] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69241Nhv(X.14i r12, com.instagram.common.session.UserSession r13, X.2Hm r14) {
        /*
            r11 = this;
            r6 = 1
            r0 = 4
            X.0qQ.A0B(r12, r0)
            X.2Hj r3 = X.OSZ.A00
            X.2Hv r4 = X.2Hv.A02
            r0 = 0
            r8 = 0
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            X.2Hw r2 = new X.2Hw
            r7 = r6
            r9 = r6
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.0rq r1 = new X.0rq
            r1.<init>()
            r11.<init>(r1, r0)
            r11.A09 = r2
            r11.A05 = r14
            r11.A06 = r1
            X.0eP r1 = X.AnonymousClass7TE.A1L(r4, r2)
            X.2Hv r4 = X.2Hv.A03
            X.2Hj r3 = X.C330797Oh.A00
            boolean r9 = r2.A03
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            X.2Hw r2 = new X.2Hw
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.LinkedHashMap r1 = X.DbY.A0p(r4, r2, r1)
            r11.A0A = r1
            r11.A0B = r12
            r11.A03 = r13
            X.ONY r1 = new X.ONY
            r1.<init>()
            r1.A00 = r0
            r1.A01 = r0
            r1.A03 = r8
            r1.A02 = r8
            r11.A07 = r1
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = -1
            X.OO8 r0 = new X.OO8
            r0.<init>()
            r0.A05 = r8
            r0.A00 = r3
            r0.A01 = r1
            r0.A03 = r8
            r0.A04 = r8
            r0.A02 = r8
            r11.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69241Nhv.<init>(X.14i, com.instagram.common.session.UserSession, X.2Hm):void");
    }

    public final void annotatePushCategory(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A09, "push_category", str);
        this.A07.A01 = str;
    }

    public final void maybeEndFlowSuccess(String str) {
        String str2;
        0qQ.A0B(str, 0);
        OO8 oo8 = this.A08;
        ONY ony = this.A07;
        if (!oo8.A03(ony.A02)) {
            return;
        }
        if (!ony.A03 || ((str2 = ony.A01) != null && str2.equals("direct_v2_user_reaction"))) {
            A0H(this.A09, "end_reason", str);
            A0N();
            Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
            while (A0u.hasNext()) {
                A0C(C66582MXn.A0h(A0u), (String) null);
            }
            2Hm r0 = this.A05;
            if (r0 != null) {
                r0.onLoggerEnded(this);
            }
            this.A05 = null;
            return;
        }
        onEndFlowFail("missing_message_id");
    }

    public final void onEndFlowFail(String str) {
        0qQ.A0B(str, 0);
        A0N();
        Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
        while (A0u.hasNext()) {
            A0A(C66582MXn.A0h(A0u), str);
        }
        2Hm r0 = this.A05;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A05 = null;
    }

    public final void onLogClickEnd() {
    }

    public final void onLogThreadRenderingEnd(boolean z) {
        OO8 oo8 = this.A08;
        synchronized (oo8) {
            oo8.A05 = true;
        }
        ONY ony = this.A07;
        A0I(this.A09, "direct_thread_render", oo8.A00(ony.A02));
        if (z) {
            if (!oo8.A03(ony.A02)) {
                synchronized (this) {
                    if (this.A04 == null && !ony.A02) {
                        PJF pjf = new PJF(this);
                        this.A04 = pjf;
                        RealtimeClientManager.getInstance(this.A03).addObserver(pjf);
                    }
                }
                synchronized (this) {
                    if (this.A01 == null && ony.A02) {
                        C59098J6g j6g = new C59098J6g(this, 33);
                        1a8 A0P = C66581MXm.A0P();
                        this.A01 = A0P;
                        PUD.A00(AnonymousClass6AP.A00(this.A03).A0B, A0P, j6g, 4);
                    }
                }
                synchronized (this) {
                    if (this.A02 == null && ony.A02) {
                        C59098J6g j6g2 = new C59098J6g(this, 34);
                        1a8 A0P2 = C66581MXm.A0P();
                        this.A02 = A0P2;
                        PUD.A00(AnonymousClass6AP.A00(this.A03).A0E, A0P2, j6g2, 4);
                    }
                }
                synchronized (this) {
                    if (this.A00 == null && !ony.A02) {
                        C71932OtG A002 = C71932OtG.A00(this, 47);
                        this.A00 = A002;
                        AnonymousClass1Nd.A00(this.A03).A01(A002, C66729Mba.class);
                    }
                }
                updateExtras(this.A03);
            }
            maybeEndFlowSuccess("rendering");
            return;
        }
        onEndFlowFail("invalid_state");
    }

    public final void updateExtras(UserSession userSession) {
        boolean equals;
        boolean equals2;
        String str;
        0qQ.A0B(userSession, 0);
        LinkedHashMap A0J = C250563lf.A0J(userSession);
        Iterator A0s = AnonymousClass7TF.A0s(A0J);
        while (A0s.hasNext()) {
            Dbb.A1V(AnonymousClass7TE.A1J(A0s), this.A09.A01);
        }
        String A0r = DbS.A0r("act_connection_state", A0J);
        boolean z = false;
        if (A0r == null) {
            equals = false;
        } else {
            equals = A0r.equals("CONNECTED");
        }
        OO8 oo8 = this.A08;
        synchronized (oo8) {
            oo8.A02 = equals;
        }
        String A0r2 = DbS.A0r("mqtt_channel_connection_state", A0J);
        if (A0r2 == null) {
            equals2 = false;
        } else {
            equals2 = A0r2.equals("CONNECTED");
        }
        oo8.A02(equals2);
        HashMap A002 = C67025Mgy.A00(userSession);
        if (A002 instanceof Map) {
            Iterator A0s2 = AnonymousClass7TF.A0s(A002);
            while (A0s2.hasNext()) {
                Dbb.A1V(AnonymousClass7TE.A1J(A0s2), this.A09.A01);
            }
            Boolean bool = (Boolean) A002.get("mem_offline_sync_completed");
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        int i = AnonymousClass6AP.A00(userSession).A02;
        oo8.A01(z);
        Integer valueOf = Integer.valueOf(i);
        Map map = this.A09.A01;
        map.put("mem_offline_sync_queue_size", valueOf);
        if (AnonymousClass43Z.A00 > -1) {
            long j = AnonymousClass43Z.A00;
            synchronized (oo8) {
                oo8.A00 = j;
            }
            map.put(C273654mx.A00(2970), Long.valueOf(AnonymousClass43Z.A00));
        }
        switch (AnonymousClass43Z.A03.intValue()) {
            case 0:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            case 1:
                str = "STARTED";
                break;
            default:
                str = "COMPLETED";
                break;
        }
        map.put("iris_subscription_status", str);
        long max = Math.max(AnonymousClass43Z.A02, AnonymousClass43Z.A01);
        map.put("iris_delta_count", Long.valueOf(Math.max(0, AnonymousClass43Z.A00 - max)));
        synchronized (oo8) {
            oo8.A01 = max;
        }
        this.A03 = userSession;
    }

    public final void A06() {
        A0H(this.A09, "unmet_conditions", this.A08.A00(this.A07.A02));
        0nY.A00().ATE(new C68646NRc(this));
    }

    public final void A0N() {
        0qQ.A07(02m.A0p);
        this.A06.A01(C51965G9l.A0l());
    }

    public final void annotateFirstUserIsBackground(boolean z) {
        A0L(this.A09, "first_user_is_background", z);
    }

    public final void annotateIsDm(boolean z) {
        A0L(this.A09, "is_dm", z);
    }

    public final void annotateIsInstamadillo(boolean z) {
        2Hw r1 = this.A09;
        A0L(r1, "is_instamadillo", z);
        A0L(r1, "is_instamadillo_from_client", z);
        this.A07.A02 = z;
    }

    public final void annotateIsVm(boolean z) {
        A0L(this.A09, "is_vm", z);
    }

    public final void annotateMessageMatchingSuccess(boolean z) {
        A0L(this.A09, "message_matching_success", z);
    }

    public final void annotateMissingMessageId(boolean z) {
        A0L(this.A09, "missing_message_id", z);
        this.A07.A03 = z;
    }

    public final void annotateOpenThreadId(String str) {
        if (str != null) {
            A0H(this.A09, "open_thread_id", str);
        }
        this.A07.A00 = str;
    }

    public final Integer getInstanceKey() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
        if (A0u.hasNext()) {
            return Integer.valueOf(C66582MXn.A0h(A0u).A04);
        }
        return null;
    }

    public final Long getStartTimestamp() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
        if (A0u.hasNext()) {
            return C66582MXn.A0h(A0u).A00;
        }
        return null;
    }

    public final boolean isMarkerOn() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
        if (A0u.hasNext()) {
            return A0M(C66582MXn.A0h(A0u));
        }
        return false;
    }

    public final void maybeEndFlowCancel(String str, String str2) {
        String str3;
        if (str == null || ((str3 = this.A07.A00) != null && str3.equals(str))) {
            onEndFlowCancel(str2);
        }
    }

    public final void onAppBackgrounded() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
        while (A0u.hasNext()) {
            2Hw A0h = C66582MXn.A0h(A0u);
            if (A0h.A07) {
                A07(A0h);
                2Hm r0 = this.A05;
                if (r0 != null) {
                    r0.onLoggerEnded(this);
                }
                this.A05 = null;
            }
        }
    }

    public final void onEndFlowCancel(String str) {
        A0N();
        Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
        while (A0u.hasNext()) {
            A09(C66582MXn.A0h(A0u), str);
        }
        2Hm r0 = this.A05;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A05 = null;
    }
}
