package X;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: X.IOw  reason: case insensitive filesystem */
public final class C57108IOw implements C240963Ni {
    public final int A00;
    public final Object A01;

    public C57108IOw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DEN() {
    }

    public final void DO4(C240983Nk r9) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(r9, 0);
                Bitmap bitmap = r9.A02;
                if (bitmap != null) {
                    int i = 0;
                    int pixel = bitmap.getPixel(0, 0);
                    boolean z = true;
                    int pixel2 = bitmap.getPixel(bitmap.getWidth() - 1, 0);
                    int pixel3 = bitmap.getPixel(0, bitmap.getHeight() - 1);
                    int pixel4 = bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() - 1);
                    if (!((pixel == -1 || pixel == 0) && ((pixel2 == -1 || pixel2 == 0) && ((pixel3 == -1 || pixel3 == 0) && (pixel4 == -1 || pixel4 == 0))))) {
                        z = false;
                    }
                    View view = (View) this.A01;
                    if (!z) {
                        i = 4;
                    }
                    view.setVisibility(i);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r9, 0);
                if (r9.A02 != null) {
                    GFO gfo = ((C52588GYn) this.A01).A08;
                    1Xj r0 = gfo.A0D.A02;
                    if (r0 != null) {
                        AnonymousClass2fL.A00(gfo.A0H).A0O(r0.A2n(), (String) null);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
            default:
                C53754Gtj gtj = (C53754Gtj) this.A01;
                AnonymousClass2fL A002 = AnonymousClass2fL.A00(gtj.A01);
                1Xj r02 = gtj.A00.A02;
                if (r02 != null) {
                    A002.A0O(r02.A2n(), (String) null);
                    return;
                }
                throw AnonymousClass7TE.A0y();
        }
    }
}
