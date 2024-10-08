package X;

import android.view.View;

/* renamed from: X.Oi1  reason: case insensitive filesystem */
public final class C71305Oi1 implements View.OnClickListener {
    public final /* synthetic */ C69112Ner A00;

    public C71305Oi1(C69112Ner ner) {
        this.A00 = ner;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(1166300108);
        C69112Ner ner = this.A00;
        AnonymousClass0eM r1 = ner.A0f;
        if (!((C357648Za) r1.getValue()).A04.A00()) {
            ((C357648Za) r1.getValue()).A05(AnonymousClass05K.A0N, AnonymousClass7TG.A0j());
            i = 275607062;
        } else {
            ner.A0H.A05(new PNX(((C357648Za) r1.getValue()).A04.A00(), false));
            i = -1483007275;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
