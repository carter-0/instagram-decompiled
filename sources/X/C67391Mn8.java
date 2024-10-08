package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mn8  reason: case insensitive filesystem */
public final class C67391Mn8 extends 1P0 {
    public final /* synthetic */ C67390Mn7 A00;
    public final /* synthetic */ C14405TvY A01;

    public C67391Mn8(C67390Mn7 mn7, C14405TvY tvY) {
        this.A00 = mn7;
        this.A01 = tvY;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -1337761154);
        C67391Mn8.super.onFail(r3);
        AnonymousClass0fD.A0A(1287801374, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(451554490);
        this.A01.A00 = false;
        AnonymousClass0fD.A0A(761001149, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-623311337);
        NH8 nh8 = (NH8) obj;
        int A0D = AnonymousClass7TG.A0D(nh8, -1153502894);
        C67391Mn8.super.onSuccess(nh8);
        C67390Mn7 mn7 = this.A00;
        List<PUI> list = nh8.A01;
        if (list != null) {
            for (PUI it : list) {
                HashSet hashSet = new HashSet();
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    if (!hashSet.add(((C66942Mfb) it2.next()).A01())) {
                        it2.remove();
                    }
                }
            }
            C67382Mmy mmy = mn7.A00;
            0sn r1 = nh8.A00;
            if (r1 == null) {
                r1 = 0sn.A00;
            }
            mmy.A00 = AnonymousClass7TE.A1D(list);
            mmy.A01 = r1;
            UserSession userSession = mmy.A02;
            1Av A002 = 1Au.A00(userSession);
            String A003 = C67378Mmu.A00(mmy.A00, C67396MnD.A00);
            0s0 r12 = A002.A7F;
            AnonymousClass0YZ[] r6 = 1Av.A8a;
            DbS.A1a(A002, A003, r12, r6, 246);
            1Av A004 = 1Au.A00(userSession);
            DbS.A1a(A004, C67378Mmu.A00(mmy.A01, C67397MnE.A00), A004.A7G, r6, 247);
            1Av A005 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            0xY A0p = AnonymousClass7TE.A0p(A005);
            A0p.E5c("search_null_state_last_sycned_timestamp_ms", currentTimeMillis);
            A0p.apply();
            AnonymousClass0fD.A0A(2107766043, A0D);
            AnonymousClass0fD.A0A(-587954819, A03);
            return;
        }
        0qQ.A0F("sections");
        throw AnonymousClass00P.createAndThrow();
    }
}
