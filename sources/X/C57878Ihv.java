package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ihv  reason: case insensitive filesystem */
public final class C57878Ihv implements Runnable {
    public final /* synthetic */ C267324bN A00;
    public final /* synthetic */ C52018GBp A01;

    public C57878Ihv(C267324bN r1, C52018GBp gBp) {
        this.A01 = gBp;
        this.A00 = r1;
    }

    public final void run() {
        String str;
        Boolean bool;
        String str2;
        C52018GBp gBp = this.A01;
        C52017GBo gBo = gBp.A08;
        ConcurrentHashMap concurrentHashMap = gBp.A0B;
        C267324bN r6 = this.A00;
        Long l = (Long) C51968G9o.A0x(r6, concurrentHashMap);
        ConcurrentHashMap concurrentHashMap2 = gBp.A0A;
        0eP r0 = (0eP) C51968G9o.A0x(r6, concurrentHashMap2);
        if (r0 != null) {
            str = (String) r0.A00;
        } else {
            str = null;
        }
        0eP r02 = (0eP) C51968G9o.A0x(r6, concurrentHashMap2);
        if (r02 != null) {
            bool = (Boolean) r02.A01;
        } else {
            bool = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gBo.A00, gBo.A01), "instagram_reels_auto_advance_countdown_canceled");
        if (A0e.isSampled()) {
            A0e.A9F("countdown_left", l);
            A0e.A7p("for_session", bool);
            String str3 = null;
            C51965G9l.A1L(A0e, r6.A0P);
            A0e.AAJ("cancel_reason", str);
            if (r6.CcK()) {
                str2 = C51966G9m.A1B(r6);
            } else {
                str2 = null;
            }
            A0e.AAJ("ad_id", str2);
            1Xj r03 = r6.A02;
            if (r03 != null) {
                str3 = r03.getId();
            }
            C51965G9l.A1J(A0e, str3);
            A0e.Cgf();
        }
        concurrentHashMap2.put(r6.getId(), new 0eP((Object) null, (Object) null));
    }
}
