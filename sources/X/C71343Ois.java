package X;

import android.view.View;

/* renamed from: X.Ois  reason: case insensitive filesystem */
public final class C71343Ois implements View.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C317116mk A01;
    public final /* synthetic */ C316136lA A02;

    public C71343Ois(C255773uh r1, C317116mk r2, C316136lA r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1461164044);
        C317116mk r2 = this.A01;
        C255773uh r1 = this.A00;
        View view2 = this.A02.A07;
        if (view2 != null) {
            r2.D6f(view2, r1);
            AnonymousClass0fD.A0C(-581653643, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-683650618, A05);
        throw A0y;
    }
}
