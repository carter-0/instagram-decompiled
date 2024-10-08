package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4ZZ  reason: invalid class name */
public final class AnonymousClass4ZZ extends 1P0 {
    public long A00 = System.currentTimeMillis();
    public final /* synthetic */ AnonymousClass2l3 A01;
    public final /* synthetic */ 1OE A02;
    public final /* synthetic */ C228102kn A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ boolean A05;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        List list;
        AnonymousClass2l3 r0;
        int A032 = AnonymousClass0fD.A03(-1648405938);
        AnonymousClass3HO r6 = (AnonymousClass3HO) obj;
        int A033 = AnonymousClass0fD.A03(-1945470903);
        0qQ.A0B(r6, 0);
        C239753Ia A002 = r6.FH3();
        C228102kn r7 = this.A03;
        1E4.A00(r7.A07);
        boolean z = this.A05;
        if (!z || !r7.A0T.get()) {
            if (z && (((list = A002.A0J) == null || list.isEmpty()) && (r0 = this.A01) != null)) {
                AnonymousClass1HD r2 = r0.A0H.A03.A01;
                r2.A01.A03("CACHED_STORIES_TRAY_FAILED", "empty");
                r2.A00().A00(1Gx.A03);
            }
            C228102kn.A08(this.A02, r6, r7, -1, this.A00, z);
            C228102kn.A07(this.A01, z);
            i = -1603884232;
        } else {
            AnonymousClass2l3 r02 = this.A01;
            if (r02 != null) {
                AnonymousClass1HD r22 = r02.A0H.A03.A01;
                r22.A01.A03("CACHED_STORIES_TRAY_FAILED", "cancel");
                r22.A00().A00(1Gx.A03);
            }
            i = 858981999;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(1866418780, A032);
    }

    public AnonymousClass4ZZ(AnonymousClass2l3 r3, 1OE r4, C228102kn r5, Integer num, boolean z) {
        this.A05 = z;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = num;
    }

    public final void onFail(C268654dm r11) {
        int A032 = AnonymousClass0fD.A03(1786885991);
        C268654dm r4 = r11;
        0qQ.A0B(r11, 0);
        boolean z = this.A05;
        if (!z) {
            String valueOf = String.valueOf(r11.A01());
            AnonymousClass2l3 r0 = this.A01;
            if (r0 != null) {
                r0.A05(false, valueOf);
            }
        }
        C228102kn.A03(r4, this.A02, this.A03, this.A00, z);
        AnonymousClass0fD.A0A(-1891485722, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1857011472);
        boolean z = this.A05;
        C228102kn r2 = this.A03;
        1OH.A00(r2.A07).A07(this.A02);
        if (!z) {
            r2.A0G = false;
        }
        r2.A0C = true;
        AnonymousClass0fD.A0A(-455298764, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-163180832);
        AnonymousClass4ZZ.super.onStart();
        if (this.A05) {
            this.A03.A0Q.clear();
        }
        UserSession userSession = this.A03.A07;
        1OI A002 = 1OH.A00(userSession);
        1OE r1 = this.A02;
        A002.A0C(r1, (String) null);
        C2372236u.A00(userSession).A05(r1);
        if (182.A06(0Tu.A05, userSession, 36327370260494721L)) {
            C2372336v A003 = C2372236u.A00(userSession);
            AnonymousClass2l3 r0 = this.A01;
            synchronized (A003) {
                A003.A00 = r0;
            }
        }
        AnonymousClass0fD.A0A(-937350023, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(1327903029);
        AnonymousClass3HO r9 = (AnonymousClass3HO) obj;
        int A033 = AnonymousClass0fD.A03(-553301623);
        0qQ.A0B(r9, 0);
        C239753Ia A002 = r9.FH3();
        C228102kn r4 = this.A03;
        UserSession userSession = r4.A07;
        1E4.A00(userSession);
        if (!this.A05) {
            C638918c.A01(C61170le.A00).A0H();
            r4.A0T.set(true);
            String str = A002.A0D;
            if (str != null && str.length() > 0) {
                1Av A003 = 1Au.A00(userSession);
                0qQ.A0B(A003, 1);
                A003.A0t(str);
            }
            C228102kn.A0A(A002, r4);
        }
        AnonymousClass0fD.A0A(1695967160, A033);
        AnonymousClass0fD.A0A(-1013209665, A032);
    }
}
