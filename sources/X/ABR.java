package X;

import android.media.MediaMetadataRetriever;
import android.opengl.Matrix;
import com.facebook.common.math.matrix.Matrix4;

public abstract class ABR {
    public static final void A00(C367508qr r5, C367508qr r6, Matrix4 matrix4, C282765Eq r8) {
        0qQ.A0B(r8, 0);
        AnonymousClass7TG.A1U(r5, r6, matrix4);
        Matrix.setIdentityM(matrix4.A01, 0);
        float f = (r8.A0A / r8.A08) / (r8.A02 / r8.A07);
        float f2 = ((float) r6.A01) / ((float) r6.A00);
        if (AnonymousClass7TE.A00(f, f2) > 0.01f) {
            matrix4.A01(-r8.A09);
            matrix4.A02(1.0f, f2 / f);
            matrix4.A01(r8.A09);
        }
        matrix4.A02(1.0f, -1.0f);
        matrix4.A03((r8.A03 * 2.0f) - 1.0f, (r8.A05 * 2.0f) - 1.0f, 0.0f);
        float f3 = ((float) r5.A00) / ((float) r5.A01);
        matrix4.A02(f3, 1.0f);
        matrix4.A01(r8.A09);
        matrix4.A02(1.0f / f3, 1.0f);
        matrix4.A02(r8.A08, r8.A07);
    }

    public static final void A01(C367508qr r7, Matrix4 matrix4, AnonymousClass9X8 r9) {
        0qQ.A0B(r9, 0);
        C391099sL r2 = r9.A04;
        boolean z = true;
        boolean A1W = AnonymousClass7TF.A1W(r2, C391099sL.HORIZONTAL);
        if (r2 != C391099sL.VERTICAL) {
            z = false;
        }
        if (A1W || z) {
            String str = r9.A0B.A0X;
            0qQ.A0B(str, 0);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                int parseInt = Integer.parseInt(extractMetadata);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata2);
                    mediaMetadataRetriever.release();
                    int i = r7.A01;
                    int i2 = r7.A00;
                    if (z) {
                        i2 /= 2;
                    }
                    float f = (float) parseInt;
                    float f2 = (float) parseInt2;
                    float f3 = f / f2;
                    float f4 = (float) i;
                    float f5 = (float) i2;
                    float f6 = f4 / f5;
                    if (f3 > f6) {
                        matrix4.A02((f3 * f5) / f4, 1.0f);
                    } else if (f3 < f6) {
                        matrix4.A02(1.0f, ((f2 / f) * f4) / f5);
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }
}
