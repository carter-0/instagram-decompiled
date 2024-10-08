package X;

import android.content.DialogInterface;

public final class I8E implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass3K9 A00;
    public final /* synthetic */ AnonymousClass35W A01;

    public I8E(AnonymousClass3K9 r1, AnonymousClass35W r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass2rI r0;
        AnonymousClass3K9 r1 = this.A00;
        1Xj r4 = r1.A01;
        AnonymousClass35W r3 = this.A01;
        C227812jx r02 = (C227812jx) r3.A0b.get();
        if (r02 != null && (r0 = (AnonymousClass2rI) r02.getAdapter()) != null) {
            AnonymousClass3W1 BQr = r0.BQr(r4);
            String str = r1.A00.A0d;
            0qQ.A0B(str, 0);
            BQr.A1J = str;
            r3.A0V.DKl(r4, BQr);
        }
    }
}
