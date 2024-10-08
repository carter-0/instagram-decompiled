package X;

import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Np  reason: invalid class name and case insensitive filesystem */
public final class C330637Np {
    public View A00;
    public EditText A01;
    public final RecyclerView A02;
    public final C252063oV A03;
    public final AnonymousClass0eM A04;
    public final /* synthetic */ AnonymousClass7WY A05;

    public C330637Np(RecyclerView recyclerView, C252063oV r6, AnonymousClass7WY r7) {
        this.A05 = r7;
        this.A02 = recyclerView;
        this.A03 = r6;
        this.A04 = AnonymousClass1YB.A00(new C377109Ko(r7, 31));
        r6.EeU(new C330647Nq(this, r7));
        if (!182.A06(0Tu.A05, r7.A09, 36328242139249788L)) {
            r6.getView();
        }
    }

    public final void A00() {
        C252063oV r2 = this.A03;
        if (r2.CVM()) {
            r2.setVisibility(8);
            View view = this.A00;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }
}
