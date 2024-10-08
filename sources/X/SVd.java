package X;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

public final class SVd implements ImageDecoder.OnHeaderDecodedListener {
    public final int A00;
    public final int A01;
    public final C8875RDr A02;
    public final RDZ A03;
    public final C10977S3l A04;
    public final SO9 A05 = SO9.A00();
    public final boolean A06;

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        SO9 so9 = this.A05;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = 1;
        if (so9.A01(i, i2, this.A06, false)) {
            i3 = 3;
        }
        imageDecoder.setAllocator(i3);
        if (this.A02 == C8875RDr.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C11442SVe(this));
        Size size = imageInfo.getSize();
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float A002 = this.A04.A00(size.getWidth(), size.getHeight(), i, i2);
        int A052 = AnonymousClass7TE.A05((float) size.getWidth(), A002);
        int A053 = AnonymousClass7TE.A05((float) size.getHeight(), A002);
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(A052, A053);
        RDZ rdz = this.A03;
        if (rdz != null) {
            if (rdz != RDZ.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) {
                named = ColorSpace.Named.SRGB;
            } else {
                named = ColorSpace.Named.DISPLAY_P3;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (X.AnonymousClass7TE.A1a(r3.A00(r1)) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SVd(X.C11856Shi r3, int r4, int r5) {
        /*
            r2 = this;
            r2.<init>()
            X.SO9 r0 = X.SO9.A00()
            r2.A05 = r0
            r2.A01 = r4
            r2.A00 = r5
            X.SJ8 r0 = X.C11416SSr.A06
            java.lang.Object r0 = r3.A00(r0)
            X.RDr r0 = (X.C8875RDr) r0
            r2.A02 = r0
            X.SJ8 r0 = X.C10977S3l.A00
            java.lang.Object r0 = r3.A00(r0)
            X.S3l r0 = (X.C10977S3l) r0
            r2.A04 = r0
            X.SJ8 r1 = X.C11416SSr.A05
            java.lang.Object r0 = r3.A00(r1)
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.A00(r1)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r2.A06 = r0
            X.SJ8 r0 = X.C11416SSr.A09
            java.lang.Object r0 = r3.A00(r0)
            X.RDZ r0 = (X.RDZ) r0
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SVd.<init>(X.Shi, int, int):void");
    }
}
