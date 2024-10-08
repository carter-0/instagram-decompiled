package X;

import android.app.Activity;
import android.text.ClipboardManager;
import android.view.View;

public final /* synthetic */ class FT1 implements AnonymousClass2hV {
    public final /* synthetic */ Activity A00;

    public /* synthetic */ FT1(Activity activity) {
        this.A00 = activity;
    }

    public final Object apply(Object obj) {
        Activity activity = this.A00;
        ((ClipboardManager) DbZ.A0e(activity)).setText((String) obj);
        C49118Eph.A00(activity, (View) null, (String) null, false);
        return null;
    }
}
