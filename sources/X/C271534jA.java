package X;

import android.view.View;

/* renamed from: X.4jA  reason: invalid class name and case insensitive filesystem */
public final class C271534jA implements View.OnClickListener {
    public final /* synthetic */ C247003fc A00;
    public final /* synthetic */ AnonymousClass3z4 A01;
    public final /* synthetic */ C247453gM A02;
    public final /* synthetic */ boolean A03;

    public C271534jA(C247003fc r1, AnonymousClass3z4 r2, C247453gM r3, boolean z) {
        this.A03 = z;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Object obj;
        int A05 = AnonymousClass0fD.A05(549368379);
        boolean z = this.A03;
        C247453gM r0 = this.A02;
        if (z) {
            ((0sL) r0.A00.A0E).invoke(this.A01.A00, this.A00);
        } else {
            boolean z2 = r0.A0E;
            AnonymousClass9IT r02 = r0.A00;
            if (z2) {
                obj = r02.A0H;
            } else {
                obj = r02.A03;
            }
            ((C62320sa) obj).invoke();
        }
        AnonymousClass0fD.A0C(-495889041, A05);
    }
}
