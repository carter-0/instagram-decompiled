package X;

import android.os.Bundle;

/* renamed from: X.Sdc  reason: case insensitive filesystem */
public final class C11634Sdc implements AnonymousClass2gO {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2Fk A01;
    public final /* synthetic */ RF6 A02;
    public final /* synthetic */ STY A03;

    public C11634Sdc(2Fk r1, RF6 rf6, STY sty, long j) {
        this.A03 = sty;
        this.A01 = r1;
        this.A02 = rf6;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        STY sty;
        boolean z;
        RRP A07;
        String message;
        String str2;
        S33 s33;
        SEH seh = (SEH) obj;
        if (seh != null) {
            this.A01.A08(this);
            Throwable th = seh.A01;
            boolean A1a = DbW.A1a(th);
            RF6 rf6 = this.A02;
            RF6 rf62 = RF6.OPT_IN;
            if (A1a) {
                if (rf6 == rf62) {
                    str2 = "SUCCEEDED_SAVE_NEW_CARD";
                } else {
                    str2 = "SUCCEEDED_SAVE_PAYMENT_OPT_IN_DATA";
                }
                sty = this.A03;
                z = false;
                A07 = sty.A07(str2, sty.A08.now() - this.A00, -1, false);
                A07.A0E = (String) seh.A00;
                if (DbY.A1Z(0Tu.A05, sty.A0T.A04.A00, 36322860551973503L) && (s33 = sty.A09) != null) {
                    s33.A00();
                }
            } else {
                if (rf6 == rf62) {
                    str = "FAILED_SAVE_NEW_CARD";
                } else {
                    str = "FAILED_SAVE_PAYMENT_OPT_IN_DATA";
                }
                sty = this.A03;
                z = false;
                A07 = sty.A07(str, sty.A08.now() - this.A00, -1, false);
                if (th == null) {
                    message = "Card save failed with empty error message";
                } else {
                    message = th.getMessage();
                }
                A07.A0E = message;
            }
            C11265SHz A002 = A07.A00();
            Bundle A022 = sty.A04.A02();
            C270254gR r1 = sty.A0T;
            SUR.A0A(A022, r1, A002);
            sty.A0H.clear();
            C10860RzL rzL = r1.A00;
            rzL.A06.A02 = AnonymousClass7TE.A1F();
            sty.A0L = z;
            ((C59671JTb) rzL.A0G.A00).A00 = z;
        }
    }
}
