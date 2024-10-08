package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lz4  reason: case insensitive filesystem */
public final class C65750Lz4 implements C332277Ui {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ L1X A02;

    public final void D9a() {
    }

    public C65750Lz4(Context context, UserSession userSession, L1X l1x) {
        this.A02 = l1x;
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void D9V() {
        L1X l1x = this.A02;
        if (!l1x.A00) {
            new LRh(this.A01, this.A00).A02();
            l1x.A00 = false;
        }
    }
}
