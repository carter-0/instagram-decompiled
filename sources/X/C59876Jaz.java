package X;

import android.content.Context;

/* renamed from: X.Jaz  reason: case insensitive filesystem */
public final class C59876Jaz implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C59870Jat A01;

    public C59876Jaz(Context context, C59870Jat jat) {
        this.A01 = jat;
        this.A00 = context;
    }

    public final void run() {
        C59870Jat jat = this.A01;
        Context context = this.A00;
        if (jat.A0A.get() != null) {
            jat.A06.A01();
        }
        if (!JTR.A0k(context).COf() && context.getExternalFilesDir((String) null) != null) {
            new C59891JbG(jat).A02(new String[0]);
        }
    }
}
