package X;

import android.view.View;

/* renamed from: X.PaQ  reason: case insensitive filesystem */
public final class C73305PaQ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C71448Okn A01;
    public final /* synthetic */ C68473NJl A02;

    public C73305PaQ(View view, C71448Okn okn, C68473NJl nJl) {
        this.A02 = nJl;
        this.A00 = view;
        this.A01 = okn;
    }

    public final void run() {
        C68473NJl nJl = this.A02;
        String str = nJl.A04;
        if (str == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        } else if (str.equals("hidden_reaction_nux") && nJl.A01 != null) {
            C68473NJl.A00(nJl);
            this.A00.getViewTreeObserver().removeOnGlobalLayoutListener(this.A01);
        }
    }
}
