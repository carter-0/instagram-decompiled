package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.facebook.systrace.Systrace;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2hh  reason: invalid class name and case insensitive filesystem */
public abstract class C226692hh implements C226702hi {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r9 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void DEj(android.graphics.drawable.Drawable r15, X.AnonymousClass2i4 r16, X.C226732hl r17, java.lang.Throwable r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            X.2hg r0 = (X.C226682hg) r0
            X.3Ni r2 = r0.A01
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r0.A02
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0017
            r1 = 284805185(0x10f9c841, float:9.852172E-29)
            java.lang.String r0 = "IgVitoHelper.onFailure"
            X.0fS.A01(r0, r1)
        L_0x0017:
            if (r2 == 0) goto L_0x001c
            r2.DEN()     // Catch:{ all -> 0x006c }
        L_0x001c:
            r6 = r18
            boolean r0 = r6 instanceof X.C69546Nnq     // Catch:{ all -> 0x006c }
            r2 = 0
            if (r0 == 0) goto L_0x002b
            r1 = r6
            X.Nnq r1 = (X.C69546Nnq) r1     // Catch:{ all -> 0x006c }
        L_0x0026:
            X.1z9 r7 = com.instagram.common.ui.widget.imageview.IgImageView.A0d     // Catch:{ all -> 0x006c }
            com.instagram.common.typedurl.ImageUrl r10 = r5.A0C     // Catch:{ all -> 0x006c }
            goto L_0x002d
        L_0x002b:
            r1 = r2
            goto L_0x0026
        L_0x002d:
            if (r10 == 0) goto L_0x0064
            if (r1 == 0) goto L_0x0037
            java.lang.String r11 = r1.getMessage()     // Catch:{ all -> 0x006c }
            if (r11 != 0) goto L_0x0048
        L_0x0037:
            if (r18 == 0) goto L_0x0043
            java.lang.Throwable r0 = r6.getCause()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0043
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x006c }
        L_0x0043:
            r11 = r2
            if (r1 != 0) goto L_0x0048
            r13 = 0
            goto L_0x004e
        L_0x0048:
            int r13 = r1.A00     // Catch:{ all -> 0x006c }
            X.3sq r9 = r1.A01     // Catch:{ all -> 0x006c }
            if (r9 != 0) goto L_0x0050
        L_0x004e:
            X.3sq r9 = X.C254663sq.LOAD_FAILURE     // Catch:{ all -> 0x006c }
        L_0x0050:
            X.0iw r8 = r5.A07     // Catch:{ all -> 0x006c }
            java.lang.String r12 = "undefined"
            r7.DK1(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x006c }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0063
            r0 = 394117838(0x177dc2ce, float:8.1994587E-25)
            X.0fS.A00(r0)
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006c }
            r0.<init>(r1)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0079
            r0 = 1011310938(0x3c47615a, float:0.0121692065)
            X.0fS.A00(r0)
        L_0x0079:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226692hh.DEj(android.graphics.drawable.Drawable, X.2i4, X.2hl, java.lang.Throwable, long):void");
    }

    public abstract void DFZ(Drawable drawable, AnonymousClass2i4 r2, C226732hl r3, C240493Lc r4, int i, long j);

    public final void DLQ(C226732hl r1, Throwable th, long j) {
    }

    public final void DXN(Drawable drawable, C226732hl r2, long j) {
    }

    public final void Dd5(AnonymousClass2i4 r1, C226732hl r2, long j) {
    }

    public final void Dnz(AnonymousClass2i4 r1, C226732hl r2, Object obj, long j) {
    }

    public void DLS(C226732hl r18, C240493Lc r19, long j) {
        int i;
        int i2;
        Integer num;
        String str;
        C226932iD r2;
        C226682hg r0 = (C226682hg) this;
        IgImageView igImageView = r0.A02;
        ImageUrl imageUrl = r0.A00;
        C62320sa r6 = r0.A06;
        AtomicInteger atomicInteger = r0.A03;
        C62320sa r7 = r0.A04;
        if (Systrace.A0E(1)) {
            0fS.A01("IgVitoHelper.onIntermediateImageSet", 1311697091);
        }
        Object obj = null;
        if (r19 != null) {
            try {
                Map B3S = r19.B3S();
                if (B3S != null) {
                    obj = B3S.get("IMAGE_RENDERED");
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1)) {
                    0fS.A00(-1339564307);
                }
                throw th;
            }
        }
        if (!(obj instanceof C226932iD) || (r2 = (C226932iD) obj) == null) {
            i = -1;
        } else {
            i = r2.ordinal();
        }
        if (i == 0) {
            C242533Um r1 = igImageView.A0F;
            if (r1 != null) {
                r19.B3S().get("LOAD_SOURCE");
                IgProgressImageView.A02(((C242523Ul) r1).A00, AnonymousClass05K.A01);
            }
            r6.invoke();
        } else if (i == 1) {
            Object obj2 = r19.B3S().get("ENCODED_IMAGE_SIZE");
            if (!(obj2 instanceof Integer) || (num = (Integer) obj2) == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            atomicInteger.set(i2);
            C242513Uk r02 = igImageView.A0H;
            if (r02 != null) {
                r02.DaN(i2);
            }
        } else if (i == 3) {
            r7.invoke();
            C240963Ni r12 = igImageView.A0D;
            if (r12 != null) {
                String url = imageUrl.getUrl();
                Object obj3 = r19.B3S().get("LOAD_SOURCE");
                if (!(obj3 instanceof String) || (str = (String) obj3) == null) {
                    str = "undefined";
                }
                r12.DO4(new C240983Nk((Bitmap) null, url, str, 0, 0));
            }
            IgImageView.A0d.DJz(imageUrl);
        }
        if (Systrace.A0E(1)) {
            0fS.A00(-149565309);
        }
    }
}
