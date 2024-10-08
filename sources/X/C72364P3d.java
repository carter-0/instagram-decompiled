package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.P3d  reason: case insensitive filesystem */
public final class C72364P3d implements C74399PuF {
    public final FragmentActivity A00;
    public final C279864zZ A01;
    public final UserSession A02;

    public final void DUW(OIR oir) {
    }

    public final void DUZ(OIR oir) {
        C279864zZ r1 = this.A01;
        Bundle A0a = AnonymousClass7TE.A0a();
        NIJ nij = new NIJ();
        nij.A00 = r1;
        nij.setArguments(A0a);
        C71110Ocp.A02(this.A00, nij, DbS.A0W(this.A02));
    }

    public C72364P3d(FragmentActivity fragmentActivity, C279864zZ r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }
}
