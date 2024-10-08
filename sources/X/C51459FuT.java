package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.FuT  reason: case insensitive filesystem */
public final class C51459FuT implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InstagramMainActivity A02;

    public C51459FuT(Bundle bundle, UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A02 = instagramMainActivity;
        this.A01 = userSession;
        this.A00 = bundle;
    }

    public final void run() {
        FHD fhd = FHD.A1l;
        if (fhd == null) {
            fhd = new FHD();
            FHD.A1l = fhd;
        }
        fhd.A0K(this.A00, this.A02, this.A01);
    }
}
