package X;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ren  reason: case insensitive filesystem */
public abstract class C9669Ren {
    public static final Object A00(C307896Rx r21, AnonymousClass6Tm r22) {
        C307896Rx r5 = r21;
        C307786Rm r7 = r5.A03;
        AnonymousClass6Tm r1 = r22;
        Object A02 = r1.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0p = DbX.A0p(r1, "null cannot be cast to non-null type kotlin.String");
        String A0n = Pxg.A0n(r1, 3);
        Object A03 = r1.A03(4);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List list = (List) A03;
        Object A032 = r1.A03(5);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Object A033 = r1.A03(6);
        0qQ.A0C(A033, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.instagram.common.bloks.sensitive.SensitiveValue<kotlin.String>>");
        Map map = (Map) A033;
        String A0n2 = Pxg.A0n(r1, 7);
        C277014uI A0P = DbW.A0P(r1, 8);
        C277014uI A0P2 = DbW.A0P(r1, 9);
        Object A034 = r1.A03(10);
        0qQ.A0C(A034, AnonymousClass000.A00(39));
        Boolean bool = (Boolean) A034;
        HashMap A1E = AnonymousClass7TE.A1E();
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator A0u = AnonymousClass7TF.A0u((Map) A032);
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
            if (A0n == null || !A0n.equals("VERIFY_FACTOR") || (!str.equals("SMS_OTP") && !str.equals("MFT_SMS_OTP") && !str.equals("MFT_RECOVERY_CODE"))) {
                0qQ.A0A(r7);
                C11395SRo.A02(r7.A00, new C12471Sv3(r5, A0P, A0P2, 5), bool, str, A0n, A0p, (String) null, (String) null, A0n2, list, 00k.A0a(A1F), A1E);
                return null;
            }
            0qQ.A0A(r7);
            Context context = r7.A00;
            List A0a = 00k.A0a(A1F);
            C11395SRo.A03(context, new C12471Sv3(r5, A0P, A0P2, 4), str, A0p, A0n2, list, A0a, A1E);
            return null;
        } catch (RL0 e) {
            throw e;
        } catch (Throwable th) {
            atomicInteger.decrementAndGet();
            throw th;
        }
    }
}
