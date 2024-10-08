package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pay  reason: case insensitive filesystem */
public final class C73339Pay implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FRE A01;
    public final /* synthetic */ UserSession A02;

    public C73339Pay(Context context, FRE fre, UserSession userSession) {
        this.A01 = fre;
        this.A00 = context;
        this.A02 = userSession;
    }

    public final void run() {
        this.A01.E0s(this.A00, new FRI((UKI) null, (Boolean) null, (Integer) null, (Integer) null, 1.0f, false, false, false, true), C48721Ej6.A00(this.A02, false));
    }
}
