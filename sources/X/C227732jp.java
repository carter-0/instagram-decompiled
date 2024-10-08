package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.io.ByteArrayOutputStream;
import java.util.Set;

/* renamed from: X.2jp  reason: invalid class name and case insensitive filesystem */
public final class C227732jp extends 0ng {
    public final /* synthetic */ AnonymousClass2iL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C227732jp(AnonymousClass2iL r5) {
        super(716, 2, false, true);
        this.A00 = r5;
    }

    public final void run() {
        int i;
        boolean z;
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr;
        AnonymousClass2iL r4 = this.A00;
        r4.A0A.getClass();
        C227052iZ r0 = r4.A0A;
        r0.A01 = true;
        1NK r2 = r4.A0c;
        r4.A05 = C227792jv.A00(r2.A0C, r0.A02);
        1MZ r6 = r2.A0G;
        int[] iArr2 = null;
        if (r6.A09 && r4.A0G != null) {
            ImageUrl imageUrl = r4.A0L;
            if (((ImageCacheKey) imageUrl.AjH()).A01 > 0 && ((ImageCacheKey) imageUrl.AjH()).A00 > 0) {
                iArr2 = new int[]{((ImageCacheKey) imageUrl.AjH()).A01, ((ImageCacheKey) imageUrl.AjH()).A00};
            }
        }
        0jG r1 = r2.A0E;
        if (r1 != null) {
            r1.Ciq(r4.A0L);
        }
        AnonymousClass1Nu r5 = r2.A0F;
        1Mn r13 = r5.A04.A0J;
        ImageUrl imageUrl2 = r4.A0L;
        String str = ((ImageCacheKey) imageUrl2.AjH()).A03;
        if (!r6.A04 || (iArr = r4.A0G) == null) {
            C227002iM r9 = r4.A0J;
            i = r9.A00 == Integer.MAX_VALUE ? 1 : r9.A00;
        } else {
            int i4 = iArr[0];
            i = 1;
            int i5 = iArr[1];
            int i6 = ((ImageCacheKey) imageUrl2.AjH()).A01;
            int i7 = ((ImageCacheKey) imageUrl2.AjH()).A00;
            if (i6 > 0 && i7 > 0) {
                while (i6 * 2 * i <= i4 && i7 * 2 * i <= i5) {
                    i *= 2;
                }
            }
        }
        C227052iZ r7 = r4.A0A;
        byte[] bArr = r7.A02;
        int i8 = r7.A00;
        int i9 = r4.A04;
        String str2 = r4.A0C;
        Boolean bool = r4.A0J.A02;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        String str3 = r4.A0N;
        AnonymousClass2l6 A01 = r13.A01(r4.A05, str, str2, str3, imageUrl2.CCJ(), bArr, iArr2, i, i8, i9, z);
        if (A01 != null) {
            Bitmap bitmap2 = A01.A02;
            r4.A07 = new AnonymousClass2l8(bitmap2, A01.A04);
            r4.A0F = true;
            if (r6.A02 && iArr2 != null) {
                String A0L = r2.A0L(imageUrl2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                0fO.A02(Bitmap.CompressFormat.JPEG, bitmap2, byteArrayOutputStream, 85);
                AnonymousClass2iL.A0A(r4, r4.A0C, A0L, byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size(), r4.A04, true);
            }
            if (r6.A05) {
                1O7 r92 = r2.A0H;
                ImageCacheKey imageCacheKey = (ImageCacheKey) imageUrl2.AjH();
                0qQ.A0B(imageCacheKey, 0);
                if (r92.A02 && !r92.A03) {
                    1O7.A02(r92.A01, r92, imageCacheKey);
                }
            }
            1J0 r93 = r5.A02;
            if (r93 != null) {
                r93.A02(r2.A0L(imageUrl2), str3, 1, r4.A00, (long) r4.A0A.A00);
            }
        }
        r2.A00 = null;
        r2.A0Q.remove(r4);
        if (r1 != null) {
            int i10 = 0;
            if (A01 == null || (bitmap = A01.A02) == null) {
                i2 = 0;
                i3 = 0;
            } else {
                i10 = bitmap.getWidth();
                i2 = bitmap.getHeight();
                i3 = bitmap.getByteCount();
            }
            r1.CiW(imageUrl2);
            r1.CiU(imageUrl2, i10, i2, i3);
        }
        AnonymousClass2iL.A09(r4, r4.A0B, "SUCCESS", (Set) null);
        1NK.A08(r2);
        if (A01 != null) {
            1NK.A04(A01.A02, r2, (C227052iZ) null, imageUrl2.getUrl());
        }
    }
}
