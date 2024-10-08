package X;

import android.content.Context;
import android.view.View;

public final class FO9 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ AnonymousClass3BQ A02;
    public final /* synthetic */ C19201WPh A03;
    public final /* synthetic */ C273384mU A04;

    public FO9(Context context, C255773uh r2, AnonymousClass3BQ r3, C19201WPh wPh, C273384mU r5) {
        this.A00 = context;
        this.A03 = wPh;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(798133033);
        Context context = this.A00;
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131974755);
        A0Y.A08(2131974751);
        C19201WPh wPh = this.A03;
        C255773uh r7 = this.A01;
        C273384mU r6 = this.A04;
        A0Y.A0L(new FIh(4, context, r6, r7, this.A02, wPh), 2131957531);
        A0Y.A0C(C50021FJg.A00(r6, 25));
        AnonymousClass7TH.A0a(A0Y, false);
        AnonymousClass0fD.A0C(1462537757, A05);
    }
}
