package X;

import android.view.View;

public final /* synthetic */ class AO6 implements View.OnClickListener {
    public final /* synthetic */ C330047Lf A00;
    public final /* synthetic */ C330447Mu A01;
    public final /* synthetic */ AnonymousClass7LZ A02;

    public /* synthetic */ AO6(C330047Lf r1, C330447Mu r2, AnonymousClass7LZ r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        C330447Mu r3 = this.A01;
        C330047Lf r2 = this.A00;
        AnonymousClass7LZ r1 = this.A02;
        r2.DrD("thread_name");
        C254793t3 r0 = r1.A0C;
        if (r0 != null) {
            1Au.A00(r3.A0Q).A0v(C300965yF.A07(r0));
        }
    }
}
