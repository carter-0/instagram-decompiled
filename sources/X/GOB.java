package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class GOB implements C254293sF {
    public final AnonymousClass0iw A00;
    public final C297195rM A01;
    public final WeakReference A02;

    public GOB(AnonymousClass0iw r2, C297195rM r3, WeakReference weakReference) {
        0qQ.A0B(weakReference, 1);
        this.A02 = weakReference;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void DzO(C254353sL r9, Boolean bool, String str) {
        UserSession userSession;
        Integer num;
        C254563sg r1;
        if (!0qQ.A0K(bool, false) && (userSession = (UserSession) this.A02.get()) != null) {
            C254353sL r3 = r9;
            C254233s9 r12 = r9.A00;
            if ((r12 instanceof C254563sg) && (r1 = (C254563sg) r12) != null) {
                int intValue = r1.A00.A2t.intValue();
                if (intValue == 0) {
                    num = AnonymousClass05K.A00;
                } else if (intValue == 1) {
                    num = AnonymousClass05K.A01;
                }
                C297195rM.A00(AnonymousClass2oW.IG_GENERIC, r3, this.A00, userSession, num, str);
            }
            num = AnonymousClass05K.A0N;
            C297195rM.A00(AnonymousClass2oW.IG_GENERIC, r3, this.A00, userSession, num, str);
        }
    }
}
