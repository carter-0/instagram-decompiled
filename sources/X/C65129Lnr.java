package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Lnr  reason: case insensitive filesystem */
public final class C65129Lnr implements C74441Puw {
    public boolean A00;
    public final /* synthetic */ LD5 A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0sP A03;

    public final void D7r(Date date) {
    }

    public final void D9n(Date date) {
        C331157Pu r1;
        this.A00 = true;
        LD5 ld5 = this.A01;
        OVW ovw = ld5.A00;
        if (!(ovw == null || (r1 = ovw.A00) == null)) {
            r1.A0L((C332277Ui) null);
        }
        ld5.A00 = null;
        if (date == null) {
            this.A02.invoke();
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.add(12, (5 - (instance.get(12) % 5)) + 20);
        Date time = instance.getTime();
        0qQ.A07(time);
        if (date.compareTo(time) < 0) {
            date = time;
        }
        Calendar instance2 = Calendar.getInstance();
        instance2.add(5, 29);
        Date time2 = instance2.getTime();
        0qQ.A07(time2);
        if (date.compareTo(time2) > 0) {
            date = time2;
        }
        this.A03.invoke(date);
    }

    public C65129Lnr(LD5 ld5, C62320sa r2, 0sP r3) {
        this.A01 = ld5;
        this.A02 = r2;
        this.A03 = r3;
    }

    public final void D9d() {
        this.A01.A00 = null;
        if (!this.A00) {
            this.A02.invoke();
        }
    }
}
