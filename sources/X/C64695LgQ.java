package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LgQ  reason: case insensitive filesystem */
public final class C64695LgQ implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032;
        String str;
        int i;
        Object obj2 = obj;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(1864379993);
            C61149Jy0 jy0 = (C61149Jy0) obj2;
            int A0D = AnonymousClass7TG.A0D(jy0, -234716575);
            C56911IHg iHg = (C56911IHg) this.A03;
            UserSession userSession = iHg.A0A;
            if (182.A06(0Tu.A05, userSession, 36329723902837029L)) {
                C363388je.A00(userSession).A01(iHg.A08, new C65243Lpn((AnonymousClass818) this.A01, iHg, jy0, (Integer) this.A02, this.A04), "after_new_fbc");
            } else {
                C56911IHg.A01((AnonymousClass818) this.A01, iHg, jy0, (Integer) this.A02);
            }
            AnonymousClass0fD.A0A(1534380603, A0D);
            i = 620373194;
        } else {
            A032 = AnonymousClass0fD.A03(-1374338546);
            WQL wql = (WQL) obj2;
            int A033 = AnonymousClass0fD.A03(-208800021);
            0qQ.A0B(wql, 0);
            AnonymousClass1Nd.A00((0lg) this.A03).A02(this, WQL.class);
            C307896Rx r4 = (C307896Rx) this.A02;
            C277014uI r2 = (C277014uI) this.A01;
            C308276Tl r1 = new C308276Tl();
            r1.A03(this.A04, 0);
            switch (wql.A01.intValue()) {
                case 1:
                    str = "complete";
                    break;
                case 2:
                    str = "fallback";
                    break;
                default:
                    str = "closed";
                    break;
            }
            r1.A02(str);
            C299275ur.A00(r4, r1.A00(), r2);
            AnonymousClass0fD.A0A(-1097157859, A033);
            i = -152873477;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public C64695LgQ(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
        this.A04 = str;
    }
}
