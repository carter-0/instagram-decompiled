package X;

import android.content.Context;

/* renamed from: X.AYi  reason: case insensitive filesystem */
public final class C40269AYi implements AnonymousClass0lh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public C40269AYi(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public final void onSessionWillEnd() {
        Context applicationContext = this.A00.getApplicationContext();
        0qQ.A07(applicationContext);
        String str = this.A01;
        0qQ.A0B(str, 1);
        0oI.A08(applicationContext, str, false);
    }
}
