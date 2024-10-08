package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.IgI  reason: case insensitive filesystem */
public final class C57777IgI implements Runnable {
    public final /* synthetic */ C53929GwZ A00;

    public C57777IgI(C53929GwZ gwZ) {
        this.A00 = gwZ;
    }

    public final void run() {
        JQR jqr;
        C55558Hje BQF;
        C14044Tol tol;
        C53929GwZ gwZ = this.A00;
        List list = (List) C51968G9o.A0x(gwZ.A02, gwZ.A0A);
        if (list != null && (jqr = (JQR) list.get(gwZ.A00)) != null && (BQF = jqr.BQF()) != null) {
            C57465Ib9 ib9 = BQF.A00;
            C56625I5d i5d = ib9.A07;
            List<Object> list2 = i5d.A08;
            int i = 0;
            for (Object A0K : list2) {
                if (!0qQ.A0K(A0K, ib9)) {
                    i++;
                } else if (i >= 0) {
                    C57466IbA ibA = ib9.A00;
                    if (!(ibA == null || (tol = ibA.A00) == null)) {
                        tol.A0A("paused_for_replay");
                    }
                    ib9.A00();
                    if (ib9.equals(i5d.A02)) {
                        Handler handler = i5d.A04;
                        handler.removeCallbacks(i5d.A06);
                        handler.removeCallbacks(i5d.A07);
                        handler.removeCallbacks(i5d.A05);
                        if (list2.size() == 1) {
                            list2.clear();
                            i5d.A00 = 0;
                            i5d.A01 = 0;
                            return;
                        } else if (i == DbT.A02(list2, 1)) {
                            list2.remove(i);
                            i5d.A00 = 0;
                            C56625I5d.A00(i5d);
                            return;
                        } else {
                            list2.remove(i);
                            C56625I5d.A02(i5d);
                            return;
                        }
                    } else {
                        list2.remove(i);
                        int i2 = i5d.A00;
                        if (i < i2) {
                            i5d.A00 = i2 - 1;
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
