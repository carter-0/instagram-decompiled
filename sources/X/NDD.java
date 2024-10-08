package X;

import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import com.instagram.rtc.rsys.models.IgCallModel;
import java.util.ArrayList;
import java.util.Iterator;

public final class NDD extends MediaStatsListener {
    public final /* synthetic */ NDE A00;

    public final void onMediaStats(ArrayList arrayList) {
        0qQ.A0B(arrayList, 0);
        O9Y o9y = this.A00.A02;
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0r.add(new OGS((MediaStats) it.next()));
        }
        0V2 r3 = o9y.A00.A0C.A02;
        N9L n9l = (N9L) C66583MXo.A0h(r3);
        if (n9l != null) {
            String str = n9l.A01;
            IgCallModel igCallModel = n9l.A00;
            0qQ.A0B(str, 0);
            r3.FIA(new N9L(igCallModel, str, A0r));
        }
    }

    public NDD(NDE nde) {
        this.A00 = nde;
    }
}
