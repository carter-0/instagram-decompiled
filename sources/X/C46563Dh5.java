package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Dh5  reason: case insensitive filesystem */
public final class C46563Dh5 extends C232232tF {
    public final Context A00;
    public final AnonymousClass32I A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        0qQ.A0B(r6, 1);
        FCX.A01(this.A00, r6, new C46467DfV(AnonymousClass05K.A0u), this.A01, 0);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.Dn4] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A002 = FCX.A00(this.A00, 0, viewGroup);
        ? r1 = new C249703kE(A002);
        r1.A00 = AnonymousClass7TG.A0R(A002, R.id.see_all_button);
        return r1;
    }

    public final Class modelClass() {
        return C16195UqK.class;
    }

    public C46563Dh5(Context context, AnonymousClass32I r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
