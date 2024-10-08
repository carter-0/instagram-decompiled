package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

public final class HKD extends C54235H4e {
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FragmentActivity fragmentActivity;
        int A03 = AnonymousClass0fD.A03(1624098331);
        int A032 = AnonymousClass0fD.A03(-1996502921);
        C267324bN r2 = this.A00;
        1Xj r1 = r2.A02;
        if (r1 != null) {
            r1.A00 = 2;
            r1.AE7(this.A01);
        }
        GBE gbe = this.A02;
        GBE.A02(r2, gbe);
        if (GD6.A01(gbe.A20).A0A() == 0 && (fragmentActivity = gbe.A0R) != null) {
            Intent A04 = C51976G9y.A04(r2);
            A04.putExtra("media_action", AnonymousClass000.A00(1573));
            fragmentActivity.setResult(-1, A04);
            fragmentActivity.onBackPressed();
        }
        AnonymousClass0fD.A0A(1014588746, A032);
        AnonymousClass0fD.A0A(-1934365460, A03);
    }
}
