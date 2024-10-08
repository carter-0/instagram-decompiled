package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import com.instagram.common.session.UserSession;

public final class W53 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C309546Yr A04;
    public final /* synthetic */ VZP A05;
    public final /* synthetic */ C232682uF A06;
    public final /* synthetic */ String A07;

    public W53(Activity activity, Uri uri, AnonymousClass0iw r3, UserSession userSession, C309546Yr r5, VZP vzp, C232682uF r7, String str) {
        this.A04 = r5;
        this.A01 = uri;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = str;
        this.A05 = vzp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C309546Yr r3 = this.A04;
        r3.A03 = true;
        0kR.A0F(this.A00, this.A01);
        UserSession userSession = this.A03;
        C309546Yr.A01(this.A02, userSession, r3, this.A05, this.A06, this.A07, AnonymousClass000.A00(1654));
    }
}
