package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.HeY  reason: case insensitive filesystem */
public abstract class C55243HeY {
    public static final K57 A00(C59725JVj jVj, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean(C273654mx.A00(548), z);
        if (jVj != null) {
            A09.putSerializable(AnonymousClass000.A00(2639), jVj);
        }
        K57 k57 = new K57();
        k57.setArguments(A09);
        return k57;
    }
}
