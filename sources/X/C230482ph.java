package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2ph  reason: invalid class name and case insensitive filesystem */
public final class C230482ph implements C250603lj {
    public final UserSession A00;
    public final C230462pf A01;
    public final C230472pg A02;
    public final Map A03;
    public final Map A04;

    public final void ATF(AnonymousClass30Y r15, C252093oY r16) {
        long j;
        float f;
        0qQ.A0B(r15, 0);
        C252093oY r4 = r16;
        0qQ.A0B(r4, 1);
        int intValue = r4.CEk(r15).intValue();
        if (intValue == 0) {
            Map map = this.A04;
            String str = r15.A05;
            map.put(str, new C254213s7());
            this.A03.put(str, Float.valueOf(r4.CFe(r15)));
            C230462pf r2 = this.A01;
            Object obj = r15.A03;
            Object obj2 = r15.A04;
            C230472pg r3 = this.A02;
            long currentTimeMillis = System.currentTimeMillis();
            0qQ.A0B(r3, 2);
            if (r2.A02) {
                AnonymousClass1HI.A02.Eym(new C387119lh(r2, r3, obj, obj2, -1.0f, -1, currentTimeMillis));
                return;
            }
            C230462pf.A00(r2, r3, obj, obj2, -1.0f, -1, currentTimeMillis);
        } else if (intValue != 1) {
            A00(r15, r4);
            Map map2 = this.A04;
            String str2 = r15.A05;
            C254213s7 r0 = (C254213s7) map2.get(str2);
            if (r0 != null) {
                j = r0.A01(r4);
            } else {
                j = -1;
            }
            Map map3 = this.A03;
            Number number = (Number) map3.get(str2);
            if (number != null) {
                f = number.floatValue();
            } else {
                f = -1.0f;
            }
            C230462pf r5 = this.A01;
            Object obj3 = r15.A03;
            Object obj4 = r15.A04;
            C230472pg r6 = this.A02;
            long currentTimeMillis2 = System.currentTimeMillis();
            0qQ.A0B(r6, 2);
            if (r5.A02) {
                AnonymousClass1HI.A02.Eym(new C387119lh(r5, r6, obj3, obj4, f, j, currentTimeMillis2));
            } else {
                C230462pf.A00(r5, r6, obj3, obj4, f, j, currentTimeMillis2);
            }
            map2.remove(str2);
            map3.remove(str2);
        } else {
            A00(r15, r4);
        }
    }

    public /* synthetic */ C230482ph(UserSession userSession, C230462pf r4, C230472pg r5) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = hashMap;
        this.A03 = hashMap2;
    }

    private final void A00(AnonymousClass30Y r5, C252093oY r6) {
        float f;
        Map map = this.A04;
        String str = r5.A05;
        C254213s7 r0 = (C254213s7) map.get(str);
        if (r0 != null) {
            r0.A03(r5, r6);
        }
        Map map2 = this.A03;
        float CFe = r6.CFe(r5);
        Number number = (Number) map2.get(str);
        if (number != null) {
            f = number.floatValue();
        } else {
            f = -1.0f;
        }
        map2.put(str, Float.valueOf(Math.max(CFe, f)));
    }
}
