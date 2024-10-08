package X;

import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.JYc  reason: case insensitive filesystem */
public final class C59783JYc {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Point A03;
    public final CameraAREffect A04;
    public final TransformMatrixConfig A05;
    public final ClipInfo A06;
    public final ClipInfo A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C59783JYc(Point point, CameraAREffect cameraAREffect, TransformMatrixConfig transformMatrixConfig, ClipInfo clipInfo, ClipInfo clipInfo2, String str, List list, float f, int i, int i2, boolean z) {
        String str2;
        this.A06 = clipInfo;
        this.A07 = clipInfo2;
        this.A04 = cameraAREffect;
        this.A00 = f;
        this.A09 = list;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = transformMatrixConfig;
        this.A08 = str;
        boolean A1V = AnonymousClass7TF.A1V(cameraAREffect);
        if (transformMatrixConfig != null && !A1V && !transformMatrixConfig.A08.A01() && (str2 = clipInfo.A0F) != null) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str2);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                Integer.parseInt(extractMetadata);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null) {
                    Integer.parseInt(extractMetadata2);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        this.A03 = point;
        this.A0A = z;
    }
}
