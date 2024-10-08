package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.FvE  reason: case insensitive filesystem */
public final /* synthetic */ class C51506FvE implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ F11 A02;
    public final /* synthetic */ FV6 A03;

    public /* synthetic */ C51506FvE(Context context, UserSession userSession, F11 f11, FV6 fv6) {
        this.A02 = f11;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = fv6;
    }

    public final void run() {
        F11 f11 = this.A02;
        Context context = this.A00;
        FV6 fv6 = this.A03;
        TextView textView = f11.A05;
        textView.setText(C49759F5k.A00(context, fv6.A06, textView, fv6.A0B, f11.A02.getWidth(), fv6.A0D.size()));
        textView.setVisibility(0);
    }
}
