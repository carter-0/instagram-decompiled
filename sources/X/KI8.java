package X;

import com.instagram.common.gallery.Medium;
import java.util.List;

public final class KI8 extends C310586bI {
    public int A00 = -1;
    public C66529MVh A01 = null;
    public L0D A02 = null;
    public List A03 = 0sn.A00;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.JVz, com.instagram.creation.photo.crop.CropImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.JbJ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        if (r6.A02 != null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            r0 = 2
            X.0qQ.A0B(r10, r0)
            r3 = 0
            if (r9 == 0) goto L_0x000b
            java.lang.Object r3 = r9.getTag()
        L_0x000b:
            boolean r0 = r3 instanceof X.C60686JpX
            if (r0 == 0) goto L_0x0013
            X.JpX r3 = (X.C60686JpX) r3
            if (r3 != 0) goto L_0x002d
        L_0x0013:
            int r3 = r7.getItemViewType(r8)
            r2 = 0
            r0 = 3
            android.view.LayoutInflater r1 = X.JTP.A0G(r10)
            if (r3 != r0) goto L_0x0105
            r0 = 2131629834(0x7f0e170a, float:1.8887E38)
            android.view.View r1 = X.DbT.A0D(r1, r10, r0, r2)
            X.MVh r0 = r7.A01
            X.KKY r3 = new X.KKY
            r3.<init>(r1, r0)
        L_0x002d:
            int r1 = r7.A00
            r0 = -1
            if (r1 == r0) goto L_0x003c
            android.view.View r0 = r3.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r7.A00
            r1.width = r0
        L_0x003c:
            java.util.List r0 = r7.A03
            java.lang.Object r6 = r0.get(r8)
            X.JuW r6 = (X.C60974JuW) r6
            boolean r0 = r3 instanceof X.KKY
            if (r0 == 0) goto L_0x0084
            r4 = r3
            X.KKY r4 = (X.KKY) r4
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r4.A00 = r6
            java.lang.Float r0 = r6.A07
            if (r0 == 0) goto L_0x0065
            float r2 = r0.floatValue()
            android.view.View r1 = r4.itemView
            boolean r0 = r1 instanceof com.instagram.ui.widget.framelayout.MediaFrameLayout
            if (r0 == 0) goto L_0x0065
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r1
            if (r1 == 0) goto L_0x0065
            r1.A00 = r2
        L_0x0065:
            r0 = 1
            r4.A00(r0)
            com.instagram.common.gallery.model.GalleryItem r0 = r6.A0B
            com.instagram.common.gallery.Medium r2 = r0.A00
            if (r2 != 0) goto L_0x0073
            com.instagram.common.gallery.Medium r2 = r6.A03
            if (r2 == 0) goto L_0x007a
        L_0x0073:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r1 = r4.A04
            X.Ljk r0 = r4.A03
            r1.setVideoMedium(r2, r0)
        L_0x007a:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r4.A04
            r0.requestLayout()
        L_0x007f:
            android.view.View r0 = X.JTO.A0F(r3)
            return r0
        L_0x0084:
            r5 = r3
            X.KKX r5 = (X.KKX) r5
            r2 = 0
            X.0qQ.A0B(r6, r2)
            r5.A00 = r6
            android.view.View r1 = r5.itemView
            boolean r0 = r1 instanceof com.instagram.ui.widget.framelayout.MediaFrameLayout
            if (r0 == 0) goto L_0x009b
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r1
            if (r1 == 0) goto L_0x009b
            float r0 = r6.A00
            r1.A00 = r0
        L_0x009b:
            android.graphics.Bitmap r0 = r6.A02
            com.instagram.creation.photo.crop.CropImageView r4 = r5.A00
            if (r0 == 0) goto L_0x00b7
            r4.setImageBitmap(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r4.setScaleType(r0)
        L_0x00a9:
            android.graphics.Bitmap r0 = r6.A01
            if (r0 != 0) goto L_0x00b2
            android.graphics.Bitmap r1 = r6.A02
            r0 = 1
            if (r1 == 0) goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            r5.A00(r0)
            goto L_0x007f
        L_0x00b7:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r4.setScaleType(r0)
            float r0 = r6.A00
            r4.A00 = r0
            boolean r0 = r6.A08
            r4.setSameProportionalGrid(r0)
            java.lang.Float r0 = r6.A06
            if (r0 != 0) goto L_0x00fd
            r4.A04 = r2
            float r0 = r4.A01
            r4.A02 = r0
        L_0x00cf:
            com.instagram.creation.photo.util.ExifImageData r0 = r6.A04
            android.graphics.Bitmap r1 = r6.A01
            if (r0 == 0) goto L_0x00ea
            if (r1 == 0) goto L_0x00ea
            int r0 = r0.A00
            X.JbJ r2 = new X.JbJ
            r2.<init>()
            r2.A01 = r1
            int r0 = r0 % 360
            r2.A00 = r0
            float[] r1 = r6.A09
            r0 = 0
            r4.setImageRotateBitmapResetBase(r2, r1, r0)
        L_0x00ea:
            float[] r0 = r6.A09
            if (r0 != 0) goto L_0x00f9
            java.lang.Boolean r0 = r6.A05
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r0.booleanValue()
            r4.A0M(r0)
        L_0x00f9:
            r4.invalidate()
            goto L_0x00a9
        L_0x00fd:
            float r0 = r0.floatValue()
            r4.setForcedMinZoom(r0)
            goto L_0x00cf
        L_0x0105:
            r0 = 2131629833(0x7f0e1709, float:1.8886998E38)
            android.view.View r0 = X.DbT.A0D(r1, r10, r0, r2)
            X.KKX r3 = new X.KKX
            r3.<init>(r0)
            android.view.View r1 = r3.itemView
            r0 = 52
            X.LY8.A00(r1, r0, r3, r7)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KI8.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final int getCount() {
        return this.A03.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public final long getItemId(int i) {
        Medium medium = ((C60974JuW) this.A03.get(i)).A0B.A00;
        if (medium != null) {
            return (long) medium.A05;
        }
        return -1;
    }

    public final int getItemViewType(int i) {
        if (((C60974JuW) this.A03.get(i)).A0B.A06()) {
            return 3;
        }
        return 1;
    }
}
