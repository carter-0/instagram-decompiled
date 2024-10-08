package X;

import java.util.Map;

/* renamed from: X.7w3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C346967w3 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8BA A00;

    public /* synthetic */ C346967w3(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8BA r5 = this.A00;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C3506685r r1 = r5.A1E;
        if (booleanValue) {
            r1.A02().pause();
            AnonymousClass8QF r12 = r5.A06;
            if (r12 != null) {
                AnonymousClass8QA r3 = r12.A01;
                C3499482o r4 = r3.A0F.A02;
                C352218Cl A03 = r4.A01.A03();
                if (A03 != null) {
                    String str = A03.A0h;
                    Map map = r12.A00;
                    if (map.get(str) == null) {
                        map.put(str, r3.A04());
                        C366678pU A06 = r3.A06((C366678pU) null, r4.A00());
                        C366638pQ r13 = A06.A01.A02;
                        if (r13 != null) {
                            r13.A00 = true;
                        }
                        r3.A0B(A06);
                    }
                }
            }
            r5.A0k((AnonymousClass8QC) null, false);
            r5.A14.A00 = true;
        } else {
            if (((AnonymousClass8ME) r5.A1g.get()).A11() != null) {
                r1.A02().E2p();
            }
            AnonymousClass8QF r14 = r5.A06;
            if (r14 != null) {
                AnonymousClass8QA r42 = r14.A01;
                C352218Cl A032 = r42.A0F.A02.A01.A03();
                if (A032 != null) {
                    String str2 = A032.A0h;
                    Map map2 = r14.A00;
                    C366678pU r15 = (C366678pU) map2.get(str2);
                    if (r15 != null) {
                        C366638pQ r0 = r15.A01.A02;
                        if (r0 != null) {
                            r0.A00 = false;
                        }
                        r42.A0B(r15);
                    }
                    map2.remove(str2);
                }
            }
            r5.A14.A00 = false;
        }
        AnonymousClass8BA.A0G(r5, false, false);
    }
}
