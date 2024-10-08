package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.429  reason: invalid class name */
public final class AnonymousClass429 {
    public final C58840Ae A00;
    public final 0sP A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sP A04;

    public AnonymousClass429(C58840Ae r5) {
        AnonymousClass42A r3 = AnonymousClass42A.A00;
        AnonymousClass42C r2 = AnonymousClass42C.A00;
        AnonymousClass42E r1 = AnonymousClass42E.A00;
        AnonymousClass42G r0 = AnonymousClass42G.A00;
        this.A00 = r5;
        this.A01 = r3;
        this.A03 = r2;
        this.A04 = r1;
        this.A02 = r0;
    }

    public final void A00(AnonymousClass5IP r5, String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "Pass";
        } else {
            str3 = "Fail";
        }
        1Ln r2 = (1Ln) this.A01.invoke(this.A00);
        if (r2.A00.isSampled()) {
            r2.A0Q("promotion_id", Long.valueOf(Long.parseLong(str)));
            r2.A0R("step", str2);
            r2.A0R("eligibility_result", str3);
            if (r5 != null) {
                ImmutableMap AET = r5.AET();
                if (!AET.isEmpty()) {
                    r2.A0x(AET);
                }
            }
            r2.Cgf();
        }
    }
}
