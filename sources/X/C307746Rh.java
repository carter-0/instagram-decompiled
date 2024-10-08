package X;

import java.util.Map;

/* renamed from: X.6Rh  reason: invalid class name and case insensitive filesystem */
public final class C307746Rh implements AnonymousClass6RV {
    public final AnonymousClass6RB A00;

    public final /* bridge */ /* synthetic */ C13752TgO BH5(C307896Rx r21, C276504tR r22, Object obj) {
        AnonymousClass6RN r14;
        H5C A002;
        C276504tR r3 = r22;
        C307876Rv r0 = (C307876Rv) obj;
        if (r0 != null) {
            r14 = r0.A00;
        } else {
            r14 = null;
        }
        0qQ.A0B(r3, 1);
        C276494tQ r32 = (C276494tQ) r3;
        Map map = r32.A02;
        0qQ.A0A(map);
        C307896Rx r1 = r21;
        String str = (String) C9816Rhe.A00(r1, "app_id", map);
        if (str != null) {
            Number number = (Number) C9816Rhe.A00(r1, Pxd.A00(193), map);
            if (number != null) {
                long longValue = number.longValue();
                0sm r9 = (Map) C9816Rhe.A00(r1, "params", map);
                if (r9 == null) {
                    r9 = 0Yt.A0E();
                }
                0sm r10 = (Map) C9816Rhe.A00(r1, "client_params", map);
                if (r10 == null) {
                    r10 = 0Yt.A0E();
                }
                AnonymousClass6RB r4 = this.A00;
                C307616Qu r12 = r4.A02;
                C307576Qq r02 = null;
                if (r12 != null) {
                    r02 = r12.A00;
                }
                String A003 = Q32.A00(r02, str, r9);
                synchronized (r4.A09) {
                    A002 = AnonymousClass6RB.A00(r4, r14, str, A003, longValue, false);
                }
                String str2 = r32.A00;
                0qQ.A07(str2);
                Object obj2 = map.get(AnonymousClass000.A00(1732));
                0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                return new INI(r4, A002, str2, (String) obj2, str, r9, r10, longValue);
            }
            throw new IllegalArgumentException("AsyncComponentQuery data manifest entry must specify a non-null cache TTL.");
        }
        throw new IllegalArgumentException("AsyncComponentQuery data manifest entry must specify a non-null appId.");
    }

    public final C307856Rt Bx9(C307786Rm r6, C307446Qd r7) {
        AnonymousClass6SK A002;
        C307876Rv r1;
        AnonymousClass6RB r4 = this.A00;
        C307866Ru r12 = new C307866Ru(r7);
        synchronized (r4.A0A) {
            A002 = r4.A08.A00(r12);
            r1 = new C307876Rv(r4.A00);
            0qQ.A0B(A002, 2);
        }
        return new C307856Rt(A002, r1);
    }

    public C307746Rh(AnonymousClass6RB r1) {
        this.A00 = r1;
    }
}
