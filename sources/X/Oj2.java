package X;

import android.content.Context;
import android.view.View;

public final /* synthetic */ class Oj2 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass74R A01;
    public final /* synthetic */ C328667Fr A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ Oj2(Context context, AnonymousClass74R r2, C328667Fr r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
        this.A03 = str;
    }

    public final void onClick(View view) {
        AnonymousClass74R r5 = this.A01;
        C328667Fr r0 = this.A02;
        Context context = this.A00;
        String str = this.A03;
        String str2 = r0.A0L.A02;
        I6E.A02(r5.A04, r5.A05, str2);
        FH7.A03(context, str);
    }
}
