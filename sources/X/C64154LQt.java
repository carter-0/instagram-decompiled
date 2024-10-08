package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LQt  reason: case insensitive filesystem */
public final class C64154LQt {
    public static final C64154LQt A00 = new Object();

    public final void A01(C279294yP r9, UserSession userSession, List list, Map map, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        boolean A1Y = DbW.A1Y(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            A00(r9, galleryItem, userSession2, (GalleryPreviewInfo) map.get(galleryItem.A0A), z, A1Y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C279294yP r23, com.instagram.common.gallery.model.GalleryItem r24, com.instagram.common.session.UserSession r25, com.instagram.creation.capture.gallery.GalleryPreviewInfo r26, boolean r27, boolean r28) {
        /*
            r3 = r24
            r2 = r25
            X.AnonymousClass7TG.A1N(r2, r3)
            com.instagram.common.gallery.Medium r5 = r3.A00
            if (r5 == 0) goto L_0x0075
            r0 = r26
            if (r26 == 0) goto L_0x0083
            com.instagram.creation.base.CropInfo r1 = r0.A00
        L_0x0011:
            X.29f r13 = X.JTO.A0c(r2)
            boolean r0 = r3.A06()
            r22 = 1
            if (r0 == 0) goto L_0x001f
            r22 = 2
        L_0x001f:
            X.8fP r10 = X.C360948fP.GALLERY
            if (r1 == 0) goto L_0x0076
            android.graphics.Rect r0 = r1.A02
            if (r0 == 0) goto L_0x0076
            int r3 = r0.width()
        L_0x002b:
            android.graphics.Rect r0 = r1.A02
            if (r0 == 0) goto L_0x007b
            int r0 = r0.height()
        L_0x0033:
            int r4 = r1.A01
            int r6 = r1.A00
        L_0x0037:
            long r1 = r5.A01()
            java.lang.Long r19 = java.lang.Long.valueOf(r1)
            java.lang.String r7 = r5.A0X
            int r1 = r5.A03
            double r1 = (double) r1
            r8 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r8
            java.lang.Double r16 = java.lang.Double.valueOf(r1)
            r20 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r28)
            X.9tJ r9 = X.C391579tJ.OPEN_CAMERA
            com.instagram.common.gallery.metadata.MediaUploadMetadata r12 = r5.A0G
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r27)
            long r1 = r5.A0C
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)
            r27 = 0
            r11 = r23
            r21 = r7
            r23 = r3
            r24 = r0
            r25 = r1
            X.29f.A05(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27)
        L_0x0075:
            return
        L_0x0076:
            int r3 = r5.A0B
            if (r1 == 0) goto L_0x007b
            goto L_0x002b
        L_0x007b:
            int r0 = r5.A04
            if (r1 != 0) goto L_0x0033
            int r4 = r5.A0B
            r6 = r0
            goto L_0x0037
        L_0x0083:
            r1 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64154LQt.A00(X.4yP, com.instagram.common.gallery.model.GalleryItem, com.instagram.common.session.UserSession, com.instagram.creation.capture.gallery.GalleryPreviewInfo, boolean, boolean):void");
    }
}
