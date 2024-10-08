package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;

/* renamed from: X.OgI  reason: case insensitive filesystem */
public final class C71251OgI implements DialogInterface.OnShowListener {
    public final /* synthetic */ PMU A00;
    public final /* synthetic */ C68293N9g A01;

    public C71251OgI(PMU pmu, C68293N9g n9g) {
        this.A00 = pmu;
        this.A01 = n9g;
    }

    public final void onShow(DialogInterface dialogInterface) {
        PMU pmu = this.A00;
        boolean z = this.A01.A0F;
        Window window = ((Dialog) pmu.A0X.getValue()).getWindow();
        if (window != null) {
            int i = -2;
            if (z) {
                i = -1;
            }
            window.setLayout(i, i);
        }
    }
}
