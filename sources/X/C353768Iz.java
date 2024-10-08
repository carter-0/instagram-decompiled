package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* renamed from: X.8Iz  reason: invalid class name and case insensitive filesystem */
public final class C353768Iz {
    public final C353718Iu A00;
    public final C353668Ip A01;

    public C353768Iz(C353718Iu r2, C353668Ip r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A00(AE1 ae1, String str, long j) {
        Bitmap createBitmap;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C353668Ip r5 = this.A01;
        if (r5.A00(str2) == null) {
            System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str2);
                for (Number intValue : 00k.A0b(new 2HY(0, Math.min((int) (j / 1000), ae1.A01)))) {
                    int intValue2 = intValue.intValue();
                    long j2 = ((long) intValue2) * 1000000;
                    if (Build.VERSION.SDK_INT >= 30) {
                        createBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j2, 0, 224, 224);
                        if (createBitmap == null) {
                        }
                    } else {
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j2, 0);
                        if (frameAtTime != null) {
                            float width = 224.0f / ((float) frameAtTime.getWidth());
                            float height = 224.0f / ((float) frameAtTime.getHeight());
                            Matrix matrix = new Matrix();
                            matrix.postScale(width, height);
                            int width2 = frameAtTime.getWidth();
                            int height2 = frameAtTime.getHeight();
                            0fO.A03(frameAtTime);
                            createBitmap = Bitmap.createBitmap(frameAtTime, 0, 0, width2, height2, matrix, false);
                            0qQ.A07(createBitmap);
                            frameAtTime.recycle();
                        }
                    }
                    this.A00.CyD(j2, intValue2, createBitmap);
                    createBitmap.recycle();
                }
            } catch (Exception unused) {
            }
            mediaMetadataRetriever.release();
            this.A00.DxQ(r5, str2, true, false);
            System.currentTimeMillis();
        }
    }
}
