package X;

import android.view.View;

/* renamed from: X.XuT  reason: case insensitive filesystem */
public final class C22044XuT implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass4K6 A00;

    public C22044XuT(AnonymousClass4K6 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1905433919);
        AnonymousClass4K6 r2 = this.A00;
        if (r2.A09 || r2.A06 || r2.A07 || r2.A08) {
            r2.A05.A0K(AnonymousClass3WB.DISMISSED);
        }
        r2.hide();
        ((C62320sa) r2.A04.A00.A02).invoke();
        AnonymousClass0fD.A0C(-731028515, A05);
    }
}
