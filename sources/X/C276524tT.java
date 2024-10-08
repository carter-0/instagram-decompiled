package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4tT  reason: invalid class name and case insensitive filesystem */
public abstract class C276524tT {
    public static Object A01(C276484tP r9, C276424tJ r10) {
        C276544tV r2;
        AnonymousClass4u1 r0;
        Object A00;
        ArrayList arrayList = new ArrayList();
        Integer E2K = r10.E2K();
        Integer num = AnonymousClass05K.A0C;
        if (E2K == num) {
            C276534tU r22 = null;
            while (true) {
                Integer Crg = r10.Crg();
                Integer num2 = AnonymousClass05K.A0N;
                if (Crg == num2) {
                    break;
                }
                String E2H = r10.E2H();
                int A002 = C276474tO.A00(E2H);
                boolean z = false;
                if (A002 >= 32) {
                    z = true;
                }
                r10.Crg();
                if (C64361Kj.A0H != null && (r0 = C64361Kj.A0H.A03) != null && (A00 = r0.A00(r10, E2H, z)) != null) {
                    r2 = A00;
                } else if (!z || 13347 != A002) {
                    C276534tU r23 = new C276534tU(A002);
                    if (!z) {
                        1Kn.A02("BloksModelParser", String.format(002.A0R("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", E2H), new Object[0]));
                    } else if (r10.E2K() != num) {
                        r10.Evn();
                        r2 = null;
                    } else {
                        arrayList.add(Integer.valueOf(A002));
                        C276644tf r1 = new C276644tf(r9, new C276624td((C276634te) null, arrayList));
                        r23.A01 = r1;
                        while (r10.Crg() != num2) {
                            String E2H2 = r10.E2H();
                            r10.Crg();
                            C276654tg.A00(r1, r23, r10, E2H2);
                            r10.Evn();
                        }
                        C276654tg.A01(r23);
                    }
                    r23.A0O();
                    r2 = r23;
                } else {
                    r2 = C7304Q3g.A00(r10);
                }
                r10.Evn();
                r22 = r2;
            }
            if (r22 == null) {
                1Kn.A03("BloksParser", new IOException("unknown bloks data type"));
            }
            return r22;
        }
        r10.Evn();
        throw new IOException("Token parsing error.");
    }

    public static Object A00(C276664th r7, C276424tJ r8) {
        C276544tV r3;
        AnonymousClass4u1 r0;
        Object A00;
        Integer E2K = r8.E2K();
        Integer num = AnonymousClass05K.A0C;
        if (E2K == num) {
            C276534tU r32 = null;
            while (true) {
                Integer Crg = r8.Crg();
                Integer num2 = AnonymousClass05K.A0N;
                if (Crg == num2) {
                    break;
                }
                String E2H = r8.E2H();
                int A002 = C276474tO.A00(E2H);
                boolean z = false;
                if (A002 >= 32) {
                    z = true;
                }
                r8.Crg();
                if (C64361Kj.A0H != null && (r0 = C64361Kj.A0H.A03) != null && (A00 = r0.A00(r8, E2H, z)) != null) {
                    r3 = A00;
                } else if (!z || 13347 != A002) {
                    C276534tU r33 = new C276534tU(A002);
                    if (!z) {
                        1Kn.A02("BloksModelParser", String.format(002.A0R("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", E2H), new Object[0]));
                    } else if (r8.E2K() != num) {
                        r8.Evn();
                        r3 = null;
                    } else {
                        List list = r7.A00;
                        list.add(Integer.valueOf(A002));
                        C276624td r1 = new C276624td(r7.A01, list);
                        r33.A01 = r1;
                        while (r8.Crg() != num2) {
                            String E2H2 = r8.E2H();
                            r8.Crg();
                            C276654tg.A00(r1, r33, r8, E2H2);
                            r8.Evn();
                        }
                        C276654tg.A01(r33);
                    }
                    r33.A0O();
                    r3 = r33;
                } else {
                    r3 = C7304Q3g.A00(r8);
                }
                r8.Evn();
                r32 = r3;
            }
            if (r32 == null) {
                1Kn.A03("BloksParser", new IOException("unknown bloks data type"));
            }
            return r32;
        }
        r8.Evn();
        throw new IOException("Token parsing error.");
    }
}
