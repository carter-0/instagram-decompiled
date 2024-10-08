package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collections;
import java.util.List;

/* renamed from: X.94i  reason: invalid class name and case insensitive filesystem */
public final class C3731894i extends 0Yg implements 0sP {
    public static final C3731894i A00 = new C3731894i();

    public C3731894i() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        0qQ.A0B(list, 0);
        double d = 1.0d;
        List singletonList = Collections.singletonList(Double.valueOf(1.0d));
        0qQ.A07(singletonList);
        if ((!list.isEmpty()) && list.size() == 1) {
            FeatureData featureData = (FeatureData) ((Example) list.get(0)).A02.get("3660");
            if (featureData != null) {
                d = featureData.A00;
            }
            singletonList = Collections.singletonList(Double.valueOf(d));
            0qQ.A07(singletonList);
        }
        singletonList.toString();
        return singletonList;
    }
}
