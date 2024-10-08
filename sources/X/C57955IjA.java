package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.IjA  reason: case insensitive filesystem */
public final class C57955IjA implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C316886mN A03;

    public C57955IjA(ViewGroup viewGroup, C255773uh r2, C255783ui r3, C316886mN r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = viewGroup;
        this.A01 = r2;
    }

    public final void run() {
        View view = this.A03.A00.getView();
        C255783ui r2 = this.A02;
        ViewGroup viewGroup = this.A00;
        C306406Ma.A04(view, r2, this.A01.A00(), viewGroup.getWidth(), viewGroup.getHeight(), false);
    }
}
