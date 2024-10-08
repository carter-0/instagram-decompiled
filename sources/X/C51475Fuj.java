package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Fuj  reason: case insensitive filesystem */
public final /* synthetic */ class C51475Fuj implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ RegFlowExtras A02;

    public /* synthetic */ C51475Fuj(Fragment fragment, 0lg r2, RegFlowExtras regFlowExtras) {
        this.A02 = regFlowExtras;
        this.A01 = r2;
        this.A00 = fragment;
    }

    public final void run() {
        RegFlowExtras regFlowExtras = this.A02;
        0lg r4 = this.A01;
        Fragment fragment = this.A00;
        DbT.A15();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        DbW.A0w(A0a, r4);
        E3V e3v = new E3V();
        Dbb.A14(e3v, DbU.A0I(A0a, e3v, fragment), r4);
    }
}
