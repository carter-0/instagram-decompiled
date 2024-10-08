package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collections;
import java.util.List;

/* renamed from: X.94k  reason: invalid class name and case insensitive filesystem */
public final class C3731994k extends 0Yg implements 0sP {
    public static final C3731994k A00 = new C3731994k();

    public C3731994k() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        List list = (List) obj;
        0qQ.A0B(list, 0);
        List singletonList = Collections.singletonList(Double.valueOf(1.0d));
        0qQ.A07(singletonList);
        if (!(!list.isEmpty()) || list.size() != 1) {
            return singletonList;
        }
        list.get(0);
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
        FeatureData featureData3 = (FeatureData) ((Example) list.get(0)).A02.get("333");
        if (featureData3 != null) {
            d3 = featureData3.A00;
        } else {
            d3 = 0.0d;
        }
        if (d <= 0.0d || d2 <= 0.0d || d3 <= 0.0d) {
            return singletonList;
        }
        double d4 = d3 * d2;
        List singletonList2 = Collections.singletonList(Double.valueOf(Math.min(Math.max(d2 - d4, d), d2 + d4) / d2));
        0qQ.A07(singletonList2);
        return singletonList2;
    }
}
