package X;

import android.graphics.Bitmap;
import com.facebook.quicklog.QuickPerformanceLogger;

public final class MBU implements 0sP {
    public final int A00;
    public final C60938Jtw A01;
    public final 0sP A02;

    public MBU(C60938Jtw jtw, 0sP r3) {
        0qQ.A0B(jtw, 1);
        this.A01 = jtw;
        this.A02 = r3;
        this.A00 = jtw.A03;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object A0c;
        C62977KpT kpT = (C62977KpT) obj;
        0qQ.A0B(kpT, 0);
        if (kpT instanceof C60809Jre) {
            Bitmap bitmap = ((C60809Jre) kpT).A00;
            if (bitmap == null) {
                A0c = C41845B3m.A0c(new C60813Jri(AnonymousClass7TE.A15("Bitmap not received"), AnonymousClass05K.A00));
            } else {
                C60938Jtw jtw = this.A01;
                if (jtw.A05) {
                    int i = this.A00;
                    int i2 = jtw.A00 + 2;
                    int i3 = jtw.A01;
                    boolean z = true;
                    if (i2 >= i3) {
                        QuickPerformanceLogger quickPerformanceLogger = jtw.A04;
                        quickPerformanceLogger.markerPoint(603995461, 002.A0c("/take_snapshot/render_frame/frame_output_validation/", "_start", i3));
                        boolean z2 = false;
                        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                            int pixel = bitmap.getPixel(0, 0);
                            2HZ A0B = C229632nm.A0B(C229632nm.A0C(1, bitmap.getHeight()), i);
                            int i4 = A0B.A00;
                            int i5 = A0B.A01;
                            int i6 = A0B.A02;
                            if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                                loop0:
                                while (true) {
                                    2HZ A0B2 = C229632nm.A0B(C229632nm.A0C(1, bitmap.getWidth()), i);
                                    int i7 = A0B2.A00;
                                    int i8 = A0B2.A01;
                                    int i9 = A0B2.A02;
                                    if (i9 <= 0 ? !(i9 >= 0 || i8 > i7) : i7 <= i8) {
                                        while (true) {
                                            if (pixel == bitmap.getPixel(i7 - 1, i4 - 1)) {
                                                if (i7 == i8) {
                                                    break;
                                                }
                                                i7 += i9;
                                            } else {
                                                break loop0;
                                            }
                                        }
                                    }
                                    if (i4 == i5) {
                                        break;
                                    }
                                    i4 += i6;
                                }
                                z2 = z;
                            }
                            z = false;
                            quickPerformanceLogger.markerAnnotate(jtw.A02, AnonymousClass000.A00(1687), pixel);
                            z2 = z;
                        }
                        quickPerformanceLogger.markerPoint(603995461, 002.A0c("/take_snapshot/render_frame/frame_output_validation/", "_end", i3));
                        if (!z2) {
                            0KC.A0C("ODR_ERROR", "Bitmap is blank or all pixels are of same color");
                            A0c = C41845B3m.A0c(new C60813Jri(AnonymousClass7TE.A15("Bitmap is blank or all pixels are of same color"), AnonymousClass05K.A01));
                        }
                    }
                    A0c = C41845B3m.A0d(bitmap);
                } else {
                    A0c = C41845B3m.A0d((Object) null);
                }
            }
        } else {
            if (kpT instanceof C60813Jri) {
                A0c = C41845B3m.A0c(kpT);
            }
            return C60340gF.A00;
        }
        this.A02.invoke(A0c);
        return C60340gF.A00;
    }
}
