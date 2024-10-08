package X;

import android.graphics.Bitmap;

/* renamed from: X.POf  reason: case insensitive filesystem */
public final class C72895POf implements C13760TgW {
    public final /* synthetic */ C69100Nef A00;

    public C72895POf(C69100Nef nef) {
        this.A00 = nef;
    }

    public final void DWo() {
        C69100Nef nef = this.A00;
        nef.A08.A00.A00(new PK7(AnonymousClass05K.A01));
        nef.A00 = null;
        DbU.A0z(nef.A09.A03.getContext(), 2131976577);
    }

    public final void DWp() {
        C69100Nef nef = this.A00;
        nef.A08.A00.A00(new PK7(AnonymousClass05K.A00));
        Bitmap bitmap = nef.A00;
        if (bitmap != null) {
            C69100Nef.A00(bitmap, nef);
        }
    }
}
