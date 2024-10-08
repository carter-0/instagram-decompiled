package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class I8M implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ 1P0 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;

    public /* synthetic */ I8M(Context context, AnonymousClass07i r2, 1P0 r3, UserSession userSession, 1Xj r5) {
        this.A03 = userSession;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = context;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A03;
        1Xj r3 = this.A04;
        C56910IHf.A01(this.A00, this.A01, this.A02, userSession, r3);
    }
}
