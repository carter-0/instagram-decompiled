package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Jq  reason: invalid class name and case insensitive filesystem */
public final class C305806Jq extends 1P0 {
    public long A00 = System.currentTimeMillis();
    public final /* synthetic */ 1OE A01;
    public final /* synthetic */ C228102kn A02;
    public final /* synthetic */ List A03;

    public C305806Jq(1OE r3, C228102kn r4, List list) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = list;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int A032 = AnonymousClass0fD.A03(-784425243);
        AnonymousClass3HO r8 = (AnonymousClass3HO) obj;
        int A033 = AnonymousClass0fD.A03(1717322060);
        0qQ.A0B(r8, 0);
        C228102kn r3 = this.A02;
        r3.A0Q.clear();
        r3.A0I = false;
        UserSession userSession = r3.A07;
        1OI A002 = 1OH.A00(userSession);
        1OE r6 = this.A01;
        A002.A0A(r6, r8, -1);
        List list2 = this.A03;
        long j = this.A00;
        C239753Ia A003 = r8.FH3();
        1E4.A00(userSession);
        ArrayList arrayList = r3.A0R;
        arrayList.removeAll(list2);
        UserSession userSession2 = 1NM.A00(userSession).A00;
        0Tu r12 = 0Tu.A05;
        if (182.A06(r12, userSession2, 36317517609506043L) && (list = A003.A0H) != null && (!list.isEmpty())) {
            arrayList.clear();
            arrayList.addAll(list);
        }
        r3.A09 = A003.A0E;
        ReelStore A05 = 1OP.A05(userSession);
        List A012 = AnonymousClass3P8.A01(userSession, A003);
        List A004 = AnonymousClass3P8.A00(userSession, A003);
        User A013 = AnonymousClass0t1.A01.A01(userSession);
        0sn r2 = A003.A0I;
        if (r2 == null) {
            r2 = 0sn.A00;
        }
        synchronized (A05) {
            1Np r10 = new 1Np();
            UserSession userSession3 = A05.A09;
            if (!182.A06(r12, 1NM.A00(userSession3).A00, 36317517608588528L)) {
                ReelStore.A0E(A05.A03, A05, A004);
            }
            ReelStore.A0D(r10, A05, A013, A012, r2);
            ReelStore.A02(A05, r10.A00.values(), true);
            1Np r122 = A05.A03;
            r122.A03(r10.A00());
            for (String str : A05.A0C) {
                Map map = A05.A0B;
                if (map.containsKey(str)) {
                    ((List) map.get(str)).addAll(r10.A00());
                }
            }
            AnonymousClass1Nd.A00(userSession3).A05(new AnonymousClass376(r6, ReelStore.A07(A05, r122.A00()), -1, false));
        }
        1OH.A00(userSession).A08(r6, -1);
        C228102kn.A09(A003, r3);
        r3.A0P.DWE(System.currentTimeMillis() - j);
        r3.A0D = false;
        r3.A0B = null;
        AnonymousClass0fD.A0A(1534219533, A033);
        AnonymousClass0fD.A0A(-2106204685, A032);
    }

    public final void onFail(C268654dm r8) {
        int i;
        int A032 = AnonymousClass0fD.A03(-102848349);
        0qQ.A0B(r8, 0);
        C228102kn r2 = this.A02;
        r2.A0I = true;
        1OH.A00(r2.A07).A06(r8, this.A01);
        long j = this.A00;
        C228122kp r3 = r2.A0P;
        long currentTimeMillis = System.currentTimeMillis() - j;
        1XQ r0 = (1XQ) r8.A00();
        if (r0 != null) {
            i = r0.mStatusCode;
        } else {
            i = -1;
        }
        r3.DWD(currentTimeMillis, i);
        AnonymousClass0fD.A0A(-816612856, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(290321296);
        C228102kn r2 = this.A02;
        1OH.A00(r2.A07).A07(this.A01);
        r2.A0H = false;
        AnonymousClass0fD.A0A(1639281655, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-946863778);
        C305806Jq.super.onStart();
        1OH.A00(this.A02.A07).A0C(this.A01, (String) null);
        AnonymousClass0fD.A0A(577790257, A032);
    }
}
