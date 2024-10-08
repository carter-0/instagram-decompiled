package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.io.Serializable;

public abstract class HZA {
    public static final void A00(AnonymousClass4DH r5, UserSession userSession) {
        Serializable serializable;
        HLC hlc;
        0qQ.A0B(userSession, 1);
        Bundle bundle = r5.mArguments;
        if (bundle != null) {
            serializable = bundle.getSerializable(C66579MXk.A00(20));
        } else {
            serializable = null;
        }
        if ((serializable instanceof HLC) && (hlc = (HLC) serializable) != null) {
            int ordinal = hlc.ordinal();
            if (ordinal == 0) {
                DbX.A1I(r5);
            } else if (ordinal == 1) {
                DbW.A0H(r5, userSession).A0G((String) null, 0);
            }
        }
    }
}
