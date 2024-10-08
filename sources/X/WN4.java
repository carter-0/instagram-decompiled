package X;

import java.util.ArrayList;
import java.util.List;

public final class WN4 implements X39 {
    public final List A00 = new ArrayList();

    public final List FMs(X8K x8k, X8K x8k2) {
        ArrayList arrayList = new ArrayList();
        for (X39 FMs : this.A00) {
            arrayList.addAll(FMs.FMs(x8k, x8k2));
        }
        return arrayList;
    }
}
