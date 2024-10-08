package X;

import android.content.DialogInterface;

public final class LUS implements DialogInterface.OnClickListener {
    public final /* synthetic */ C62671KkX A00;
    public final /* synthetic */ C63964LFp A01;
    public final /* synthetic */ AnonymousClass0iw A02;

    public LUS(C62671KkX kkX, C63964LFp lFp, AnonymousClass0iw r3) {
        this.A01 = lFp;
        this.A02 = r3;
        this.A00 = kkX;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C63964LFp lFp = this.A01;
        new C63963LFo(this.A02, lFp.A02).A00(this.A00);
        lFp.A01.CfV();
    }
}
