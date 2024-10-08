package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.List;

/* renamed from: X.G3k  reason: case insensitive filesystem */
public final class C51826G3k extends 0Yg implements 0sP {
    public static final C51826G3k A00 = new C51826G3k();

    public C51826G3k() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        List list = (List) obj;
        0qQ.A0B(list, 0);
        List A0f = Dbb.A0f(1.0d);
        if ((!list.isEmpty()) && list.size() == 1) {
            if (list.size() > 0) {
                obj2 = list.get(0);
            } else {
                obj2 = Example.A03;
            }
            FeatureData featureData = (FeatureData) ((Example) obj2).A02.get("3882");
            if (featureData != null) {
                double d = featureData.A00;
                if (d != -1.0d && d <= 2.0d) {
                    A0f = Dbb.A0f(0.0d);
                }
            }
        }
        A0f.toString();
        return A0f;
    }
}
