package com.facebook.cameracore.recognizer.integrations.contextual_music;

import X.0dV;
import X.AnonymousClass7TG;
import X.C392889vX;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public abstract class ContextualMusicGraph {
    public static final C392889vX Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(String str);

    private final native float[] nativeRun(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, Reference reference);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vX, java.lang.Object] */
    static {
        0dV.A0C("contextual-music-graph-android");
        AnonymousClass7TG.A0v();
    }
}
