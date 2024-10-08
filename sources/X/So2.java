package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class So2 implements C258943zt {
    public final UserSession A00;
    public final C13790Th5 A01;

    public final String getId() {
        return "ReelsSwipeSource";
    }

    public So2(UserSession userSession, C13790Th5 th5) {
        AnonymousClass7TG.A1O(userSession, th5);
        this.A00 = userSession;
        this.A01 = th5;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C255463uA[] r0 = FeatureData.A0E;
        Type type = Type.LONG;
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A06;
        A1C.add(new FeatureData(type, "111", (String) null, (List) null, 0.0d, 16376, 182.A01(r2, userSession, 36599018356018539L)));
        A1C.add(new FeatureData(type, "222", (String) null, (List) null, 0.0d, 16376, 182.A01(r2, userSession, 36599018356149613L)));
        A1C.add(new FeatureData(Type.DOUBLE, "333", (String) null, (List) null, 182.A00(r2, userSession, 37161968309633222L), 16372, 0));
        Type type2 = Type.LONG_LIST;
        C13790Th5 th5 = this.A01;
        A1C.add(new FeatureData(type2, "444", (String) null, th5.E6m(AnonymousClass05K.A00), 0.0d, 16316, 0));
        A1C.add(new FeatureData(type2, "555", (String) null, th5.E6m(AnonymousClass05K.A01), 0.0d, 16316, 0));
        return Pxf.A0M(A1C);
    }
}
