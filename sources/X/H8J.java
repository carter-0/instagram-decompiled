package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class H8J extends 0ng {
    public final /* synthetic */ GJ0 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8J(GJ0 gj0, UserSession userSession, String str, String str2, String str3) {
        super(1829080448, 5, true, false);
        this.A00 = gj0;
        this.A04 = str;
        this.A02 = str2;
        this.A01 = userSession;
        this.A03 = str3;
    }

    public final void run() {
        GJ0 gj0 = this.A00;
        String str = this.A04;
        String str2 = this.A02;
        UserSession userSession = this.A01;
        String str3 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        long j = gj0.A05.getLong("LAST_OPENED_EFFECT_PAGE_TIMESTAMP_KEY", -1);
        if (j != -1 && TimeUnit.MILLISECONDS.toHours(C51966G9m.A07(j)) <= 24) {
            Map map = gj0.A00;
            if (currentTimeMillis - DbY.A04(C51966G9m.A14(str2, map)) > IMZ.A04) {
                Map map2 = gj0.A01;
                if (map2.containsKey(str)) {
                    if (!"loop_playback_25_percent".equals(str)) {
                        Map map3 = gj0.A02;
                        Set set = (Set) map3.get(str2);
                        if (set == null) {
                            set = AnonymousClass7TE.A1F();
                            map3.put(str2, set);
                        }
                        if (!set.contains(str)) {
                            set.add(str);
                        } else {
                            return;
                        }
                    }
                    int A07 = C51973G9u.A07(str, map2);
                    Map map4 = gj0.A03;
                    map4.put(str2, Integer.valueOf(C51967G9n.A04(C51966G9m.A14(str2, map4), 0) + A07));
                    if (map4.containsKey(str2)) {
                        int A072 = C51973G9u.A07(str2, map4);
                        boolean z = AnonymousClass1B0.A05;
                        int i = 80;
                        if (!AnonymousClass1B1.A00(gj0.A04).A00(1B2.A0A)) {
                            i = 24;
                        }
                        if (A072 >= i) {
                            new IMZ(str2, 100, false).AQ0((Context) null, userSession, str3, (String) null, false, false);
                            map.put(str2, Long.valueOf(currentTimeMillis));
                        }
                    }
                }
            }
        }
    }
}
