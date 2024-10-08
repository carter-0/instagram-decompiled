package X;

import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Map;

/* renamed from: X.2ud  reason: invalid class name and case insensitive filesystem */
public final class C232902ud {
    public final UserSession A00;
    public final C230562pp A01;
    public final C249763kK A02;
    public final 0hq A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass4DU A05;
    public final C228412ld A06;

    public C232902ud(0hq r2, UserSession userSession, C230562pp r4, AnonymousClass4DU r5, AnonymousClass4DU r6, C228412ld r7, C249763kK r8) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A00 = userSession;
        this.A03 = r2;
        this.A06 = r7;
        this.A01 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A02 = r8;
    }

    public final void A00(1Xj r29, int i) {
        long j;
        long j2;
        long j3;
        1Xj r11 = r29;
        0qQ.A0B(r11, 0);
        UserSession userSession = this.A00;
        C10709Rwn rwn = (C10709Rwn) userSession.A01(C10709Rwn.class, C13328TVb.A00);
        long now = rwn.A00.now();
        Number number = (Number) rwn.A02.remove(r11.getId());
        if (number != null) {
            long longValue = now - number.longValue();
            Map map = rwn.A03;
            Number number2 = (Number) map.get(r11.getId());
            if (number2 == null) {
                number2 = 0L;
            }
            map.put(r11.getId(), Long.valueOf(longValue + number2.longValue()));
            Map map2 = rwn.A01;
            Number number3 = (Number) map2.get(r11.getId());
            if (number3 == null || number3.longValue() < longValue) {
                map2.put(r11.getId(), Long.valueOf(longValue));
            }
            if (longValue > 250) {
                AnonymousClass3W1 BQr = this.A06.BQr(r11);
                AnonymousClass4DU r12 = this.A05;
                Number number4 = (Number) map2.get(r11.getId());
                if (number4 != null) {
                    j = number4.longValue();
                } else {
                    j = 0;
                }
                Number number5 = (Number) map.get(r11.getId());
                if (number5 != null) {
                    j2 = number5.longValue();
                } else {
                    j2 = 0;
                }
                Number number6 = (Number) map.get(r11.getId());
                if (number6 != null) {
                    j3 = number6.longValue();
                } else {
                    j3 = 0;
                }
                int i2 = (j3 > longValue ? 1 : (j3 == longValue ? 0 : -1));
                boolean z = false;
                if (i2 > 0) {
                    z = true;
                }
                C254213s7 r7 = new C254213s7();
                r7.A04 = j;
                r7.A05 = j2;
                r7.A02 = longValue;
                Boolean valueOf = Boolean.valueOf(z);
                C52365GPl.A00(new PlaylistContext((String) null), userSession, r11, r12, BQr, (C228182kv) null, new SearchContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null), this.A02, r7, valueOf, (String) null);
            }
        }
        C230562pp r0 = this.A01;
        int i3 = i;
        r0.A03(r11, i3);
        r0.A02(r11, i3);
        C71342cb.A00(userSession).A0D(this.A05, "back", this.A03.A0M());
        C71342cb.A00(userSession).A0E(C66579MXk.A00(144), this.A04);
    }

    public final void A01(1Xj r10, int i, int i2) {
        0qQ.A0B(r10, 0);
        UserSession userSession = this.A00;
        C71342cb.A00(userSession).A0D(this.A04, "long_press", this.A03.A0M());
        C71342cb.A00(userSession).A0E(C66579MXk.A00(144), this.A05);
        C10709Rwn rwn = (C10709Rwn) userSession.A01(C10709Rwn.class, C13328TVb.A00);
        rwn.A02.put(r10.getId(), Long.valueOf(rwn.A00.now()));
        C230562pp r3 = this.A01;
        r3.A00((0jB) null, r10, i, i2, true);
        r3.A01(C254193s5.A01, r10, i);
    }
}
