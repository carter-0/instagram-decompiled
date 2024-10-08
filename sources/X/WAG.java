package X;

import android.content.DialogInterface;
import android.view.View;

public final class WAG implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ AnonymousClass6ZF A02;
    public final /* synthetic */ C19201WPh A03;
    public final /* synthetic */ AnonymousClass6ZB A04;
    public final /* synthetic */ VUB A05;
    public final /* synthetic */ VQE A06;
    public final /* synthetic */ CharSequence A07;

    public WAG(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r2, AnonymousClass6ZF r3, C19201WPh wPh, AnonymousClass6ZB r5, VUB vub, VQE vqe, CharSequence charSequence) {
        this.A03 = wPh;
        this.A07 = charSequence;
        this.A00 = onDismissListener;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = vub;
        this.A06 = vqe;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(640683660);
        C19201WPh wPh = this.A03;
        CharSequence charSequence = this.A07;
        C19201WPh.A03(this.A00, this.A01, this.A02, wPh, this.A04, this.A05, this.A06, charSequence);
        AnonymousClass0fD.A0C(-525182454, A052);
    }
}
