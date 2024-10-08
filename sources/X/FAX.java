package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.HashMap;
import java.util.List;

public final class FAX {
    public final 0sP A00 = C51825G3j.A00;
    public final 0sP A01 = C51826G3k.A00;
    public final 0sP A02 = C51827G3l.A00;
    public final 0sP A03 = C51828G3m.A00;
    public final 0sP A04 = C51829G3n.A00;
    public final 0sP A05 = new G4U(this, 27);
    public final 0sP A06 = new G4U(this, 28);

    public static final List A00(List list, String str) {
        Object obj;
        double d;
        boolean isEmpty = list.isEmpty();
        Double valueOf = Double.valueOf(1.0d);
        if (isEmpty || list.size() > 1) {
            list.size();
            return AnonymousClass7TE.A1I(valueOf);
        }
        if (list.size() > 0) {
            obj = list.get(0);
        } else {
            obj = Example.A03;
        }
        HashMap hashMap = ((Example) obj).A02;
        FeatureData featureData = (FeatureData) hashMap.get("111");
        if (featureData != null) {
            d = featureData.A00;
        } else {
            d = -1.0d;
        }
        FeatureData featureData2 = (FeatureData) hashMap.get(str);
        if (featureData2 != null) {
            double d2 = featureData2.A00;
            if (!(d2 == -1.0d || d == -1.0d || d2 > d)) {
                valueOf = Double.valueOf(0.0d);
            }
        }
        List A1I = AnonymousClass7TE.A1I(valueOf);
        A1I.toString();
        return A1I;
    }
}
