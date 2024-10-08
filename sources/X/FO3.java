package X;

import android.content.Context;
import android.view.View;

public final class FO3 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;
    public final /* synthetic */ String A03;

    public FO3(Context context, AnonymousClass4DH r2, AnonymousClass6Z5 r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1725404412);
        AnonymousClass6Z5 r7 = this.A02;
        AnonymousClass4DH r6 = this.A01;
        Context context = this.A00;
        String str = this.A03;
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A04();
        A0Y.A09(2131954707);
        A0Y.A08(2131954706);
        A0Y.A0Q(new FIZ(context, r6, r7, str, 10), C358278ae.RED, 2131964901);
        A0Y.A03();
        C50036FJv.A00(A0Y, r7, 9);
        DbT.A1V(A0Y);
        AnonymousClass0fD.A0C(2125106487, A05);
    }
}
