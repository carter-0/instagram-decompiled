package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Fec  reason: case insensitive filesystem */
public final class C50567Fec implements G7C {
    public final Dd4 A00;
    public final C49492EwX A01;

    public final boolean AFM(C48087EVf eVf, C283155Gi r3, int i) {
        0qQ.A0B(eVf, 1);
        return AnonymousClass7TF.A1W(eVf, C48087EVf.END_ICON);
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r7, int i) {
        0qQ.A0B(r7, 0);
        User A04 = r7.A04();
        if (A04 != null) {
            this.A00.D8G(jv7, r7, i, false);
            C49492EwX ewX = this.A01;
            String id = A04.getId();
            DdQ.A01(ewX.A00, ewX.A01, id, i);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C50567Fec(Dd4 dd4, C49492EwX ewX) {
        this.A00 = dd4;
        this.A01 = ewX;
    }
}
