package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;

public final class NSC extends 0ng {
    public final /* synthetic */ DirectThreadWidgetItem A00;
    public final /* synthetic */ OHG A01;
    public final /* synthetic */ C67685MsN A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSC(DirectThreadWidgetItem directThreadWidgetItem, OHG ohg, C67685MsN msN) {
        super(1243474276, 3, false, false);
        this.A00 = directThreadWidgetItem;
        this.A02 = msN;
        this.A01 = ohg;
    }

    public final void run() {
        Bitmap A0H = 1NK.A00().A0H(DbS.A0V(this.A00.A03), (String) null);
        Context context = this.A02.getContext();
        0qQ.A0C(context, Pxd.A00(0));
        ((Activity) context).runOnUiThread(new C73180PYK(A0H, this.A01));
    }
}
