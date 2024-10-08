package X;

import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.PDm  reason: case insensitive filesystem */
public final class C72633PDm implements C74482Pvc {
    public final /* synthetic */ OZT A00;

    public final void DsT(View view) {
    }

    public final void Dsf(String str, View view) {
    }

    public final void onDismiss() {
    }

    public C72633PDm(OZT ozt) {
        this.A00 = ozt;
    }

    public final void D7W() {
        OZT ozt = this.A00;
        ozt.A02(true);
        DirectThreadKey A04 = C66647MaG.A04(ozt.A0B);
        if (ozt.A05 == 29 && A04 != null) {
            C313746gw.A00(ozt.A09).A0B(ozt.A04, A04.A00, A04.A01);
        }
    }

    public final void DBp(String str, int i) {
        GME gme = this.A00.A0C.A00.A04;
        if (gme != null) {
            gme.A0I(str, NetInfoModule.CONNECTION_TYPE_NONE, "emoji_tray", (String) null);
        }
    }
}
