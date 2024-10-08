package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.WBh  reason: case insensitive filesystem */
public final class C18890WBh implements View.OnLongClickListener {
    public final /* synthetic */ C17939ViU A00;
    public final /* synthetic */ U5O A01;
    public final /* synthetic */ String A02;

    public C18890WBh(C17939ViU viU, U5O u5o, String str) {
        this.A00 = viU;
        this.A01 = u5o;
        this.A02 = str;
    }

    public final boolean onLongClick(View view) {
        C17939ViU viU = this.A00;
        C358248ab r6 = new C358248ab((Activity) viU.A02);
        r6.A0s(true);
        r6.A0Q(new W5S(viU, this.A01, this.A02, 2), C358278ae.DEFAULT, 2131957531);
        DbT.A1V(r6);
        return true;
    }
}
