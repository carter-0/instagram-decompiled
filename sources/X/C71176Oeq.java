package X;

import android.content.DialogInterface;

/* renamed from: X.Oeq  reason: case insensitive filesystem */
public final class C71176Oeq implements DialogInterface.OnClickListener {
    public final /* synthetic */ C314806is A00;

    public C71176Oeq(C314806is r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        0qQ.A0B(dialogInterface, 0);
        C314826iu r0 = this.A00.A02;
        if (r0 == null) {
            0qQ.A0F("audLogging");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00();
        dialogInterface.dismiss();
    }
}
