package X;

import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Draft;
import com.instagram.common.session.UserSession;

/* renamed from: X.8XV  reason: invalid class name */
public final class AnonymousClass8XV implements AnonymousClass1MK {
    public final int A00;
    public final BitmapFactory.Options A01;
    public final C62780vc A02 = new C62780vc(0nY.A00(), Runtime.getRuntime().availableProcessors() * 2);
    public final UserSession A03;

    public AnonymousClass8XV(UserSession userSession, int i) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A01 = options;
        options.inJustDecodeBounds = true;
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        Object C3s = r5.C3s();
        if (C3s != null) {
            C39682A4y a4y = (C39682A4y) C3s;
            C41814B1u b1u = (C41814B1u) a4y.A01.get();
            Draft draft = a4y.A00;
            if (b1u != null && b1u.CWO(draft)) {
                b1u.DrR(r6.A01, draft);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
