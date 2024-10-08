package X;

import android.graphics.Point;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.JYd  reason: case insensitive filesystem */
public abstract class C59784JYd {
    public static final C59783JYc A00(Point point, Point point2, ClipInfo clipInfo) {
        return new C59783JYc(point2, (CameraAREffect) null, (TransformMatrixConfig) null, clipInfo, clipInfo, (String) null, (List) null, clipInfo.A00, point.x, point.y, false);
    }

    public static final C59783JYc A01(Point point, AnonymousClass3Q2 r13) {
        CameraAREffect cameraAREffect = r13.A10;
        float f = r13.A02;
        List list = r13.A4a;
        int i = r13.A0H;
        int i2 = r13.A0G;
        return new C59783JYc(point, cameraAREffect, r13.A16, r13.A1N, (ClipInfo) r13.A4G.get(0), r13.A2h, list, f, i, i2, r13.A69);
    }
}
