package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.instagram.user.model.User;

/* renamed from: X.Paq  reason: case insensitive filesystem */
public final class C73331Paq implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ OGO A01;
    public final /* synthetic */ User A02;

    public C73331Paq(ViewGroup viewGroup, OGO ogo, User user) {
        this.A01 = ogo;
        this.A02 = user;
        this.A00 = viewGroup;
    }

    public final void run() {
        OGO ogo = this.A01;
        C70480O8f o8f = ogo.A00;
        if (o8f != null) {
            o8f.A00.A0W("dialog");
        }
        Context context = ogo.A03;
        AnonymousClass5Gt r2 = new AnonymousClass5Gt((Activity) context, new PI1(context.getString(2131969567), DbW.A0h(context, this.A02.getUsername(), 2131969565)));
        r2.A03(this.A00);
        r2.A01();
        r2.A0F = false;
        r2.A04 = new NdO(this, 5);
        AnonymousClass5Gv A002 = r2.A00();
        ogo.A01 = A002;
        A002.A06();
    }
}
