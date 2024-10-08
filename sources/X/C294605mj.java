package X;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5mj  reason: invalid class name and case insensitive filesystem */
public final class C294605mj extends C249403jg {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C292795jX A01;

    public C294605mj(Handler handler, C292795jX r2) {
        this.A00 = handler;
        this.A01 = r2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(69486859);
        0qQ.A0B(recyclerView, 0);
        if (i == 0) {
            Handler handler = this.A00;
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(new C57842IhL(recyclerView, this.A01), 200);
        }
        AnonymousClass0fD.A0A(1783790361, A03);
    }
}
