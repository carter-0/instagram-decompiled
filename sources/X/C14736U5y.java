package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.U5y  reason: case insensitive filesystem */
public final class C14736U5y extends C18018Vju {
    public final /* synthetic */ WDU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14736U5y(Context context, View view, C14733U5v u5v, WDU wdu) {
        super(context, view, u5v, R.attr.actionOverflowMenuStyle, 0, false);
        this.A00 = wdu;
        if ((((C18934WDm) u5v.getItem()).A02 & 32) != 32) {
            View view2 = wdu.A0C;
            this.A01 = view2 == null ? (View) wdu.A08 : view2;
        }
        WDQ wdq = wdu.A0K;
        this.A04 = wdq;
        WDW wdw = this.A03;
        if (wdw != null) {
            wdw.EQJ(wdq);
        }
    }

    public final void A01() {
        this.A00.A09 = null;
        super.A01();
    }
}
