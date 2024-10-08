package X;

import android.content.Context;
import android.view.View;

public final class IC8 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass9JO A01;
    public final /* synthetic */ AnonymousClass6P6 A02;
    public final /* synthetic */ Integer A03;

    public IC8(Context context, AnonymousClass9JO r2, AnonymousClass6P6 r3, Integer num) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = r2;
        this.A03 = num;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1685509499);
        AnonymousClass6P6 r1 = this.A02;
        C309766Zn r3 = r1.A04;
        if (r3 != null) {
            Context context = this.A00;
            AnonymousClass9JO r0 = this.A01;
            String str2 = r0.A01;
            String str3 = r0.A00;
            String str4 = r0.A05;
            String str5 = r0.A04;
            if (this.A03.intValue() != 0) {
                str = "see_less";
            } else {
                str = "see_more";
            }
            r3.CI5(context, str2, str3, str4, str5, str);
            r1.A05.setVisibility(8);
            AnonymousClass0fD.A0C(-581502382, A05);
            return;
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }
}
