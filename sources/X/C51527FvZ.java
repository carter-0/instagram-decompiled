package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* renamed from: X.FvZ  reason: case insensitive filesystem */
public final class C51527FvZ implements Runnable {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ C2365334c A02;
    public final /* synthetic */ AnonymousClass3K2 A03;

    public C51527FvZ(AnonymousClass0iw r1, AnonymousClass3BQ r2, C2365334c r3, AnonymousClass3K2 r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3K2 r5 = this.A03;
        C2365334c r4 = this.A02;
        AnonymousClass3BQ r3 = this.A01;
        AnonymousClass0iw r2 = this.A00;
        Map map = AnonymousClass3K2.A13;
        AnonymousClass3N2 r1 = (AnonymousClass3N2) r4.A00(r5.A0E);
        if (r1 == null) {
            RecyclerView recyclerView = r4.A03;
            if (recyclerView != null) {
                0nA.A0p(recyclerView, new C51528Fva(r2, r3, r4, r5));
                return;
            }
            r1 = null;
        }
        AnonymousClass3K2.A0P(r2, r5.A0I, r5, r1);
    }
}
