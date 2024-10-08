package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

public final class IPJ implements C250603lj {
    public final Rect A00 = AnonymousClass7TE.A0W();
    public final C228412ld A01;
    public final AnonymousClass2xS A02;
    public final WeakReference A03 = C51965G9l.A0v((Object) null);

    public IPJ(C228412ld r2, AnonymousClass2xS r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void ATF(AnonymousClass30Y r19, C252093oY r20) {
        C252093oY r3 = r20;
        AnonymousClass30Y r4 = r19;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, r3);
        C54077Gz1 gz1 = ((C53288Gla) r4.A03).A03;
        List list = gz1.A0B;
        Object obj = r4.A04;
        0qQ.A06(obj);
        1Xj A002 = ((C55923Hpk) list.get(AnonymousClass7TE.A0M(obj))).A00();
        float CFe = r3.CFe(r4);
        Rect rect = this.A00;
        r3.B9Y(rect, r4);
        int A0A = C51968G9o.A0A(r4, r3);
        boolean z = false;
        if (A0A == A1U) {
            AnonymousClass3W1 BQr = this.A01.BQr(A002);
            if (((double) CFe) >= 0.99d) {
                z = true;
            }
            BQr.A0g(z);
            this.A02.A03((View) this.A03.get(), A002, gz1, CFe, rect.top, rect.left);
        } else if (A0A == 0) {
            AnonymousClass3W1 BQr2 = this.A01.BQr(A002);
            BQr2.A0E(0, BQr2.A03);
            BQr2.A0l(A1U);
            AnonymousClass2xS r8 = this.A02;
            int i = rect.top;
            int i2 = rect.left;
            int i3 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            r8.A04((View) this.A03.get(), A002, gz1, CFe, i, i2, false, false, false);
        } else if (A0A == 2) {
            this.A01.BQr(A002).A0l(false);
            this.A02.A06(A002);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
