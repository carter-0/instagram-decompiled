package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LbU  reason: case insensitive filesystem */
public final class C64413LbU implements AnonymousClass2Ui {
    public final List A00;

    public C64413LbU(List list) {
        ArrayList<AnonymousClass2Ui> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next instanceof AnonymousClass2Ui) {
                A1C.add(next);
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (AnonymousClass2Ui r0 : A1C) {
            018.A16(((C64413LbU) r0).A00, A1C2);
        }
        this.A00 = A1C2;
    }
}
