package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pbn  reason: case insensitive filesystem */
public final class C73390Pbn implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C70961OTi A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C73390Pbn(Context context, UserSession userSession, C70961OTi oTi, String str, String str2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = oTi;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void run() {
        C70122Nxc.A00(this.A00, this.A01, this.A02.A03, this.A04, this.A03);
    }
}
