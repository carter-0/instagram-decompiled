package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collections;
import java.util.List;

/* renamed from: X.94j  reason: invalid class name */
public final class AnonymousClass94j extends 0Yg implements 0sP {
    public static final AnonymousClass94j A00 = new AnonymousClass94j();

    public AnonymousClass94j() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double d;
        double d2;
        List list = (List) obj;
        0qQ.A0B(list, 0);
        List singletonList = Collections.singletonList(Double.valueOf(1.0d));
        0qQ.A07(singletonList);
        if ((!list.isEmpty()) && list.size() == 1) {
            FeatureData featureData = (FeatureData) ((Example) list.get(0)).A02.get("222");
            if (featureData != null) {
                d = featureData.A00;
            } else {
                d = 0.0d;
            }
            FeatureData featureData2 = (FeatureData) ((Example) list.get(0)).A02.get("111");
            if (featureData2 != null) {
                d2 = featureData2.A00;
            } else {
                d2 = 0.0d;
            }
            if (d > 0.0d && d2 > 0.0d) {
                singletonList = Collections.singletonList(Double.valueOf(d / d2));
                0qQ.A07(singletonList);
            }
            singletonList.toString();
        }
        return singletonList;
    }
}
