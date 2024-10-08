package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public final class VWB {
    public ArrayList A00;
    public ArrayList A01;
    public final X1V A02;

    public VWB(X1V x1v, List list) {
        ImageUrl A1Q;
        this.A02 = x1v;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                1Xj r0 = (1Xj) 00k.A0O(list, i);
                if (!(r0 == null || (A1Q = r0.A1Q()) == null)) {
                    long A17 = r0.A17();
                    arrayList.add(A1Q);
                    arrayList2.add(Long.valueOf(A17));
                }
            }
            this.A01 = arrayList;
            this.A00 = arrayList2;
        }
    }
}
