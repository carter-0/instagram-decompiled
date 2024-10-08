package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class W0E {
    public static volatile W0E A04;
    public ArrayList A00 = new ArrayList();
    public boolean A01;
    public final 1QP A02;
    public final UserSession A03;

    public static boolean A01(W0E w0e, Object obj) {
        0qQ.A0B(obj, 0);
        return 182.A06(0Tu.A05, w0e.A03, 36325592144032839L);
    }

    public final void A02(C255773uh r11, String str) {
        String str2;
        0qQ.A0B(r11, 0);
        UserSession userSession = this.A03;
        0Tu r7 = 0Tu.A05;
        if (182.A06(r7, userSession, 36325592144032839L)) {
            1QP r4 = this.A02;
            String str3 = r11.A0j;
            0qQ.A07(str3);
            if (!r4.isOngoingFlow(r4.generateFlowId(17308601, String.valueOf(str3).hashCode()))) {
                this.A00 = new ArrayList();
                this.A01 = false;
                long generateFlowId = r4.generateFlowId(17308601, String.valueOf(str3).hashCode());
                r4.flowStartIfNotOngoing(generateFlowId, new UserFlowConfig(str, true));
                r4.flowAnnotate(generateFlowId, AnonymousClass000.A00(813), str);
                182.A06(r7, userSession, 36325592144032839L);
                Long A002 = A00(this, str3);
                if (A002 != null) {
                    long longValue = A002.longValue();
                    1iA A0C = r11.A0C();
                    ArrayList arrayList = null;
                    if (A0C != null) {
                        str2 = A0C.name();
                    } else {
                        str2 = null;
                    }
                    r4.flowAnnotate(longValue, "media_type", str2);
                    r4.flowAnnotate(longValue, AnonymousClass000.A00(3556), r11.A0B().name());
                    List<C255783ui> A0b = r11.A0b();
                    if (A0b != null) {
                        arrayList = AnonymousClass7TG.A0r(A0b);
                        for (C255783ui r0 : A0b) {
                            arrayList.add(r0.A11.name());
                        }
                    }
                    r4.flowAnnotate(longValue, "stickers", String.valueOf(arrayList));
                    1Xj r02 = r11.A0b;
                    if (r02 != null) {
                        r4.flowAnnotate(longValue, "cross_shared_to_fb", r02.A5O() ? 1 : 0);
                    }
                    r4.flowAnnotate(longValue, Pxd.A00(234), r11.A1C());
                }
            }
        }
    }

    public static final Long A00(W0E w0e, String str) {
        1QP r3 = w0e.A02;
        long generateFlowId = r3.generateFlowId(17308601, String.valueOf(str).hashCode());
        if (r3.isOngoingFlow(generateFlowId)) {
            return Long.valueOf(generateFlowId);
        }
        return null;
    }

    public W0E(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = AnonymousClass1QO.A00(userSession);
    }

    public final void A03(String str) {
        Long A002;
        if (A01(this, str) && (A002 = A00(this, str)) != null) {
            this.A02.flowAnnotate(A002.longValue(), "loaded_from_memory", 1);
        }
    }

    public final void A04(String str, String str2) {
        Long A002;
        if (A01(this, str) && (A002 = A00(this, str)) != null) {
            long longValue = A002.longValue();
            1QP r3 = this.A02;
            r3.flowAnnotate(longValue, AnonymousClass000.A00(537), str2);
            r3.flowEndCancel(longValue, str2);
        }
    }
}
