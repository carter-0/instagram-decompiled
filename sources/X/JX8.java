package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class JX8 {
    public static final JX8 A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.gallery.Medium r5, com.instagram.common.session.UserSession r6, X.C378479Py r7) {
        /*
            r2 = 0
            if (r7 == 0) goto L_0x0053
            X.3oV r0 = r7.A0B
            if (r0 == 0) goto L_0x0053
            android.view.View r0 = r0.getView()
            r3 = 2
            if (r0 == 0) goto L_0x0053
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0053
            X.27r r0 = X.27p.A01(r6)
            X.4yP r4 = r0.A0J()
            if (r4 == 0) goto L_0x0061
            int r1 = r4.ordinal()
            r0 = 3
            if (r1 == r3) goto L_0x005e
            if (r1 == r0) goto L_0x005b
            r0 = 8
            if (r1 != r0) goto L_0x0061
            r3 = r2
        L_0x002c:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A0G
            java.lang.String r1 = r0.A03
            X.0sn r0 = X.0sn.A00
            X.Kp0 r1 = X.C59737JVv.A01(r6, r1, r0)
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C59790JYj
            if (r0 == 0) goto L_0x0054
            com.instagram.api.schemas.WearablesAppAttributionType r2 = X.C59790JYj.A00
        L_0x003e:
            X.4yP r0 = X.C279294yP.DIRECT_THREAD
            if (r4 != r0) goto L_0x0048
            boolean r0 = X.C69903Nu5.A00(r6)
            if (r0 != 0) goto L_0x0053
        L_0x0048:
            X.HOh r1 = X.C54676HOh.GALLERY_WEARABLES_ICON_IMPRESSION
            int r0 = r5.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.HWP.A00(r1, r2, r6, r0, r3)
        L_0x0053:
            return
        L_0x0054:
            boolean r0 = r1 instanceof X.C59788JYh
            if (r0 == 0) goto L_0x003e
            com.instagram.api.schemas.WearablesAppAttributionType r2 = X.C59788JYh.A00
            goto L_0x003e
        L_0x005b:
            java.lang.String r3 = "reels_gallery"
            goto L_0x002c
        L_0x005e:
            java.lang.String r3 = "story_gallery"
            goto L_0x002c
        L_0x0061:
            java.lang.String r3 = java.lang.String.valueOf(r4)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JX8.A02(com.instagram.common.gallery.Medium, com.instagram.common.session.UserSession, X.9Py):void");
    }

    public static final Bitmap A00(C59739JVx jVx) {
        BitmapDrawable bitmapDrawable;
        Drawable drawable = jVx.A03.A07.getDrawable();
        if (!(drawable instanceof BitmapDrawable) || (bitmapDrawable = (BitmapDrawable) drawable) == null) {
            return null;
        }
        return bitmapDrawable.getBitmap();
    }

    public static final void A01(C376529Ii r4, C348297yD r5, C59739JVx jVx) {
        boolean z = false;
        if (r4.A02 == AnonymousClass05K.A01) {
            z = true;
            JXQ.A02(r4, jVx.A03);
        }
        if (r5 != null) {
            C61081JwJ jwJ = jVx.A03.A03;
            if (jwJ != null) {
                Object obj = jwJ.A00;
                0qQ.A0B(obj, 0);
                if (r5.A00) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = r5.A01;
                    if (concurrentLinkedQueue.size() < 12) {
                        concurrentLinkedQueue.add(obj);
                    }
                }
            } else {
                return;
            }
        } else if (!z) {
            return;
        }
        jVx.A03.A03 = null;
    }

    public static final void A03(Medium medium, C378479Py r5, C59739JVx jVx, C361698ge r7, boolean z) {
        MQT mqt;
        GalleryItem.LocalGalleryMedium A0f = JTR.A0f(medium);
        Bitmap A002 = A00(jVx);
        if (A002 == null || !AnonymousClass8XE.A05(jVx.A03.A07, medium)) {
            mqt = C65122Lnk.A00;
        } else {
            if (z) {
                r5.A03 = true;
            }
            mqt = new C59787JYg(A002);
        }
        r7.DMR(A0f, mqt, jVx.getAbsoluteAdapterPosition(), z);
    }

    public static final void A04(Medium medium, C59739JVx jVx, C361698ge r6) {
        MQT mqt;
        GalleryItem.LocalGalleryMedium A0f = JTR.A0f(medium);
        Bitmap A002 = A00(jVx);
        if (A002 == null || !AnonymousClass8XE.A05(jVx.A03.A07, medium)) {
            mqt = C65122Lnk.A00;
        } else {
            mqt = new C59787JYg(A002);
        }
        r6.DLy(A0f, mqt, jVx.getAbsoluteAdapterPosition());
    }
}
