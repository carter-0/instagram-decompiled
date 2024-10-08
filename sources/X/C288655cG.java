package X;

/* renamed from: X.5cG  reason: invalid class name and case insensitive filesystem */
public final class C288655cG extends AnonymousClass5WI implements C288665cH {
    public String A00;
    public C62320sa A01;
    public C62320sa A02;

    public final void FJX(C287085Yy r13, C287605aT r14, C287625aV r15, String str, String str2, C62320sa r18, C62320sa r19, C62320sa r20, boolean z) {
        boolean z2;
        AnonymousClass6FQ r0;
        String str3 = str;
        if (!0qQ.A0K(this.A00, str3)) {
            this.A00 = str3;
            AnonymousClass5WH.A02(this).A0M();
        }
        boolean z3 = false;
        boolean z4 = false;
        if (this.A02 == null) {
            z4 = true;
        }
        boolean z5 = false;
        C62320sa r4 = r19;
        if (r19 == null) {
            z5 = true;
        }
        if (z4 != z5) {
            A0K();
            AnonymousClass5WH.A02(this).A0M();
            z2 = true;
        } else {
            z2 = false;
        }
        this.A02 = r4;
        boolean z6 = false;
        if (this.A01 == null) {
            z6 = true;
        }
        C62320sa r1 = r20;
        if (r20 == null) {
            z3 = true;
        }
        if (z6 != z3) {
            z2 = true;
        }
        this.A01 = r1;
        boolean z7 = z;
        if (this.A07 != z7) {
            z2 = true;
        }
        A0L(r13, r14, r15, str2, r18, z7);
        if (z2 && (r0 = this.A05) != null) {
            r0.EI9();
        }
    }
}
