package X;

import android.os.Bundle;

/* renamed from: X.Fqf  reason: case insensitive filesystem */
public final class C51224Fqf implements Runnable {
    public final /* synthetic */ E3L A00;

    public C51224Fqf(E3L e3l) {
        this.A00 = e3l;
    }

    public final void run() {
        Integer num;
        E3L e3l = this.A00;
        Bundle requireArguments = e3l.requireArguments();
        if (e3l.A03) {
            requireArguments.putBoolean(Dbq.A05(0, 33, 94), true);
        }
        F3Y A002 = FFR.A00();
        0qQ.A0A(requireArguments);
        String str = e3l.A02;
        if (str == null) {
            0qQ.A0F("currPhoneNumber");
            throw AnonymousClass00P.createAndThrow();
        }
        if (e3l.A04) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A00;
        }
        Dbc.A0S(A002.A01(requireArguments, num, AnonymousClass05K.A00, str, false), e3l.requireActivity(), e3l.A08);
    }
}
