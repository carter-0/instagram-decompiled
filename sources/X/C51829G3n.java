package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.List;

/* renamed from: X.G3n  reason: case insensitive filesystem */
public final class C51829G3n extends 0Yg implements 0sP {
    public static final C51829G3n A00 = new C51829G3n();

    public C51829G3n() {
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
            FeatureData featureData = (FeatureData) ((Example) obj2).A02.get("3884");
            if (featureData != null) {
                double d = featureData.A00;
                if (d != -1.0d && d < 3.0d) {
                    A0f = Dbb.A0f(0.0d);
                }
            }
        }
        A0f.toString();
        return A0f;
    }
}
