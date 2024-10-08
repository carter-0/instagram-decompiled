package X;

/* renamed from: X.AUe  reason: case insensitive filesystem */
public final class C40164AUe implements C340707lh {
    public final /* synthetic */ C352948Fr A00;

    public C40164AUe(C352948Fr r1) {
        this.A00 = r1;
    }

    public final void DPS(int i) {
        C352948Fr r5 = this.A00;
        C3495780x r6 = r5.A09;
        boolean z = true;
        if (AnonymousClass7TE.A1a(r6.A09.getValue()) || (r5.A06.A08.A00 instanceof AnonymousClass80O)) {
            r5.A01 = true;
            C340297l2 r1 = r5.A04;
            if (r1.A09() != 1 && r1.A09() != 2) {
                return;
            }
            if (r1.A09() == 1) {
                C352948Fr.A00(r5, 0);
            } else if (r1.A09() == 2) {
                r5.A08.A00().CLZ();
                AnonymousClass7TF.A1O(r6.A0A, false);
            }
        } else if (r5.A00 != AnonymousClass7TF.A1S(i, 2) || r5.A01) {
            r5.A01 = false;
            if (i != 2) {
                z = false;
            }
            r5.A00 = z;
            C352948Fr.A01(r5, z);
        }
    }
}
