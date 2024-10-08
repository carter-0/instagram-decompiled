package com.facebook.facedetection.amlfacetracker;

import X.0dV;
import X.RVB;
import android.graphics.Bitmap;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class AMLFaceTracker {
    public NativePeer A00;

    public final class NativePeer {
        public static final RVB Companion = new Object();
        public static volatile boolean jniLoaded;
        public final HybridData mHybridData;

        public final native void configure(AMLTrackerConfiguration aMLTrackerConfiguration);

        public final native AMLDetectedFace[] getLandmarksFromBitmap(Bitmap bitmap, int i, boolean z);

        public final native HybridData initHybrid();

        public final native void loadModels(String[] strArr, String[] strArr2);

        public final native AMLDetectedFace[] track(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

        public final native AMLDetectedFace[] trackBitmap(Bitmap bitmap, int i, boolean z);

        /* JADX WARNING: type inference failed for: r0v0, types: [X.RVB, java.lang.Object] */
        static {
            try {
                0dV.A0C("fb_amlfacetracker_jni");
                jniLoaded = true;
            } catch (Throwable unused) {
                jniLoaded = false;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NativePeer(com.facebook.facedetection.amlfacetracker.AMLTrackerConfiguration r7, java.util.Map r8) {
            /*
                r6 = this;
                r6.<init>()
                boolean r0 = jniLoaded
                if (r0 == 0) goto L_0x003e
                com.facebook.jni.HybridData r0 = r6.initHybrid()
                r6.mHybridData = r0
                r6.configure(r7)
                int r0 = r8.size()
                java.lang.String[] r5 = new java.lang.String[r0]
                int r0 = r8.size()
                java.lang.String[] r4 = new java.lang.String[r0]
                r3 = 0
                java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r8)
            L_0x0021:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x003a
                java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
                java.lang.Object r1 = r0.getKey()
                java.lang.Object r0 = r0.getValue()
                r5[r3] = r1
                r4[r3] = r0
                int r3 = r3 + 1
                goto L_0x0021
            L_0x003a:
                r6.loadModels(r5, r4)
                return
            L_0x003e:
                java.lang.String r0 = "JNI init fail"
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.facedetection.amlfacetracker.AMLFaceTracker.NativePeer.<init>(com.facebook.facedetection.amlfacetracker.AMLTrackerConfiguration, java.util.Map):void");
        }
    }
}
