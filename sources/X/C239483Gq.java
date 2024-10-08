package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Gq  reason: invalid class name and case insensitive filesystem */
public final class C239483Gq {
    public final 1Xz A00;
    public final C239453Gn A01;
    public final 1Xu A02;
    public final C239443Gm A03;
    public final 1XI A04;
    public final String A05;

    public C239483Gq(1Xz r2, C239453Gn r3, 1Xu r4, C239443Gm r5, 1XI r6, String str) {
        0qQ.A0B(r4, 4);
        0qQ.A0B(str, 6);
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = str;
    }

    public final AnonymousClass5HJ A00(String str, boolean z) {
        0qQ.A0B(str, 0);
        C239443Gm r6 = this.A03;
        0xa r4 = r6.A03;
        boolean contains = r4.contains(002.A0R(str, "|showing"));
        0xY AR4 = r4.AR4();
        AR4.ED3(002.A0R(str, "|showing"));
        AR4.apply();
        String A002 = C284285Lx.A00(this.A05, str);
        AnonymousClass5HJ r5 = null;
        this.A00.A03((Runnable) null, A002, 64278);
        this.A01.A01(A002);
        if (contains) {
            0sn r0 = (List) r6.A05.get(str);
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            r5 = (AnonymousClass5HJ) 00k.A0L(r0);
        }
        if (z) {
            List list = (List) r6.A05.remove(str);
            0xY AR42 = r4.AR4();
            AR42.ED3(002.A0R(str, "|showing"));
            if (list != null) {
                int i = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AR42.ED3(002.A0G(str, '|', i));
                    i = i2;
                }
            }
            AR42.apply();
        }
        return r5;
    }

    public final void A01(0lg r15, Runnable runnable, String str, boolean z, boolean z2) {
        UserSession userSession;
        String str2 = str;
        String A002 = C284285Lx.A00(this.A05, str2);
        0lg r10 = r15;
        if (r15 instanceof UserSession) {
            userSession = (UserSession) r10;
        } else {
            userSession = null;
        }
        C239443Gm r1 = this.A03;
        0sn r8 = (List) r1.A05.get(str2);
        if (r8 == null) {
            r8 = 0sn.A00;
        }
        1XI r4 = this.A04;
        C370438wT AEa = r4.AEa(userSession, A002, str2, r8, z);
        AEa.A02 = z2;
        AnonymousClass5HJ r2 = AEa.A04;
        0qQ.A07(r2);
        0xY AR4 = r1.A03.AR4();
        AR4.E5T(002.A0R(str2, "|showing"), true);
        AR4.apply();
        this.A02.A05(r2, r15);
        this.A00.A02(AEa, r10, runnable, A002, 64278);
        r4.AAv(r2, userSession, str2);
    }
}
