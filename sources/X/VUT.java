package X;

import android.content.Context;

public final class VUT {
    public VL8 A00;
    public final Context A01;
    public final C20945X5o A02;

    public VUT(Context context) {
        C20945X5o x5o;
        this.A01 = context;
        try {
            VJP.A00(context);
            x5o = VJP.A00.AK5();
        } catch (C20552WuS e) {
            1yR.A09.A04(e);
            x5o = new WFY(this);
        }
        this.A02 = x5o;
    }
}
