package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.Arrays;

/* renamed from: X.JuW  reason: case insensitive filesystem */
public final class C60974JuW extends AnonymousClass0T0 {
    public float A00;
    public Bitmap A01;
    public Bitmap A02;
    public Medium A03;
    public ExifImageData A04;
    public Boolean A05;
    public Float A06;
    public Float A07;
    public boolean A08;
    public float[] A09;
    public AnonymousClass514 A0A;
    public final GalleryItem A0B;

    public C60974JuW(Bitmap bitmap, Bitmap bitmap2, Medium medium, GalleryItem galleryItem, AnonymousClass514 r6, ExifImageData exifImageData, Boolean bool, Float f, Float f2, float[] fArr, float f3, boolean z) {
        0qQ.A0B(galleryItem, 1);
        this.A0B = galleryItem;
        this.A03 = medium;
        this.A08 = z;
        this.A00 = f3;
        this.A07 = f;
        this.A06 = f2;
        this.A05 = bool;
        this.A04 = exifImageData;
        this.A01 = bitmap;
        this.A02 = bitmap2;
        this.A09 = fArr;
        this.A0A = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r1.sameAs(r0) == true) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r2 = 1
            if (r4 == r5) goto L_0x008d
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = X.JTR.A0v(r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewItemModel"
            X.0qQ.A0C(r5, r0)
            X.JuW r5 = (X.C60974JuW) r5
            com.instagram.common.gallery.model.GalleryItem r1 = r4.A0B
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007f
            boolean r1 = r4.A08
            boolean r0 = r5.A08
            if (r1 != r0) goto L_0x007f
            float r1 = r4.A00
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x007f
            java.lang.Float r1 = r4.A07
            java.lang.Float r0 = r5.A07
            boolean r0 = X.0qQ.A0J(r1, r0)
            if (r0 == 0) goto L_0x007f
            java.lang.Float r1 = r4.A06
            java.lang.Float r0 = r5.A06
            boolean r0 = X.0qQ.A0J(r1, r0)
            if (r0 == 0) goto L_0x007f
            java.lang.Boolean r1 = r4.A05
            java.lang.Boolean r0 = r5.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007f
            com.instagram.creation.photo.util.ExifImageData r1 = r4.A04
            com.instagram.creation.photo.util.ExifImageData r0 = r5.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007f
            android.graphics.Bitmap r1 = r4.A01
            android.graphics.Bitmap r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007f
            android.graphics.Bitmap r1 = r4.A02
            android.graphics.Bitmap r0 = r5.A02
            if (r1 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x007f
            boolean r0 = r1.sameAs(r0)
            if (r0 != r2) goto L_0x007f
        L_0x0071:
            float[] r1 = r4.A09
            float[] r0 = r5.A09
            if (r1 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x007f
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0086
        L_0x007f:
            return r3
        L_0x0080:
            if (r0 == 0) goto L_0x0071
            return r3
        L_0x0083:
            if (r0 == 0) goto L_0x0086
            return r3
        L_0x0086:
            X.514 r1 = r4.A0A
            X.514 r0 = r5.A0A
            if (r1 == r0) goto L_0x008d
            return r3
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60974JuW.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int A002 = (((((((((((AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A08, AnonymousClass7TE.A0K(this.A0B)), this.A00) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02)) * 31;
        float[] fArr = this.A09;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        int i3 = (A002 + i) * 31;
        AnonymousClass514 r0 = this.A0A;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return i3 + i2;
    }
}
