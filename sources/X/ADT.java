package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;

public final class ADT {
    public static final ADT A00 = new Object();

    public final LBC A00(Context context, Bitmap bitmap, FilterChain filterChain, CameraAREffect cameraAREffect, UserSession userSession, TransformMatrixConfig transformMatrixConfig, L83 l83, C352218Cl r43, String str, LinkedHashMap linkedHashMap, Set set, int i, boolean z, boolean z2, boolean z3) {
        double d;
        C352218Cl r9 = r43;
        0qQ.A0B(r9, 2);
        FilterChain filterChain2 = filterChain;
        0qQ.A0B(filterChain2, 14);
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            int width = bitmap2.getWidth();
            Context context2 = context;
            UserSession userSession2 = userSession;
            Point A002 = AEW.A00(((float) width) / ((float) bitmap2.getHeight()), C63472Kxb.A00(context2, userSession2, width, C343127pi.A00(context2), false));
            0qQ.A07(A002);
            int i2 = A002.x;
            int i3 = A002.y;
            String str2 = r9.A0a;
            File A003 = LIM.A00(-1);
            boolean z4 = r9.A12;
            long j = r9.A0A;
            long j2 = r9.A0B;
            if (j2 <= 0) {
                j2 = j;
            }
            C349307zv r16 = new C349307zv(A003, (Integer) null, str2, i2, i3, 0, j, j2, false, z4, false);
            if (z2) {
                d = 500.0d + 500.0d;
            } else {
                d = 3000.0d;
            }
            CameraAREffect cameraAREffect2 = cameraAREffect;
            Set set2 = set;
            int A004 = AJ8.A00(cameraAREffect2, userSession2, set2, d);
            boolean z5 = !set2.isEmpty();
            float f = ((float) r16.A0K) / ((float) r16.A08);
            boolean z6 = false;
            AnonymousClass3Q2 A01 = AnonymousClass9T3.A01(String.valueOf(System.nanoTime()));
            A01.A0K = r9.A12 ^ true ? 1 : 0;
            File parentFile = AnonymousClass7TE.A0t(r16.A0k).getParentFile();
            parentFile.getClass();
            A01.A3w = parentFile.getName();
            A01.A0H = r16.A0K;
            A01.A0G = r16.A08;
            A01.A5F = true;
            A01.A5V = true;
            A01.A02 = f;
            A01.A10 = cameraAREffect2;
            TransformMatrixConfig transformMatrixConfig2 = transformMatrixConfig;
            if (transformMatrixConfig != null) {
                z6 = true;
            }
            A01.A5z = z6;
            FilterChain A005 = filterChain2.deepCopy();
            if (z5 && (cameraAREffect == null || !cameraAREffect2.A0K())) {
                AJ8.A05(A005);
            }
            AJ8.A03(A005, A01, z3);
            if (cameraAREffect != null) {
                AJ8.A06(transformMatrixConfig2, l83, A01, r9, i);
            }
            A01.A2k = str;
            SON son = new SON();
            try {
                String canonicalPath = AnonymousClass7TE.A0t(r16.A0k).getCanonicalPath();
                0qQ.A07(canonicalPath);
                son.A02(bitmap2, canonicalPath, ((float) A004) / 1000.0f, A002.x, A002.y);
                A01.A0j(r16.A0k, A004, false);
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (linkedHashMap != null) {
                    A1H.putAll(linkedHashMap2);
                }
                return new LBC(context2, userSession2, (1GK) null, (TransformMatrixConfig) null, (AnonymousClass51W) null, (AnonymousClass3QS) null, A01, A1H, false, false, z);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "null";
                }
                0kD.A07("PhotoToVideoTaskFactory", message, e);
                throw new IOException(e.getMessage());
            }
        } else {
            throw new IOException("mediaBitmap was null when converting photo to video");
        }
    }
}
