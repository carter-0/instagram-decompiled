package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.47z  reason: invalid class name and case insensitive filesystem */
public final class C2610347z implements Runnable {
    public final /* synthetic */ AnonymousClass407 A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public C2610347z(AnonymousClass407 r1, List list, List list2) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = list2;
    }

    public final void run() {
        AnonymousClass407 r6 = this.A00;
        List list = this.A01;
        List list2 = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HashMap hashMap = ((Example) list.get(i)).A02;
            C255463uA[] r0 = FeatureData.A0E;
            hashMap.put("-1", new FeatureData(Type.DOUBLE, "-1", (String) null, (List) null, ((Number) list2.get(i)).doubleValue(), 16372, 0));
        }
        r6.A02.EyW(list);
    }
}
