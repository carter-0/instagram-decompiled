package X;

import android.view.View;

public final class PQ5 implements C3493580b {
    public final /* synthetic */ C69112Ner A00;

    public PQ5(C69112Ner ner) {
        this.A00 = ner;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        int i;
        View A0c;
        int A02 = DbU.A02((AnonymousClass80V) obj2, 1);
        if (A02 != 3) {
            if (A02 == 2) {
                C69112Ner ner = this.A00;
                ((AnonymousClass8DM) ner.A0U.getValue()).DDM();
                C69112Ner.A03(ner);
                i = 8;
                C66580MXl.A0l(ner.A0S).A07.setVisibility(8);
                A0c = AnonymousClass7TE.A0c(ner.A0P);
            }
            C69112Ner ner2 = this.A00;
            C69112Ner.A07(ner2, ner2.A03.A0V);
        }
        C69112Ner ner3 = this.A00;
        AnonymousClass0eM r1 = ner3.A0U;
        ((AnonymousClass8DM) r1.getValue()).DCI();
        ((AnonymousClass8DM) r1.getValue()).EpH(ner3.A00);
        C69112Ner.A03(ner3);
        C71139Odj A0l = C66580MXl.A0l(ner3.A0S);
        i = 0;
        A0l.A07.setVisibility(0);
        C71139Odj.A05(A0l, -1, C71139Odj.A02(A0l).indexOf(A0l.A02));
        A0l.A09.postDelayed(new C73117PWy(A0l), 20);
        A0c = AnonymousClass7TE.A0c(ner3.A0P);
        A0c.setVisibility(i);
        C69112Ner ner22 = this.A00;
        C69112Ner.A07(ner22, ner22.A03.A0V);
    }
}
