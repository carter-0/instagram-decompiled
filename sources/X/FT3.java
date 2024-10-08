package X;

import android.app.Activity;
import android.content.Context;
import android.text.ClipboardManager;
import android.view.View;

public final class FT3 implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public FT3(Activity activity, View view, int i, boolean z) {
        this.A00 = i;
        this.A01 = activity;
        this.A03 = z;
        this.A02 = view;
    }

    public final Object apply(Object obj) {
        int i = this.A00;
        Context context = (Context) this.A01;
        boolean z = this.A03;
        View view = (View) this.A02;
        String str = (String) obj;
        if (i != 0) {
            ((ClipboardManager) DbZ.A0e(context)).setText(str);
        } else {
            0nC.A00(context, str);
        }
        C49118Eph.A00(context, view, (String) null, z);
        return null;
    }
}
