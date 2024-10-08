package X;

import android.view.View;

/* renamed from: X.FvF  reason: case insensitive filesystem */
public final class C51507FvF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C266444Yx A02;
    public final /* synthetic */ C47477E4b A03;

    public C51507FvF(View view, C266444Yx r2, C47477E4b e4b, int i) {
        this.A03 = e4b;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = view;
    }

    public final void run() {
        C47477E4b e4b = this.A03;
        if (e4b.getActivity() != null) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(e4b.requireActivity(), C66909Mes.A01(e4b, this.A02));
            A0f.A04(this.A01, 0, this.A00, true);
            A0f.A01();
            A0f.A00().A07(AnonymousClass7TE.A0l(e4b.A0O));
        }
    }
}
