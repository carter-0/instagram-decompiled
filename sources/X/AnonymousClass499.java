package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.ui.blur.BlurUtil;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.499  reason: invalid class name */
public final class AnonymousClass499 {
    public final int A00;
    public final Context A01;
    public final AnonymousClass1Nu A02;
    public final ImageCacheKey A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass499(Context context, AnonymousClass1Nu r3, ImageCacheKey imageCacheKey, String str, String str2, int i, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(imageCacheKey, 3);
        0qQ.A0B(str, 4);
        0qQ.A0B(str2, 6);
        this.A01 = context;
        this.A02 = r3;
        this.A03 = imageCacheKey;
        this.A04 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A06 = z;
    }

    public final AnonymousClass2l8 A00() {
        int length;
        Bitmap bitmap;
        String str;
        InputStream openRawResource;
        1Mn r10 = this.A02.A04.A0J;
        ImageCacheKey imageCacheKey = this.A03;
        AnonymousClass2l6 A032 = r10.A03(imageCacheKey, -1.0f, 1);
        if (A032 != null) {
            return new AnonymousClass2l8(A032.A02, A032.A04);
        }
        try {
            synchronized (AnonymousClass499.class) {
                Context context = this.A01;
                String str2 = this.A04;
                synchronized (this) {
                    try {
                        if (AnonymousClass49A.A00 == null) {
                            AnonymousClass49A.A00 = new byte[C249703kE.FLAG_MOVED];
                            try {
                                openRawResource = context.getResources().openRawResource(R.raw.header);
                                openRawResource.read(AnonymousClass49A.A00, 0, 607);
                                openRawResource.close();
                            } catch (IOException e) {
                                0wb.A07("mini_preview_image_loader", e);
                                throw e;
                            } catch (Throwable th) {
                                if (openRawResource != null) {
                                    openRawResource.close();
                                }
                                throw th;
                            }
                        }
                        try {
                            byte[] decode = Base64.decode(str2, 0);
                            byte[] bArr = AnonymousClass49A.A00;
                            if (bArr != null) {
                                bArr[162] = decode[1];
                                bArr[160] = decode[2];
                                length = decode.length - 3;
                                System.arraycopy(decode, 3, bArr, 607, length);
                            } else {
                                th = new IllegalArgumentException("Required value was null.");
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                String str3 = imageCacheKey.A03;
                byte[] bArr2 = AnonymousClass49A.A00;
                if (bArr2 != null) {
                    AnonymousClass2l6 A012 = r10.A01((C376649Iu) null, str3, (String) null, this.A05, "mini_preview", bArr2, (int[]) null, 1, length + 607, -1, false);
                    if (A012 != null) {
                        bitmap = A012.A02;
                        str = A012.A04;
                    } else {
                        bitmap = null;
                        str = null;
                    }
                } else {
                    th = new IllegalArgumentException("Required value was null.");
                    throw th;
                }
            }
            if (bitmap != null) {
                if (0yU.A07(AnonymousClass0yP.A00(36326343763375845L))) {
                    bitmap = 0fO.A00(bitmap, bitmap.getWidth() * 2, bitmap.getHeight() * 2, false);
                    bitmap.getWidth();
                    bitmap.getHeight();
                    bitmap.getAllocationByteCount();
                }
                BlurUtil.blurInPlace(bitmap, this.A00);
            } else {
                bitmap = null;
            }
            return new AnonymousClass2l8(bitmap, str);
        } catch (IOException unused) {
            return null;
        }
    }
}
