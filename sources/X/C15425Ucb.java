package X;

import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.Ucb  reason: case insensitive filesystem */
public final class C15425Ucb extends C18477VsT {
    public final ImageInfo A00;

    public C15425Ucb(C17732Vd1 vd1) {
        super(new C18478VsU(vd1.A04, vd1.A0G), vd1.A08, vd1.A0A, 100);
        VNR vnr = ((C17582Vaa) AnonymousClass7TE.A13(vd1.A0E)).A00;
        if (vnr != null) {
            this.A00 = C18679Vwc.A01(vnr);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
