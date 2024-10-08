package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

public final class U5z extends C18018Vju {
    public final /* synthetic */ WDU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U5z(Context context, View view, C18932WDk wDk, WDU wdu) {
        super(context, view, wDk, R.attr.actionOverflowMenuStyle, 0, true);
        this.A00 = wdu;
        this.A00 = 8388613;
        WDQ wdq = wdu.A0K;
        this.A04 = wdq;
        WDW wdw = this.A03;
        if (wdw != null) {
            wdw.EQJ(wdq);
        }
    }

    public final void A01() {
        WDU wdu = this.A00;
        C18932WDk wDk = wdu.A06;
        if (wDk != null) {
            wDk.close();
        }
        wdu.A0D = null;
        super.A01();
    }
}
