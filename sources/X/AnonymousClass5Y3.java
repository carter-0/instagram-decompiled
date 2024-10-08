package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Y3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5Y3 implements AnonymousClass08X {
    public final /* synthetic */ AnonymousClass5Y2 A00;

    public /* synthetic */ AnonymousClass5Y3(AnonymousClass5Y2 r1) {
        this.A00 = r1;
    }

    public final Bundle EKB() {
        ArrayList arrayList;
        Map E2c = this.A00.E2c();
        Bundle bundle = new Bundle();
        for (Map.Entry entry : E2c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        return bundle;
    }
}
