package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class FIW implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;

    public FIW(Context context, AnonymousClass0iw r2, UserSession userSession, long j) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r2;
        this.A00 = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FEC.A00(this.A01, this.A02, this.A03, Long.valueOf(this.A00), "ig_direct");
    }
}
