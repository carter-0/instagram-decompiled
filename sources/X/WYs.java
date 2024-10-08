package X;

import android.location.Location;
import androidx.fragment.app.FragmentActivity;

public final class WYs implements C267874cM {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ U92 A01;

    public WYs(FragmentActivity fragmentActivity, U92 u92) {
        this.A01 = u92;
        this.A00 = fragmentActivity;
    }

    public final void DCn(Exception exc) {
        String str;
        Object value;
        ULF ulf;
        U92 u92 = this.A01;
        if (exc != null) {
            str = exc.getLocalizedMessage();
        } else {
            str = null;
        }
        U92.A04(u92, String.valueOf(str));
        05G r2 = u92.A02.A04;
        do {
            value = r2.getValue();
            ulf = (ULF) value;
        } while (!r2.AIY(value, ULF.A00(ulf.A03, ulf.A02, ulf.A05, ulf.A04, ulf.A00, ulf.A01, false)));
    }

    public final void onLocationChanged(Location location) {
        U92.A02(this.A00, this.A01);
    }
}
