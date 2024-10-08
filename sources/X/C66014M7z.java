package X;

import android.view.View;

/* renamed from: X.M7z  reason: case insensitive filesystem */
public final class C66014M7z implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ L58 A01;

    public C66014M7z(View view, L58 l58) {
        this.A01 = l58;
        this.A00 = view;
    }

    public final void run() {
        L58 l58 = this.A01;
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(l58.A00, 2131960840);
        A0e.A03(this.A00);
        A0e.A02();
        KSP.A00(A0e, l58, 13).A07(l58.A01);
    }
}
