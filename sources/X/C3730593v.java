package X;

import android.os.Handler;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;

/* renamed from: X.93v  reason: invalid class name and case insensitive filesystem */
public interface C3730593v {
    int createFbaProcessingGraph(int i, int i2, C341477mx r3);

    int createManualProcessingGraph(int i, int i2, C341477mx r3);

    int fillAudioBuffer(Y1G y1g);

    AudioGraphClientProvider getAudioGraphClientProvider();

    String getDebugInfo();

    boolean isSubgraphInserted();

    void onReceivedAudioMixingMode(int i);

    int pause();

    void prepareRecorder(C343487qI r1, C341607nE r2, Handler handler, C341687nM r4, Handler handler2);

    void release();

    int resume();

    String snapshot();

    void startInput(C341687nM r1, Handler handler);

    void stopInput(C341687nM r1, Handler handler);

    void updateOutputRouteState(int i);
}
