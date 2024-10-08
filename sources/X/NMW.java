package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

public final class NMW extends C252233om implements C252243on {
    public final Map A00 = AnonymousClass7TE.A1E();
    public final int A01;
    public final AnonymousClass0iw A02;
    public final C230012om A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static final void A00(NMW nmw, String str, boolean z) {
        Object obj;
        NMW nmw2 = nmw;
        Map map = nmw2.A00;
        String str2 = str;
        if (z) {
            obj = map.remove(str2);
        } else {
            obj = map.get(str2);
        }
        OH5 oh5 = (OH5) obj;
        if (oh5 != null) {
            long currentTimeMillis = System.currentTimeMillis() - oh5.A01;
            String A002 = C294615mk.A00(nmw2.A04);
            String moduleName = nmw2.A02.getModuleName();
            AnonymousClass7TG.A1Q(str2, moduleName);
            String str3 = oh5.A04;
            String str4 = oh5.A02;
            String str5 = oh5.A03;
            int i = oh5.A00;
            int i2 = nmw2.A01;
            Long valueOf = Long.valueOf(currentTimeMillis);
            String str6 = nmw2.A06;
            C230012om.A01(nmw2.A03, (Integer) null, valueOf, str4, moduleName, (String) null, nmw2.A05, str3, str6, (String) null, nmw2.A07, str5, str2, A002, i, i2);
            return;
        }
        0wb.A03("SuggestedUsersOnViewableListener", 002.A0g("Tried to get user with userId: ", str2, " from the viewable info map but no entry was found"));
    }

    public final void onDestroy() {
        this.A00.clear();
    }

    public final void onPause() {
        Iterator A16 = DbV.A16(this.A00);
        while (A16.hasNext()) {
            A00(this, AnonymousClass7TE.A18(A16), false);
        }
    }

    public NMW(AnonymousClass0iw r2, UserSession userSession, Integer num, String str, String str2, String str3, int i) {
        this.A02 = r2;
        this.A01 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = num;
        this.A07 = str3;
        this.A03 = new C230012om(r2, userSession);
    }

    public final void onResume() {
        long currentTimeMillis = System.currentTimeMillis();
        Map map = this.A00;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            OH5 oh5 = (OH5) map.get(A16.next());
            if (oh5 != null) {
                oh5.A01 = currentTimeMillis;
            }
        }
    }
}
