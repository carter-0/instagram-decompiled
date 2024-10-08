package X;

import android.graphics.Bitmap;
import android.util.SparseArray;

/* renamed from: X.ATk  reason: case insensitive filesystem */
public final class C40144ATk implements B2S {
    public final /* synthetic */ C39904AIm A00;
    public final /* synthetic */ A3G A01;
    public final /* synthetic */ Integer A02;

    public C40144ATk(C39904AIm aIm, A3G a3g, Integer num) {
        this.A00 = aIm;
        this.A01 = a3g;
        this.A02 = num;
    }

    public final void CyI(Bitmap bitmap, long j) {
        A3G a3g = this.A01;
        int intValue = this.A02.intValue();
        a3g.A00.CyH(bitmap);
        C39904AIm aIm = this.A00;
        SparseArray sparseArray = aIm.A09;
        Object obj = sparseArray.get(intValue);
        if (obj != null) {
            aIm.A02.BQ8().EDi(intValue, obj);
            sparseArray.remove(intValue);
        }
    }

    public final void DCn(Exception exc) {
        this.A01.A00.D0x(AnonymousClass7TE.A15(String.valueOf(exc)));
        C39904AIm aIm = this.A00;
        int intValue = this.A02.intValue();
        SparseArray sparseArray = aIm.A09;
        Object obj = sparseArray.get(intValue);
        if (obj != null) {
            aIm.A02.BQ8().EDi(intValue, obj);
            sparseArray.remove(intValue);
        }
    }

    public final void DJq() {
        ((C64356LaY) this.A01.A00).A00.invoke(C60814Jrj.A00);
    }
}
