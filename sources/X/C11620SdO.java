package X;

import android.os.Bundle;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.SdO  reason: case insensitive filesystem */
public final class C11620SdO implements 06c {
    public final /* synthetic */ C13879Tj0 A00;
    public final /* synthetic */ 1Nv A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AndroidLink A03;
    public final /* synthetic */ AndroidLink A04;
    public final /* synthetic */ Q03 A05;

    public C11620SdO(C13879Tj0 tj0, 1Nv r2, 1Xj r3, AndroidLink androidLink, AndroidLink androidLink2, Q03 q03) {
        this.A05 = q03;
        this.A02 = r3;
        this.A04 = androidLink;
        this.A03 = androidLink2;
        this.A01 = r2;
        this.A00 = tj0;
    }

    public final void DGi(String str, Bundle bundle) {
        0qQ.A0B(bundle, 1);
        String string = bundle.getString("playable_result_key");
        if (string != null && string.equals("playable_result_open_cta")) {
            Q03 q03 = this.A05;
            1Xj r2 = this.A02;
            AndroidLink androidLink = this.A04;
            AndroidLink androidLink2 = this.A03;
            SUD.A02(this.A00, this.A01, r2, androidLink, androidLink2, q03);
        }
    }
}
