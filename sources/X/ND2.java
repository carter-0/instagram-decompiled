package X;

import com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import java.util.ArrayList;

public final class ND2 extends GroupExpansionProxy {
    public final GroupExpansionProxy A00;

    public final void expand(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback) {
        C51974G9v.A1K(str, str2, arrayList2);
        0qQ.A0B(groupExpansionCompletedCallback, 6);
        this.A00.expand(str, str2, arrayList, arrayList2, i, i2, groupExpansionCompletedCallback);
    }

    public ND2(GroupExpansionProxy groupExpansionProxy) {
        this.A00 = groupExpansionProxy;
    }
}
