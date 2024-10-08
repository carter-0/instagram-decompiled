package com.facebook.cameracore.recognizer.integrations.scene_understanding;

import X.0dV;
import X.AnonymousClass7TG;
import com.facebook.cameracore.recognizer.logger.RecognizerLogger;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

public abstract class SceneUnderstandingRecognizer {
    public final ScheduledExecutorService mExecutorService;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, String str, String str2, String str3, RecognizerLogger recognizerLogger);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, Reference reference);

    private native void setRecognizedTargetHandler(SceneUnderstandingRecognizedTargetHandler sceneUnderstandingRecognizedTargetHandler);

    private native void startRecognizer();

    private native void stopRecognizer();

    static {
        0dV.A0C("scene-understanding-recognizer-android");
        AnonymousClass7TG.A0v();
    }
}
