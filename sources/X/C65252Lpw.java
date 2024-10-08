package X;

import android.view.View;

/* renamed from: X.Lpw  reason: case insensitive filesystem */
public final class C65252Lpw implements MSE {
    public final /* synthetic */ C65228LpY A00;

    public C65252Lpw(C65228LpY lpY) {
        this.A00 = lpY;
    }

    public final void DZP() {
        KHY khy;
        C65228LpY lpY = this.A00;
        KHY khy2 = lpY.A00;
        if (khy2 != null) {
            khy2.setEnableSwitchView(true);
            if (C363558jv.A00(lpY.A05) && (khy = lpY.A00) != null) {
                khy.setChecked(true);
            }
            lpY.A02 = true;
            KHY khy3 = lpY.A00;
            if (khy3 != null) {
                khy3.setOnCheckedClickedListener((View.OnClickListener) null);
            }
            KHY khy4 = lpY.A00;
            if (khy4 != null) {
                khy4.setDescription(C65228LpY.A01(lpY));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
