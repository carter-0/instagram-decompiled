package X;

import android.view.View;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.FLm  reason: case insensitive filesystem */
public final class C50046FLm implements View.OnClickListener {
    public final /* synthetic */ FAY A00;

    public C50046FLm(FAY fay) {
        this.A00 = fay;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-2095012191);
        FAY fay = this.A00;
        DeveloperOptionsLauncher.launchHomeDeliveryDebugTool(fay.A00, fay.A02, fay.A04);
        AnonymousClass0fD.A0C(1023194094, A05);
    }
}
