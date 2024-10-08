package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.PPl  reason: case insensitive filesystem */
public final class C72927PPl implements 0Jp {
    public final AnonymousClass5HJ A00;

    public C72927PPl(AnonymousClass5HJ r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Object, X.NxU] */
    public final void ATC(UserSession userSession, 0Jv r11) {
        String str;
        UserSession userSession2;
        C66957Mfq mfq;
        boolean z;
        String str2;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r11);
        AnonymousClass5HJ r3 = this.A00;
        if (r3.A1S) {
            AnonymousClass2HN A002 = 2HM.A00(userSession);
            AnonymousClass65S A003 = AnonymousClass6ED.A00(userSession);
            A003.A09(A1Z);
            HashMap A01 = OQ0.A01(r3);
            if (DbX.A1Z(A002.A15)) {
                C66956Mfp mfp = C66957Mfq.A0A;
                ? obj = new Object();
                synchronized (mfp) {
                    mfq = C66957Mfq.A09;
                    if (mfq == null) {
                        mfq = new C66957Mfq(obj);
                        C66957Mfq.A09 = mfq;
                    }
                }
                String str3 = userSession.A06;
                C71068Oan oan = mfq.A01;
                if (oan != null) {
                    z = oan.A0J.get();
                } else {
                    z = false;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = mfq.A05;
                if (!C66957Mfq.A03(mfq, str3, concurrentLinkedQueue)) {
                    C71068Oan oan2 = mfq.A01;
                    if (oan2 != null) {
                        str2 = oan2.A0D;
                    } else {
                        str2 = null;
                    }
                    if (!0qQ.A0K(str2, str3) || z) {
                        if (!C66957Mfq.A03(mfq, str3, mfq.A04)) {
                            concurrentLinkedQueue.add(new C61073JwB(str3, C51972G9s.A0n(), "push_notification", A01));
                        }
                        ConcurrentLinkedQueue concurrentLinkedQueue2 = mfq.A06;
                        if (C66957Mfq.A03(mfq, str3, concurrentLinkedQueue2)) {
                            Iterator A1G = AnonymousClass7TE.A1G(concurrentLinkedQueue2);
                            while (A1G.hasNext()) {
                                C61073JwB jwB = (C61073JwB) A1G.next();
                                if (str3.equals(jwB.A01)) {
                                    concurrentLinkedQueue2.remove(jwB);
                                }
                            }
                        }
                        if (mfq.A01 == null && !mfq.A07.getAndSet(A1Z)) {
                            C66957Mfq.A00(mfq);
                        }
                    }
                }
            } else {
                boolean A06 = 182.A06(0Tu.A05, userSession, 36327722448075407L);
                if (A06) {
                    C372178zu A012 = C372178zu.A0A.A01();
                    String str4 = userSession.A06;
                    C72939PPx pPx = A012.A02;
                    if (pPx == null || (userSession2 = pPx.A03) == null) {
                        str = null;
                    } else {
                        str = userSession2.A06;
                    }
                    if (!0qQ.A0K(str, str4)) {
                        C296405q0.A00.A01(userSession, A01);
                    }
                }
                C372178zu.A0A.A01().A04(new C71638OoJ(A06, userSession), A003, userSession.A06, A01);
            }
        }
        AnonymousClass69F A004 = AnonymousClass69E.A00(r3.A0j);
        Long l = r3.A0K;
        0qQ.A07(l);
        A004.DUc(l.longValue());
        r11.AId((Object) null);
    }
}
