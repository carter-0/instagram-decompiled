package X;

import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class WUN implements MS1 {
    public final /* synthetic */ WUZ A00;

    public final void DBu(View view, String str, String str2) {
        IgSimpleImageView igSimpleImageView;
        WUZ wuz = this.A00;
        C19470WaI waI = new C19470WaI(new C283405Hn(str, false));
        wuz.A01 = waI;
        C17656Vbm vbm = wuz.A00;
        if (vbm != null && (igSimpleImageView = vbm.A02) != null) {
            igSimpleImageView.setImageDrawable(new C16148UpZ(wuz.A03, waI, true, false));
        }
    }

    public WUN(WUZ wuz) {
        this.A00 = wuz;
    }
}
