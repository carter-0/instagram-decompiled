package X;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.8BI  reason: invalid class name */
public final class AnonymousClass8BI implements 0sL {
    public final /* synthetic */ AnonymousClass8BA A00;

    public AnonymousClass8BI(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AnonymousClass8BA r2 = this.A00;
        if (booleanValue) {
            Activity activity = r2.A0n;
            Medium A002 = C282665Eg.A00(activity, Uri.fromFile(new File(str)), 3);
            if (A002 != null) {
                UserSession userSession = r2.A0v;
                C385759jU r3 = new C385759jU(this);
                0qQ.A0B(activity, 0);
                0qQ.A0B(userSession, 2);
                C290815g0 r0 = new C290815g0(new JZ5(activity, A002, userSession, true), 458);
                r0.A00 = r3;
                1ES.A03(r0);
            }
        } else {
            Dialog dialog = (Dialog) r2.A1y.getValue();
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        return C60340gF.A00;
    }
}
