package X;

import android.content.Context;

public final class PIG implements C231272rL {
    public final AnonymousClass2t9 A00;

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    public final int getCount() {
        return this.A00.getItemCount();
    }

    public final Object getItem(int i) {
        Object A04 = this.A00.A04(i);
        0qQ.A07(A04);
        return A04;
    }

    public PIG(Context context, C74463PvI pvI) {
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A0C.addAll(pvI.AMu());
        AnonymousClass2t9 A003 = A002.A00();
        this.A00 = A003;
        pvI.ENv(A003);
    }
}
