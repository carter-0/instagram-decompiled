package X;

import android.view.View;

/* renamed from: X.7Nr  reason: invalid class name and case insensitive filesystem */
public final class C330657Nr implements View.OnClickListener {
    public final /* synthetic */ C330637Np A00;
    public final /* synthetic */ AnonymousClass7WY A01;

    public C330657Nr(C330637Np r1, AnonymousClass7WY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-2028772642);
        this.A00.A00();
        AnonymousClass7WY r2 = this.A01;
        1Av A002 = 1Au.A00(r2.A09);
        String valueOf = String.valueOf(r2.A02);
        0qQ.A0B(valueOf, 0);
        0xY AR4 = A002.A01.AR4();
        AR4.E5g("has_seen_thread_title_change_banner_thread_id", valueOf);
        AR4.apply();
        AnonymousClass0fD.A0C(1370267366, A05);
    }
}
