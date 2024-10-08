package X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: X.8N5  reason: invalid class name */
public final class AnonymousClass8N5 extends AnonymousClass0T0 {
    public final Bitmap A00;
    public final Bitmap A01;
    public final Bitmap A02;
    public final C61029JvT A03;
    public final AnonymousClass8N6 A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final float[] A08;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0069
            java.lang.Class r1 = r4.getClass()
            if (r5 == 0) goto L_0x0067
            java.lang.Class r0 = r5.getClass()
        L_0x000d:
            boolean r0 = X.0qQ.A0K(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5 instanceof X.AnonymousClass8N5
            if (r0 == 0) goto L_0x003c
            android.graphics.Bitmap r1 = r4.A02
            X.8N5 r5 = (X.AnonymousClass8N5) r5
            android.graphics.Bitmap r0 = r5.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003c
            android.graphics.Bitmap r1 = r4.A00
            android.graphics.Bitmap r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003c
            float[] r1 = r4.A08
            float[] r0 = r5.A08
            if (r1 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0040
        L_0x003c:
            return r2
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return r2
        L_0x0040:
            android.graphics.Bitmap r1 = r4.A01
            android.graphics.Bitmap r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.Integer r1 = r4.A05
            java.lang.Integer r0 = r5.A05
            if (r1 != r0) goto L_0x003c
            boolean r1 = r4.A07
            boolean r0 = r5.A07
            if (r1 != r0) goto L_0x003c
            boolean r1 = r4.A06
            boolean r0 = r5.A06
            if (r1 != r0) goto L_0x003c
            X.JvT r1 = r4.A03
            X.JvT r0 = r5.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0069
            return r2
        L_0x0067:
            r0 = 0
            goto L_0x000d
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8N5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        Bitmap bitmap = this.A02;
        int i6 = 0;
        if (bitmap != null) {
            i = bitmap.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            i2 = bitmap2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        float[] fArr = this.A08;
        if (fArr != null) {
            i3 = Arrays.hashCode(fArr);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        Bitmap bitmap3 = this.A01;
        if (bitmap3 != null) {
            i4 = bitmap3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        Integer num = this.A05;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "AUTO_SEGMENTATION_SUCCEED";
                    break;
                case 2:
                    str = "AUTO_SEGMENTATION_FAILED";
                    break;
                case 3:
                    str = "MANUAL_REFINEMENT_INITIAL";
                    break;
                case 4:
                    str = "MANUAL_REFINEMENT_LOADING";
                    break;
                case 5:
                    str = "MANUAL_REFINEMENT_FINISHED";
                    break;
                case 6:
                    str = "VIDEO_FIRST_FRAME_EXTRACTION_FAILED";
                    break;
                case 7:
                    str = "VIDEO_STICKER_CREATING";
                    break;
                case 8:
                    str = "VIDEO_STICKER_CREATION_FAILED";
                    break;
                case 9:
                    str = "VIDEO_STICKER_CREATION_SUCCEED";
                    break;
                default:
                    str = "AUTO_SEGMENTATION_LOADING";
                    break;
            }
            i5 = str.hashCode() + intValue;
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        int i12 = 1237;
        if (this.A07) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A06) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        C61029JvT jvT = this.A03;
        if (jvT != null) {
            i6 = jvT.hashCode();
        }
        return i15 + i6;
    }

    public AnonymousClass8N5(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, C61029JvT jvT, AnonymousClass8N6 r5, Integer num, float[] fArr, boolean z, boolean z2) {
        this.A02 = bitmap;
        this.A00 = bitmap2;
        this.A08 = fArr;
        this.A01 = bitmap3;
        this.A05 = num;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = jvT;
        this.A04 = r5;
    }
}
