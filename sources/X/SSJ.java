package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Pair;
import com.facebook.msys.mci.PSNRCalculator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class SSJ {
    public final C10213RoU A00;

    private double[] A02(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return new double[]{-1.0d, -1.0d, -1.0d};
        }
        try {
            Bitmap A002 = 0fO.A00(bitmap2, bitmap.getWidth(), bitmap.getHeight(), true);
            if (A002 == null) {
                return new double[]{-1.0d, -1.0d, -1.0d};
            }
            double[] computePSNRNative = PSNRCalculator.computePSNRNative(bitmap, A002);
            if (computePSNRNative == null) {
                return new double[]{-1.0d, -1.0d, -1.0d};
            }
            return computePSNRNative;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static Bitmap A01(Bitmap bitmap, int i) {
        int i2 = i % 360;
        if (i2 == 0) {
            return bitmap;
        }
        Matrix A0U = AnonymousClass7TE.A0U();
        A0U.postRotate((float) i2);
        try {
            return Pxk.A09(bitmap, A0U);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final C11259SHt A03(C10734RxD rxD, ByteArrayOutputStream byteArrayOutputStream, String str, int i, int i2) {
        Integer valueOf;
        Integer valueOf2;
        int A002;
        int A003;
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        long A0F = Pxf.A0F(str2);
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        byteArrayOutputStream2.reset();
        try {
            int A004 = C9261RVm.A00(str2);
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(str2);
                boolean z = rxD.A02;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str2, options);
                float f = (float) i3;
                float f2 = (float) i4;
                options.inSampleSize = Math.min(Math.round(Math.max(((float) options.outWidth) / f, ((float) options.outHeight) / f2)), 4);
                options.inJustDecodeBounds = false;
                Bitmap decodeFile2 = BitmapFactory.decodeFile(str2, options);
                if (decodeFile2 == null) {
                    e = AnonymousClass7TE.A15("BitmapImageTranscoder: Unable to decode into a bitmap");
                    return C11259SHt.A00(e);
                }
                decodeFile2.getWidth();
                decodeFile2.getHeight();
                if (decodeFile != null) {
                    decodeFile = A01(decodeFile, A004);
                }
                int i5 = A004 % 360;
                if (i5 != 0) {
                    float min = Math.min(Math.min(f / JTO.A02(decodeFile2), f2 / JTO.A01(decodeFile2)), 1.0f);
                    Matrix A0U = AnonymousClass7TE.A0U();
                    A0U.postScale(min, min);
                    A0U.postRotate((float) i5);
                    decodeFile2 = Pxh.A0H(decodeFile2, A0U);
                }
                int width = decodeFile2.getWidth();
                int height = decodeFile2.getHeight();
                if (height > i4 || width > i3) {
                    int i6 = i * height;
                    int i7 = i2 * width;
                    if (i6 < i7) {
                        i4 = i6 / width;
                    } else {
                        i3 = i7 / height;
                    }
                    valueOf = Integer.valueOf(i3);
                    valueOf2 = Integer.valueOf(i4);
                } else {
                    valueOf = Integer.valueOf(width);
                    valueOf2 = Integer.valueOf(height);
                }
                Pair create = Pair.create(valueOf, valueOf2);
                int A05 = Pxf.A05(create);
                int A04 = Pxf.A04(create);
                if (width > A05 || height > A04) {
                    try {
                        Bitmap A005 = 0fO.A00(decodeFile2, A05, A04, true);
                        if (A005 == null) {
                            0KC.A0C("BitmapImageTranscoder", "transcodeImageHelper: bitmap scaling returned null");
                            return C11259SHt.A00(AnonymousClass7TE.A15("transcodeImageHelper: bitmap scaling returned null"));
                        }
                        if (z) {
                            A002 = Math.max(A00(true, height, width), 45);
                        } else {
                            A002 = A00(false, height, width);
                        }
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                        0fO.A01(compressFormat, A005, A002);
                        if (!A005.compress(compressFormat, A002, byteArrayOutputStream2)) {
                            byteArrayOutputStream2.size();
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        double[] A02 = A02(decodeFile, BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
                        return new C11259SHt((Exception) null, AnonymousClass05K.A00, byteArrayOutputStream2.toByteArray(), A02[0], width, height, A004, A05, A04, A002, A0F, (long) byteArrayOutputStream2.size());
                    } catch (IllegalArgumentException e) {
                        0KC.A0F("BitmapImageTranscoder", "transcodeImageHelper: invalid dimensions passed to bitmap scaling - ", e);
                        e = Pxe.A0h("transcodeImageHelper: invalid dimensions passed to bitmap scaling", e);
                    }
                } else {
                    if (z) {
                        A003 = Math.max(A00(true, height, width), 45);
                    } else {
                        A003 = A00(false, height, width);
                    }
                    Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
                    0fO.A01(compressFormat2, decodeFile2, A003);
                    if (!decodeFile2.compress(compressFormat2, A003, byteArrayOutputStream2)) {
                        byteArrayOutputStream2.size();
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    double[] A022 = A02(decodeFile, BitmapFactory.decodeByteArray(byteArray2, 0, byteArray2.length));
                    int size = byteArrayOutputStream2.size();
                    return new C11259SHt((Exception) null, AnonymousClass05K.A0C, byteArrayOutputStream2.toByteArray(), A022[0], width, height, A004, width, height, A003, A0F, (long) size);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IOException e3) {
            throw e3;
        } catch (IOException e4) {
            e = e4;
        }
    }

    static {
        C67541ts.A00();
    }

    public SSJ(C10213RoU roU) {
        this.A00 = roU;
    }

    public static int A00(Boolean bool, int i, int i2) {
        int max = Math.max(i, i2);
        int i3 = 1080;
        if (bool.booleanValue()) {
            i3 = 4032;
        }
        if (max <= 320) {
            return 85;
        }
        if (max >= i3) {
            return 45;
        }
        return (int) Math.max(Math.min(((-40.0d / ((double) (i3 - 320))) * ((double) (max - i3))) + 45.0d, 85.0d), 45.0d);
    }
}
