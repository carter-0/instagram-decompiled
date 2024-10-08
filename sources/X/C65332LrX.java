package X;

import android.content.DialogInterface;

/* renamed from: X.LrX  reason: case insensitive filesystem */
public final class C65332LrX implements C66488MTr {
    public final /* synthetic */ C65163LoS A00;

    public C65332LrX(C65163LoS loS) {
        this.A00 = loS;
    }

    public final void DCn(Exception exc) {
        C65163LoS loS = this.A00;
        if (!loS.A06) {
            loS.A06 = true;
            0xI A002 = C59882Jb5.A00(AnonymousClass05K.A0R);
            A002.A0C("error", AnonymousClass7TG.A0m(exc, "Rendering error: ", AnonymousClass7TE.A1A()));
            DbU.A1R(A002, loS.A0E);
            loS.A0F.A01.A05.A0A((DialogInterface.OnClickListener) null, AnonymousClass05K.A1I);
        }
    }

    public final void Ddq() {
        this.A00.AOv();
    }
}
