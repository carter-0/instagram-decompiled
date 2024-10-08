package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.Mv0  reason: case insensitive filesystem */
public final class C67796Mv0 extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public final Context A01;
    public final C74476PvW A02;

    public final void onBindViewHolder(C249703kE r5, int i) {
        C70972OTt oTt = (C70972OTt) this.A00.get(i);
        boolean A1V = C66581MXm.A1V(getItemCount());
        ORR.A01(this.A01, oTt, this.A02, (C67882MwQ) r5, A1V);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return ORR.A00(this.A01, viewGroup, false);
    }

    public C67796Mv0(Context context, C74476PvW pvW) {
        this.A01 = context;
        this.A02 = pvW;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1581021844);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1202324648, A03);
        return size;
    }
}
