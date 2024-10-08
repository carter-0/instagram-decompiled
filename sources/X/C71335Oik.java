package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Oik  reason: case insensitive filesystem */
public final class C71335Oik implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass9JN A00;
    public final /* synthetic */ C328667Fr A01;
    public final /* synthetic */ AnonymousClass78H A02;

    public C71335Oik(AnonymousClass9JN r1, C328667Fr r2, AnonymousClass78H r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1028704066);
        String str = this.A01.A0L.A02;
        AnonymousClass78H r2 = this.A02;
        I6E.A02(r2.A01, r2.A02, str);
        Context context = r2.A00;
        String str2 = this.A00.A02;
        if (str2 != null) {
            FH7.A03(context, str2);
            AnonymousClass0fD.A0C(461506296, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-699850886, A05);
        throw A0y;
    }
}
