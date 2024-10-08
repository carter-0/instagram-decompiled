package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;

public final class MAB implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C69410Nkp A03;
    public final /* synthetic */ DirectThreadKey A04;
    public final /* synthetic */ PendingMediaStore A05;
    public final /* synthetic */ String A06;

    public MAB(Bitmap bitmap, View view, UserSession userSession, C69410Nkp nkp, DirectThreadKey directThreadKey, PendingMediaStore pendingMediaStore, String str) {
        this.A05 = pendingMediaStore;
        this.A06 = str;
        this.A04 = directThreadKey;
        this.A02 = userSession;
        this.A03 = nkp;
        this.A01 = view;
        this.A00 = bitmap;
    }

    public final void run() {
        AnonymousClass3Q2 A032 = this.A05.A03(this.A06);
        if (A032 != null) {
            DirectThreadKey directThreadKey = this.A04;
            UserSession userSession = this.A02;
            C69410Nkp nkp = this.A03;
            C65530Lut lut = new C65530Lut(this.A00, this.A01, userSession, nkp, directThreadKey);
            A032.A0Y(lut);
            lut.DaJ(A032);
        }
    }
}
