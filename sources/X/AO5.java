package X;

import android.view.View;
import android.widget.Adapter;
import com.instagram.model.direct.DirectThreadKey;

public final class AO5 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9SZ A01;
    public final /* synthetic */ C355598Qp A02;

    public AO5(AnonymousClass9SZ r1, C355598Qp r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void onClick(View view) {
        C40368Ab1 ab1;
        Adapter adapter;
        int A05 = AnonymousClass0fD.A05(-338105978);
        C355598Qp r3 = this.A02;
        C328787Gf r2 = r3.A03;
        int i = this.A00;
        r2.removeItem(i);
        r3.notifyItemRemoved(i);
        r3.notifyItemRangeChanged(i, r3.getItemCount() - i);
        if (r2.isEmpty() && (adapter = r3.A02) != null && (adapter instanceof AnonymousClass7H0)) {
            ((AnonymousClass7H0) adapter).A08 = false;
        }
        C329077Hm r0 = r3.A04;
        if (r0 != null) {
            AnonymousClass9SZ r1 = this.A01;
            int itemCount = r3.getItemCount();
            C329067Hl r5 = r0.A00;
            if (r1 instanceof C388699oF) {
                C388699oF r12 = (C388699oF) r1;
                DirectThreadKey A09 = C329067Hl.A09(r5);
                if (C70083Nwz.A00(r5.A1Z, A09) && A09 != null) {
                    AnonymousClass9HP r32 = r5.A0V;
                    C41819B1z b1z = r12.A00.A01;
                    if ((b1z instanceof C40368Ab1) && (ab1 = (C40368Ab1) b1z) != null) {
                        ab1.A01(new C74185PqR(30, (Object) A09, (Object) r32));
                    }
                }
            }
            if (itemCount == 0) {
                r5.A1C();
            }
        }
        AnonymousClass0fD.A0C(308209742, A05);
    }
}
