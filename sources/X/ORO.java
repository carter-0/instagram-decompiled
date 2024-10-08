package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ORO {
    public static final 0xE A00(boolean z, boolean z2) {
        0xE r3 = new 0xE();
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (z2) {
            A1C.add(C69500Nmi.A04);
        }
        if (z) {
            A1C.add(C69500Nmi.A0E);
        }
        if (DbT.A1b(A1C)) {
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                r3.A02(((C69500Nmi) it.next()).A00);
            }
        }
        return r3;
    }

    public static final void A01(UserSession userSession, String str, String str2, String str3, List list) {
        0xI A01 = 0xI.A01("direct_inapp_notification_tap", str);
        A01.A0C("reason", str2);
        A01.A0D("thread_ids", list);
        if (str3 != null) {
            A01.A0C("target_id", str3);
        }
        if (!list.isEmpty()) {
            A01.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, (String) AnonymousClass7TE.A13(list));
        }
        DbU.A1R(A01, userSession);
    }
}
