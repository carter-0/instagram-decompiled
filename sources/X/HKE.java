package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

public final class HKE extends C54235H4e {
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FragmentActivity fragmentActivity;
        ImageUrl A1Q;
        int A03 = AnonymousClass0fD.A03(1543284701);
        int A032 = AnonymousClass0fD.A03(1979397978);
        C267324bN r2 = this.A00;
        1Xj r3 = r2.A02;
        if (r3 != null) {
            r3.A00 = 0;
            r3.A0C.EUA(0);
            r3.AE7(this.A01);
        }
        GBE gbe = this.A02;
        GBE.A02(r2, gbe);
        if (GD6.A01(gbe.A20).A0A() == 0 && (fragmentActivity = gbe.A0R) != null) {
            Intent A04 = C51976G9y.A04(r2);
            A04.putExtra("media_action", AnonymousClass000.A00(1574));
            1Xj r0 = r2.A02;
            if (!(r0 == null || (A1Q = r0.A1Q()) == null)) {
                A04.putExtra(AnonymousClass000.A00(1586), A1Q.getUrl());
                A04.putExtra(AnonymousClass000.A00(1585), A1Q.getHeight());
                A04.putExtra(AnonymousClass000.A00(1588), A1Q.getWidth());
            }
            fragmentActivity.setResult(-1, A04);
            fragmentActivity.onBackPressed();
        }
        AnonymousClass0fD.A0A(598730574, A032);
        AnonymousClass0fD.A0A(119825064, A03);
    }
}
