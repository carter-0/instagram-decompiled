package X;

import android.view.View;

/* renamed from: X.IAs  reason: case insensitive filesystem */
public final class C56743IAs implements View.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C53157GjT A01;

    public C56743IAs(1Xj r1, C53157GjT gjT) {
        this.A01 = gjT;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-389837202);
        C2363233h r1 = this.A01.A02;
        if (r1 != null) {
            r1.D9c(this.A00);
            AnonymousClass0fD.A0C(-396038284, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-665511989, A05);
        throw A0y;
    }
}
