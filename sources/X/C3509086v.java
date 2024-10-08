package X;

/* renamed from: X.86v  reason: invalid class name and case insensitive filesystem */
public final class C3509086v implements AnonymousClass81G {
    public final /* synthetic */ C3508086k A00;

    public C3509086v(C3508086k r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void FHt(Object obj) {
        AnonymousClass80Y r8 = (AnonymousClass80Y) obj;
        0qQ.A0B(r8, 0);
        C3508086k r6 = this.A00;
        AnonymousClass80Y r2 = r6.A00;
        AnonymousClass80Y r1 = AnonymousClass80Y.CURATION;
        if (r8 == r1 && r2 == AnonymousClass80Y.EDITING) {
            boolean z = ((C365838nl) r6.A02.getValue()).A00;
            AnonymousClass86m r0 = (AnonymousClass86m) r6.A01.getValue();
            r0.A0C = z;
            r0.A0S.A00(r0.A0N, r0.A0O);
        } else if (r8 == AnonymousClass80Y.EDITING && r2 == r1) {
            AnonymousClass86m r02 = (AnonymousClass86m) r6.A01.getValue();
            boolean z2 = r02.A0C;
            r02.hide();
            AnonymousClass86h r12 = r02.A0S;
            AnonymousClass2gO r4 = r02.A0N;
            AnonymousClass2gO r3 = r02.A0O;
            0qQ.A0B(r3, 1);
            C3504884v r22 = r12.A05;
            if (r22 != null) {
                if (r4 != null) {
                    C226292g8.A00(19B.A00, r22.A0c).A08(r4);
                }
                r22.A01().A08(r3);
            }
            ((C365838nl) r6.A02.getValue()).A00 = z2;
        }
        r6.A00 = r8;
    }
}
