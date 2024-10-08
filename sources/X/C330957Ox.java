package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7Ox  reason: invalid class name and case insensitive filesystem */
public final class C330957Ox implements AnonymousClass0lh {
    public static final C330967Oy A04 = new Object();
    public final Context A00;
    public final 1a8 A01 = new 1a8((C269794fh) null);
    public final UserSession A02;
    public final Set A03 = new HashSet();

    public static final AnonymousClass7ZA A00(C330957Ox r2, C254793t3 r3) {
        AnonymousClass7ZA r32;
        if (r3 instanceof MsysThreadId) {
            r32 = new PCP(r2.A02);
        } else {
            UserSession userSession = r2.A02;
            r32 = new AnonymousClass7Z9(userSession, new PCR(r3), 1bJ.A00(userSession));
        }
        return r32;
    }

    public final void onSessionWillEnd() {
        this.A01.A01();
    }

    public C330957Ox(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A00 = context;
    }
}
