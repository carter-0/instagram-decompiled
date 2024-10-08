package X;

import java.util.List;

/* renamed from: X.APa  reason: case insensitive filesystem */
public final class C40044APa implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8LU A00;

    public C40044APa(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C62753Klr klr = (C62753Klr) obj;
        if (klr instanceof C61758KKx) {
            AnonymousClass8LU r5 = this.A00;
            C349307zv A04 = r5.A0k.A02.A01.A04();
            if (A04 != null) {
                List list = ((C61758KKx) klr).A00;
                boolean isEmpty = list.isEmpty();
                if (isEmpty) {
                    AnonymousClass8LU.A0B(r5, 2131964542);
                }
                AnonymousClass3Q2 r1 = r5.A0D;
                if (r1 != null) {
                    r1.A59 = !isEmpty;
                }
                r5.A0G = A04.A07();
                AnonymousClass2gO r0 = r5.A02;
                if (r0 != null) {
                    r0.onChanged(list);
                }
            }
        } else if ((klr instanceof C61759KKy) || (klr instanceof KL0)) {
            AnonymousClass8LU r3 = this.A00;
            C349307zv A042 = r3.A0k.A02.A01.A04();
            if (A042 != null) {
                AnonymousClass8LU.A0B(r3, 2131964542);
                AnonymousClass3Q2 r12 = r3.A0D;
                if (r12 != null) {
                    r12.A59 = false;
                }
                r3.A0G = A042.A07();
                AnonymousClass2gO r13 = r3.A02;
                if (r13 != null) {
                    r13.onChanged(AnonymousClass7TE.A1C());
                }
            }
        } else {
            AnonymousClass8LU r14 = this.A00;
            AnonymousClass8LU.A0B(r14, 2131964541);
            r14.A0H = null;
        }
    }
}
