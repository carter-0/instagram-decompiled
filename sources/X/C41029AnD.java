package X;

import android.view.View;

/* renamed from: X.AnD  reason: case insensitive filesystem */
public final class C41029AnD implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass8AT A01;

    public C41029AnD(View view, AnonymousClass8AT r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        AnonymousClass8AT r1 = this.A01;
        r1.A00 = this.A00.getWidth();
        r1.A02.post(new C40804Aja(this));
    }
}
