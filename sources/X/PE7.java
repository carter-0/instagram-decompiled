package X;

import java.util.Iterator;
import java.util.Set;

public final class PE7 implements C51905G6z {
    public final /* synthetic */ OVU A00;
    public final /* synthetic */ OLT A01;

    public final void onFail(C268654dm r4) {
        0qQ.A0B(r4, 0);
        NLD nld = this.A00.A06.A04;
        if (nld != null) {
            nld.A02.A01 = true;
            nld.notifyDataSetChanged();
        }
    }

    public PE7(OVU ovu, OLT olt) {
        this.A00 = ovu;
        this.A01 = olt;
    }

    public final void onSuccess() {
        OVU ovu = this.A00;
        NKQ nkq = ovu.A06;
        NLD nld = nkq.A04;
        if (nld != null) {
            nld.A02.A01 = false;
            nld.notifyDataSetChanged();
        }
        Set set = ovu.A07;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A01.A00(DbT.A0k(it));
        }
        set.clear();
        OVU.A00(ovu);
        nkq.A02();
    }
}
