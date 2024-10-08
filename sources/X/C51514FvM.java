package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FvM  reason: case insensitive filesystem */
public final class C51514FvM implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Fe1 A01;
    public final /* synthetic */ BaseFragmentActivity A02;
    public final /* synthetic */ UserSession A03;

    public C51514FvM(Bundle bundle, Fe1 fe1, BaseFragmentActivity baseFragmentActivity, UserSession userSession) {
        this.A01 = fe1;
        this.A02 = baseFragmentActivity;
        this.A03 = userSession;
        this.A00 = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void run() {
        FHD.A0J(this.A02, this.A00, this.A03, false);
    }
}
