package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.user.model.User;

public abstract class LKI {
    public static final void A00(Context context) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131965171);
        DbU.A17(context, A0Y, 2131965169);
        A0Y.A06();
        AnonymousClass7TH.A0a(A0Y, true);
    }

    public static final void A01(Context context, User user) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, user);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A05 = DbY.A0b(context, user, 2131965243);
        A0Y.A0c((DialogInterface.OnClickListener) null, AnonymousClass7TE.A16(context, 2131968772));
        AnonymousClass7TH.A0a(A0Y, A1Z);
    }
}
