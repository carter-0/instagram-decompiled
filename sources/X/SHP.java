package X;

import com.instagram.android.R;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SHP {
    public final IgSignalsCasper A00;
    public final List A01;
    public final S5L A02;
    public final List A03;

    public static final void A00(SHP shp, 0sP r6) {
        ArrayList arrayList;
        S5L s5l = shp.A02;
        if (s5l != null) {
            List A0a = 00k.A0a(s5l.A02());
            arrayList = AnonymousClass7TG.A0r(A0a);
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                AnonymousClass7TE.A1Y(arrayList, Pxg.A0H(it) * 1000);
            }
        } else {
            arrayList = 0sn.A00;
        }
        r6.invoke(arrayList);
    }

    public final void A01(IgBgFetchMetadata igBgFetchMetadata, C9111RPi rPi, 0sP r19) {
        C9111RPi rPi2 = rPi;
        IgBgFetchMetadata igBgFetchMetadata2 = igBgFetchMetadata;
        C58768IxF ixF = new C58768IxF(11, igBgFetchMetadata2, this, rPi2, r19);
        long currentTimeMillis = System.currentTimeMillis();
        List list = this.A01;
        long j = 900000;
        if (!list.isEmpty()) {
            if (rPi2 instanceof C8816RAs) {
                Number number = (Number) 00k.A0O(list, 0);
                if (number != null) {
                    j = number.longValue();
                }
            } else if (rPi2 instanceof C8815RAr) {
                IgBgFetchJobRun igBgFetchJobRun = ((C8815RAr) rPi2).A00;
                long A0I = Pxg.A0I(list, Pxf.A01(C51966G9m.A06(list), igBgFetchMetadata2.A01.size() + 1, 0));
                j = Math.min(A0I, Math.max(900000, (2 * A0I) - (igBgFetchJobRun.A01 - igBgFetchJobRun.A03)));
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        IgBgFetchJob igBgFetchJob = new IgBgFetchJob(R.id.ig_bg_fetch_id, currentTimeMillis + j);
        0qQ.A07(Collections.singletonList(igBgFetchJob));
        ixF.invoke(AnonymousClass7TE.A1I(igBgFetchJob));
    }

    public SHP(S5L s5l, IgSignalsCasper igSignalsCasper, List list) {
        this.A01 = list;
        this.A03 = list;
        this.A02 = s5l;
        this.A00 = igSignalsCasper;
    }
}
