package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.List;

public final class So1 implements C258943zt {
    public final AnonymousClass5K5 A00;

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        ArrayList arrayList;
        Type type;
        AnonymousClass5K5 r0 = this.A00;
        if (r0 != null) {
            double d = r0.A00;
            double d2 = d;
            int i = 1;
            if (d == 0.0d) {
                d = 1.0d;
            } else if (d <= 0.3d) {
                i = 0;
            }
            arrayList = AnonymousClass7TE.A1C();
            Type type2 = Type.LONG;
            arrayList.add(new FeatureData(type2, "3351", (String) null, (List) null, 0.0d, 16376, (long) r0.A05));
            Type type3 = Type.DOUBLE;
            arrayList.add(new FeatureData(type3, "3252", (String) null, (List) null, d2, 16372, 0));
            arrayList.add(new FeatureData(type3, "3627", (String) null, (List) null, r0.A01, 16372, 0));
            arrayList.add(new FeatureData(type3, "3628", (String) null, (List) null, r0.A02, 16372, 0));
            arrayList.add(new FeatureData(type3, "3629", (String) null, (List) null, r0.A03, 16372, 0));
            arrayList.add(new FeatureData(type3, "3630", (String) null, (List) null, r0.A04, 16372, 0));
            arrayList.add(new FeatureData(type3, "3649", (String) null, (List) null, d, 16372, 0));
            arrayList.add(new FeatureData(type2, "3650", (String) null, (List) null, 0.0d, 16376, (long) i));
        } else {
            arrayList = 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : arrayList) {
            FeatureData featureData = (FeatureData) next;
            if (!0qQ.A0K(featureData.A03, "") && !(((type = featureData.A02) == Type.DOUBLE && featureData.A00 == -1.0d) || (type == Type.LONG && featureData.A01 == -1))) {
                A1C.add(next);
            }
        }
        return Pxf.A0M(A1C);
    }

    public final String getId() {
        return "StoryPrefetchImmediate";
    }

    public So1(AnonymousClass5K5 r1) {
        this.A00 = r1;
    }
}
