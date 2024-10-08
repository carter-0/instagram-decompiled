package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.6ZK  reason: invalid class name */
public final class AnonymousClass6ZK {
    public final /* synthetic */ AnonymousClass6Z5 A00;

    public AnonymousClass6ZK(AnonymousClass6Z5 r1) {
        this.A00 = r1;
    }

    public final void A00(C255773uh r13) {
        String str;
        1Xj r8 = r13.A0b;
        if (r8 != null) {
            AnonymousClass6Z5 r4 = this.A00;
            UserSession userSession = r4.A09;
            if (userSession == null) {
                str = "userSession";
            } else {
                AnonymousClass4DU r9 = r4.A15;
                HNS hns = HNS.OPEN_BLOKS_APP;
                hns.A00 = "com.instagram.misinformation.fact_check_sheet.action";
                I2F.A00(hns, HNP.OVERFLOW_MENU, r8, r9, userSession, AnonymousClass05K.A0C);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String A2n = r8.A2n();
                if (A2n != null) {
                    linkedHashMap.put("media_id", A2n);
                    linkedHashMap.put("module", r9.getModuleName());
                    C310226ad r0 = r4.A0r;
                    if (r0 == null) {
                        str = "reelViewerBloksHelper";
                    } else {
                        r0.A00(r13, "com.instagram.misinformation.fact_check_sheet.action", linkedHashMap);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
