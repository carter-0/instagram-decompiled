package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.WUt  reason: case insensitive filesystem */
public final class C19337WUt implements C74441Puw {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ 0rk A03;
    public final /* synthetic */ 0rm A04;

    public final void D7r(Date date) {
    }

    public C19337WUt(C307896Rx r1, C276544tV r2, C277014uI r3, 0rk r4, 0rm r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void D9d() {
        if (this.A03.A00 == 0) {
            DbX.A1P(this.A00, new C308276Tl(), this.A02, C13988Tno.A0S(this.A01, 36), 0);
        }
    }

    public final void D9n(Date date) {
        C331157Pu r1;
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.set(14, 0);
            instance.set(13, 0);
            Date time = instance.getTime();
            0qQ.A07(time);
            0rk r6 = this.A03;
            C307896Rx r5 = this.A00;
            C277014uI r4 = this.A02;
            0rm r3 = this.A04;
            int A0P = (int) AnonymousClass7TE.A0P(time.getTime());
            r6.A00 = A0P;
            DbX.A1P(r5, new C308276Tl(), r4, Integer.valueOf(A0P), 0);
            OVW ovw = (OVW) r3.A00;
            if (ovw != null && (r1 = ovw.A00) != null) {
                r1.A0L((C332277Ui) null);
            }
        }
    }
}
