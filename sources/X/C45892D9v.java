package X;

import android.net.Uri;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.direct.stickerstore.TypedImageUrl;

/* renamed from: X.D9v  reason: case insensitive filesystem */
public abstract class C45892D9v {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r15 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.direct.stickerstore.DirectStoreSticker A00(X.C42753Bho r11, java.lang.String r12, int r13, int r14, boolean r15) {
        /*
            r10 = 0
            if (r11 == 0) goto L_0x0053
            java.lang.String r7 = X.C41845B3m.A0k(r11)
            if (r7 == 0) goto L_0x0053
            java.lang.String r0 = "image(force_static_image:$sticker_full_force_static_image,height:$sticker_full_size,width:$sticker_full_size)"
            java.lang.String r6 = r11.A0A(r0)
            r5 = 5
            java.lang.String r4 = "original_aspect_ratio"
            double r0 = r11.getCoercedDoubleField(r5, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            r2 = 4
            java.lang.String r1 = "is_animated"
            boolean r0 = r11.getCoercedBooleanField(r2, r1)
            com.instagram.model.direct.stickerstore.TypedImageUrl r6 = A02(r3, r6, r14, r0)
            if (r6 == 0) goto L_0x0053
            boolean r0 = r11.getCoercedBooleanField(r2, r1)
            if (r0 == 0) goto L_0x0030
            r3 = 1
            if (r15 == 0) goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            java.lang.String r0 = "image(force_static_image:$sticker_preview_force_static_image,height:$sticker_preview_size,width:$sticker_preview_size)"
            java.lang.String r2 = r11.A09(r0)
            double r0 = r11.getCoercedDoubleField(r5, r4)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.instagram.model.direct.stickerstore.TypedImageUrl r5 = A02(r0, r2, r13, r3)
            if (r5 == 0) goto L_0x0053
            java.lang.String r0 = "accessibility_label"
            java.lang.String r9 = r11.A08(r0)
            r11 = 0
            com.instagram.model.direct.stickerstore.DirectStoreSticker r4 = new com.instagram.model.direct.stickerstore.DirectStoreSticker
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x0053:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45892D9v.A00(X.Bho, java.lang.String, int, int, boolean):com.instagram.model.direct.stickerstore.DirectStoreSticker");
    }

    public static final DirectStoreSticker A01(DirectStoreStickerResponseItem directStoreStickerResponseItem) {
        boolean z;
        boolean z2;
        if (directStoreStickerResponseItem == null) {
            return null;
        }
        String str = directStoreStickerResponseItem.A09;
        int i = directStoreStickerResponseItem.A00;
        Double d = directStoreStickerResponseItem.A04;
        Boolean bool = directStoreStickerResponseItem.A02;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        TypedImageUrl A02 = A02(d, str, i, z);
        if (A02 == null) {
            return null;
        }
        String str2 = directStoreStickerResponseItem.A07;
        String str3 = directStoreStickerResponseItem.A0A;
        String str4 = directStoreStickerResponseItem.A05;
        String str5 = directStoreStickerResponseItem.A06;
        Boolean bool2 = directStoreStickerResponseItem.A03;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        return new DirectStoreSticker((TypedImageUrl) null, A02, str2, str3, str4, str5, z2);
    }

    public static final TypedImageUrl A02(Double d, String str, int i, boolean z) {
        double d2;
        if (str != null) {
            if (d == null || d.doubleValue() == 0.0d) {
                d2 = 1.0d;
            } else {
                d2 = d.doubleValue();
            }
            try {
                Uri A03 = 0cp.A03(str);
                0qQ.A07(A03);
                return new TypedImageUrl(new SimpleImageUrl(A03.toString(), (int) (((double) i) * d2), i), "image/webp", z);
            } catch (Exception e) {
                0wj.A01.AEf(002.A0R("Failed to parse sticker image url. Error: ", e.getMessage()), 20134884);
            }
        }
        return null;
    }
}
