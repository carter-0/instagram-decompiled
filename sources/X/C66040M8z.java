package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.M8z  reason: case insensitive filesystem */
public final class C66040M8z implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ User A02;

    public C66040M8z(Context context, DialogInterface.OnClickListener onClickListener, User user) {
        this.A00 = context;
        this.A02 = user;
        this.A01 = onClickListener;
    }

    public final void run() {
        Context context = this.A00;
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131962006);
        A0Y.A0q(DbY.A0b(context, this.A02, 2131962005));
        A0Y.A0I(this.A01, 2131962530);
        A0Y.A05();
        DbT.A1V(A0Y);
    }
}
