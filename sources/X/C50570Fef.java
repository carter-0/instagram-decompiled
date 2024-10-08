package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Fef  reason: case insensitive filesystem */
public final class C50570Fef implements G7C {
    public final Dd4 A00;
    public final C49492EwX A01;
    public final C62320sa A02;

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r7, int i) {
        0qQ.A0B(r7, 0);
        User A04 = r7.A04();
        if (A04 != null) {
            this.A00.A73(jv7, r7, A04, i);
            C49492EwX ewX = this.A01;
            String id = A04.getId();
            DdQ.A00(ewX.A00, ewX.A01, id, i);
            this.A02.invoke();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C50570Fef(Dd4 dd4, C49492EwX ewX, C62320sa r3) {
        this.A00 = dd4;
        this.A01 = ewX;
        this.A02 = r3;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (eVf != C48087EVf.PRIMARY_BUTTON || r4.A04() == null) {
            return false;
        }
        return true;
    }
}
