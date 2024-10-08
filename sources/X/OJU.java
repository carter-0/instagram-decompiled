package X;

import com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment;
import java.util.Set;

public final class OJU {
    public final /* synthetic */ ImportMsgrIceBreakersFragment A00;

    public OJU(ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment) {
        this.A00 = importMsgrIceBreakersFragment;
    }

    public final void A00(String str, boolean z) {
        C69673Npv npv;
        boolean z2;
        ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment = this.A00;
        if (!importMsgrIceBreakersFragment.getRecyclerView().A1E()) {
            Set set = importMsgrIceBreakersFragment.A09;
            if (z) {
                set.add(str);
            } else if (set.contains(str)) {
                set.remove(str);
            }
            for (int i = 0; i < importMsgrIceBreakersFragment.A05.size(); i++) {
                ((C69672Npu) importMsgrIceBreakersFragment.A05.get(i)).A00.A01.getClass();
                if (((C69672Npu) importMsgrIceBreakersFragment.A05.get(i)).A00.A01.equals(str)) {
                    ((C69672Npu) importMsgrIceBreakersFragment.A05.get(i)).A01.A01 = z;
                }
                int size = set.size();
                if (z) {
                    if (size == 4 && !set.contains(((C69672Npu) importMsgrIceBreakersFragment.A05.get(i)).A00.A01)) {
                        npv = ((C69672Npu) importMsgrIceBreakersFragment.A05.get(i)).A01;
                        z2 = false;
                    }
                } else if (size == 3) {
                    npv = ((C69672Npu) importMsgrIceBreakersFragment.A05.get(i)).A01;
                    z2 = true;
                }
                npv.A00 = z2;
            }
            importMsgrIceBreakersFragment.A04();
            importMsgrIceBreakersFragment.A02.A00(importMsgrIceBreakersFragment.A05);
        }
    }
}
