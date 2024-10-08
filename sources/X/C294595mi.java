package X;

import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5mi  reason: invalid class name and case insensitive filesystem */
public abstract class C294595mi {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.instagram.model.rixu.RIXUChainingBehaviorDefinition] */
    public static final RIXUChainingBehaviorDefinition A00(C376559Il r9) {
        RIXUCoverChainingType rIXUCoverChainingType = (RIXUCoverChainingType) r9.A01;
        RIXUChainingSourceType rIXUChainingSourceType = (RIXUChainingSourceType) r9.A02;
        Boolean bool = (Boolean) r9.A05;
        Integer num = (Integer) r9.A07;
        Boolean bool2 = (Boolean) r9.A03;
        List<C276014sL> list = (List) r9.A06;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C276014sL r0 : list) {
            arrayList.add(C267324bN.A0d.A04(r0.A00));
        }
        ? obj = new Object();
        obj.A01 = rIXUCoverChainingType;
        obj.A00 = rIXUChainingSourceType;
        obj.A03 = bool;
        obj.A04 = num;
        obj.A02 = bool2;
        obj.A05 = arrayList;
        return obj;
    }
}
