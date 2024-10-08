package X;

import android.content.Context;
import android.widget.TextSwitcher;

/* renamed from: X.Fus  reason: case insensitive filesystem */
public final class C51484Fus implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ TextSwitcher A02;

    public C51484Fus(Context context, TextSwitcher textSwitcher, int i) {
        this.A02 = textSwitcher;
        this.A01 = context;
        this.A00 = i;
    }

    public final void run() {
        this.A02.setCurrentText(002.A0T(this.A01.getResources().getString(2131971559), AnonymousClass6YV.A00[this.A00], ' '));
    }
}
