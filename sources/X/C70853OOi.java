package X;

import android.os.Bundle;

/* renamed from: X.OOi  reason: case insensitive filesystem */
public abstract class C70853OOi {
    public static final C74547Pwg A00(Bundle bundle, 0lg r6) {
        Object obj;
        0qQ.A0B(r6, 1);
        if (bundle != null) {
            long j = bundle.getLong("bug_reporter_user_flow_logger_v2_flow_id_extra", 0);
            if (!(Long.valueOf(j) == null || j == 0)) {
                obj = new C71846Orn(r6, j);
                return (C74547Pwg) obj;
            }
        }
        obj = new Object();
        return (C74547Pwg) obj;
    }

    public static final C74547Pwg A01(0lg r3) {
        Object obj;
        if (182.A06(AnonymousClass7TF.A0H(r3), r3, 36324359488614432L)) {
            obj = new C71846Orn(r3, 0);
        } else {
            obj = new Object();
        }
        return (C74547Pwg) obj;
    }
}
