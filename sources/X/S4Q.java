package X;

import android.os.Bundle;
import java.util.ArrayList;

public final class S4Q {
    public static S4Q A02;
    public final SRY A00 = SRY.A00();
    public final ArrayList A01 = DbS.A0v(8);

    public final void A00(Bundle bundle) {
        SRY sry = this.A00;
        if (sry.A01 != null) {
            ArrayList arrayList = this.A01;
            AnonymousClass7TE.A1Y(arrayList, System.currentTimeMillis());
            if (arrayList.size() >= 8) {
                SRY.A02(new QJx(bundle, sry, A01()), sry, false);
            }
        }
    }

    public final long[] A01() {
        ArrayList arrayList = this.A01;
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            0qQ.A07(obj);
            jArr[i] = AnonymousClass7TE.A0R(obj);
        }
        arrayList.clear();
        return jArr;
    }
}
