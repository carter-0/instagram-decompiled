package X;

import com.instagram.creation.photo.crop.CropImageView;

public final class JWR implements X96 {
    public boolean A00;
    public final /* synthetic */ CropImageView A01;

    public final void Dl2(float f, float f2) {
    }

    public JWR(CropImageView cropImageView) {
        this.A01 = cropImageView;
    }

    public final void DHm(float f, float f2) {
        CropImageView cropImageView = this.A01;
        if (cropImageView.A05) {
            cropImageView.A0I(f, f2);
            this.A00 = false;
            C66511MUp mUp = cropImageView.A03;
            if (mUp != null) {
                mUp.DHn(cropImageView);
            }
        }
    }

    public final void DHq() {
        CropImageView cropImageView = this.A01;
        if (cropImageView.A05) {
            cropImageView.A0E.A04.clear();
            cropImageView.A0L(false);
            C66511MUp mUp = cropImageView.A03;
            if (mUp != null) {
                mUp.DHr(cropImageView);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r8 != 0.0f) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DSf(float r5, float r6, float r7, float r8, float r9, float r10) {
        /*
            r4 = this;
            com.instagram.creation.photo.crop.CropImageView r2 = r4.A01
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0036
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r1 = 1
        L_0x0011:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            r1 = r1 ^ 1
            android.graphics.PointF r0 = r2.A03
            if (r0 != 0) goto L_0x0037
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r5, r6)
            r2.A03 = r0
        L_0x0024:
            android.graphics.Matrix r0 = r2.A08
            r0.postScale(r9, r9, r5, r6)
            if (r1 == 0) goto L_0x002e
            X.C59741JVz.A01(r2)
        L_0x002e:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
        L_0x0036:
            return
        L_0x0037:
            r0.set(r5, r6)
            goto L_0x0024
        L_0x003b:
            android.graphics.Matrix r0 = r2.A08
            r0.postTranslate(r7, r8)
            X.C59741JVz.A01(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWR.DSf(float, float, float, float, float, float):void");
    }

    public final void DlH(float f, float f2, float f3, float f4) {
        CropImageView cropImageView = this.A01;
        if (!cropImageView.A05) {
            return;
        }
        if (f3 != 0.0f || f4 != 0.0f) {
            cropImageView.A08.postTranslate(f3, f4);
            C59741JVz.A01(cropImageView);
        }
    }

    public final void DsP(boolean z) {
        CropImageView cropImageView = this.A01;
        if (!cropImageView.A05) {
            return;
        }
        if (z) {
            cropImageView.A0O(true, true);
            this.A00 = true;
        } else if (this.A00) {
            cropImageView.A0O(false, true);
        }
    }
}
