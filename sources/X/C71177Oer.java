package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oer  reason: case insensitive filesystem */
public final class C71177Oer implements DialogInterface.OnClickListener {
    public final /* synthetic */ C314806is A00;

    public C71177Oer(C314806is r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C314806is r0 = this.A00;
        C49872FAt fAt = C49872FAt.A00;
        Context context = r0.A00;
        if (context == null) {
            str = "context";
        } else {
            UserSession userSession = r0.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                C314826iu r02 = r0.A02;
                if (r02 == null) {
                    str = "audLogging";
                } else {
                    fAt.A00(context, r02, userSession);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
