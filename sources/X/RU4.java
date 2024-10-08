package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class RU4 {
    /* JADX WARNING: type inference failed for: r12v0, types: [X.RsP, java.lang.Object] */
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        AnonymousClass6Tm r3 = r17;
        String str = (String) DbW.A0d(r3);
        Object A00 = r3.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Object A03 = r3.A03(3);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.instagram.common.bloks.sensitive.SensitiveValue<kotlin.String>>");
        Map map = (Map) A03;
        C277014uI A0P = DbW.A0P(r3, 4);
        C277014uI A0P2 = DbW.A0P(r3, 5);
        C10890Rzq rzq = C11214SFo.A0A;
        SSZ A01 = SOC.A01();
        HashMap A1E = AnonymousClass7TE.A1E();
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator A0u = AnonymousClass7TF.A0u((Map) A00);
        while (A0u.hasNext()) {
            JTR.A1U(A1E, AnonymousClass7TE.A1J(A0u));
        }
        C294125lt r0 = C294115ls.A00;
        AtomicInteger atomicInteger = (AtomicInteger) r0.get();
        if (atomicInteger == null) {
            atomicInteger = Pxf.A10();
            r0.set(atomicInteger);
        }
        atomicInteger.incrementAndGet();
        try {
            Iterator A0u2 = AnonymousClass7TF.A0u(map);
            while (A0u2.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u2);
                Object key = A1J.getKey();
                C10910S0l s0l = (C10910S0l) A1J.getValue();
                if (C294115ls.A00()) {
                    A1E.put(key, s0l.A00);
                    A1F.add(A1J.getKey());
                } else {
                    throw new IllegalStateException("SensitiveValue is not allowed to be unwrapped outside of Boundary.run");
                }
            }
            atomicInteger.decrementAndGet();
            ? obj = new Object();
            obj.A00 = A1E;
            obj.A01 = A1F;
            C11214SFo A002 = rzq.A00(A01, obj, str, 0Yt.A0E(), 0sl.A00);
            C11650Sds sds = new C11650Sds(r16, A0P, A0P2, 0);
            C7422QCn A012 = SQA.A01(A002);
            0qQ.A07(A012);
            SQB.A01((AnonymousClass07Z) null, A012, sds);
            return null;
        } catch (RL0 e) {
            throw e;
        } catch (Throwable th) {
            atomicInteger.decrementAndGet();
            throw th;
        }
    }
}
